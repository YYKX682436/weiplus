package mi5;

/* loaded from: classes9.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.s0 f408433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f408435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ se5.a f408436g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mi5.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c cVar, se5.a aVar) {
        super(1);
        this.f408433d = s0Var;
        this.f408434e = f9Var;
        this.f408435f = cVar;
        this.f408436g = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        v05.a aVar;
        android.widget.ImageView it = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f408434e;
        java.lang.String m164362x4eae2065 = this.f408436g.m164362x4eae2065();
        this.f408433d.getClass();
        android.content.Context context = it.getContext();
        java.lang.String str = null;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.a(f9Var, f9Var != null ? f9Var.z0() : null)) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var != null ? f9Var.z0() : null, i65.a.g(context), false);
        }
        if (bitmap == null && com.p314xaae8f345.mm.vfs.w6.j(m164362x4eae2065)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().n0(f9Var, m164362x4eae2065, true, i65.a.g(context), false, true);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            o11.f fVar = new o11.f();
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
            fVar.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.k();
            fVar.f423612c = true;
            fVar.f423616g = tv.a.a();
            fVar.A = new r35.n0(0);
            fVar.B = new r35.w(0);
            int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
            int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
            fVar.f423619j = b17;
            fVar.f423620k = b18;
            fVar.f423610a = true;
            fVar.f423629t = true;
            fVar.f423630u = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
            n11.a b19 = n11.a.b();
            l15.c cVar = this.f408435f;
            v05.b k17 = cVar.k();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17 != null ? k17.m75945x2fec8307(k17.f513848e + 14) : null);
            v05.b k18 = cVar.k();
            if (K0) {
                if (k18 != null && (aVar = (v05.a) k18.m75936x14adae67(k18.f513848e + 8)) != null) {
                    str = aVar.A();
                }
            } else if (k18 != null) {
                str = k18.m75945x2fec8307(k18.f513848e + 14);
            }
            b19.h(str, it, fVar.a());
        } else {
            it.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
