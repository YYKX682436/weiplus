package c01;

/* loaded from: classes9.dex */
public class ta {

    /* renamed from: s, reason: collision with root package name */
    public boolean f37486s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f37487t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f37488u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f37489v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f37490w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f37491x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f37492y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f37493z = "";
    public int A = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f37468a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f37469b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f37470c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37471d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f37472e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f37473f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f37474g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f37475h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f37476i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f37477j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f37478k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f37479l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f37480m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f37481n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f37482o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f37483p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f37484q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f37485r = "";

    public static java.lang.String e(int i17) {
        if (i17 == 20) {
            return "newsapp";
        }
        if (i17 == 11) {
            return "blogapp";
        }
        iz5.a.g("INFO TYPE NEITHER NEWS NOR WEIBO", false);
        return null;
    }

    public void a(android.database.Cursor cursor) {
        this.f37468a = cursor.getString(0);
        this.f37469b = cursor.getLong(1);
        this.f37470c = cursor.getInt(2);
        this.f37471d = cursor.getString(3);
        this.f37472e = cursor.getString(4);
        this.f37473f = cursor.getString(5);
        this.f37474g = cursor.getString(6);
        this.f37475h = cursor.getString(7);
        this.f37476i = cursor.getLong(8);
        this.f37477j = cursor.getString(9);
        this.f37478k = cursor.getString(10);
        this.f37479l = cursor.getInt(11);
        this.f37480m = cursor.getString(12);
        this.f37481n = cursor.getString(13);
        this.f37482o = cursor.getInt(14);
        this.f37483p = cursor.getLong(15);
        this.f37484q = cursor.getString(16);
        this.f37485r = cursor.getString(17);
    }

    public void b(int i17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(ya.b.INDEX, java.lang.Integer.valueOf(i17));
            jSONObject.putOpt("videoLength", java.lang.Integer.valueOf(i18));
            jSONObject.putOpt("subType", java.lang.Integer.valueOf(i19));
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("groupId", str);
            jSONObject.putOpt("tweetType", java.lang.Integer.valueOf(i27));
            jSONObject.putOpt("installedTitle", str2);
            jSONObject.putOpt("yuanBaoAid", str3);
            this.f37485r = jSONObject.toString();
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String c() {
        java.lang.String[] split;
        java.lang.String str = this.f37480m;
        return (str == null || (split = str.split("\\|")) == null || split.length <= 0) ? "" : split[0];
    }

    public java.lang.String d() {
        java.lang.String str = this.f37481n;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f37472e;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f37468a;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f37473f;
        return str == null ? "" : str;
    }

    public final void i() {
        if (this.f37486s || com.tencent.mm.sdk.platformtools.t8.K0(this.f37485r)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f37485r);
            this.f37487t = jSONObject.optInt("videoLength", 0);
            int optInt = jSONObject.optInt("subType", 0);
            if (optInt == 1) {
                this.f37488u = optInt;
            } else {
                this.f37488u = 0;
            }
            this.f37490w = jSONObject.optString("groupId", "");
            this.f37489v = jSONObject.optInt("tweetType", 0);
            this.f37491x = jSONObject.optString("installedTitle", "");
            this.f37493z = jSONObject.optString("yuanBaoAid", "");
            this.f37492y = jSONObject.optInt(ya.b.INDEX, 0);
        } catch (java.lang.Exception unused) {
        }
        this.f37486s = true;
    }
}
