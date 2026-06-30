package tg0;

/* loaded from: classes8.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f500579a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f500580b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f500581c;

    /* renamed from: d, reason: collision with root package name */
    public final tg0.g2 f500582d;

    /* renamed from: e, reason: collision with root package name */
    public final tg0.d1 f500583e;

    /* renamed from: f, reason: collision with root package name */
    public final tg0.s2 f500584f;

    /* renamed from: g, reason: collision with root package name */
    public final tg0.y1 f500585g;

    /* renamed from: h, reason: collision with root package name */
    public final tg0.h2 f500586h;

    /* renamed from: i, reason: collision with root package name */
    public final tg0.b f500587i;

    /* renamed from: j, reason: collision with root package name */
    public tg0.c1 f500588j;

    /* renamed from: k, reason: collision with root package name */
    public final int f500589k;

    public c2(boolean z17, boolean z18, boolean z19, tg0.g2 mode, tg0.d1 d1Var, tg0.s2 s2Var, tg0.y1 y1Var, tg0.h2 h2Var, tg0.b bVar, tg0.c1 c1Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        this.f500579a = z17;
        this.f500580b = z18;
        this.f500581c = z19;
        this.f500582d = mode;
        this.f500583e = d1Var;
        this.f500584f = s2Var;
        this.f500585g = y1Var;
        this.f500586h = h2Var;
        this.f500587i = bVar;
        this.f500588j = c1Var;
        this.f500589k = i17;
    }

    /* renamed from: equals */
    public boolean m166442xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.c2)) {
            return false;
        }
        tg0.c2 c2Var = (tg0.c2) obj;
        return this.f500579a == c2Var.f500579a && this.f500580b == c2Var.f500580b && this.f500581c == c2Var.f500581c && this.f500582d == c2Var.f500582d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500583e, c2Var.f500583e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500584f, c2Var.f500584f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500585g, c2Var.f500585g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500586h, c2Var.f500586h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500587i, c2Var.f500587i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500588j, c2Var.f500588j) && this.f500589k == c2Var.f500589k;
    }

    /* renamed from: hashCode */
    public int m166443x8cdac1b() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f500579a) * 31) + java.lang.Boolean.hashCode(this.f500580b)) * 31) + java.lang.Boolean.hashCode(this.f500581c)) * 31) + this.f500582d.hashCode()) * 31;
        tg0.d1 d1Var = this.f500583e;
        int hashCode2 = (hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        tg0.s2 s2Var = this.f500584f;
        int hashCode3 = (hashCode2 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        tg0.y1 y1Var = this.f500585g;
        int hashCode4 = (hashCode3 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        tg0.h2 h2Var = this.f500586h;
        int hashCode5 = (hashCode4 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        tg0.b bVar = this.f500587i;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        tg0.c1 c1Var = this.f500588j;
        return ((hashCode6 + (c1Var != null ? c1Var.m166440x8cdac1b() : 0)) * 31) + java.lang.Integer.hashCode(this.f500589k);
    }

    /* renamed from: toString */
    public java.lang.String m166444x9616526c() {
        return "PlatformSearchWebViewData(isJsReady=" + this.f500579a + ", needCallUiInit=" + this.f500580b + ", needNotifyH5Result=" + this.f500581c + ", mode=" + this.f500582d + ", bean=" + this.f500583e + ", webView=" + this.f500584f + ", jsApi=" + this.f500585g + ", webSearchJsApi=" + this.f500586h + ", editFocusChangedListener=" + this.f500587i + ", result=" + this.f500588j + ", hashCode=" + this.f500589k + ')';
    }
}
