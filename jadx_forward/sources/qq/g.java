package qq;

/* loaded from: classes.dex */
public final class g extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447400a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f447401b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f447402c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f447403d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f447404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String title, java.lang.String key, java.util.List options, java.lang.Object defaultValue, java.lang.String storageKey) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultValue, "defaultValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey, "storageKey");
        this.f447400a = title;
        this.f447401b = key;
        this.f447402c = options;
        this.f447403d = defaultValue;
        this.f447404e = storageKey;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f447401b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f447400a;
    }

    /* renamed from: equals */
    public boolean m160702xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.g)) {
            return false;
        }
        qq.g gVar = (qq.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447400a, gVar.f447400a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447401b, gVar.f447401b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447402c, gVar.f447402c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447403d, gVar.f447403d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447404e, gVar.f447404e);
    }

    /* renamed from: hashCode */
    public int m160703x8cdac1b() {
        return (((((((this.f447400a.hashCode() * 31) + this.f447401b.hashCode()) * 31) + this.f447402c.hashCode()) * 31) + this.f447403d.hashCode()) * 31) + this.f447404e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160704x9616526c() {
        return "EcsSettingSwitch(title=" + this.f447400a + ", key=" + this.f447401b + ", options=" + this.f447402c + ", defaultValue=" + this.f447403d + ", storageKey=" + this.f447404e + ')';
    }
}
