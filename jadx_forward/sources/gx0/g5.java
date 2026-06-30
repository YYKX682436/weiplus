package gx0;

/* loaded from: classes5.dex */
public final class g5 implements com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f357981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f357982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f357983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.q f357984d;

    public g5(android.util.Size size, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, wt3.q qVar) {
        this.f357981a = size;
        this.f357982b = bitmap;
        this.f357983c = interfaceC29045xdcb5ca57;
        this.f357984d = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.l0
    public final void a(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 m0Var, int i17, com.p314xaae8f345.p457x3304c6.p479x4179489f.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m0Var, "<anonymous parameter 0>");
        android.util.Size size = this.f357981a;
        if (n0Var == null || (bitmap2 = n0Var.f130047a) == null || (bitmap = dx0.o.b(bitmap2, size)) == null) {
            bitmap = this.f357982b;
        }
        android.graphics.Bitmap bitmap3 = bitmap;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f357983c.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f357984d.b(bitmap3, size.getWidth(), size.getHeight(), 0L)));
    }
}
