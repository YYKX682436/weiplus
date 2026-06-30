package qq;

/* loaded from: classes.dex */
public final class d extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447395a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f447396b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f447397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String title, java.lang.String key, yz5.l action) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f447395a = title;
        this.f447396b = key;
        this.f447397c = action;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f447396b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f447395a;
    }

    /* renamed from: equals */
    public boolean m160696xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.d)) {
            return false;
        }
        qq.d dVar = (qq.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447395a, dVar.f447395a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447396b, dVar.f447396b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447397c, dVar.f447397c);
    }

    /* renamed from: hashCode */
    public int m160697x8cdac1b() {
        return (((this.f447395a.hashCode() * 31) + this.f447396b.hashCode()) * 31) + this.f447397c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160698x9616526c() {
        return "EcsSettingButton(title=" + this.f447395a + ", key=" + this.f447396b + ", action=" + this.f447397c + ')';
    }
}
