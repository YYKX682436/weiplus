package vc1;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f516559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f516560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516561f;

    public o(vc1.p1 p1Var, android.widget.ImageView imageView, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f516561f = p1Var;
        this.f516559d = imageView;
        this.f516560e = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f516561f.f516597c.addView(this.f516559d, this.f516560e);
        synchronized (this.f516561f.V) {
            vc1.p1 p1Var = this.f516561f;
            p1Var.V.add(new vc1.h1(p1Var, this.f516559d));
        }
    }
}
