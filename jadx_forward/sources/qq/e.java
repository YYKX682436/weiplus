package qq;

/* loaded from: classes.dex */
public final class e extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447398a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f447399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String title, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        str = (i17 & 2) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f447398a = title;
        this.f447399b = str;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f447399b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f447398a;
    }

    /* renamed from: equals */
    public boolean m160699xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.e)) {
            return false;
        }
        qq.e eVar = (qq.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447398a, eVar.f447398a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447399b, eVar.f447399b);
    }

    /* renamed from: hashCode */
    public int m160700x8cdac1b() {
        int hashCode = this.f447398a.hashCode() * 31;
        java.lang.String str = this.f447399b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m160701x9616526c() {
        return "EcsSettingGroupTitle(title=" + this.f447398a + ", key=" + this.f447399b + ')';
    }
}
