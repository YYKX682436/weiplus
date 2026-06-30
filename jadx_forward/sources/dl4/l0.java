package dl4;

/* loaded from: classes.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f316964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        super(0);
        this.f316963d = bitmap;
        this.f316964e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f316963d;
        if (bitmap != null && !bitmap.isRecycled() && (imageView = this.f316964e) != null) {
            imageView.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
