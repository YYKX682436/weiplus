package cr0;

/* loaded from: classes12.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f303281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(cr0.u0 u0Var) {
        super(0);
        this.f303281d = u0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cr0.b bVar = com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795.f29664x233c02ec;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10869xaaca795 accProxyCallsStats = this.f303281d.c();
        bVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accProxyCallsStats, "accProxyCallsStats");
        if (!accProxyCallsStats.m46625x1828bc7f().isEmpty()) {
            java.lang.String a17 = bm5.f1.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
            accProxyCallsStats.m46632x71a77ce0(a17);
            mh.k.f407804a.b("key_proc_binder_calls_prefix_" + ri.i.g(accProxyCallsStats.getAccProcName()), accProxyCallsStats, "full-charge-proc-life-stats.bin");
        }
        return jz5.f0.f384359a;
    }
}
