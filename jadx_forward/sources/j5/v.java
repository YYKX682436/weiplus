package j5;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f379294a;

    /* renamed from: b, reason: collision with root package name */
    public a5.q0 f379295b;

    /* renamed from: equals */
    public boolean m140347xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.v)) {
            return false;
        }
        j5.v vVar = (j5.v) obj;
        if (this.f379295b != vVar.f379295b) {
            return false;
        }
        return this.f379294a.equals(vVar.f379294a);
    }

    /* renamed from: hashCode */
    public int m140348x8cdac1b() {
        return (this.f379294a.hashCode() * 31) + this.f379295b.hashCode();
    }
}
