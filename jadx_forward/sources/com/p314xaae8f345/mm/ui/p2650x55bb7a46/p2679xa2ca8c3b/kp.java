package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kp extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f285900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp f285902f;

    public kp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar, boolean z17, yb5.d dVar) {
        this.f285902f = lpVar;
        this.f285900d = z17;
        this.f285901e = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        yb5.d dVar = this.f285901e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lp lpVar = this.f285902f;
        boolean z17 = this.f285900d;
        if (z17) {
            lpVar.B.setText(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7c));
        } else {
            lpVar.B.setText(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7d));
        }
        yd5.r.f542680a.c(z17 ^ true ? "chat_voice_message_speed_up" : "chat_voice_message_speed_reset", false, true);
    }
}
