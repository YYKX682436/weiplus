package ip;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f375084f = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "configlist/";

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f375085a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f375086b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("configListDecoder_debug_xml");

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f375087c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f375088d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f375089e = false;

    public static java.lang.String c(int i17) {
        return f375084f + "config_" + i17 + ".xml";
    }

    public java.util.List a() {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String a17 = ip.h.a(new java.lang.String[]{"FullScreenMpLinkPrefixList", "MpLinkPrefix"});
        ip.h d17 = d(1);
        java.util.Map map = null;
        if (d17 != null && (d17 instanceof ip.i)) {
            java.util.HashMap hashMap = ((ip.i) d17).f375101f;
            if (hashMap.containsKey("MPConfig")) {
                java.lang.Object obj = ((java.util.HashMap) hashMap.get("MPConfig")).get(a17);
                if (obj instanceof java.util.Map) {
                    map = (java.util.Map) obj;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConfigListInfoExtension", "get item list, but item object no instance of list");
                }
            }
        }
        if (map != null && !map.isEmpty()) {
            for (int i17 = 0; i17 < 100; i17++) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17 == 0 ? a17 : a17 + i17);
                sb6.append(".");
                java.lang.String sb7 = sb6.toString();
                java.util.Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((java.lang.String) it.next()).startsWith(sb7)) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    break;
                }
                java.lang.String str = (java.lang.String) map.get(sb7 + "urlPrefix");
                if (!android.text.TextUtils.isEmpty(str)) {
                    jp.a aVar = new jp.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                    aVar.f382503a = str;
                    for (int i18 = 0; i18 < 100; i18++) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(sb7);
                        sb8.append(i18 != 0 ? "showTypeList.showType" + i18 : "showTypeList.showType");
                        java.lang.String sb9 = sb8.toString();
                        if (!map.containsKey(sb9)) {
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) map.get(sb9);
                        if (android.text.TextUtils.isEmpty(str2)) {
                            break;
                        }
                        try {
                            aVar.f382504b.add(java.lang.Integer.valueOf(str2.trim()));
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public java.lang.String b(int i17, java.lang.String str, java.lang.String str2) {
        ip.h d17 = d(i17);
        if (d17 == null) {
            return null;
        }
        java.util.HashMap hashMap = d17.f375098b;
        if (hashMap.containsKey(str)) {
            return (java.lang.String) ((java.util.HashMap) hashMap.get(str)).get(str2);
        }
        return null;
    }

    public final ip.h d(int i17) {
        if (!this.f375089e) {
            synchronized (this) {
                if (!this.f375089e) {
                    int i18 = 0;
                    while (true) {
                        int[] iArr = ip.h.f375096e;
                        if (i18 >= 1) {
                            break;
                        }
                        f(iArr[i18]);
                        i18++;
                    }
                    this.f375089e = true;
                }
            }
        }
        if (this.f375085a.get(i17) == null) {
            f(i17);
        }
        return (ip.h) this.f375085a.get(i17);
    }

    public java.util.List e() {
        java.lang.String b17 = b(1, "IBeacon", "Content");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator<java.lang.String> keys = new org.json.JSONObject(b17.replace(",}", "}")).keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (next != null) {
                    arrayList.add(next.toString());
                }
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "[oneliang] json parse exception: " + e17.getMessage());
            return arrayList;
        }
    }

    public void f(int i17) {
        java.io.InputStream inputStream = null;
        try {
            try {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c(i17));
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    inputStream = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17));
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    while (true) {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            stringBuffer.append(readLine);
                        }
                    }
                    g(i17, stringBuffer.toString());
                    inputStreamReader.close();
                    bufferedReader.close();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
            } catch (java.lang.Exception e18) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e27) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                }
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip.e.g(int, java.lang.String):void");
    }

    public final void h(int i17) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f375088d);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s4) ((ip.d) it.next())).getClass();
            if (i17 == 1) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268417a) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268421e.clear();
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConfigListDecoder", "notifyConfigFileUpdate configID=%s ", java.lang.Integer.valueOf(i17));
        ((java.util.ArrayList) this.f375087c).clear();
        ((java.util.ArrayList) this.f375087c).addAll(a());
    }

    public int i() {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceVOIPSwitch"), 0);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return 0;
        }
    }
}
