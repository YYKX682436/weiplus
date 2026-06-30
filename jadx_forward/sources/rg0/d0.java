package rg0;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f476703c;

    /* renamed from: a, reason: collision with root package name */
    public static final rg0.d0 f476701a = new rg0.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f476702b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f476704d = new java.lang.Object();

    public final void a() {
        java.io.InputStream E;
        java.io.InputStreamReader inputStreamReader;
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/anops";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str3 = a18.f294812f;
            if (str3 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a18, null);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        java.lang.String concat = str.concat("/comm.img");
        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(concat);
        java.lang.String str4 = a19.f294812f;
        if (str4 != null) {
            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l19)) {
                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a19, null);
        boolean z17 = true;
        java.lang.String str5 = "";
        if (!m19.a() ? false : m19.f294799a.F(m19.f294800b)) {
            java.lang.String concat2 = str.concat("/comm.json");
            rg0.t tVar = rg0.t.f476724a;
            if (tVar.c(concat, concat2).length() == 0) {
                tVar.j("TL config dec failed!");
            } else {
                str5 = concat2;
            }
        } else {
            rg0.t.f476724a.j("TL config not found!");
        }
        if (str5 != null && str5.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        try {
            E = com.p314xaae8f345.mm.vfs.w6.E(str5);
            try {
                inputStreamReader = new java.io.InputStreamReader(E);
            } finally {
            }
        } catch (java.lang.Exception e17) {
            rg0.t.f476724a.j("TL config read error!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLCManager", "read failed: %s", e17.getLocalizedMessage());
        }
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            try {
                java.lang.String c17 = vz5.v.c(bufferedReader);
                vz5.b.a(bufferedReader, null);
                vz5.b.a(inputStreamReader, null);
                vz5.b.a(E, null);
                c(c17);
                com.p314xaae8f345.mm.vfs.z7 a27 = com.p314xaae8f345.mm.vfs.z7.a(str5);
                java.lang.String str6 = a27.f294812f;
                if (str6 != null) {
                    java.lang.String l27 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l27)) {
                        a27 = new com.p314xaae8f345.mm.vfs.z7(a27.f294810d, a27.f294811e, l27, a27.f294813g, a27.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a27, null);
                if (m27.a()) {
                    m27.f294799a.d(m27.f294800b);
                }
            } finally {
            }
        } finally {
        }
    }

    public final boolean b(java.lang.String str) {
        boolean z17 = true;
        if (!f476703c) {
            synchronized (f476704d) {
                f476701a.a();
            }
            f476703c = true;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return false;
        }
        return ((java.util.ArrayList) f476702b).contains(str);
    }

    public final void c(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.optString("config_ver", ""), "optString(...)");
        java.lang.String optString = jSONObject.optString("scene_list", "");
        if (optString == null || optString.length() == 0) {
            return;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(optString, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.List list = f476702b;
        ((java.util.ArrayList) list).clear();
        for (java.lang.String str2 : f07) {
            if (!r26.n0.N(str2)) {
                ((java.util.ArrayList) list).add(r26.n0.u0(str2).toString());
            }
        }
    }
}
