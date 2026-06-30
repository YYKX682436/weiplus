package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class qg implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 f214426d;

    public qg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 c15330x673c21f7) {
        this.f214426d = c15330x673c21f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View m62292x60166df4;
        int m62293x6adea43b;
        android.view.View m62284x8838954d;
        int m62285xa53cf079;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m62282xfb80a4ef;
        int m62283x4fdde990;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m62282xfb80a4ef2;
        int m62283x4fdde9902;
        android.widget.TextView m62286xff46996e;
        int m62289xe4cffef9;
        int m62288xa04ca07;
        android.widget.TextView m62286xff46996e2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 c15330x673c21f7 = this.f214426d;
        m62292x60166df4 = c15330x673c21f7.m62292x60166df4();
        android.view.ViewGroup.LayoutParams layoutParams = m62292x60166df4.getLayoutParams();
        m62293x6adea43b = c15330x673c21f7.m62293x6adea43b();
        int i17 = (int) (m62293x6adea43b * floatValue);
        if (i17 < 1) {
            i17 = 1;
        }
        layoutParams.height = i17;
        m62284x8838954d = c15330x673c21f7.m62284x8838954d();
        android.view.ViewGroup.LayoutParams layoutParams2 = m62284x8838954d.getLayoutParams();
        m62285xa53cf079 = c15330x673c21f7.m62285xa53cf079();
        int i18 = (int) (m62285xa53cf079 * floatValue);
        layoutParams2.width = i18 >= 1 ? i18 : 1;
        m62282xfb80a4ef = c15330x673c21f7.m62282xfb80a4ef();
        android.view.ViewGroup.LayoutParams layoutParams3 = m62282xfb80a4ef.getLayoutParams();
        m62283x4fdde990 = c15330x673c21f7.m62283x4fdde990();
        layoutParams3.width = (int) (m62283x4fdde990 * (floatValue < 0.67f ? 0.67f : floatValue));
        m62282xfb80a4ef2 = c15330x673c21f7.m62282xfb80a4ef();
        android.view.ViewGroup.LayoutParams layoutParams4 = m62282xfb80a4ef2.getLayoutParams();
        m62283x4fdde9902 = c15330x673c21f7.m62283x4fdde990();
        layoutParams4.height = (int) (m62283x4fdde9902 * (floatValue >= 0.67f ? floatValue : 0.67f));
        m62286xff46996e = c15330x673c21f7.m62286xff46996e();
        android.view.ViewGroup.LayoutParams layoutParams5 = m62286xff46996e.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams.width = (int) (c15330x673c21f7.f212884q * floatValue);
        marginLayoutParams.height = (int) (c15330x673c21f7.f212885r * floatValue);
        m62289xe4cffef9 = c15330x673c21f7.m62289xe4cffef9();
        marginLayoutParams.topMargin = (int) (m62289xe4cffef9 * floatValue);
        m62288xa04ca07 = c15330x673c21f7.m62288xa04ca07();
        marginLayoutParams.bottomMargin = (int) (m62288xa04ca07 * floatValue);
        m62286xff46996e2 = c15330x673c21f7.m62286xff46996e();
        m62286xff46996e2.requestLayout();
    }
}
