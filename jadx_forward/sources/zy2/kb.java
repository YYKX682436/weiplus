package zy2;

/* loaded from: classes10.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public final long f558977a;

    /* renamed from: b, reason: collision with root package name */
    public int f558978b;

    /* renamed from: c, reason: collision with root package name */
    public int f558979c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f558980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f558981e;

    public kb(long j17) {
        this.f558977a = j17;
    }

    /* renamed from: equals */
    public boolean m179984xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy2.kb) && this.f558977a == ((zy2.kb) obj).f558977a;
    }

    /* renamed from: hashCode */
    public int m179985x8cdac1b() {
        return java.lang.Long.hashCode(this.f558977a);
    }

    /* renamed from: toString */
    public java.lang.String m179986x9616526c() {
        return "TriggerInfo(localId=" + this.f558977a + ')';
    }
}
