package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f101834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101835e;

    public b0(r45.e21 e21Var, com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC) {
        this.f101834d = e21Var;
        this.f101835e = finderActivityParticipateUIC;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.j84 j84Var;
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "showParticipatePrepareBottomSheet");
            g4Var.a(10012, com.tencent.mm.R.string.f491998ew0);
            boolean z17 = false;
            r45.e21 e21Var = this.f101834d;
            if (e21Var != null && (j84Var = (r45.j84) e21Var.getCustom(30)) != null && j84Var.getBoolean(0)) {
                z17 = true;
            }
            if (z17) {
                zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
                com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101835e;
                ((c61.w8) paVar).Ui(3, finderActivityParticipateUIC.f101825v, finderActivityParticipateUIC.f101826w, null);
                g4Var.a(10013, com.tencent.mm.R.string.e5h);
            }
        }
    }
}
