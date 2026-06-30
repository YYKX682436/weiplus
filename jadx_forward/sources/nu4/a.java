package nu4;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.l83 f421766a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.m83 f421767b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f421768c;

    /* renamed from: d, reason: collision with root package name */
    public int f421769d;

    /* renamed from: e, reason: collision with root package name */
    public int f421770e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f421771f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f421772g;

    public a(r45.l83 domain, r45.m83 manifest, java.lang.String str, int i17, int i18, boolean z17, java.lang.String str2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i19 & 4) != 0 ? null : str;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        z17 = (i19 & 32) != 0 ? false : z17;
        str2 = (i19 & 64) != 0 ? null : str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(domain, "domain");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manifest, "manifest");
        this.f421766a = domain;
        this.f421767b = manifest;
        this.f421768c = str;
        this.f421769d = i17;
        this.f421770e = i18;
        this.f421771f = z17;
        this.f421772g = str2;
    }

    /* renamed from: equals */
    public boolean m150007xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu4.a)) {
            return false;
        }
        nu4.a aVar = (nu4.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421766a, aVar.f421766a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421767b, aVar.f421767b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421768c, aVar.f421768c) && this.f421769d == aVar.f421769d && this.f421770e == aVar.f421770e && this.f421771f == aVar.f421771f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421772g, aVar.f421772g);
    }

    /* renamed from: hashCode */
    public int m150008x8cdac1b() {
        int hashCode = ((this.f421766a.hashCode() * 31) + this.f421767b.hashCode()) * 31;
        java.lang.String str = this.f421768c;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f421769d)) * 31) + java.lang.Integer.hashCode(this.f421770e)) * 31) + java.lang.Boolean.hashCode(this.f421771f)) * 31;
        java.lang.String str2 = this.f421772g;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m150009x9616526c() {
        return "PrefetchManifest(domain=" + this.f421766a + ", manifest=" + this.f421767b + ", extInfo=" + this.f421768c + ", bizScene=" + this.f421769d + ", subBizScene=" + this.f421770e + ", debug=" + this.f421771f + ", manifestKey=" + this.f421772g + ')';
    }
}
