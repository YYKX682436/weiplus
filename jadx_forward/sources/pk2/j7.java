package pk2;

/* loaded from: classes3.dex */
public final class j7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.m7 f437413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f437415f;

    public j7(pk2.m7 m7Var, int i17, android.widget.ImageView imageView) {
        this.f437413d = m7Var;
        this.f437414e = i17;
        this.f437415f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f437413d.m8183xf806b362() != this.f437414e) {
            return;
        }
        android.widget.ImageView imageView = this.f437415f;
        imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new pk2.i7(imageView)).start();
    }
}
