package cy0;

/* loaded from: classes15.dex */
public final class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f306214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306215e;

    public e(java.lang.Object obj, android.widget.ImageView imageView) {
        this.f306214d = obj;
        this.f306215e = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View v17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.graphics.Matrix a17 = ((ip0.d) this.f306214d).a(v17.getWidth(), v17.getHeight());
        android.widget.ImageView imageView = this.f306215e;
        if (a17 != null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            imageView.setImageMatrix(a17);
        }
        imageView.removeOnLayoutChangeListener(this);
    }
}
