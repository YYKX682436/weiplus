package bg2;

/* loaded from: classes3.dex */
public final class u2 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f102081b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(bg2.x2 x2Var, java.lang.Class cls) {
        super(cls);
        this.f102081b = x2Var;
    }

    @Override // bg2.s6
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveConvertSearchComponentController", "fail ret " + i17 + " errMsg " + errMsg);
    }

    @Override // bg2.s6
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.nc2 result = (r45.nc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        bg2.x2 x2Var = this.f102081b;
        x2Var.getClass();
        tc2.g gVar = x2Var.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        if (h1Var == null || (y0Var = gVar.f498680g) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.r2(h1Var, i17, x2Var, result, null), 3, null);
    }
}
