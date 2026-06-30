package mn2;

/* loaded from: classes5.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f411634e;

    public r0(android.view.View view, android.graphics.Matrix matrix) {
        this.f411633d = view;
        this.f411634e = matrix;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f411633d;
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            ((android.widget.ImageView) view).setImageMatrix(this.f411634e);
        }
    }
}
