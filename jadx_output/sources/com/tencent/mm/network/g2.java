package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class g2 {
    public static void a(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean contains;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterInfoHandle", "onDisasterNodeNotify:\n" + str);
        org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            newPullParser.setInput(new java.io.StringReader(str));
            int eventType = newPullParser.getEventType();
            while (true) {
                z17 = true;
                if (eventType == 1) {
                    break;
                }
                if (eventType == 2 && "host".equals(newPullParser.getName())) {
                    arrayList.add(newPullParser.nextText());
                }
                eventType = newPullParser.next();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterInfoHandle", "host " + ((java.lang.String) it.next()));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDisasterInfoHandle", "compareDisasterHost");
            if (arrayList.size() == 0) {
                return;
            }
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterInfoHandle", "autoAuth is null");
                return;
            }
            com.tencent.mm.network.AccInfo accInfo = c17.f71993n;
            if (accInfo == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterInfoHandle", "accinfo is null");
                return;
            }
            if (accInfo.F0(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM)) {
                java.lang.String[] strArr = new java.lang.String[20];
                ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getLocalHostList(strArr, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(strArr));
                if (arrayList2.size() > 0) {
                    int size = arrayList2.size();
                    java.util.Iterator it6 = arrayList.iterator();
                    z18 = false;
                    while (it6.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it6.next();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size) {
                                if (arrayList2.get(i17) != null && ((java.lang.String) arrayList2.get(i17)).equals(str2)) {
                                    z18 = true;
                                    break;
                                }
                                i17++;
                            } else {
                                break;
                            }
                        }
                    }
                }
                z18 = false;
            } else {
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    byte[] bytes = ((java.lang.String) it7.next()).getBytes();
                    synchronized (accInfo.A) {
                        contains = accInfo.A.contains(new java.lang.String(bytes));
                    }
                    if (contains) {
                        z18 = true;
                        break;
                    }
                }
                z18 = false;
            }
            if (z18) {
                accInfo.w0();
                try {
                    com.tencent.mm.network.x2.e().post(new com.tencent.mm.network.f2());
                } catch (java.lang.Exception e17) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMDisasterInfoHandle", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterInfoHandle", "main disaster disasterOccur ");
                jx3.f.INSTANCE.idkeyStat(148L, 124L, 1L, false);
                return;
            }
            if (accInfo.F0("axhost")) {
                java.lang.String[] strArr2 = new java.lang.String[20];
                ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getLocalHostList(strArr2, "axhost");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(java.util.Arrays.asList(strArr2));
                int size2 = arrayList3.size();
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it8.next();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size2) {
                            if (arrayList3.get(i18) != null && ((java.lang.String) arrayList3.get(i18)).equals(str3)) {
                                z18 = true;
                                break;
                            }
                            i18++;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                java.util.Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    if (accInfo.x((java.lang.String) it9.next())) {
                        break;
                    }
                }
            }
            z17 = z18;
            if (z17) {
                accInfo.w0();
                com.tencent.mm.network.x2.c().V("");
                jx3.f.INSTANCE.idkeyStat(148L, 125L, 1L, false);
                com.tencent.mars.xlog.Log.w("MicroMsg.MMDisasterInfoHandle", "ax disaster disasterOccur ");
            }
        } catch (java.lang.Exception e18) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMDisasterInfoHandle", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
        }
    }
}
