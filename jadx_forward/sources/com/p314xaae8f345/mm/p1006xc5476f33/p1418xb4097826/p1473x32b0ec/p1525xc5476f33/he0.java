package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class he0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 f194336d;

    public he0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var) {
        this.f194336d = le0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.g7 g7Var = (mm2.g7) obj;
        if (g7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0 le0Var = this.f194336d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(le0Var.f194923s, "initPlugin onPageSelect");
            le0Var.x1(((mm2.c1) le0Var.P0(mm2.c1.class)).L9(), false);
            le0Var.v1(g7Var.f410628b, g7Var.f410629c, g7Var.f410630d);
            if (((mm2.w) le0Var.P0(mm2.w.class)).O6()) {
                return;
            }
            le0Var.f194920p.setAlpha(1.0f);
        }
    }
}
