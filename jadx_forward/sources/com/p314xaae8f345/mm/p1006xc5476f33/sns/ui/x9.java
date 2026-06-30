package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class x9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y9 f253032d;

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y9 y9Var) {
        this.f253032d = y9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y9 y9Var = this.f253032d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(y9Var.f253157p) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38281x4178699b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar = y9Var.f253157p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean o17 = paVar.o();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (!o17) {
            float a17 = ym5.x.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p), 4.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar2 = y9Var.f253157p;
            int color = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(paVar2).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4n);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            android.graphics.drawable.StateListDrawable n17 = paVar2.n(a17, color);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(y9Var.f253157p).setBackground(n17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(y9Var.f253157p).setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4o));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdCardActionBtnCtrl", "btn is not enable!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
            return;
        }
        float f17 = 0.0f;
        if (valueAnimator != null) {
            try {
                f17 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", e17.toString());
            }
        }
        int color2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar3 = y9Var.f253157p;
        int f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar3, color2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar3).f38285x68b19291, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38284x7c1f5a67);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar4 = y9Var.f253157p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(y9Var.f253157p).setTextColor(e3.b.c(f18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar4, color2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar4).f38281x4178699b.f247548e, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38281x4178699b.f247546c), f17));
        int color3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560134c0);
        int color4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560135c1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar5 = y9Var.f253157p;
        int f19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar5, color3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar5).f38283x8c9e72cc, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38282xace39022);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar6 = y9Var.f253157p;
        int c17 = e3.b.c(f19, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar6, color3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar6).f38281x4178699b.f247549f, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38281x4178699b.f247547d), f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar7 = y9Var.f253157p;
        int f27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar7, color4, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar7).f38283x8c9e72cc, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38282xace39022);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa paVar8 = y9Var.f253157p;
        int c18 = e3.b.c(e3.b.c(f27, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.f(paVar8, color4, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(paVar8).f38281x4178699b.f247549f, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.k(y9Var.f253157p).f38281x4178699b.f247547d), f17), -16777216, 0.125f);
        float a18 = ym5.x.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p), 4.0f);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        android.graphics.drawable.ShapeDrawable p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p), c18, a18);
        android.graphics.drawable.ShapeDrawable p18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.d(y9Var.f253157p), c17, a18);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, p17);
        stateListDrawable.addState(new int[0], p18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pa.i(y9Var.f253157p).setBackground(stateListDrawable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$6$1");
    }
}
