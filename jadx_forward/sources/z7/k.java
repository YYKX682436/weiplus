package z7;

/* loaded from: classes16.dex */
public class k extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f552021d;

    public k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("string is null");
        }
        this.f552021d = str;
    }

    @Override // z7.l
    /* renamed from: equals */
    public boolean mo178486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.k.class == obj.getClass()) {
            return this.f552021d.equals(((z7.k) obj).f552021d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        java.io.Writer writer = mVar.f552030a;
        writer.write(34);
        mVar.d(this.f552021d);
        writer.write(34);
    }

    @Override // z7.l
    /* renamed from: hashCode */
    public int mo178487x8cdac1b() {
        return this.f552021d.hashCode();
    }
}
