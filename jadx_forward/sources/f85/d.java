package f85;

/* loaded from: classes10.dex */
public final class d implements f85.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f341763a;

    /* renamed from: b, reason: collision with root package name */
    public long f341764b;

    public d(long j17) {
        this.f341763a = j17;
    }

    @Override // f85.e
    public boolean a() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f341764b);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            this.f341764b = uptimeMillis;
            return true;
        }
        boolean z17 = uptimeMillis - valueOf.longValue() > this.f341763a;
        if (z17) {
            this.f341764b = uptimeMillis;
        }
        return z17;
    }
}
