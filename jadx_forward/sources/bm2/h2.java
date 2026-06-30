package bm2;

/* loaded from: classes3.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f103469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.g2 f103470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(android.graphics.Bitmap bitmap, bm2.g2 g2Var) {
        super(0);
        this.f103469d = bitmap;
        this.f103470e = g2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f103469d;
        if (bitmap != null) {
            this.f103470e.f103437d.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, 3.0f));
        }
        return jz5.f0.f384359a;
    }
}
