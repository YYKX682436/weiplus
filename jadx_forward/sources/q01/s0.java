package q01;

/* loaded from: classes12.dex */
public final class s0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f440861f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.m1 f440862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440863b;

    /* renamed from: c, reason: collision with root package name */
    public final long f440864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f440865d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440866e;

    public s0(com.p314xaae8f345.mm.p944x882e457a.m1 netScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netScene, "netScene");
        this.f440862a = netScene;
        this.f440863b = f440861f.incrementAndGet();
        this.f440864c = android.os.SystemClock.uptimeMillis();
        this.f440865d = netScene.mo808xfb85f7b0();
        this.f440866e = jz5.h.b(new q01.r0(this));
    }

    /* renamed from: equals */
    public boolean m159216xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q01.s0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440862a, ((q01.s0) obj).f440862a);
    }

    /* renamed from: hashCode */
    public int m159217x8cdac1b() {
        return this.f440862a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m159218x9616526c() {
        return "Req(" + this.f440863b + ", " + q01.a1.f440792a.a(this.f440862a) + ')';
    }
}
