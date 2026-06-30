package uj3;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f509886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f509887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f509888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f509889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509890h;

    public v(uj3.z zVar, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f509886d = zVar;
        this.f509887e = bitmap;
        this.f509888f = i17;
        this.f509889g = i18;
        this.f509890h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator withStartAction;
        uj3.z zVar = this.f509886d;
        android.widget.ImageView imageView = zVar.f509930d;
        if (imageView != null && (animate = imageView.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(300L)) != null && (listener = duration.setListener(new uj3.t(zVar, this.f509890h))) != null && (withStartAction = listener.withStartAction(new uj3.u(zVar))) != null) {
            withStartAction.start();
        }
        zVar.e(this.f509887e, this.f509888f, this.f509889g, 1);
    }
}
