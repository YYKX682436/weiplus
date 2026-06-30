package zv4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f557995a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f557996b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f557997c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f557998d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f557999e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f558000f;

    /* renamed from: g, reason: collision with root package name */
    public final int f558001g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f558002h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f558003i;

    /* renamed from: j, reason: collision with root package name */
    public final int f558004j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f558005k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f558006l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f558007m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f558008n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f558009o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f558010p;

    public i(java.lang.String query, java.lang.Integer num, java.lang.Integer num2, java.lang.String sessionId, java.lang.String searchId, java.lang.String subSessionId, int i17, java.lang.String extParams, java.lang.String placeHolder, int i18, boolean z17, boolean z18, java.lang.String forceUseThemeMode, boolean z19, boolean z27, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subSessionId, "subSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeHolder, "placeHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceUseThemeMode, "forceUseThemeMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f557995a = query;
        this.f557996b = num;
        this.f557997c = num2;
        this.f557998d = sessionId;
        this.f557999e = searchId;
        this.f558000f = subSessionId;
        this.f558001g = i17;
        this.f558002h = extParams;
        this.f558003i = placeHolder;
        this.f558004j = i18;
        this.f558005k = z17;
        this.f558006l = z18;
        this.f558007m = forceUseThemeMode;
        this.f558008n = z19;
        this.f558009o = z27;
        this.f558010p = title;
    }

    /* renamed from: equals */
    public boolean m179791xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv4.i)) {
            return false;
        }
        zv4.i iVar = (zv4.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557995a, iVar.f557995a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557996b, iVar.f557996b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557997c, iVar.f557997c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557998d, iVar.f557998d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557999e, iVar.f557999e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558000f, iVar.f558000f) && this.f558001g == iVar.f558001g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558002h, iVar.f558002h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558003i, iVar.f558003i) && this.f558004j == iVar.f558004j && this.f558005k == iVar.f558005k && this.f558006l == iVar.f558006l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558007m, iVar.f558007m) && this.f558008n == iVar.f558008n && this.f558009o == iVar.f558009o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558010p, iVar.f558010p);
    }

    /* renamed from: hashCode */
    public int m179792x8cdac1b() {
        int hashCode = this.f557995a.hashCode() * 31;
        java.lang.Integer num = this.f557996b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f557997c;
        return ((((((((((((((((((((((((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.f557998d.hashCode()) * 31) + this.f557999e.hashCode()) * 31) + this.f558000f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f558001g)) * 31) + this.f558002h.hashCode()) * 31) + this.f558003i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f558004j)) * 31) + java.lang.Boolean.hashCode(this.f558005k)) * 31) + java.lang.Boolean.hashCode(this.f558006l)) * 31) + this.f558007m.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f558008n)) * 31) + java.lang.Boolean.hashCode(this.f558009o)) * 31) + this.f558010p.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179793x9616526c() {
        return "SearchParams(query=" + this.f557995a + ", scene=" + this.f557996b + ", type=" + this.f557997c + ", sessionId=" + this.f557998d + ", searchId=" + this.f557999e + ", subSessionId=" + this.f558000f + ", ftsNeedKeyboard=" + this.f558001g + ", extParams=" + this.f558002h + ", placeHolder=" + this.f558003i + ", isHomePage=" + this.f558004j + ", needPreGet=" + this.f558005k + ", enableRestoreEducatePage=" + this.f558006l + ", forceUseThemeMode=" + this.f558007m + ", isHideSearchInput=" + this.f558008n + ", isHideNavBar=" + this.f558009o + ", title=" + this.f558010p + ')';
    }
}
