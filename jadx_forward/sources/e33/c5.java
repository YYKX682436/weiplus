package e33;

/* loaded from: classes10.dex */
public class c5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.d5 f328725a;

    public c5(e33.d5 d5Var) {
        this.f328725a = d5Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int i17;
        int i18;
        e33.d5 d5Var = this.f328725a;
        e33.h5 h5Var = d5Var.f328734b;
        j33.d0.r(h5Var.f328793h, h5Var.f328798p, h5Var.f328799q);
        e33.h5 h5Var2 = d5Var.f328734b;
        e33.g5 g5Var = h5Var2.f328794i;
        if (g5Var != null) {
            int i19 = d5Var.f328733a;
            int i27 = h5Var2.f328798p;
            if (i19 > i27 && i19 <= (i18 = h5Var2.f328799q)) {
                ((e33.v3) g5Var).b(i27, i18, i19 - 1);
                return;
            }
            if (i19 < i27 && i19 >= (i17 = h5Var2.f328799q)) {
                ((e33.v3) g5Var).b(i27, i17, i19 + 1);
            } else if (i27 != i19) {
                ((e33.v3) g5Var).b(i27, h5Var2.f328799q, i19);
            } else {
                int i28 = h5Var2.f328799q;
                ((e33.v3) g5Var).b(i27, i28, i28);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
