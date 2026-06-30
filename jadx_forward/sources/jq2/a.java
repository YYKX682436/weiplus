package jq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f382628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382629b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.dd2 f382630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f382631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f382632e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.u80 f382633f;

    /* renamed from: g, reason: collision with root package name */
    public final fq2.a f382634g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.ed2 f382635h;

    /* renamed from: i, reason: collision with root package name */
    public final hq2.c f382636i;

    public a(int i17, int i18, r45.dd2 tabInfo, int i19, int i27, r45.u80 containerContext, fq2.a outSideHook, r45.ed2 ed2Var, hq2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabInfo, "tabInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerContext, "containerContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outSideHook, "outSideHook");
        this.f382628a = i17;
        this.f382629b = i18;
        this.f382630c = tabInfo;
        this.f382631d = i19;
        this.f382632e = i27;
        this.f382633f = containerContext;
        this.f382634g = outSideHook;
        this.f382635h = ed2Var;
        this.f382636i = cVar;
    }

    /* renamed from: equals */
    public boolean m141220xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq2.a)) {
            return false;
        }
        jq2.a aVar = (jq2.a) obj;
        return this.f382628a == aVar.f382628a && this.f382629b == aVar.f382629b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382630c, aVar.f382630c) && this.f382631d == aVar.f382631d && this.f382632e == aVar.f382632e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382633f, aVar.f382633f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382634g, aVar.f382634g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382635h, aVar.f382635h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382636i, aVar.f382636i);
    }

    /* renamed from: hashCode */
    public int m141221x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f382628a) * 31) + java.lang.Integer.hashCode(this.f382629b)) * 31) + this.f382630c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f382631d)) * 31) + java.lang.Integer.hashCode(this.f382632e)) * 31) + this.f382633f.hashCode()) * 31) + this.f382634g.hashCode()) * 31;
        r45.ed2 ed2Var = this.f382635h;
        int hashCode2 = (hashCode + (ed2Var == null ? 0 : ed2Var.hashCode())) * 31;
        hq2.c cVar = this.f382636i;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141222x9616526c() {
        return "LiveStreamTabParams(pos=" + this.f382628a + ", tabId=" + this.f382629b + ", tabInfo=" + this.f382630c + ", containerType=" + this.f382631d + ", containerId=" + this.f382632e + ", containerContext=" + this.f382633f + ", outSideHook=" + this.f382634g + ", tabContainerInfo=" + this.f382635h + ", tabPageConvertData=" + this.f382636i + ')';
    }
}
