package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f100862d;

    public g4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f100862d = favPostVoiceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI = this.f100862d;
        android.view.View findViewById = favPostVoiceUI.findViewById(com.tencent.mm.R.id.p6l);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = favPostVoiceUI.f100387v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = favPostVoiceUI.findViewById(com.tencent.mm.R.id.dvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        favPostVoiceUI.f100387v.startAnimation(alphaAnimation);
        favPostVoiceUI.findViewById(com.tencent.mm.R.id.p6l).startAnimation(alphaAnimation);
        favPostVoiceUI.findViewById(com.tencent.mm.R.id.dvh).startAnimation(translateAnimation);
    }
}
