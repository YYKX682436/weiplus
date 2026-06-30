package androidx.fragment.app;

/* loaded from: classes14.dex */
public class l0 implements j3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11379a;

    public l0(androidx.fragment.app.Fragment fragment) {
        this.f11379a = fragment;
    }

    @Override // j3.g
    public void onCancel() {
        androidx.fragment.app.Fragment fragment = this.f11379a;
        if (fragment.getAnimatingAway() != null) {
            android.view.View animatingAway = fragment.getAnimatingAway();
            fragment.setAnimatingAway(null);
            animatingAway.clearAnimation();
        }
        fragment.setAnimator(null);
    }
}
