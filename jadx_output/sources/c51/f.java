package c51;

/* loaded from: classes10.dex */
public final class f extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.a f38639o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d51.a loadConfig) {
        super(loadConfig);
        kotlin.jvm.internal.o.g(loadConfig, "loadConfig");
        this.f38639o = loadConfig;
    }

    @Override // c51.e
    public void e(c51.c result) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("PAGLoadTask", " result:" + result);
        boolean z17 = result instanceof c51.b;
        d51.a aVar = this.f38639o;
        if (z17) {
            org.libpag.PAGFile Load = org.libpag.PAGFile.Load(((c51.b) result).f38629a);
            yz5.l lVar2 = aVar.f226520d;
            if (lVar2 != null) {
                lVar2.invoke(Load);
            }
        } else if ((result instanceof c51.a) && (lVar = aVar.f226520d) != null) {
            lVar.invoke(null);
        }
        aVar.f226520d = null;
    }
}
