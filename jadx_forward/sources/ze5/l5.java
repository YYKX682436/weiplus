package ze5;

/* loaded from: classes9.dex */
public final class l5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v05.b f553602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, v05.b bVar) {
        super(1);
        this.f553600d = f9Var;
        this.f553601e = dVar;
        this.f553602f = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView it = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553600d;
        boolean a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s1.a(f9Var, f9Var.z0());
        yb5.d dVar = this.f553601e;
        if (a17) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(dVar.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            o11.f fVar = new o11.f();
            fVar.f423625p = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80862x137353c3, it.getLayoutParams().width, it.getLayoutParams().height, dVar.g().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836), dVar.g().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77627xb498cd1c), 0.625f));
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
            v05.b bVar = this.f553602f;
            java.lang.String m75945x2fec8307 = bVar.m75945x2fec8307(bVar.f513848e + 14);
            if (r26.n0.N(m75945x2fec8307)) {
                v05.a aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
                m75945x2fec8307 = aVar != null ? aVar.A() : null;
            }
            b19.h(m75945x2fec8307, it, fVar.a());
        } else {
            it.setImageBitmap(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
