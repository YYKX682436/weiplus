package c82;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c82.b f39665d = new c82.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean z17 = !kotlin.jvm.internal.o.b("0", dVar.aj("clicfg_fav_use_wcdb2", "0"));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDBProvider", "Use new WCDB: " + z17);
        if (z17) {
            d95.v vVar = new d95.v();
            vVar.f227707a = com.tencent.mm.sdk.platformtools.t8.F1(dVar.aj("clicfg_wcdb2_perfopts_soft_heap_limit", "8388608"), 8388608L);
            vVar.f227708b = com.tencent.mm.sdk.platformtools.t8.D1(dVar.aj("clicfg_wcdb2_perfopts_checkpoint_foreground", "100"), 100);
            vVar.f227709c = com.tencent.mm.sdk.platformtools.t8.D1(dVar.aj("clicfg_wcdb2_perfopts_checkpoint_background", "300"), 300);
            vVar.f227710d = kotlin.jvm.internal.o.b("1", dVar.aj("clicfg_wcdb2_perfopts_close_handles_background", "0"));
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDBProvider", "PerformanceOptions: softHeapLimit: " + vVar.f227707a + ", checkpointFg: " + vVar.f227708b + ", checkpointBg: " + vVar.f227709c + ", closeHandle: " + vVar.f227710d);
            d95.q.f227701a = vVar;
            com.tencent.wcdb.core.Database.setSoftHeapLimit(vVar.f227707a);
            com.tencent.wcdb.core.Database.setAutoCheckpointMinFrames(d95.q.f227702b ? vVar.f227709c : vVar.f227708b);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
