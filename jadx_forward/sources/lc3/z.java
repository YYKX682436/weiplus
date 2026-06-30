package lc3;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f399477a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399478b;

    public z(int i17, java.lang.String str) {
        this.f399477a = i17;
        this.f399478b = str;
    }

    public final java.lang.String a() {
        return this.f399478b;
    }

    public final int b() {
        return this.f399477a;
    }

    /* renamed from: equals */
    public boolean m145589xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lc3.z.class, obj.getClass()) && this.f399477a == ((lc3.z) obj).f399477a;
    }

    /* renamed from: hashCode */
    public int m145590x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f399477a));
    }

    /* renamed from: toString */
    public java.lang.String m145591x9616526c() {
        return "MBErrorInfo{errno=" + this.f399477a + ", errMsg='" + this.f399478b + "'}";
    }
}
