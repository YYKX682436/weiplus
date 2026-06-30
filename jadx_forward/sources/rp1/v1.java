package rp1;

/* loaded from: classes14.dex */
public class v1 implements rp1.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 f480075a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700) {
        this.f480075a = c12931xa4a39700;
    }

    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.animation.Animator.AnimatorListener animatorListener) {
        android.view.View view;
        if (k3Var == null || (view = k3Var.f3639x46306858) == null) {
            return false;
        }
        float measuredWidth = view.getMeasuredWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f480075a;
        if (measuredWidth <= 0.0f) {
            measuredWidth = c12931xa4a39700.getMeasuredWidth();
        }
        if (c12931xa4a39700.f175127y) {
            measuredWidth = -measuredWidth;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "animateRemove tranX: %f", java.lang.Float.valueOf(measuredWidth));
        k3Var.f3639x46306858.animate().alpha(0.0f).translationX(measuredWidth).setListener(new rp1.u1(this, animatorListener, k3Var)).start();
        return true;
    }
}
