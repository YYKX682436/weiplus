package p3325xe03a0797.p3326xc267989b.p3330xd70c6594;

/* loaded from: classes14.dex */
public final class m extends p3325xe03a0797.p3326xc267989b.p3330xd70c6594.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f392146d;

    public m(java.lang.Runnable runnable, long j17, p3325xe03a0797.p3326xc267989b.p3330xd70c6594.k kVar) {
        super(j17, kVar);
        this.f392146d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f392146d.run();
        } finally {
            this.f72738xa940486a.getClass();
        }
    }

    /* renamed from: toString */
    public java.lang.String m144102x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.f392146d;
        sb6.append(runnable.getClass().getSimpleName());
        sb6.append('@');
        sb6.append(p3325xe03a0797.p3326xc267989b.c1.a(runnable));
        sb6.append(", ");
        sb6.append(this.f72737xbcf77c39);
        sb6.append(", ");
        sb6.append(this.f72738xa940486a);
        sb6.append(']');
        return sb6.toString();
    }
}
