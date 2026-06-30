package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public class i extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f276550f = {l75.n0.m145250x3fdc6f77(dm.o.m125352x3593deb(null), "AddContactAntispamTicket")};

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f276551d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f276552e;

    public i(l75.k0 k0Var) {
        super(k0Var, dm.o.m125352x3593deb(null), "AddContactAntispamTicket", null);
        this.f276551d = new java.util.HashMap();
        this.f276552e = k0Var;
    }

    public void D0(java.lang.String str, int i17, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        ((java.util.HashMap) this.f276551d).put(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AntispamTicketStorage", "justAddToCache, username:%s, scene:%d, ticket:%s", str, java.lang.Integer.valueOf(i17), str2);
    }

    public void y0(java.lang.String str, int i17, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h hVar = new com.p314xaae8f345.mm.p2621x8fb0427b.h();
        hVar.f67762xdde069b = str;
        hVar.f67760x29cbf907 = i17;
        hVar.f67761x11bb99f1 = str2;
        boolean mo11260x413cb2b4 = mo11260x413cb2b4(hVar);
        D0(str, i17, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AntispamTicketStorage", "addTicket, username:%s, scene:%d, ticket:%s, result: %b", str, java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(mo11260x413cb2b4));
    }

    public java.lang.String z0(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f276551d).get(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str2;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.h hVar = new com.p314xaae8f345.mm.p2621x8fb0427b.h();
        hVar.f67762xdde069b = str;
        if (!get(hVar, "userName")) {
            return null;
        }
        D0(hVar.f67762xdde069b, hVar.f67760x29cbf907, hVar.f67761x11bb99f1);
        return hVar.f67761x11bb99f1;
    }
}
