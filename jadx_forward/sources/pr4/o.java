package pr4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.i f439573a;

    public o(pr4.i tierType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tierType, "tierType");
        this.f439573a = tierType;
    }

    /* renamed from: equals */
    public boolean m158920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.o) && this.f439573a == ((pr4.o) obj).f439573a;
    }

    /* renamed from: hashCode */
    public int m158921x8cdac1b() {
        return this.f439573a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158922x9616526c() {
        return "WeCoinSubscribeResultInfo(tierType=" + this.f439573a + ')';
    }
}
