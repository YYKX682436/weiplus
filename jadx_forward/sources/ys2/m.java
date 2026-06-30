package ys2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f546703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ys2.o f546704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.Bitmap bitmap, ys2.o oVar) {
        super(0);
        this.f546703d = bitmap;
        this.f546704e = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f546703d;
        boolean z17 = bitmap.getWidth() > bitmap.getHeight();
        ys2.o oVar = this.f546704e;
        oVar.d7(z17);
        android.widget.ImageView imageView = oVar.f546708o;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
