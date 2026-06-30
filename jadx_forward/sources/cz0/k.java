package cz0;

/* loaded from: classes5.dex */
public final class k extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f306481a;

    /* renamed from: b, reason: collision with root package name */
    public int f306482b;

    /* renamed from: c, reason: collision with root package name */
    public int f306483c;

    /* renamed from: d, reason: collision with root package name */
    public int f306484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f306485e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306486f = "";

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObj, "jsonObj");
        this.f306482b = jsonObj.optInt("compatVersion");
        this.f306483c = jsonObj.optInt("resVersion");
        this.f306484d = jsonObj.optInt("baseVersion");
        java.lang.String optString = jsonObj.optString("sha1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        this.f306485e = optString;
        java.lang.String optString2 = jsonObj.optString("fullSha1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        this.f306486f = optString2;
        return this;
    }

    public final boolean c() {
        int i17 = this.f306482b;
        cz0.y yVar = cz0.y.f306502a;
        int i18 = cz0.y.f306503b;
        boolean z17 = i17 == i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasSdkResConfig", "isComp: " + z17 + ' ' + this.f306482b + ' ' + i18 + ' ');
        return z17;
    }

    public final boolean d() {
        if (this.f306483c <= 0 || this.f306484d <= 0) {
            return false;
        }
        if (this.f306485e.length() > 0) {
            return this.f306486f.length() > 0;
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m123141x9616526c() {
        return "MaasSdkResConfig(compatVersion=" + this.f306482b + ", resVersion=" + this.f306483c + ", baseVersion=" + this.f306484d + ", sha1='" + this.f306485e + "', fullSha1='" + this.f306486f + "')";
    }
}
