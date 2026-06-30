package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public int f264674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264675b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264676c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f264677d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264678e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f264679f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f264680g;

    /* renamed from: h, reason: collision with root package name */
    public r45.n54 f264681h;

    /* renamed from: i, reason: collision with root package name */
    public final long f264682i;

    /* renamed from: j, reason: collision with root package name */
    public int f264683j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f264684k;

    public v3(int i17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3, r45.n54 n54Var, long j17, int i28, java.lang.String str4, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i29 & 1) != 0 ? -1 : i17;
        str = (i29 & 8) != 0 ? null : str;
        n54Var = (i29 & 128) != 0 ? null : n54Var;
        str4 = (i29 & 1024) != 0 ? null : str4;
        this.f264674a = i17;
        this.f264675b = i18;
        this.f264676c = i19;
        this.f264677d = str;
        this.f264678e = i27;
        this.f264679f = str2;
        this.f264680g = str3;
        this.f264681h = n54Var;
        this.f264682i = j17;
        this.f264683j = i28;
        this.f264684k = str4;
    }

    /* renamed from: equals */
    public boolean m74320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v3 v3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.v3) obj;
        return this.f264674a == v3Var.f264674a && this.f264675b == v3Var.f264675b && this.f264676c == v3Var.f264676c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264677d, v3Var.f264677d) && this.f264678e == v3Var.f264678e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264679f, v3Var.f264679f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264680g, v3Var.f264680g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264681h, v3Var.f264681h) && this.f264682i == v3Var.f264682i && this.f264683j == v3Var.f264683j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f264684k, v3Var.f264684k);
    }

    /* renamed from: hashCode */
    public int m74321x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f264674a) * 31) + java.lang.Integer.hashCode(this.f264675b)) * 31) + java.lang.Integer.hashCode(this.f264676c)) * 31;
        java.lang.String str = this.f264677d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f264678e)) * 31;
        java.lang.String str2 = this.f264679f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f264680g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r45.n54 n54Var = this.f264681h;
        int hashCode5 = (((((hashCode4 + (n54Var == null ? 0 : n54Var.hashCode())) * 31) + java.lang.Long.hashCode(this.f264682i)) * 31) + java.lang.Integer.hashCode(this.f264683j)) * 31;
        java.lang.String str4 = this.f264684k;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m74322x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebViewEventReportInfo{eventType: ");
        sb6.append(this.f264674a);
        sb6.append(", init_request_id: ");
        sb6.append(this.f264675b);
        sb6.append(", request_id: ");
        sb6.append(this.f264676c);
        sb6.append("}, msgId: ");
        sb6.append(this.f264677d);
        sb6.append(", scene: ");
        sb6.append(this.f264678e);
        sb6.append(", fromUsername: ");
        sb6.append(this.f264679f);
        sb6.append(", msgUsername: ");
        sb6.append(this.f264680g);
        sb6.append(", appId: ");
        r45.n54 n54Var = this.f264681h;
        sb6.append(n54Var != null ? n54Var.f462623d : null);
        sb6.append(", interval_since_webview_open_ms:");
        sb6.append(this.f264683j);
        sb6.append(", url: %s");
        java.lang.String format = java.lang.String.format(sb6.toString(), java.util.Arrays.copyOf(new java.lang.Object[]{this.f264684k}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
