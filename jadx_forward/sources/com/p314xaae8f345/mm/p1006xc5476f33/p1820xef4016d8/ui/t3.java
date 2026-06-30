package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class t3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228975e;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228975e = activityC16363x8a0a619d;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bv7;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View p17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p3) cVar).f228837d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228975e;
        if (activityC16363x8a0a619d.Q2 == 7) {
            s0Var.w(com.p314xaae8f345.mm.R.id.j6l, 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b((android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.j6l), h5Var.f226846e, h5Var.f226852n);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226849h)) {
            s0Var.w(com.p314xaae8f345.mm.R.id.j6k, 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16363x8a0a619d.mo55332x76847179(), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.j6k), h5Var.f226849h);
            s0Var.w(com.p314xaae8f345.mm.R.id.j6k, 0);
        }
        s0Var.s(com.p314xaae8f345.mm.R.id.j6q, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f(activityC16363x8a0a619d.mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(h5Var.f226848g, 0L) * 1000));
        s0Var.w(com.p314xaae8f345.mm.R.id.j6q, 0);
        s0Var.w(com.p314xaae8f345.mm.R.id.j6r, 8);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226854p)) {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.j6p);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16363x8a0a619d.mo55332x76847179();
            java.lang.String str = h5Var.f226845d + h5Var.f226854p;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16363x8a0a619d.mo55332x76847179();
            java.lang.String str2 = h5Var.f226845d;
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7("#FA9D3B", new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q3(this)), j18.length(), j17.length(), 18);
            textView.setText(spannableStringBuilder);
        } else if (h5Var.f226855q) {
            s0Var.s(com.p314xaae8f345.mm.R.id.j6p, "");
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.j6p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s", h5Var.f226852n);
            textView2.setTag(h5Var.f226852n);
            ((java.util.HashSet) activityC16363x8a0a619d.f227626r2).add(h5Var.f226852n);
            ((c01.k7) c01.n8.a()).b(h5Var.f226852n, 4, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s3(this, h5Var, textView2));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16363x8a0a619d.mo55332x76847179(), (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.j6p), h5Var.f226845d);
        }
        s0Var.s(com.p314xaae8f345.mm.R.id.j6j, activityC16363x8a0a619d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(h5Var.f226847f / 100.0d)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226853o)) {
            s0Var.w(com.p314xaae8f345.mm.R.id.j6o, 8);
        } else {
            s0Var.s(com.p314xaae8f345.mm.R.id.j6o, h5Var.f226853o);
            s0Var.w(com.p314xaae8f345.mm.R.id.j6o, 0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226851m)) {
            s0Var.w(com.p314xaae8f345.mm.R.id.j6m, 8);
            s0Var.w(com.p314xaae8f345.mm.R.id.j6n, 8);
        } else {
            s0Var.s(com.p314xaae8f345.mm.R.id.j6n, h5Var.f226851m);
            if (activityC16363x8a0a619d.Q2 == 2) {
                ((android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.j6m)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_a);
            } else {
                ((android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.j6m)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c99);
            }
            s0Var.w(com.p314xaae8f345.mm.R.id.j6m, 0);
            s0Var.w(com.p314xaae8f345.mm.R.id.j6n, 0);
        }
        java.util.ArrayList arrayList = activityC16363x8a0a619d.T1;
        if (arrayList == null || arrayList.isEmpty() || (p17 = s0Var.p(com.p314xaae8f345.mm.R.id.uef)) == null) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) p17.getLayoutParams();
        if (i17 == arrayList.size() - 1) {
            layoutParams.leftMargin = i65.a.b(activityC16363x8a0a619d.mo55332x76847179(), 0);
        } else {
            layoutParams.leftMargin = i65.a.b(activityC16363x8a0a619d.mo55332x76847179(), 76);
        }
        p17.setLayoutParams(layoutParams);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.s0 s0Var, int i17) {
    }
}
