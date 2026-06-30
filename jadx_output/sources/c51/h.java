package c51;

/* loaded from: classes10.dex */
public final class h extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.d f38642o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d51.d loadConfig) {
        super(loadConfig);
        kotlin.jvm.internal.o.g(loadConfig, "loadConfig");
        this.f38642o = loadConfig;
    }

    @Override // c51.e
    public void e(c51.c result) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("RfxPAGLoadTask", " result:" + result);
        boolean z17 = result instanceof c51.b;
        d51.d dVar = this.f38642o;
        if (z17) {
            com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(((c51.b) result).f38629a);
            yz5.l lVar2 = dVar.f226526d;
            if (lVar2 != null) {
                lVar2.invoke(Load);
            }
        } else if ((result instanceof c51.a) && (lVar = dVar.f226526d) != null) {
            lVar.invoke(null);
        }
        dVar.f226526d = null;
    }
}
