package sc2;

/* loaded from: classes.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f487871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f487872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f487873c;

    /* renamed from: d, reason: collision with root package name */
    public final int f487874d;

    public w6(long j17, int i17, int i18, int i19) {
        this.f487871a = j17;
        this.f487872b = i17;
        this.f487873c = i18;
        this.f487874d = i19;
    }

    /* renamed from: equals */
    public boolean m164280xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof sc2.w6)) {
            return false;
        }
        sc2.w6 w6Var = (sc2.w6) obj;
        return this.f487871a == w6Var.f487871a && this.f487872b == w6Var.f487872b && this.f487873c == w6Var.f487873c && this.f487874d == w6Var.f487874d;
    }

    /* renamed from: hashCode */
    public int m164281x8cdac1b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f487871a);
        sb6.append('_');
        sb6.append(this.f487872b);
        sb6.append('_');
        sb6.append(this.f487873c);
        sb6.append('_');
        sb6.append(this.f487874d);
        return sb6.toString().hashCode();
    }
}
