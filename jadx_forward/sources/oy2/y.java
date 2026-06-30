package oy2;

/* loaded from: classes5.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.a0 f431540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(oy2.a0 a0Var) {
        super(1);
        this.f431540d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.widget.ImageView imageView = this.f431540d.f431475g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
