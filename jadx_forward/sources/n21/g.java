package n21;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f415786a = "BeiJing;GuangZhou;ShangHai;";

    /* renamed from: b, reason: collision with root package name */
    public int f415787b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f415788c = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f415789d = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f415790e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f415791f = com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb;

    /* renamed from: g, reason: collision with root package name */
    public int f415792g = 10240000;

    /* renamed from: h, reason: collision with root package name */
    public int f415793h = 100;

    /* renamed from: i, reason: collision with root package name */
    public int f415794i = 100;

    /* renamed from: j, reason: collision with root package name */
    public int f415795j = 100;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Random f415796k = new java.util.Random();

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f415797l = null;

    public static n21.g b() {
        rz.q qVar = (rz.q) i95.n0.c(rz.q.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((qz.c) qVar).getClass();
        f21.r0.Bi().getClass();
        sb6.append(zz1.a.a());
        sb6.append(f21.r0.Bi().u0(1, 9));
        java.lang.String sb7 = sb6.toString();
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(sb7);
        if (k17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("upload", "read file failed " + k17 + sb7);
            return null;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, k17);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("upload", "read file failed " + k17 + sb7);
            return null;
        }
        java.lang.String str = new java.lang.String(N);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        n21.g gVar = (n21.g) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) n21.h.f415798f).get(java.lang.Integer.valueOf(hashCode));
        if (gVar != null) {
            return gVar;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "Config", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("upload", "parse msg failed");
            return null;
        }
        try {
            n21.g gVar2 = new n21.g();
            int i17 = 0;
            while (true) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(".Config.Item");
                java.lang.Object obj = "";
                sb8.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                sb8.append(".$key");
                java.lang.String str2 = (java.lang.String) d17.get(sb8.toString());
                if (str2 == null) {
                    ((kk.l) n21.h.f415798f).j(java.lang.Integer.valueOf(hashCode), gVar2);
                    return gVar2;
                }
                if (str2.equals("region")) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb9.append(obj);
                    java.lang.String str3 = (java.lang.String) d17.get(sb9.toString());
                    gVar2.f415786a = str3;
                    if (str3 != null && str3.length() > 0) {
                        java.lang.String[] split = gVar2.f415786a.split(";");
                        gVar2.f415797l = new java.util.ArrayList();
                        if (split != null && split.length > 0) {
                            for (int i18 = 0; i18 < split.length; i18++) {
                                java.lang.String str4 = split[i18];
                                if (str4 != null && str4.length() > 0) {
                                    ((java.util.ArrayList) gVar2.f415797l).add(split[i18]);
                                }
                            }
                        }
                    }
                } else if (str2.equals("sex")) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb10.append(obj);
                    gVar2.f415787b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb10.toString()), 0);
                } else if (str2.equals(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54480x74e6a74f)) {
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                    sb11.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb11.append(obj);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb11.toString()), 0);
                } else if (str2.equals("minsize")) {
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb12.append(obj);
                    gVar2.f415791f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb12.toString()), 0);
                } else if (str2.equals("maxsize")) {
                    java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                    sb13.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb13.append(obj);
                    gVar2.f415792g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb13.toString()), 0);
                } else if (str2.equals("daycount_single")) {
                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                    sb14.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb14.append(obj);
                    gVar2.f415793h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb14.toString()), 0);
                } else if (str2.equals("daycount_chatroom")) {
                    java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                    sb15.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb15.append(obj);
                    gVar2.f415794i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb15.toString()), 0);
                } else if (str2.equals("daycount_app")) {
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    sb16.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb16.append(obj);
                    gVar2.f415795j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb16.toString()), 0);
                } else if (str2.equals("rate_single")) {
                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                    sb17.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb17.append(obj);
                    gVar2.f415788c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb17.toString()), 0);
                } else if (str2.equals("rate_chatroom")) {
                    java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                    sb18.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb18.append(obj);
                    gVar2.f415789d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb18.toString()), 0);
                } else if (str2.equals("rate_app")) {
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    sb19.append(".Config.Item");
                    if (i17 != 0) {
                        obj = java.lang.Integer.valueOf(i17);
                    }
                    sb19.append(obj);
                    gVar2.f415790e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(sb19.toString()), 0);
                }
                i17++;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("upload", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public boolean a() {
        java.util.List list;
        java.lang.String[] split;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
        if (("  getRegionCode " + g17) != null) {
            java.lang.String str = g17.f318103l1;
        }
        java.lang.String str2 = g17.f318103l1;
        if (str2 != null && str2.length() > 0 && (list = this.f415797l) != null && ((java.util.ArrayList) list).size() > 0 && (split = str2.split("_")) != null && split.length > 0) {
            for (int i17 = 0; i17 < split.length; i17++) {
                java.lang.String str3 = split[i17];
                if (str3 != null && str3.length() > 0) {
                    java.util.Iterator it = ((java.util.ArrayList) this.f415797l).iterator();
                    while (it.hasNext()) {
                        if (((java.lang.String) it.next()).trim().toLowerCase().equals(split[i17].trim().toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
