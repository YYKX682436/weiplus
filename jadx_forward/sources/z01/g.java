package z01;

/* loaded from: classes9.dex */
public final class g implements q31.p {

    /* renamed from: n, reason: collision with root package name */
    public int f550553n;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f550557r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f550558s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f550559t;

    /* renamed from: u, reason: collision with root package name */
    public int f550560u;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f550563x;

    /* renamed from: d, reason: collision with root package name */
    public z01.f f550546d = z01.f.f550539f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f550547e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f550548f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f550549g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f550550h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f550551i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f550552m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f550554o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f550555p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f550556q = "";

    /* renamed from: v, reason: collision with root package name */
    public int f550561v = 146;

    /* renamed from: w, reason: collision with root package name */
    public int f550562w = 146;

    public final void a() {
        java.lang.String str = this.f550556q;
        int hashCode = str.hashCode();
        if (hashCode == 48936) {
            str.equals("1:1");
            return;
        }
        if (hashCode == 50861) {
            if (str.equals("3:4")) {
                this.f550562w = 195;
            }
        } else if (hashCode == 51821 && str.equals("4:3")) {
            this.f550561v = 195;
        }
    }

    public final void b() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f550554o);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56081x69307313);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f550547e = optString;
            java.lang.String optString2 = jSONObject.optString("subSource");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            this.f550552m = optString2;
            java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            this.f550549g = optString3;
            java.lang.String optString4 = jSONObject.optString("thumbUrl");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            this.f550548f = optString4;
            java.lang.String optString5 = jSONObject.optString("ratioType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
            this.f550556q = optString5;
            this.f550553n = jSONObject.optInt("count");
            this.f550555p = c(jSONObject.optInt("duration"));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AskShareViewModel", e17.getMessage());
        }
        java.lang.String str = this.f550547e;
        this.f550546d = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "photo") ? z01.f.f550537d : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "video") ? z01.f.f550538e : z01.f.f550539f;
        a();
    }

    public final java.lang.String c(int i17) {
        if (i17 < 1) {
            return "";
        }
        int i18 = i17 / 3600;
        int i19 = i17 % 3600;
        int i27 = i19 / 60;
        int i28 = i19 % 60;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i18 > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i18);
            sb7.append(':');
            sb6.append(sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(i27);
        sb8.append(':');
        sb6.append(sb8.toString());
        if (i28 < 10) {
            sb6.append("0" + i28);
        } else {
            sb6.append(i28);
        }
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }

    /* renamed from: clone */
    public java.lang.Object m178241x5a5dd5d() {
        return super.clone();
    }
}
