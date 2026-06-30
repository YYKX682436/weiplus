package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f391704b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.e0.class, "_handled");

    /* renamed from: _handled */
    private volatile /* synthetic */ int f72701xb5dafdfd;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f391705a;

    public e0(java.lang.Throwable th6, boolean z17) {
        this.f391705a = th6;
        this.f72701xb5dafdfd = z17 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this.f72701xb5dafdfd;
    }

    /* renamed from: toString */
    public java.lang.String m143988x9616526c() {
        return getClass().getSimpleName() + '[' + this.f391705a + ']';
    }

    public /* synthetic */ e0(java.lang.Throwable th6, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(th6, (i17 & 2) != 0 ? false : z17);
    }
}
