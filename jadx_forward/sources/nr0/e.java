package nr0;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nr0.x xVar) {
        super(1);
        this.f420606d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        nr0.x xVar = this.f420606d;
        nr0.c0 c0Var = xVar.f420659r;
        yz5.a aVar = c0Var.f420602a;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        c0Var.f420602a = null;
        or0.c.f428962a.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6358xa3635a0e a17 = as0.a.f94958a.a(xVar.f420648d);
        if (a17 != null) {
            if (a17.f137099o <= 0) {
                a17.f137099o = java.lang.System.currentTimeMillis();
            }
            a17.f137104t++;
        }
        xVar.l(new nr0.d(xVar, null));
        return jz5.f0.f384359a;
    }
}
