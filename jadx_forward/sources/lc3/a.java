package lc3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399411a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399412b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399413c;

    /* renamed from: d, reason: collision with root package name */
    public final long f399414d;

    public a(java.lang.String pathInAssets, long j17, java.lang.String md52, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathInAssets, "pathInAssets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        this.f399411a = pathInAssets;
        this.f399412b = j17;
        this.f399413c = md52;
        this.f399414d = j18;
    }

    /* renamed from: equals */
    public boolean m145558xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.a)) {
            return false;
        }
        lc3.a aVar = (lc3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399411a, aVar.f399411a) && this.f399412b == aVar.f399412b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399413c, aVar.f399413c) && this.f399414d == aVar.f399414d;
    }

    /* renamed from: hashCode */
    public int m145559x8cdac1b() {
        return (((((this.f399411a.hashCode() * 31) + java.lang.Long.hashCode(this.f399412b)) * 31) + this.f399413c.hashCode()) * 31) + java.lang.Long.hashCode(this.f399414d);
    }

    /* renamed from: toString */
    public java.lang.String m145560x9616526c() {
        return "BaseEmbedConfig(pathInAssets='" + this.f399411a + "', versionForBoots=" + this.f399412b + ", versionForUDR=" + this.f399414d + ", md5='" + this.f399413c + "')";
    }

    public /* synthetic */ a(java.lang.String str, long j17, java.lang.String str2, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, j17, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? 0L : j18);
    }
}
