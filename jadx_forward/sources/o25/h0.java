package o25;

/* loaded from: classes9.dex */
public class h0 implements o25.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f424062a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.l0 f424063b;

    public h0(o25.l0 l0Var) {
        this.f424063b = l0Var;
        a();
    }

    @Override // o25.l0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkHelper", "markDeepLinkDoneWillBeCallback#buildWeAppStartCallback");
        this.f424063b.a();
    }

    @Override // o25.l0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback");
        if (this.f424062a.compareAndSet(false, true)) {
            this.f424063b.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback, already callback");
        }
    }
}
