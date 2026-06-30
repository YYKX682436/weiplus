package mu4;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f412958a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f412959b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412960c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412961d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f412962e;

    public j(boolean z17, boolean z18, java.lang.String str, java.lang.String assetsPath, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetsPath, "assetsPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f412958a = z17;
        this.f412959b = z18;
        this.f412960c = str;
        this.f412961d = assetsPath;
        this.f412962e = appId;
    }

    /* renamed from: equals */
    public boolean m148390xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4.j)) {
            return false;
        }
        mu4.j jVar = (mu4.j) obj;
        return this.f412958a == jVar.f412958a && this.f412959b == jVar.f412959b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412960c, jVar.f412960c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412961d, jVar.f412961d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412962e, jVar.f412962e);
    }

    /* renamed from: hashCode */
    public int m148391x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f412958a) * 31) + java.lang.Boolean.hashCode(this.f412959b)) * 31;
        java.lang.String str = this.f412960c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f412961d.hashCode()) * 31) + this.f412962e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148392x9616526c() {
        return "ReadPkgInfo(isDebugger=" + this.f412958a + ", isPreview=" + this.f412959b + ", resPath=" + this.f412960c + ", assetsPath=" + this.f412961d + ", appId=" + this.f412962e + ')';
    }
}
