package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f183367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 f183368e;

    public b0(r45.e21 e21Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466) {
        this.f183367d = e21Var;
        this.f183368e = c13667xc5da9466;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.j84 j84Var;
        if (g4Var.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityParticipateUIC", "showParticipatePrepareBottomSheet");
            g4Var.a(10012, com.p314xaae8f345.mm.R.C30867xcad56011.f573531ew0);
            boolean z17 = false;
            r45.e21 e21Var = this.f183367d;
            if (e21Var != null && (j84Var = (r45.j84) e21Var.m75936x14adae67(30)) != null && j84Var.m75933x41a8a7f2(0)) {
                z17 = true;
            }
            if (z17) {
                zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13667xc5da9466 c13667xc5da9466 = this.f183368e;
                ((c61.w8) paVar).Ui(3, c13667xc5da9466.f183358v, c13667xc5da9466.f183359w, null);
                g4Var.a(10013, com.p314xaae8f345.mm.R.C30867xcad56011.e5h);
            }
        }
    }
}
