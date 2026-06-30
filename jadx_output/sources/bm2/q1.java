package bm2;

/* loaded from: classes3.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f22239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f22240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.p1 f22241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.graphics.Bitmap bitmap, kotlin.jvm.internal.h0 h0Var, bm2.p1 p1Var) {
        super(0);
        this.f22239d = bitmap;
        this.f22240e = h0Var;
        this.f22241f = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f22239d;
        if (bitmap != null) {
            int integer = ((r45.ty1) this.f22240e.f310123d).getInteger(5);
            bm2.p1 p1Var = this.f22241f;
            if (integer == 3) {
                p1Var.f22217d.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getHeight() / 2));
            } else {
                p1Var.f22217d.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, 6.0f));
            }
        }
        return jz5.f0.f302826a;
    }
}
