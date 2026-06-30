package pk2;

/* loaded from: classes3.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.l7 f437451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.m7 f437452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f437453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f437454g;

    public k7(pk2.l7 l7Var, pk2.m7 m7Var, android.widget.ImageView imageView, int i17) {
        this.f437451d = l7Var;
        this.f437452e = m7Var;
        this.f437453f = imageView;
        this.f437454g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f437451d.f437493f = null;
        pk2.m7 m7Var = this.f437452e;
        int i17 = this.f437454g;
        android.widget.ImageView imageView = this.f437453f;
        pk2.j7 j7Var = new pk2.j7(m7Var, i17, imageView);
        m7Var.f437546m = j7Var;
        imageView.postDelayed(j7Var, 1500L);
    }
}
