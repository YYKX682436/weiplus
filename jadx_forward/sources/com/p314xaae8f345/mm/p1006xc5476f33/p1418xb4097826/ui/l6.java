package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class l6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f210990n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 f210991o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f210992p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o6 o6Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, android.content.Context context) {
        super(context);
        this.f210991o = o6Var;
        this.f210992p = layoutManager;
        this.f210990n = new android.view.animation.DecelerateInterpolator(2.0f);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        int[] c17 = this.f210991o.c(this.f210992p, targetView);
        int i17 = c17[0];
        int i18 = c17[1];
        int k17 = k(java.lang.Math.max(java.lang.Math.abs(i17), java.lang.Math.abs(i18)));
        if (k17 > 0) {
            action.b(i17, i18, k17, this.f210990n);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) this.f210992p;
        c15415x74224fd8.getClass();
        float f17 = c15415x74224fd8.f214173y;
        if (f17 > 0.0f) {
            i17 = displayMetrics.heightPixels;
        } else {
            f17 = c15415x74224fd8.f214172x;
            i17 = displayMetrics.densityDpi;
        }
        return f17 / i17;
    }
}
