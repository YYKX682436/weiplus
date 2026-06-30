package rx4;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f482857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f482858b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f482859c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f482860d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482861e;

    /* renamed from: f, reason: collision with root package name */
    public final int f482862f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f482863g;

    /* renamed from: h, reason: collision with root package name */
    public final rx4.y0 f482864h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f482865i;

    public x0(org.json.JSONObject raw, int i17, boolean z17) {
        org.json.JSONObject optJSONObject;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        this.f482857a = raw;
        this.f482858b = i17;
        this.f482859c = z17;
        this.f482860d = "";
        this.f482861e = "";
        this.f482865i = "";
        java.lang.String optString = raw.optString("hotword", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f482860d = optString;
        java.lang.String optString2 = raw.optString("mixerCommonContext", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f482861e = optString2;
        boolean z18 = false;
        this.f482862f = raw.optInt(ya.b.f77502x92235c1b, 0);
        java.lang.String optString3 = raw.optString("showText", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
        if (optString3.length() > 0) {
            this.f482863g = r26.n0.B(optString3, "font-color-BOLD", false);
        }
        org.json.JSONArray optJSONArray = raw.optJSONArray("tags");
        if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
            return;
        }
        rx4.y0 y0Var = new rx4.y0(optJSONObject);
        this.f482865i = y0Var.f482871b;
        if (r26.n0.D(y0Var.f482873d, "var(--ORANGE)", false, 2, null) || (i18 = y0Var.f482872c) == 1 || i18 == 35 || (z17 && (i18 == 6 || i18 == 11))) {
            z18 = true;
        }
        if (z18) {
            this.f482864h = y0Var;
        }
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f482858b;
        sb6.append(i17 + 1);
        sb6.append('|');
        sb6.append(i17 + 1);
        sb6.append('|');
        sb6.append(fp.s0.b(this.f482860d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append("||1|");
        sb6.append(fp.s0.b(this.f482865i, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append("|||title|");
        sb6.append(this.f482862f);
        return sb6.toString();
    }

    /* renamed from: equals */
    public boolean m163433xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.x0)) {
            return false;
        }
        rx4.x0 x0Var = (rx4.x0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482857a, x0Var.f482857a) && this.f482858b == x0Var.f482858b && this.f482859c == x0Var.f482859c;
    }

    /* renamed from: hashCode */
    public int m163434x8cdac1b() {
        return (((this.f482857a.hashCode() * 31) + java.lang.Integer.hashCode(this.f482858b)) * 31) + java.lang.Boolean.hashCode(this.f482859c);
    }

    /* renamed from: toString */
    public java.lang.String m163435x9616526c() {
        return "FTSRecommendItem(raw=" + this.f482857a + ", index=" + this.f482858b + ", isNewStyle=" + this.f482859c + ')';
    }
}
