package bm2;

/* loaded from: classes3.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f103772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f103773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.p1 f103774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.graphics.Bitmap bitmap, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, bm2.p1 p1Var) {
        super(0);
        this.f103772d = bitmap;
        this.f103773e = h0Var;
        this.f103774f = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f103772d;
        if (bitmap != null) {
            int m75939xb282bd08 = ((r45.ty1) this.f103773e.f391656d).m75939xb282bd08(5);
            bm2.p1 p1Var = this.f103774f;
            if (m75939xb282bd08 == 3) {
                p1Var.f103750d.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getHeight() / 2));
            } else {
                p1Var.f103750d.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, 6.0f));
            }
        }
        return jz5.f0.f384359a;
    }
}
