package y56;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f541116a;

    /* renamed from: b, reason: collision with root package name */
    public final r56.a f541117b;

    /* renamed from: c, reason: collision with root package name */
    public final p56.p f541118c;

    /* renamed from: d, reason: collision with root package name */
    public final long f541119d;

    public e(p56.p pVar, long j17, r56.a aVar) {
        long j18 = rx.p3379xd70c5718.C30150x4df5d029.f482428g;
        rx.p3379xd70c5718.C30150x4df5d029.f482428g = 1 + j18;
        this.f541119d = j18;
        this.f541116a = j17;
        this.f541117b = aVar;
        this.f541118c = pVar;
    }

    /* renamed from: toString */
    public java.lang.String m176546x9616526c() {
        return java.lang.String.format("TimedAction(time = %d, action = %s)", java.lang.Long.valueOf(this.f541116a), this.f541117b.toString());
    }
}
