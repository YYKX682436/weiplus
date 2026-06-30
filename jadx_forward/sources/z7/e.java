package z7;

/* loaded from: classes16.dex */
public class e extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f552002d;

    public e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("string is null");
        }
        this.f552002d = str;
    }

    @Override // z7.l
    /* renamed from: equals */
    public boolean mo178486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.e.class == obj.getClass()) {
            return this.f552002d.equals(((z7.e) obj).f552002d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.f552030a.write(this.f552002d);
    }

    @Override // z7.l
    /* renamed from: hashCode */
    public int mo178487x8cdac1b() {
        return this.f552002d.hashCode();
    }

    @Override // z7.l
    /* renamed from: toString */
    public java.lang.String mo178488x9616526c() {
        return this.f552002d;
    }
}
