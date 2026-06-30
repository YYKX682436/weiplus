package ub3;

/* loaded from: classes9.dex */
public class y implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507681d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95) {
        this.f507681d = activityC16331x46dfff95;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95 = this.f507681d;
        android.content.Intent intent = activityC16331x46dfff95.f226642x;
        if (intent != null) {
            activityC16331x46dfff95.m78604xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class, intent);
        }
        activityC16331x46dfff95.setResult(-1, null);
        activityC16331x46dfff95.finish();
        if (activityC16331x46dfff95.f226642x != null) {
            activityC16331x46dfff95.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
