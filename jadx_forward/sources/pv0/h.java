package pv0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f440058a;

    /* renamed from: b, reason: collision with root package name */
    public final pv0.a f440059b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440060c;

    /* renamed from: d, reason: collision with root package name */
    public final pv0.j f440061d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440063f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f440064g;

    public h(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment, pv0.a timbrePanelCallback, java.lang.String panelTitle, pv0.j panelType, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timbrePanelCallback, "timbrePanelCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelTitle, "panelTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelType, "panelType");
        this.f440058a = segment;
        this.f440059b = timbrePanelCallback;
        this.f440060c = panelTitle;
        this.f440061d = panelType;
        this.f440062e = z17;
        this.f440063f = z18;
        this.f440064g = z19;
    }

    /* renamed from: equals */
    public boolean m159058xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0.h)) {
            return false;
        }
        pv0.h hVar = (pv0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440058a, hVar.f440058a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440059b, hVar.f440059b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440060c, hVar.f440060c) && this.f440061d == hVar.f440061d && this.f440062e == hVar.f440062e && this.f440063f == hVar.f440063f && this.f440064g == hVar.f440064g;
    }

    /* renamed from: hashCode */
    public int m159059x8cdac1b() {
        return (((((((((((this.f440058a.hashCode() * 31) + this.f440059b.hashCode()) * 31) + this.f440060c.hashCode()) * 31) + this.f440061d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f440062e)) * 31) + java.lang.Boolean.hashCode(this.f440063f)) * 31) + java.lang.Boolean.hashCode(this.f440064g);
    }

    /* renamed from: toString */
    public java.lang.String m159060x9616526c() {
        return "Args(segment=" + this.f440058a + ", timbrePanelCallback=" + this.f440059b + ", panelTitle=" + this.f440060c + ", panelType=" + this.f440061d + ", isAutoApply=" + this.f440062e + ", isAllowApplyInLoading=" + this.f440063f + ", isAllowClose=" + this.f440064g + ')';
    }
}
