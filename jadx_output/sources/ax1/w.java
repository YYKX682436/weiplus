package ax1;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f15023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f15025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15026g;

    public w(android.view.View view, android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f15023d = view;
        this.f15024e = context;
        this.f15025f = bitmap;
        this.f15026g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f15023d.getWidth();
        int height = this.f15023d.getHeight();
        if (this.f15023d.getWidth() == 0 || this.f15023d.getHeight() == 0) {
            width = i65.a.b(this.f15024e, 268);
            height = i65.a.b(this.f15024e, 80);
        }
        int i17 = width;
        android.content.Context context = this.f15024e;
        android.view.View view = this.f15023d;
        android.graphics.Bitmap bitmap = this.f15025f;
        java.lang.String str = this.f15026g;
        ((ku5.t0) ku5.t0.f312615d).a(new ax1.u(bitmap, height, i17, str, context, view));
    }
}
