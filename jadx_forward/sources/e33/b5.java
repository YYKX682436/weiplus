package e33;

/* loaded from: classes10.dex */
public class b5 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f328693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f328694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e33.d5 f328695c;

    public b5(e33.d5 d5Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f328695c = d5Var;
        this.f328693a = i17;
        this.f328694b = k3Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        if (this.f328693a == 2) {
            e33.d5 d5Var = this.f328695c;
            e33.h5 h5Var = d5Var.f328734b;
            int m8183xf806b362 = this.f328694b.m8183xf806b362();
            h5Var.f328799q = m8183xf806b362;
            h5Var.f328798p = m8183xf806b362;
            int i17 = d5Var.f328734b.f328801s;
            d5Var.f328733a = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewSelectedImageAdapter", "lastVisiblePos:%s", java.lang.Integer.valueOf(i17));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
