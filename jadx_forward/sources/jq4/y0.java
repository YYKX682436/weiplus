package jq4;

/* loaded from: classes5.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f382760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f382762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382763h;

    public y0(jq4.z0 z0Var, android.graphics.Bitmap bitmap, android.view.View view, android.widget.ImageView imageView, android.view.View view2) {
        this.f382759d = z0Var;
        this.f382760e = bitmap;
        this.f382761f = view;
        this.f382762g = imageView;
        this.f382763h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f382759d.f382767c;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jq4.x0(this.f382760e, this.f382759d, this.f382761f, this.f382762g, this.f382763h, null), 3, null);
        }
    }
}
