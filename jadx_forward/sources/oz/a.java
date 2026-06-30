package oz;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f431671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f431672b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f431673c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f431674d;

    public a(long j17, boolean z17, java.lang.String serialTag, java.lang.String storageKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serialTag, "serialTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageKey, "storageKey");
        this.f431671a = j17;
        this.f431672b = z17;
        this.f431673c = serialTag;
        this.f431674d = storageKey;
    }

    /* renamed from: equals */
    public boolean m157467xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz.a)) {
            return false;
        }
        oz.a aVar = (oz.a) obj;
        return this.f431671a == aVar.f431671a && this.f431672b == aVar.f431672b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431673c, aVar.f431673c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431674d, aVar.f431674d);
    }

    /* renamed from: hashCode */
    public int m157468x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f431671a) * 31) + java.lang.Boolean.hashCode(this.f431672b)) * 31) + this.f431673c.hashCode()) * 31) + this.f431674d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157469x9616526c() {
        return "SceneConfig(checkDelayMs=" + this.f431671a + ", requiresAutoSyncEnabled=" + this.f431672b + ", serialTag=" + this.f431673c + ", storageKey=" + this.f431674d + ')';
    }
}
