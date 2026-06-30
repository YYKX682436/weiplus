package e04;

/* loaded from: classes9.dex */
public final class h3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f327486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f327487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f327488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(0);
        this.f327486d = h0Var;
        this.f327487e = bitmap;
        this.f327488f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f327486d.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.W(this.f327487e, 0.1f, 10, true, 200L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanViewUtils", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanViewUtils", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f327486d.f391656d;
        if (bitmap != null) {
            bitmap.getWidth();
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) this.f327486d.f391656d;
        if (bitmap2 != null) {
            bitmap2.getHeight();
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            return ((ku5.t0) ku5.t0.f394148d).B(new e04.g3(this.f327488f, this.f327486d));
        }
        this.f327488f.mo146xb9724478(this.f327486d.f391656d);
        return jz5.f0.f384359a;
    }
}
