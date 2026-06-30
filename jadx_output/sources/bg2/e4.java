package bg2;

/* loaded from: classes2.dex */
public final class e4 extends bg2.s6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f20056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(bg2.h4 h4Var, java.lang.Class cls) {
        super(cls);
        this.f20056b = h4Var;
    }

    @Override // bg2.s6
    public void b(com.tencent.mm.protobuf.f fVar, int i17) {
        r45.bc2 result = (r45.bc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("LiveConvertShoppingHotSaleController", "polling resp = " + pm0.b0.g(result));
        kotlinx.coroutines.flow.j2 j2Var = this.f20056b.f20139i;
        if (j2Var == null) {
            return;
        }
        ((kotlinx.coroutines.flow.h3) j2Var).k(result);
    }
}
