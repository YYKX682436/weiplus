package vc1;

/* loaded from: classes13.dex */
public class m0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.j2 f516541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516543f;

    public m0(vc1.p1 p1Var, vc1.j2 j2Var, java.lang.String str) {
        this.f516543f = p1Var;
        this.f516541d = j2Var;
        this.f516542e = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationCancel");
        vc1.j2 j2Var = this.f516541d;
        if (j2Var != null) {
            j2Var.b();
        }
        synchronized (this.f516543f.f516625q) {
            this.f516543f.f516625q.remove(this.f516542e);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationEnd");
        vc1.j2 j2Var = this.f516541d;
        if (j2Var != null) {
            j2Var.a(true);
        }
        synchronized (this.f516543f.f516625q) {
            this.f516543f.f516625q.remove(this.f516542e);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationStart");
    }
}
