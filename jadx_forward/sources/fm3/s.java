package fm3;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f345652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f345653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, r45.ss4 ss4Var, yz5.l lVar) {
        super(2);
        this.f345651d = str;
        this.f345652e = ss4Var;
        this.f345653f = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap != null) {
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            java.lang.String str = this.f345651d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, compressFormat, str, false);
            this.f345652e.set(2, str);
        }
        this.f345653f.mo146xb9724478(java.lang.Boolean.valueOf(bitmap != null));
        return jz5.f0.f384359a;
    }
}
