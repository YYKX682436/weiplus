package ql2;

/* loaded from: classes3.dex */
public final class g0 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f446048a;

    public g0(android.widget.ImageView imageView) {
        this.f446048a = imageView;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        android.widget.ImageView imageView = this.f446048a;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        dVar.f510677e.f510726b.d();
        dVar.a(new ql2.f0(imageView));
    }
}
