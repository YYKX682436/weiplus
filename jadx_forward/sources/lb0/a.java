package lb0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f399197a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399198b;

    /* renamed from: c, reason: collision with root package name */
    public final long f399199c;

    public a(boolean z17, long j17, long j18) {
        this.f399197a = z17;
        this.f399198b = j17;
        this.f399199c = j18;
    }

    /* renamed from: equals */
    public boolean m145498xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0.a)) {
            return false;
        }
        lb0.a aVar = (lb0.a) obj;
        return this.f399197a == aVar.f399197a && this.f399198b == aVar.f399198b && this.f399199c == aVar.f399199c;
    }

    /* renamed from: hashCode */
    public int m145499x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f399197a) * 31) + java.lang.Long.hashCode(this.f399198b)) * 31) + java.lang.Long.hashCode(this.f399199c);
    }

    /* renamed from: toString */
    public java.lang.String m145500x9616526c() {
        return "AdEntranceConfig(enable=" + this.f399197a + ", keepTime=" + this.f399198b + ", addTime=" + this.f399199c + ')';
    }
}
