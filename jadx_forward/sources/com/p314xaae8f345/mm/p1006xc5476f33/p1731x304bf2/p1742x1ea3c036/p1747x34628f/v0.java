package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f221477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221478f;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, java.lang.String str, android.os.Bundle bundle) {
        this.f221478f = x0Var;
        this.f221476d = str;
        this.f221477e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        zq1.l0 l0Var;
        java.lang.String str = this.f221476d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221478f;
        boolean z17 = x0Var.T;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "load url, url: %s, fromStash: %b  mFirstLoad : %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(x0Var.N));
        sd.o0 o0Var = x0Var.f488188i;
        o0Var.f488171q = str;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "stash url");
            x0Var.f263719t.m74262xd4333bda(true);
            android.os.Bundle bundle = x0Var.f488190n;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28))) {
                x0Var.I(bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), 0);
            }
            x0Var.N = false;
            if (x0Var.f263711J == null) {
                x0Var.f263711J = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d(null);
            }
            x0Var.f263711J.f264916c = 32;
            x0Var.V(str);
            return;
        }
        x0Var.U();
        java.lang.String string = this.f221477e.getString("game_open_html");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            x0Var.f263714p0 = true;
            x0Var.f263713p.mo64581x9b341568(str, string, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        } else if (x0Var.y(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "loadUrlWithoutCache, url: %s, __Time__: %d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Cache-Control", "no-cache");
            x0Var.f263713p.mo32266x141096a9(str, hashMap);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = x0Var.M1;
            if (c10723x8ab106bc.D == 0) {
                c10723x8ab106bc.D = java.lang.System.currentTimeMillis();
            }
        } else if (!x0Var.N) {
            x0Var.b(str, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "before GetA8Key stopLoading and load url, url: %s,", str);
        zq1.j0 b17 = ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).b(str, null);
        if (b17 != null && (l0Var = b17.f556534g) != null && l0Var.f556546a != null) {
            x0Var.Z = true;
            o0Var.f488166i.mo32269xc77ccada();
            o0Var.j(str);
        }
        x0Var.V(str);
        x0Var.N = false;
    }
}
