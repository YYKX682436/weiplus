package jm3;

/* loaded from: classes10.dex */
public final class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381854d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a) {
        this.f381854d = activityC16653xffd2636a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381854d;
        activity.Z6().animate().setListener(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        if (h4Var.f232702p + 1 < h4Var.R6().mo1894x7e414b06()) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 S6 = h4Var.S6();
            int i18 = h4Var.f232702p + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            S6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFixEditUIC", "moveToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
