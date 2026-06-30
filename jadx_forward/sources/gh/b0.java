package gh;

/* loaded from: classes7.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f353331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gh.r f353332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.graphics.Bitmap bitmap, gh.r rVar) {
        super(0);
        this.f353331d = bitmap;
        this.f353332e = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f353332e;
        android.graphics.Bitmap bitmap = this.f353331d;
        return bitmap != null ? ((android.view.TextureView) obj).getBitmap(bitmap) : ((android.view.TextureView) obj).getBitmap();
    }
}
