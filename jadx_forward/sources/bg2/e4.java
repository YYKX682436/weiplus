package bg2;

/* loaded from: classes2.dex */
public final class e4 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f101589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(bg2.h4 h4Var, java.lang.Class cls) {
        super(cls);
        this.f101589b = h4Var;
    }

    @Override // bg2.s6
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        r45.bc2 result = (r45.bc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertShoppingHotSaleController", "polling resp = " + pm0.b0.g(result));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f101589b.f101672i;
        if (j2Var == null) {
            return;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(result);
    }
}
