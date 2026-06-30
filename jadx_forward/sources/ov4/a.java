package ov4;

/* loaded from: classes.dex */
public final class a implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f430714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f430715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430716c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f430717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f430718e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f430719f;

    /* renamed from: g, reason: collision with root package name */
    public final int f430720g;

    public a(int i17, int i18, int i19, java.lang.String searchId, int i27, java.lang.String sessionId, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i29 & 2) != 0 ? 0 : i18;
        searchId = (i29 & 8) != 0 ? "" : searchId;
        i27 = (i29 & 16) != 0 ? 0 : i27;
        i28 = (i29 & 64) != 0 ? 2 : i28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f430714a = i17;
        this.f430715b = i18;
        this.f430716c = i19;
        this.f430717d = searchId;
        this.f430718e = i27;
        this.f430719f = sessionId;
        this.f430720g = i28;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "12845-" + this.f430719f + ',' + this.f430714a + ',' + this.f430716c;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return null;
    }

    /* renamed from: equals */
    public boolean m157210xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.a)) {
            return false;
        }
        ov4.a aVar = (ov4.a) obj;
        return this.f430714a == aVar.f430714a && this.f430715b == aVar.f430715b && this.f430716c == aVar.f430716c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430717d, aVar.f430717d) && this.f430718e == aVar.f430718e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430719f, aVar.f430719f) && this.f430720g == aVar.f430720g;
    }

    /* renamed from: hashCode */
    public int m157211x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f430714a) * 31) + java.lang.Integer.hashCode(this.f430715b)) * 31) + java.lang.Integer.hashCode(this.f430716c)) * 31) + this.f430717d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430718e)) * 31) + this.f430719f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430720g);
    }

    /* renamed from: toString */
    public java.lang.String m157212x9616526c() {
        return "FTSReportItem12845(businessType=" + this.f430714a + ", guideStyle=" + this.f430715b + ", scene=" + this.f430716c + ", searchId=" + this.f430717d + ", isTabGuide=" + this.f430718e + ", sessionId=" + this.f430719f + ", h5version=" + this.f430720g + ')';
    }

    @Override // nv4.h
    public void z() {
        jx3.f.INSTANCE.mo68478xbd3cda5f(12845, this.f430714a + ',' + this.f430715b + ',' + this.f430716c + ',' + this.f430717d + ',' + this.f430718e + ',' + this.f430719f + ",," + this.f430720g);
    }
}
