package ln1;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.z f401406a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f401407b;

    /* renamed from: c, reason: collision with root package name */
    public final long f401408c;

    public y(ln1.z zVar, java.lang.Object obj, long j17) {
        this.f401406a = zVar;
        this.f401407b = obj;
        this.f401408c = j17;
    }

    /* renamed from: equals */
    public boolean m146100xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln1.y)) {
            return false;
        }
        ln1.y yVar = (ln1.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401406a, yVar.f401406a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f401407b, yVar.f401407b) && this.f401408c == yVar.f401408c;
    }

    /* renamed from: hashCode */
    public int m146101x8cdac1b() {
        ln1.z zVar = this.f401406a;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        java.lang.Object obj = this.f401407b;
        return ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f401408c);
    }

    /* renamed from: toString */
    public java.lang.String m146102x9616526c() {
        return "FlowData(runnbale=" + this.f401406a + ", obj=" + this.f401407b + ", size=" + this.f401408c + ')';
    }
}
