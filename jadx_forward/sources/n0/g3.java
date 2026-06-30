package n0;

/* loaded from: classes14.dex */
public final class g3 implements n0.f3, n0.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f415048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f415049e;

    public g3(n0.v2 state, oz5.l coroutineContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coroutineContext, "coroutineContext");
        this.f415048d = coroutineContext;
        this.f415049e = state;
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l mo7786x54170f2d() {
        return this.f415048d;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return this.f415049e.mo128745x754a37bb();
    }

    @Override // n0.v2
    /* renamed from: setValue */
    public void mo148714x53d8522f(java.lang.Object obj) {
        this.f415049e.mo148714x53d8522f(obj);
    }
}
