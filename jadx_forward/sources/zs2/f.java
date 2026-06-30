package zs2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f556789a;

    public f(int i17) {
        this.f556789a = i17;
    }

    /* renamed from: equals */
    public boolean m179379xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs2.f) && this.f556789a == ((zs2.f) obj).f556789a;
    }

    /* renamed from: hashCode */
    public int m179380x8cdac1b() {
        return java.lang.Integer.hashCode(this.f556789a);
    }

    /* renamed from: toString */
    public java.lang.String m179381x9616526c() {
        return "LiveMsgOffsetProcessConfig,scene:" + this.f556789a;
    }
}
