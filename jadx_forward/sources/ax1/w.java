package ax1;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f96556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f96557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f96558f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96559g;

    public w(android.view.View view, android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f96556d = view;
        this.f96557e = context;
        this.f96558f = bitmap;
        this.f96559g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f96556d.getWidth();
        int height = this.f96556d.getHeight();
        if (this.f96556d.getWidth() == 0 || this.f96556d.getHeight() == 0) {
            width = i65.a.b(this.f96557e, 268);
            height = i65.a.b(this.f96557e, 80);
        }
        int i17 = width;
        android.content.Context context = this.f96557e;
        android.view.View view = this.f96556d;
        android.graphics.Bitmap bitmap = this.f96558f;
        java.lang.String str = this.f96559g;
        ((ku5.t0) ku5.t0.f394148d).a(new ax1.u(bitmap, height, i17, str, context, view));
    }
}
