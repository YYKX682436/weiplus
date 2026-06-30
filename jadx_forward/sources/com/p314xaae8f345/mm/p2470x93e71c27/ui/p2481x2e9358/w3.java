package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272238d;

    public w3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272238d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272238d;
        c19666xfd6e2f33.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "playAutoBubbleExitAnimate");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        java.lang.String chatUsername = y4Var != null ? y4Var.c() : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voice_sessionid", u35.d.f505968a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("voice_auto_send_after_60s_hold", hashMap, 35963);
        float dimensionPixelSize = c19666xfd6e2f33.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        float dimensionPixelSize2 = c19666xfd6e2f33.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "translationY", 0.0f, -dimensionPixelSize);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "scaleX", 1.0f, 0.9f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271489a4, "scaleY", 1.0f, 0.9f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271511e4, "translationY", 0.0f, -dimensionPixelSize2);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(c19666xfd6e2f33.f271511e4, "alpha", 1.0f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        animatorSet.addListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n0(c19666xfd6e2f33));
        animatorSet.start();
    }
}
