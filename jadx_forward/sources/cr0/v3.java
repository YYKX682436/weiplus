package cr0;

/* loaded from: classes12.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.v3 f303316d = new cr0.v3();

    public v3() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr0.d dVar = com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212.f29671x233c02ec;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10870x6e1f7212 accStats = cr0.w3.f303333a.a();
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accStats, "accStats");
        if ((!accStats.m46636xc3ec362e().isEmpty()) || (!accStats.m46637x2db8acb0().isEmpty())) {
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            accStats.m46642x71a77ce0(a17);
            mh.k.f407804a.b("key_proc_network_stats_prefix" + ri.i.g(accStats.getAccProcName()), accStats, "full-charge-proc-life-stats.bin");
        }
        return jz5.f0.f384359a;
    }
}
