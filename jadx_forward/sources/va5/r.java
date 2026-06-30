package va5;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f515975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f515976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f515977f;

    public r(android.widget.ImageView imageView, float f17, float f18) {
        this.f515975d = imageView;
        this.f515976e = f17;
        this.f515977f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17 = this.f515976e;
        android.widget.ImageView imageView = this.f515975d;
        imageView.setPivotX(f17);
        imageView.setPivotY(this.f515977f);
    }
}
