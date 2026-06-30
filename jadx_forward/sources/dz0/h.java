package dz0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f326388a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326389b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f326390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f326391d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f326392e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f326393f;

    /* renamed from: g, reason: collision with root package name */
    public final int f326394g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f326395h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f326396i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f326397j;

    public h(java.lang.String scene, boolean z17, boolean z18, int i17, boolean z19, java.util.List defaultTemplateIDs, int i18, boolean z27, java.util.List list, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultTemplateIDs, "defaultTemplateIDs");
        this.f326388a = scene;
        this.f326389b = z17;
        this.f326390c = z18;
        this.f326391d = i17;
        this.f326392e = z19;
        this.f326393f = defaultTemplateIDs;
        this.f326394g = i18;
        this.f326395h = z27;
        this.f326396i = list;
        this.f326397j = z28;
    }

    /* renamed from: equals */
    public boolean m126468xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.h)) {
            return false;
        }
        dz0.h hVar = (dz0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326388a, hVar.f326388a) && this.f326389b == hVar.f326389b && this.f326390c == hVar.f326390c && this.f326391d == hVar.f326391d && this.f326392e == hVar.f326392e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326393f, hVar.f326393f) && this.f326394g == hVar.f326394g && this.f326395h == hVar.f326395h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326396i, hVar.f326396i) && this.f326397j == hVar.f326397j;
    }

    /* renamed from: hashCode */
    public int m126469x8cdac1b() {
        int hashCode = ((((((((((((((this.f326388a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f326389b)) * 31) + java.lang.Boolean.hashCode(this.f326390c)) * 31) + java.lang.Integer.hashCode(this.f326391d)) * 31) + java.lang.Boolean.hashCode(this.f326392e)) * 31) + this.f326393f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f326394g)) * 31) + java.lang.Boolean.hashCode(this.f326395h)) * 31;
        java.util.List list = this.f326396i;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f326397j);
    }

    /* renamed from: toString */
    public java.lang.String m126470x9616526c() {
        return "MaasMovieSessionInitialParams(scene=" + this.f326388a + ", musicMuted=" + this.f326389b + ", originMuted=" + this.f326390c + ", maxDurationInSeconds=" + this.f326391d + ", shouldRetainOriginalMediaDuration=" + this.f326392e + ", defaultTemplateIDs=" + this.f326393f + ", retainOriginalMediaDurationThresholdInSeconds=" + this.f326394g + ", shouldAutoRecommendBGM=" + this.f326395h + ", initialTmplList=" + this.f326396i + ", shouldAutoRecommendBGMForAutoRecommendTemplate=" + this.f326397j + ')';
    }
}
