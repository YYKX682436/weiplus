package c82;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c82.b f121198d = new c82.b();

    public b() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", dVar.aj("clicfg_fav_use_wcdb2", "0"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDBProvider", "Use new WCDB: " + z17);
        if (z17) {
            d95.v vVar = new d95.v();
            vVar.f309240a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(dVar.aj("clicfg_wcdb2_perfopts_soft_heap_limit", "8388608"), 8388608L);
            vVar.f309241b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(dVar.aj("clicfg_wcdb2_perfopts_checkpoint_foreground", "100"), 100);
            vVar.f309242c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(dVar.aj("clicfg_wcdb2_perfopts_checkpoint_background", "300"), 300);
            vVar.f309243d = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", dVar.aj("clicfg_wcdb2_perfopts_close_handles_background", "0"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDBProvider", "PerformanceOptions: softHeapLimit: " + vVar.f309240a + ", checkpointFg: " + vVar.f309241b + ", checkpointBg: " + vVar.f309242c + ", closeHandle: " + vVar.f309243d);
            d95.q.f309234a = vVar;
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106632x4d50bee3(vVar.f309240a);
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106621x6a99b7ff(d95.q.f309235b ? vVar.f309242c : vVar.f309241b);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
