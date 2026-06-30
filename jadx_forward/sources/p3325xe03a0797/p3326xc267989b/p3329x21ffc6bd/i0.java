package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class i0 extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f392033d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i0.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f392034c;

    /* renamed from: cleanedAndPointers */
    private volatile /* synthetic */ int f72715xf24fb05;

    public i0(long j17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i0 i0Var, int i17) {
        super(i0Var);
        this.f392034c = j17;
        this.f72715xf24fb05 = i17 << 16;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g
    public boolean b() {
        return this.f72715xf24fb05 == f() && !c();
    }

    public final boolean e() {
        return f392033d.addAndGet(this, -65536) == f() && !c();
    }

    public abstract int f();

    public final boolean g() {
        int i17;
        do {
            i17 = this.f72715xf24fb05;
            if (!(i17 != f() || c())) {
                return false;
            }
        } while (!f392033d.compareAndSet(this, i17, 65536 + i17));
        return true;
    }
}
