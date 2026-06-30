package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public final class x0 implements i22.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c f180085a;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c) {
        this.f180085a = activityC13303x3d472b4c;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        boolean z17;
        j12.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (n0Var == null || !((z17 = n0Var instanceof i22.m0))) {
            return;
        }
        i22.m0 m0Var = z17 ? (i22.m0) n0Var : null;
        if (m0Var == null || (iVar = m0Var.f369537a) == null) {
            return;
        }
        bw5.ra raVar = iVar.f378701c;
        java.lang.String str = raVar.f113989d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, null, iVar);
        d0Var.f445731g = 106;
        d0Var.f445688a = 69;
        d0Var.f445733i = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c = this.f180085a;
        java.lang.String stringExtra = activityC13303x3d472b4c.getIntent().getStringExtra("to_talker_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        d0Var.f445732h = stringExtra;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(activityC13303x3d472b4c.getIntent(), "from_appbrand_ui", false);
        nr.d dVar = nr.d.f420574a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6407xe9d59d8 c6407xe9d59d8 = nr.d.f420575b;
        c6407xe9d59d8.p(raVar.f113989d);
        dVar.a(4);
        c6407xe9d59d8.p("");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 4, "", "", "", 69, 69);
        d22.u.f307409a.a(activityC13303x3d472b4c.mo55332x76847179(), d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i22.p0
    public void b(i22.m holder, int i17, i22.n0 n0Var) {
        boolean z17;
        j12.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (n0Var != null && ((z17 = n0Var instanceof i22.m0)) && (holder instanceof i12.x)) {
            i22.m0 m0Var = z17 ? (i22.m0) n0Var : null;
            if (m0Var == null || (iVar = m0Var.f369537a) == null) {
                return;
            }
            nr.d dVar = nr.d.f420574a;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6407xe9d59d8 c6407xe9d59d8 = nr.d.f420575b;
            c6407xe9d59d8.p(iVar.f378701c.f113989d);
            dVar.a(3);
            c6407xe9d59d8.p("");
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13303x3d472b4c activityC13303x3d472b4c = this.f180085a;
            i22.b0 b0Var = activityC13303x3d472b4c.f179279f;
            if (b0Var != null) {
                b0Var.f369468d = (i22.q0) holder;
            }
            if (b0Var != null) {
                b0Var.f369473i = new g22.u0(activityC13303x3d472b4c.mo273xed6858b4(), activityC13303x3d472b4c.f179279f);
            }
            i22.b0 b0Var2 = activityC13303x3d472b4c.f179279f;
            if (b0Var2 != null) {
                b0Var2.b();
            }
        }
    }
}
