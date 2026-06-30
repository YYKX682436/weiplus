package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289736a;

    public w(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        this.f289736a = activityC22359x66709fa8;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289736a;
        activityC22359x66709fa8.f39543x88e85d54 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "klem animationEnd");
        com.p314xaae8f345.mm.ui.cf.f279625d.b();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.m80477xbbd79cb9(activityC22359x66709fa8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        long j17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289736a;
        j17 = activityC22359x66709fa8.f39554x6408e5f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseConversationUI", "klem onAnimationStart onDrawed->onAnimationStart:%sms", java.lang.Long.valueOf(currentTimeMillis - j17));
        activityC22359x66709fa8.f39543x88e85d54 = true;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8.m80476xbbd798f8(activityC22359x66709fa8);
        activityC22359x66709fa8.T6(false, 0);
    }
}
