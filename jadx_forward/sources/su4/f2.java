package su4;

/* loaded from: classes5.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static final su4.f2 f494412b = new su4.f2(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f494413a;

    public f2(long j17) {
        this.f494413a = j17;
    }

    /* renamed from: equals */
    public boolean m165277xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof su4.f2) && this.f494413a == ((su4.f2) obj).f494413a;
    }

    /* renamed from: hashCode */
    public int m165278x8cdac1b() {
        return java.lang.Long.hashCode(this.f494413a);
    }

    /* renamed from: toString */
    public java.lang.String m165279x9616526c() {
        return "SearchEntryStatistics(clickTeachEnterTimestamp=" + this.f494413a + ')';
    }
}
