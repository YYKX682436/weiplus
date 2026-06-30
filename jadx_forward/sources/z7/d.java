package z7;

/* loaded from: classes16.dex */
public class d extends z7.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f552001d;

    public d(java.lang.String str) {
        this.f552001d = str;
        "null".equals(str);
        "true".equals(str);
        "false".equals(str);
    }

    @Override // z7.l
    /* renamed from: equals */
    public boolean mo178486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z7.d.class == obj.getClass()) {
            return this.f552001d.equals(((z7.d) obj).f552001d);
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.f552030a.write(this.f552001d);
    }

    @Override // z7.l
    /* renamed from: hashCode */
    public int mo178487x8cdac1b() {
        return this.f552001d.hashCode();
    }

    @Override // z7.l
    /* renamed from: toString */
    public java.lang.String mo178488x9616526c() {
        return this.f552001d;
    }
}
