package jn5;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f382378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn5.i f382379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f382380h;

    public e(android.view.View view, int i17, int i18, jn5.i iVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f382376d = view;
        this.f382377e = i17;
        this.f382378f = i18;
        this.f382379g = iVar;
        this.f382380h = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn5.d dVar;
        android.view.View view = this.f382376d;
        if (view != null) {
            int i17 = this.f382377e;
            int i18 = this.f382378f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f382380h;
            android.view.ViewPropertyAnimator animate = view.animate();
            if (i17 != 0) {
                animate.translationX(0.0f);
            }
            if (i18 != 0) {
                animate.translationY(0.0f);
            }
            jn5.i iVar = this.f382379g;
            if (iVar.I(k3Var)) {
                android.view.View itemView = k3Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                dVar = new jn5.d(k3Var, itemView, iVar);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                animate.setUpdateListener(dVar);
            }
            animate.setDuration(iVar.f93703e).setInterpolator(iVar.f382391u).setListener(new jn5.c(iVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
