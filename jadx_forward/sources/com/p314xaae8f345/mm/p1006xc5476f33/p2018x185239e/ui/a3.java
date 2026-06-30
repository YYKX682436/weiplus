package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class a3 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 f239163b;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var) {
        this.f239162a = h3Var;
        this.f239163b = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1
    public void a(r45.yt5 yt5Var, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (yt5Var == null) {
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", yt5Var.m75962x8b6d8abc());
        int i17 = yt5Var.f472887d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = this.f239163b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239162a;
        boolean z17 = (i17 == 1 || i17 == 2) && !h3Var.y(z0Var.f238602a, z0Var.f238621t);
        int i18 = z0Var.f238602a;
        java.lang.String str = z0Var.f238621t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0 x0Var = z0Var.f238612k;
        java.lang.String str2 = x0Var != null ? x0Var.f238597e : null;
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.x(h3Var, i18, str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t.e(7, z0Var.f238602a, z0Var.f238621t);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "need refresh item");
            h3Var.m8152xc67946d3(0, h3Var.mo1894x7e414b06(), java.lang.Boolean.TRUE);
        }
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.z2());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1
    public boolean b(r45.yt5 yt5Var, java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        return false;
    }
}
