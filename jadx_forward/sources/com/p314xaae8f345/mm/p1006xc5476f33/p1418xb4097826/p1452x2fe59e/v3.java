package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class v3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f192402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f192403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f192404d;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, so2.y0 y0Var, boolean z17, fp0.r rVar) {
        this.f192401a = a7Var;
        this.f192402b = y0Var;
        this.f192403c = z17;
        this.f192404d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f192401a;
        so2.y0 y0Var = this.f192402b;
        if (intValue == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p2 p2Var = a7Var.f187750p;
            if (p2Var != null) {
                p2Var.a(y0Var.f492236d.t0(), y0Var.f492236d.f68961xf609be94, true);
            }
            if (y0Var.f492236d.Y0() == 0 && (h17 = bu2.j.f106067a.h(y0Var.f492236d.f68959xf9a02e3e)) != null) {
                h17.m59355xc51b2372(h17.m59216x8ed22866() - 1);
                if (h17.m59216x8ed22866() < 0) {
                    h17.m59355xc51b2372(0);
                }
                if (y0Var.f492236d.A0() > 0 && y0Var.f492236d.A0() <= h17.m59216x8ed22866()) {
                    h17.m59355xc51b2372(h17.m59216x8ed22866() - y0Var.f492236d.A0());
                }
                hc2.a0.d(h17);
                a7Var.C0();
            }
            db5.t7.m123882x26a183b(a7Var.f187740d, com.p314xaae8f345.mm.R.C30867xcad56011.f2d, 0).show();
        } else if (intValue == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.p(a7Var, list, y0Var, this.f192403c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.B(a7Var, list);
        }
        this.f192404d.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
