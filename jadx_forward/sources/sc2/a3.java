package sc2;

/* loaded from: classes2.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b3 f487278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f487279e;

    public a3(sc2.b3 b3Var, int i17) {
        this.f487278d = b3Var;
        this.f487279e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationY3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator listener;
        float f17 = this.f487279e;
        sc2.b3 b3Var = this.f487278d;
        in5.s0 s0Var = b3Var.f84681i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3) : null;
        in5.s0 s0Var2 = b3Var.f84681i;
        android.view.View p18 = s0Var2 != null ? s0Var2.p(com.p314xaae8f345.mm.R.id.g1y) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("height=");
        sb6.append(f17);
        sb6.append(", before 1=");
        android.view.View view = b3Var.f487310x;
        sb6.append(view != null ? java.lang.Float.valueOf(view.getTranslationY()) : null);
        sb6.append(" 2=");
        sb6.append(p17 != null ? java.lang.Float.valueOf(p17.getTranslationY()) : null);
        sb6.append(" 3=");
        sb6.append(p18 != null ? java.lang.Float.valueOf(p18.getTranslationY()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b3Var.f487309w, sb6.toString());
        android.view.View view2 = b3Var.f487310x;
        if (view2 != null && (animate3 = view2.animate()) != null && (translationY3 = animate3.translationY(f17)) != null && (duration3 = translationY3.setDuration(300L)) != null && (listener = duration3.setListener(new sc2.y2(b3Var, f17, p17, p18))) != null) {
            listener.start();
        }
        if (p17 != null && (animate2 = p17.animate()) != null && (translationY2 = animate2.translationY(f17)) != null && (duration2 = translationY2.setDuration(300L)) != null) {
            duration2.start();
        }
        if (p18 == null || (animate = p18.animate()) == null || (translationY = animate.translationY(f17)) == null || (duration = translationY.setDuration(300L)) == null) {
            return;
        }
        duration.start();
    }
}
