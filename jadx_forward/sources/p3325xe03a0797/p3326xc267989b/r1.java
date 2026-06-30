package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes5.dex */
public final class r1 implements p3325xe03a0797.p3326xc267989b.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.Future f392112d;

    public r1(java.util.concurrent.Future future) {
        this.f392112d = future;
    }

    @Override // p3325xe03a0797.p3326xc267989b.s1
    /* renamed from: dispose */
    public void mo144008x63a5261f() {
        this.f392112d.cancel(false);
    }

    /* renamed from: toString */
    public java.lang.String m144087x9616526c() {
        return "DisposableFutureHandle[" + this.f392112d + ']';
    }
}
