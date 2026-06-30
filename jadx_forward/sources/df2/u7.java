package df2;

/* loaded from: classes3.dex */
public final class u7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f313036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f313037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f313036d = imageView;
        this.f313037e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.ImageView imageView = this.f313036d;
        imageView.setColorFilter((android.graphics.ColorFilter) null);
        imageView.setImageDrawable(null);
        imageView.setImageBitmap(this.f313037e);
        return jz5.f0.f384359a;
    }
}
