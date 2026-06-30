package gr5;

/* loaded from: classes15.dex */
public final class w implements gr5.n {
    public w(float f17) {
    }

    @Override // gr5.n
    public long a(long j17, long j18) {
        return zq5.s.a(1.0f, 1.0f);
    }

    /* renamed from: equals */
    public boolean m132128xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.w)) {
            return false;
        }
        ((gr5.w) obj).getClass();
        return java.lang.Float.compare(1.0f, 1.0f) == 0;
    }

    /* renamed from: hashCode */
    public int m132129x8cdac1b() {
        return java.lang.Float.hashCode(1.0f);
    }

    /* renamed from: toString */
    public java.lang.String m132130x9616526c() {
        return "FixedScale(value=1.0)";
    }
}
