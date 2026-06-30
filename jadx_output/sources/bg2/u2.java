package bg2;

/* loaded from: classes3.dex */
public final class u2 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.x2 f20548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(bg2.x2 x2Var, java.lang.Class cls) {
        super(cls);
        this.f20548b = x2Var;
    }

    @Override // bg2.s6
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.w("LiveConvertSearchComponentController", "fail ret " + i17 + " errMsg " + errMsg);
    }

    @Override // bg2.s6
    public void b(com.tencent.mm.protobuf.f fVar, int i17) {
        kotlinx.coroutines.y0 y0Var;
        r45.nc2 result = (r45.nc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        bg2.x2 x2Var = this.f20548b;
        x2Var.getClass();
        tc2.g gVar = x2Var.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        if (h1Var == null || (y0Var = gVar.f417147g) == null) {
            return;
        }
        kotlinx.coroutines.l.d(y0Var, null, null, new bg2.r2(h1Var, i17, x2Var, result, null), 3, null);
    }
}
