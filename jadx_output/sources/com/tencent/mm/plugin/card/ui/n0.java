package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class n0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f95084c;

    public n0(com.tencent.mm.plugin.card.ui.b0 b0Var, int i17, java.lang.String str) {
        this.f95084c = b0Var;
        this.f95082a = i17;
        this.f95083b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.card.ui.b0 b0Var = this.f95084c;
            b0Var.f94934J = str;
            int i18 = this.f95082a;
            if (i18 == 0) {
                com.tencent.mm.plugin.card.ui.s0 s0Var = b0Var.T;
                if (s0Var != null) {
                    ((com.tencent.mm.plugin.card.ui.q) s0Var).b(this.f95083b);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperGift", 1, java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), b0Var.I);
                com.tencent.mm.ui.MMActivity mMActivity = b0Var.f94936e;
                db5.e1.T(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.asp));
                return;
            }
            if (i18 == 1) {
                b0Var.E.Y().f377580d = b0Var.h(com.tencent.mm.R.string.avh) + b0Var.H.d();
                lu1.a0.G(b0Var.E, b0Var.I, b0Var.U.f95108f, 2, true, false);
                lu1.a0.H(b0Var.f94934J, b0Var.I);
                com.tencent.mm.ui.MMActivity mMActivity2 = b0Var.f94936e;
                db5.e1.T(mMActivity2, mMActivity2.getResources().getString(com.tencent.mm.R.string.asp));
                return;
            }
            if (i18 == 4) {
                if (android.text.TextUtils.isEmpty(b0Var.E.a())) {
                    b0Var.E.j0(c01.z1.r());
                }
                b0Var.E.Y().f377580d = b0Var.h(com.tencent.mm.R.string.aum) + b0Var.H.d();
                lu1.a0.G(b0Var.E, b0Var.I, b0Var.U.f95108f, 23, true, false);
                lu1.a0.H(b0Var.f94934J, b0Var.I);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OpeRecommendCard", java.lang.Integer.valueOf(b0Var.U.f95103a), java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), b0Var.I);
                com.tencent.mm.ui.MMActivity mMActivity3 = b0Var.f94936e;
                db5.e1.T(mMActivity3, mMActivity3.getResources().getString(com.tencent.mm.R.string.asp));
            }
        }
    }
}
