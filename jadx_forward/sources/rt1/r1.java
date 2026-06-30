package rt1;

/* loaded from: classes7.dex */
public final class r1 implements android.text.style.WrapTogetherSpan {

    /* renamed from: e, reason: collision with root package name */
    public static final rt1.q1 f481014e = new rt1.q1(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f481015d;

    public r1(long j17) {
        this.f481015d = j17;
    }

    /* renamed from: equals */
    public boolean m162996xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt1.r1) && this.f481015d == ((rt1.r1) obj).f481015d;
    }

    /* renamed from: hashCode */
    public int m162997x8cdac1b() {
        return java.lang.Long.hashCode(this.f481015d);
    }

    /* renamed from: toString */
    public java.lang.String m162998x9616526c() {
        return "TimestampSpan(timestamp=" + this.f481015d + ')';
    }
}
