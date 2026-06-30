package wh;

/* loaded from: classes12.dex */
public class n1 {

    /* renamed from: b, reason: collision with root package name */
    public static wh.n1 f527370b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f527371c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f527372d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f527373e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f527374f = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;

    /* renamed from: a, reason: collision with root package name */
    public wh.l1[] f527375a;

    public n1(android.content.Context context) {
        synchronized (f527373e) {
            if (f527371c.size() == 0 && f527372d.size() == 0) {
                try {
                    m(context);
                } catch (java.io.IOException e17) {
                    oj.j.f("PowerProfile", "Failed to read power values: " + e17, new java.lang.Object[0]);
                }
            }
            k();
        }
    }

    public static wh.n1 j(android.content.Context context) {
        wh.n1 n1Var;
        synchronized (f527373e) {
            try {
                if (f527370b == null) {
                    wh.n1 n1Var2 = new wh.n1(context);
                    n1Var2.q();
                    f527370b = n1Var2;
                }
                n1Var = f527370b;
            } catch (java.lang.Throwable th6) {
                throw new java.io.IOException("Compat err: " + th6.getMessage(), th6);
            }
        }
        return n1Var;
    }

    public double a(java.lang.String str) {
        java.util.HashMap hashMap = f527371c;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Double) hashMap.get(str)).doubleValue();
        }
        java.util.HashMap hashMap2 = f527372d;
        if (hashMap2.containsKey(str)) {
            return ((java.lang.Double[]) hashMap2.get(str))[0].doubleValue();
        }
        return 0.0d;
    }

    public double b(java.lang.String str, int i17) {
        java.util.HashMap hashMap = f527371c;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Double) hashMap.get(str)).doubleValue();
        }
        java.util.HashMap hashMap2 = f527372d;
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

    public double c(int i17) {
        if (i17 < 0) {
            return 0.0d;
        }
        wh.l1[] l1VarArr = this.f527375a;
        if (i17 < l1VarArr.length) {
            return a(l1VarArr[i17].f527360b);
        }
        return 0.0d;
    }

    public double d(int i17, int i18) {
        if (i17 < 0) {
            return 0.0d;
        }
        wh.l1[] l1VarArr = this.f527375a;
        if (i17 < l1VarArr.length) {
            return b(l1VarArr[i17].f527361c, i18);
        }
        return 0.0d;
    }

    public double e(java.lang.String str) {
        int h17 = h(str);
        if (h17 <= 0) {
            return a(str);
        }
        double d17 = 0.0d;
        for (int i17 = 0; i17 < h17; i17++) {
            d17 += b(str, i17);
        }
        return d17 / h17;
    }

    public int f(int i17) {
        if (i17 < 0) {
            return -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            wh.l1[] l1VarArr = this.f527375a;
            if (i18 >= l1VarArr.length) {
                return -2;
            }
            int i27 = l1VarArr[i18].f527362d;
            if (i27 + i19 >= i17 + 1) {
                return i18;
            }
            i19 += i27;
            i18++;
        }
    }

    public int g() {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            wh.l1[] l1VarArr = this.f527375a;
            if (i17 >= l1VarArr.length) {
                return i18;
            }
            i18 += l1VarArr[i17].f527362d;
            i17++;
        }
    }

    public int h(java.lang.String str) {
        if (f527371c.containsKey(str)) {
            return 1;
        }
        java.util.HashMap hashMap = f527372d;
        if (hashMap.containsKey(str)) {
            return ((java.lang.Double[]) hashMap.get(str)).length;
        }
        return 0;
    }

    public int i(int i17) {
        if (i17 < 0) {
            return 0;
        }
        wh.l1[] l1VarArr = this.f527375a;
        if (i17 >= l1VarArr.length) {
            return 0;
        }
        java.util.HashMap hashMap = f527372d;
        if (hashMap.containsKey(l1VarArr[i17].f527359a)) {
            return ((java.lang.Double[]) hashMap.get(this.f527375a[i17].f527359a)).length;
        }
        return 1;
    }

    public void k() {
        java.util.HashMap hashMap = f527372d;
        if (!hashMap.containsKey("cpu.clusters.cores")) {
            this.f527375a = new wh.l1[1];
            java.util.HashMap hashMap2 = f527371c;
            this.f527375a[0] = new wh.l1("cpu.core_speeds.cluster0", "cpu.cluster_power.cluster0", "cpu.core_power.cluster0", hashMap2.containsKey("cpu.clusters.cores") ? (int) java.lang.Math.round(((java.lang.Double) hashMap2.get("cpu.clusters.cores")).doubleValue()) : 1, null);
            return;
        }
        java.lang.Double[] dArr = (java.lang.Double[]) hashMap.get("cpu.clusters.cores");
        this.f527375a = new wh.l1[dArr.length];
        for (int i17 = 0; i17 < dArr.length; i17++) {
            int round = (int) java.lang.Math.round(dArr[i17].doubleValue());
            this.f527375a[i17] = new wh.l1("cpu.core_speeds.cluster" + i17, "cpu.cluster_power.cluster" + i17, "cpu.core_power.cluster" + i17, round, null);
        }
    }

    public boolean l() {
        try {
            q();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public final void m(android.content.Context context) {
        java.util.HashMap hashMap = f527372d;
        java.util.HashMap hashMap2 = f527371c;
        java.lang.Exception exc = null;
        try {
            o(context, "power_profile");
            k();
            q();
            f527374f = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46634x1dde913b;
            e = null;
        } catch (java.lang.Exception e17) {
            e = e17;
            oj.j.f("PowerProfile", "read from framework failed: " + e, new java.lang.Object[0]);
            hashMap2.clear();
            hashMap.clear();
        }
        if (e != null) {
            try {
                n(context, (java.io.File) new wh.k1(this).call());
                k();
                q();
                f527374f = "custom";
                e = null;
            } catch (java.lang.Exception e18) {
                e = e18;
                oj.j.f("PowerProfile", "read from custom failed: " + e, new java.lang.Object[0]);
                hashMap2.clear();
                hashMap.clear();
            }
        }
        if (e != null) {
            try {
                o(context, "power_profile_test");
                k();
                q();
                f527374f = "test";
            } catch (java.lang.Exception e19) {
                exc = e19;
                oj.j.f("PowerProfile", "read from test failed: " + exc, new java.lang.Object[0]);
                hashMap2.clear();
                hashMap.clear();
            }
        } else {
            exc = e;
        }
        if (exc != null) {
            throw new java.io.IOException("readPowerValuesCompat failed", exc);
        }
    }

    public void n(android.content.Context context, java.io.File file) {
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
            p(context, newPullParser);
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

    public void o(android.content.Context context, java.lang.String str) {
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = context.getResources().getXml(context.getResources().getIdentifier(str, "xml", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f));
                p(context, xmlResourceParser);
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

    public final void p(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        int integer;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            wh.m1.a(xmlPullParser, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280);
            boolean z17 = false;
            java.lang.String str = null;
            while (true) {
                int next = xmlPullParser.next();
                if (next == 2 || next == 1) {
                    java.lang.String name = xmlPullParser.getName();
                    double d17 = 0.0d;
                    hashMap = f527371c;
                    hashMap2 = f527372d;
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

    public wh.n1 q() {
        if (this.f527375a.length <= 0) {
            throw new java.io.IOException("Invalid cpu clusters: " + this.f527375a.length);
        }
        for (int i17 = 0; i17 < this.f527375a.length; i17++) {
            if (i(i17) <= 0) {
                throw new java.io.IOException("Invalid cpu cluster speed-steps: cluster = " + i17 + ", steps = " + i(i17));
            }
        }
        int o17 = wh.m.o();
        int g17 = g();
        if (o17 == g17) {
            return this;
        }
        throw new java.io.IOException("Unmatched cpu core num, sys = " + o17 + ", profile = " + g17);
    }
}
