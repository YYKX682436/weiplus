package su4;

/* loaded from: classes8.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f494392b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f494393c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f494394d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f494395e;

    public d3(int i17) {
        this.f494391a = "MicroMsg.WebSearch.WebSearchPreloadMgr";
        this.f494392b = i17;
        this.f494391a = "MicroMsg.WebSearch.WebSearchPreloadMgr_" + i17;
    }

    public void a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494391a, "preload please call from tools proc");
            return;
        }
        if (this.f494393c.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494391a, "preloading webview %s", java.lang.Integer.valueOf(this.f494392b));
            return;
        }
        if (((java.util.LinkedList) this.f494394d).size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494391a, "already preload webview %s", java.lang.Integer.valueOf(this.f494392b));
            return;
        }
        this.f494393c.set(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494391a, "start to preload webview %d", java.lang.Integer.valueOf(this.f494392b));
        ((ku5.t0) ku5.t0.f394148d).B(new su4.w2(this, str));
    }
}
