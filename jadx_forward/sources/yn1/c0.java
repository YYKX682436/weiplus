package yn1;

/* loaded from: classes11.dex */
public final class c0 implements p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f545153d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f545154e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f545155f;

    public c0(p3325xe03a0797.p3326xc267989b.p0 poolDispatcher, p3325xe03a0797.p3326xc267989b.p0 mainDispatcher, java.lang.String tag, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 2) != 0) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            mainDispatcher = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        }
        tag = (i17 & 4) != 0 ? "MM.Mig.MigrationScope" : tag;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poolDispatcher, "poolDispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainDispatcher, "mainDispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f545153d = poolDispatcher;
        this.f545154e = mainDispatcher;
        this.f545155f = tag;
    }

    public final p3325xe03a0797.p3326xc267989b.r2 a(yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return p3325xe03a0797.p3326xc267989b.l.d(this, this.f545153d, null, block, 2, null);
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF93115e() {
        oz5.l mo7096x348d9a = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(this.f545153d);
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        return mo7096x348d9a.mo7096x348d9a(new yn1.b0(p3325xe03a0797.p3326xc267989b.q0.f392100d, this));
    }
}
