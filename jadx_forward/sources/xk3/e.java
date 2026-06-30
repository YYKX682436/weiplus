package xk3;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f536554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f536555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xk3.i f536556g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.widget.ImageView imageView, android.graphics.Matrix matrix, android.graphics.Bitmap bitmap, xk3.i iVar) {
        super(0);
        this.f536553d = imageView;
        this.f536554e = matrix;
        this.f536555f = bitmap;
        this.f536556g = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f536553d;
        imageView.setImageMatrix(this.f536554e);
        android.graphics.Bitmap bitmap = this.f536555f;
        imageView.setImageBitmap(bitmap);
        this.f536556g.q(bitmap, imageView);
        return jz5.f0.f384359a;
    }
}
