package ze5;

/* loaded from: classes9.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553711e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        super(1);
        this.f553710d = f9Var;
        this.f553711e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553710d;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.a(f9Var, f9Var.z0())) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(this.f553711e.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
