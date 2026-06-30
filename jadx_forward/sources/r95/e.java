package r95;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f474988a;

    /* renamed from: b, reason: collision with root package name */
    public final long f474989b;

    public e(long j17, long j18) {
        this.f474988a = j17;
        this.f474989b = j18;
    }

    /* renamed from: toString */
    public java.lang.String m162080x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TimeRange(startTimeMs=");
        long j17 = this.f474988a;
        sb6.append(j17);
        sb6.append(", endTimeMs=");
        long j18 = this.f474989b;
        sb6.append(j18);
        sb6.append(" durationMS:");
        sb6.append(j18 - j17);
        sb6.append(')');
        return sb6.toString();
    }
}
