package oz3;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f431790a;

    /* renamed from: b, reason: collision with root package name */
    public final int f431791b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f431792c;

    /* renamed from: d, reason: collision with root package name */
    public final int f431793d;

    /* renamed from: e, reason: collision with root package name */
    public final int f431794e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f431795f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f431796g;

    /* renamed from: h, reason: collision with root package name */
    public final oz3.f f431797h;

    public e(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab, oz3.f ocrReportType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrReportType, "ocrReportType");
        this.f431790a = i17;
        this.f431791b = i18;
        this.f431792c = str;
        this.f431793d = i19;
        this.f431794e = i27;
        this.f431795f = str2;
        this.f431796g = c25309x51dbc9ab;
        this.f431797h = ocrReportType;
    }

    /* renamed from: equals */
    public boolean m157489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz3.e)) {
            return false;
        }
        oz3.e eVar = (oz3.e) obj;
        return this.f431790a == eVar.f431790a && this.f431791b == eVar.f431791b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431792c, eVar.f431792c) && this.f431793d == eVar.f431793d && this.f431794e == eVar.f431794e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431795f, eVar.f431795f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431796g, eVar.f431796g) && this.f431797h == eVar.f431797h;
    }

    /* renamed from: hashCode */
    public int m157490x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f431790a) * 31) + java.lang.Integer.hashCode(this.f431791b)) * 31;
        java.lang.String str = this.f431792c;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f431793d)) * 31) + java.lang.Integer.hashCode(this.f431794e)) * 31;
        java.lang.String str2 = this.f431795f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab = this.f431796g;
        return ((hashCode3 + (c25309x51dbc9ab != null ? c25309x51dbc9ab.hashCode() : 0)) * 31) + this.f431797h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157491x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScanCodeOcrReportRequest{getA8KeyScene: ");
        sb6.append(this.f431790a);
        sb6.append(", getA8KeyRequestId: ");
        sb6.append(this.f431791b);
        sb6.append(", codeContent: ");
        sb6.append(this.f431792c);
        sb6.append("}, codeType: ");
        sb6.append(this.f431793d);
        sb6.append(", scanSource: ");
        sb6.append(this.f431794e);
        sb6.append(", svrMsgId: ");
        sb6.append(this.f431795f);
        sb6.append(", identifyReportInfo.imagePath: ");
        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab = this.f431796g;
        sb6.append(c25309x51dbc9ab != null ? c25309x51dbc9ab.f296779h : null);
        sb6.append('}');
        return sb6.toString();
    }
}
