package y00;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f540037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f540038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f540039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540040g;

    public c0(int i17, int i18, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.String str) {
        this.f540037d = i17;
        this.f540038e = i18;
        this.f540039f = atomicInteger;
        this.f540040g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: queried %d parsed %d put %d talker=%s", java.lang.Integer.valueOf(this.f540037d), java.lang.Integer.valueOf(this.f540038e), java.lang.Integer.valueOf(this.f540039f.get()), this.f540040g);
    }
}
