package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class b1 extends sd.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f263683a;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var) {
        this.f263683a = e0Var;
    }

    @Override // sd.t0
    public android.webkit.WebResourceResponse a(android.webkit.WebResourceRequest webResourceRequest, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = this.f263683a;
        try {
            int i17 = bundle.getInt("resourceType");
            if (i17 == 1 || i17 == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "get resoutce type is iframe : %d, start geta8key", java.lang.Integer.valueOf(i17));
                java.lang.String uri = webResourceRequest.getUrl().toString();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar = e0Var.f263711J;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a aVar = e0Var.B1;
                synchronized (dVar) {
                    dVar.t(uri, false, 5, aVar);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageMMWebPage", "get resource type failed Exception ; %s", e17.getMessage());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageMMWebPage", "get resource type failed Throwable ; %s", th6.getMessage());
        }
        if (webResourceRequest != null) {
            webResourceRequest.getUrl().toString();
        }
        e0Var.getClass();
        return null;
    }

    @Override // sd.t0
    public void c(sd.u0 u0Var, java.lang.String str) {
        this.f263683a.C(str);
    }

    @Override // sd.t0
    public void d(sd.u0 u0Var, java.lang.String str) {
        int l17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) this.f263683a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.w0 w0Var = x0Var.f221488g2;
        if (w0Var != null) {
            w0Var.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = x0Var.M;
        n3Var.mo77785xc570fb34(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l0(x0Var));
        vz4.x S = x0Var.S();
        uw4.n nVar = x0Var.f263713p;
        S.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new vz4.u(S, nVar));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onUrlLoadingStarted, url = %s, __Time__, time = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        int a17 = hy4.b0.a(x0Var.f488143d);
        if (a17 < 1 || a17 > 8) {
            a17 = 2;
        }
        x0Var.z(a17);
        n3Var.mo77785xc570fb34(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f0(x0Var, a17));
        boolean V = x0Var.V(str);
        sd.o0 o0Var = x0Var.f488188i;
        if (V && ((l17 = x0Var.f263711J.l(str, false)) == 0 || l17 == 2 || l17 == 8)) {
            o0Var.f488166i.mo32269xc77ccada();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k.b(x0Var.f263713p);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x2 x2Var = x0Var.D;
            if (x2Var != null) {
                x2Var.c0("rawUrl", str);
                x2Var.t0(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = x0Var.F;
            if (c16092xbbe22aef != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                c16092xbbe22aef.m65140xca029dad(str == null ? "" : str);
                ((d73.i) i95.n0.c(d73.i.class)).Jc(x0Var.F);
            }
            x0Var.f263719t.m74262xd4333bda(false);
            x0Var.U();
            x0Var.H(str);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = x0Var.M1;
        if (c10723x8ab106bc.E == 0) {
            c10723x8ab106bc.E = currentTimeMillis;
        }
        sx4.d0 d0Var = x0Var.P1;
        if (d0Var.f495118d == 0) {
            d0Var.f495118d = currentTimeMillis;
        }
        java.lang.String N = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N(str);
        if (N == null || !N.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy))) {
            o0Var.f488152e = x0Var.L;
        } else {
            o0Var.f488152e = td.c.f499116a;
        }
        sx4.v vVar = x0Var.L1.f495199f.f495193a;
        vVar.f495198e = null;
        vVar.f495195b = 0L;
        vVar.f495196c = 0L;
        vVar.f495197d = 0L;
    }
}
