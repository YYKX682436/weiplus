package c01;

/* loaded from: classes9.dex */
public class ta {

    /* renamed from: s, reason: collision with root package name */
    public boolean f119019s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f119020t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f119021u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f119022v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f119023w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f119024x = "";

    /* renamed from: y, reason: collision with root package name */
    public int f119025y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f119026z = "";
    public int A = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f119001a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f119002b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f119003c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f119004d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f119005e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f119006f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f119007g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f119008h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f119009i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f119010j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f119011k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f119012l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f119013m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f119014n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f119015o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f119016p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f119017q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f119018r = "";

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
        this.f119001a = cursor.getString(0);
        this.f119002b = cursor.getLong(1);
        this.f119003c = cursor.getInt(2);
        this.f119004d = cursor.getString(3);
        this.f119005e = cursor.getString(4);
        this.f119006f = cursor.getString(5);
        this.f119007g = cursor.getString(6);
        this.f119008h = cursor.getString(7);
        this.f119009i = cursor.getLong(8);
        this.f119010j = cursor.getString(9);
        this.f119011k = cursor.getString(10);
        this.f119012l = cursor.getInt(11);
        this.f119013m = cursor.getString(12);
        this.f119014n = cursor.getString(13);
        this.f119015o = cursor.getInt(14);
        this.f119016p = cursor.getLong(15);
        this.f119017q = cursor.getString(16);
        this.f119018r = cursor.getString(17);
    }

    public void b(int i17, int i18, int i19, java.lang.String str, int i27, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i17));
            jSONObject.putOpt("videoLength", java.lang.Integer.valueOf(i18));
            jSONObject.putOpt("subType", java.lang.Integer.valueOf(i19));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("groupId", str);
            jSONObject.putOpt("tweetType", java.lang.Integer.valueOf(i27));
            jSONObject.putOpt("installedTitle", str2);
            jSONObject.putOpt("yuanBaoAid", str3);
            this.f119018r = jSONObject.toString();
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String c() {
        java.lang.String[] split;
        java.lang.String str = this.f119013m;
        return (str == null || (split = str.split("\\|")) == null || split.length <= 0) ? "" : split[0];
    }

    public java.lang.String d() {
        java.lang.String str = this.f119014n;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f119005e;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f119001a;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f119006f;
        return str == null ? "" : str;
    }

    public final void i() {
        if (this.f119019s || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f119018r)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f119018r);
            this.f119020t = jSONObject.optInt("videoLength", 0);
            int optInt = jSONObject.optInt("subType", 0);
            if (optInt == 1) {
                this.f119021u = optInt;
            } else {
                this.f119021u = 0;
            }
            this.f119023w = jSONObject.optString("groupId", "");
            this.f119022v = jSONObject.optInt("tweetType", 0);
            this.f119024x = jSONObject.optString("installedTitle", "");
            this.f119026z = jSONObject.optString("yuanBaoAid", "");
            this.f119025y = jSONObject.optInt(ya.b.f77479x42930b2, 0);
        } catch (java.lang.Exception unused) {
        }
        this.f119019s = true;
    }
}
