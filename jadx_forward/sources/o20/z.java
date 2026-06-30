package o20;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb f423935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423936e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1.C10556x2b36b1cb c10556x2b36b1cb, java.lang.String str) {
        super(1);
        this.f423935d = c10556x2b36b1cb;
        this.f423936e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.p onThumbnailBitmapLoad;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null && (onThumbnailBitmapLoad = this.f423935d.getOnThumbnailBitmapLoad()) != null) {
            onThumbnailBitmapLoad.mo149xb9724478(this.f423936e, bitmap);
        }
        return jz5.f0.f384359a;
    }
}
