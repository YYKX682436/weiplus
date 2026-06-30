package rv4;

/* loaded from: classes12.dex */
public final class c0 implements mv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.i f481980a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.w f481981b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481982c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f481983d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f481984e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f481985f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f481986g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f481987h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f481988i;

    /* renamed from: j, reason: collision with root package name */
    public int f481989j;

    public c0(mv4.i boxData, org.json.JSONObject json, rv4.w session) {
        java.lang.Long c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f481980a = boxData;
        this.f481981b = session;
        java.lang.String optString = json.optString("hotword");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f481982c = optString;
        java.lang.Integer b17 = pv4.a.b(json, "businessType");
        this.f481984e = b17;
        this.f481985f = pv4.a.b(json, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        this.f481987h = json.has("isSwitchClosed") ? java.lang.Boolean.valueOf(json.optBoolean("isSwitchClosed")) : null;
        this.f481988i = json.optBoolean("needHideKeyBoard");
        pv4.a.b(json, "optype");
        org.json.JSONObject optJSONObject = session.a().f482087a.optJSONObject("localVerticalSwitchMap");
        optJSONObject = optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        if (b17 != null && b17.intValue() == 0) {
            c17 = pv4.a.c(optJSONObject, optString);
        } else {
            c17 = pv4.a.c(optJSONObject, java.lang.String.valueOf(b17));
            if (c17 == null) {
                c17 = pv4.a.c(optJSONObject, optString);
            }
        }
        this.f481983d = c17;
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f481981b;
        jv4.i iVar = wVar.f482090c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str = wVar.f413207a;
        rv4.b0 b0Var = (rv4.b0) this.f481980a;
        java.lang.String str2 = b0Var.f481976f;
        int i17 = b0Var.f481978h;
        java.lang.String title = b0Var.f481974d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        java.lang.String str3 = i17 + "|55|" + fp.s0.b(title, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        java.lang.String str4 = this.f481989j + '|' + this.f481989j + '|' + fp.s0.b(this.f481982c, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6) + "||||||title|";
        java.lang.Integer num = this.f481984e;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str, null, str2, 0L, dVar, str3, str4, 0, 0, null, 0, 3, 0, intValue, jSONObject2, 6026, null);
    }

    public boolean b() {
        java.lang.Long l17 = this.f481983d;
        if (l17 == null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481987h, java.lang.Boolean.TRUE)) {
                return true;
            }
        } else if (l17.longValue() == 0) {
            return true;
        }
        return false;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f481982c + '-' + this.f481984e;
    }

    @Override // nv4.g
    public void w() {
        ov4.c a17 = a(ov4.d.f430740f);
        rv4.w wVar = this.f481981b;
        if (wVar.f413208b.d("vertical-entry-" + ((rv4.b0) this.f481980a).f481976f + '-' + this.f481982c, a17)) {
            nv4.k kVar = wVar.f413208b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vertical-22369-");
            sb6.append(wVar.f413207a);
            sb6.append('-');
            java.lang.Integer num = this.f481984e;
            sb6.append(num != null ? num.intValue() : 0);
            kVar.d(sb6.toString(), new ov4.b(wVar.f413207a, java.lang.String.valueOf(num != null ? num.intValue() : 0), 2));
        }
    }
}
