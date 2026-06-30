package gi;

/* loaded from: classes12.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f353615b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f353616c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public gi.n1[] f353617a;

    public double a(java.lang.String str) {
        java.util.HashMap hashMap = f353615b;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Double) hashMap.get(str)).doubleValue();
        }
        java.util.HashMap hashMap2 = f353616c;
        if (hashMap2.containsKey(str)) {
            return ((java.lang.Double[]) hashMap2.get(str))[0].doubleValue();
        }
        return 0.0d;
    }

    public double b(java.lang.String str, int i17) {
        java.util.HashMap hashMap = f353615b;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Double) hashMap.get(str)).doubleValue();
        }
        java.util.HashMap hashMap2 = f353616c;
        if (hashMap2.containsKey(str)) {
            java.lang.Double[] dArr = (java.lang.Double[]) hashMap2.get(str);
            if (dArr.length > i17 && i17 >= 0) {
                return dArr[i17].doubleValue();
            }
            if (i17 >= 0 && dArr.length != 0) {
                return dArr[dArr.length - 1].doubleValue();
            }
        }
        return 0.0d;
    }

    public double c(java.lang.String str) {
        int length;
        if (f353615b.containsKey(str)) {
            length = 1;
        } else {
            java.util.HashMap hashMap = f353616c;
            length = hashMap.containsKey(str) ? ((java.lang.Double[]) hashMap.get(str)).length : 0;
        }
        if (length <= 0) {
            return a(str);
        }
        double d17 = 0.0d;
        for (int i17 = 0; i17 < length; i17++) {
            d17 += b(str, i17);
        }
        return d17 / length;
    }

    public void d() {
        java.util.HashMap hashMap = f353616c;
        if (!hashMap.containsKey("cpu.clusters.cores")) {
            this.f353617a = new gi.n1[1];
            java.util.HashMap hashMap2 = f353615b;
            this.f353617a[0] = new gi.n1("cpu.core_speeds.cluster0", "cpu.cluster_power.cluster0", "cpu.core_power.cluster0", hashMap2.containsKey("cpu.clusters.cores") ? (int) java.lang.Math.round(((java.lang.Double) hashMap2.get("cpu.clusters.cores")).doubleValue()) : 1, null);
            return;
        }
        java.lang.Double[] dArr = (java.lang.Double[]) hashMap.get("cpu.clusters.cores");
        this.f353617a = new gi.n1[dArr.length];
        for (int i17 = 0; i17 < dArr.length; i17++) {
            int round = (int) java.lang.Math.round(dArr[i17].doubleValue());
            this.f353617a[i17] = new gi.n1("cpu.core_speeds.cluster" + i17, "cpu.cluster_power.cluster" + i17, "cpu.core_power.cluster" + i17, round, null);
        }
    }

    public void e(android.content.Context context, java.io.File file) {
        org.xmlpull.v1.XmlPullParser newPullParser;
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
                newInstance.setNamespaceAware(true);
                newPullParser = newInstance.newPullParser();
                fileInputStream = new java.io.FileInputStream(file);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            newPullParser.setInput(fileInputStream, null);
            g(context, newPullParser);
            try {
                fileInputStream.close();
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            throw new java.lang.RuntimeException("Error reading file " + file + ": " + e.getMessage(), e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void f(android.content.Context context, java.lang.String str) {
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = context.getResources().getXml(context.getResources().getIdentifier(str, "xml", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f));
                g(context, xmlResourceParser);
                try {
                    xmlResourceParser.close();
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Error reading res " + str + ": " + e17.getMessage(), e17);
            }
        } catch (java.lang.Throwable th6) {
            if (xmlResourceParser != null) {
                try {
                    xmlResourceParser.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }

    public final void g(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        int integer;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            gi.o1.a(xmlPullParser, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            boolean z17 = false;
            java.lang.String str = null;
            while (true) {
                int next = xmlPullParser.next();
                if (next == 2 || next == 1) {
                    java.lang.String name = xmlPullParser.getName();
                    double d17 = 0.0d;
                    hashMap = f353615b;
                    hashMap2 = f353616c;
                    if (name == null) {
                        break;
                    }
                    if (z17 && !name.equals("value")) {
                        hashMap2.put(str, (java.lang.Double[]) arrayList.toArray(new java.lang.Double[arrayList.size()]));
                        z17 = false;
                    }
                    if (name.equals("array")) {
                        arrayList.clear();
                        str = xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                        z17 = true;
                    } else if (name.equals("item") || name.equals("value")) {
                        java.lang.String attributeValue = !z17 ? xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d) : null;
                        if (xmlPullParser.next() == 4) {
                            try {
                                d17 = java.lang.Double.valueOf(xmlPullParser.getText()).doubleValue();
                            } catch (java.lang.NumberFormatException unused) {
                            }
                            if (name.equals("item")) {
                                hashMap.put(attributeValue, java.lang.Double.valueOf(d17));
                            } else if (z17) {
                                arrayList.add(java.lang.Double.valueOf(d17));
                            }
                        }
                    }
                }
            }
            if (z17) {
                hashMap2.put(str, (java.lang.Double[]) arrayList.toArray(new java.lang.Double[arrayList.size()]));
            }
            int[] iArr = {context.getResources().getIdentifier("config_bluetooth_idle_cur_ma", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f), context.getResources().getIdentifier("config_bluetooth_rx_cur_ma", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f), context.getResources().getIdentifier("config_bluetooth_tx_cur_ma", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f), context.getResources().getIdentifier("config_bluetooth_operating_voltage_mv", "integer", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)};
            java.lang.String[] strArr = {"bluetooth.controller.idle", "bluetooth.controller.rx", "bluetooth.controller.tx", "bluetooth.controller.voltage"};
            for (int i17 = 0; i17 < 4; i17++) {
                java.lang.String str2 = strArr[i17];
                if ((!hashMap.containsKey(str2) || ((java.lang.Double) hashMap.get(str2)).doubleValue() <= 0.0d) && (integer = context.getResources().getInteger(iArr[i17])) > 0) {
                    hashMap.put(str2, java.lang.Double.valueOf(integer));
                }
            }
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            throw new java.lang.RuntimeException(e18);
        }
    }
}
