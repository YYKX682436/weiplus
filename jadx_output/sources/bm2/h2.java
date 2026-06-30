package bm2;

/* loaded from: classes3.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f21936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.g2 f21937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(android.graphics.Bitmap bitmap, bm2.g2 g2Var) {
        super(0);
        this.f21936d = bitmap;
        this.f21937e = g2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f21936d;
        if (bitmap != null) {
            this.f21937e.f21904d.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, 3.0f));
        }
        return jz5.f0.f302826a;
    }
}
