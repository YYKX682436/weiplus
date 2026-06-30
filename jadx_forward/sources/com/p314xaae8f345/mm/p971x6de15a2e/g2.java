package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public abstract class g2 {
    public static void a(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean contains;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterInfoHandle", "onDisasterNodeNotify:\n" + str);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterInfoHandle", "host " + ((java.lang.String) it.next()));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDisasterInfoHandle", "compareDisasterHost");
            if (arrayList.size() == 0) {
                return;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterInfoHandle", "autoAuth is null");
                return;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = c17.f153526n;
            if (binderC11173x1cfac0af == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterInfoHandle", "accinfo is null");
                return;
            }
            if (binderC11173x1cfac0af.F0(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29)) {
                java.lang.String[] strArr = new java.lang.String[20];
                ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40243x55bd6b3b(strArr, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
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
                    synchronized (binderC11173x1cfac0af.A) {
                        contains = binderC11173x1cfac0af.A.contains(new java.lang.String(bytes));
                    }
                    if (contains) {
                        z18 = true;
                        break;
                    }
                }
                z18 = false;
            }
            if (z18) {
                binderC11173x1cfac0af.w0();
                try {
                    com.p314xaae8f345.mm.p971x6de15a2e.x2.e().mo50293x3498a0(new com.p314xaae8f345.mm.p971x6de15a2e.f2());
                } catch (java.lang.Exception e17) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDisasterInfoHandle", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterInfoHandle", "main disaster disasterOccur ");
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 124L, 1L, false);
                return;
            }
            if (binderC11173x1cfac0af.F0("axhost")) {
                java.lang.String[] strArr2 = new java.lang.String[20];
                ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40243x55bd6b3b(strArr2, "axhost");
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
                    if (binderC11173x1cfac0af.x((java.lang.String) it9.next())) {
                        break;
                    }
                }
            }
            z17 = z18;
            if (z17) {
                binderC11173x1cfac0af.w0();
                com.p314xaae8f345.mm.p971x6de15a2e.x2.c().V("");
                jx3.f.INSTANCE.mo68477x336bdfd8(148L, 125L, 1L, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMDisasterInfoHandle", "ax disaster disasterOccur ");
            }
        } catch (java.lang.Exception e18) {
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDisasterInfoHandle", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
        }
    }
}
