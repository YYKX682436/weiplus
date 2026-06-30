package tk4;

/* loaded from: classes5.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501492e;

    public a0(tk4.c0 c0Var, android.view.View view) {
        this.f501491d = c0Var;
        this.f501492e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioPush.TipsManager", "show banner!!");
        android.view.View view = this.f501492e;
        int measuredHeight = view.getMeasuredHeight();
        tk4.c0 c0Var = this.f501491d;
        c0Var.f501501f = measuredHeight;
        android.animation.Animator animator = c0Var.f501498c;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-c0Var.f501501f, 0);
        android.view.View view2 = c0Var.f501497b;
        if (view2 != null) {
            ofInt.addUpdateListener(new tk4.y(view2, c0Var));
        }
        ofInt.addListener(new tk4.z(view, c0Var));
        ofInt.setDuration(200L);
        ofInt.start();
        c0Var.f501498c = ofInt;
    }
}
