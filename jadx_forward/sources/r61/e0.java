package r61;

/* loaded from: classes11.dex */
public class e0 {

    /* renamed from: q, reason: collision with root package name */
    public int f474391q = -1;

    /* renamed from: a, reason: collision with root package name */
    public long f474375a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f474376b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f474377c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f474378d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474379e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474380f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474381g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f474382h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f474383i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f474384j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f474385k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f474386l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f474387m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f474388n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f474389o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f474390p = "";

    public void a(android.database.Cursor cursor) {
        this.f474375a = cursor.getLong(0);
        this.f474376b = cursor.getString(1);
        this.f474377c = cursor.getInt(2);
        this.f474378d = cursor.getInt(3);
        this.f474379e = cursor.getString(4);
        this.f474380f = cursor.getString(5);
        this.f474381g = cursor.getString(6);
        this.f474382h = cursor.getString(7);
        this.f474383i = cursor.getInt(8);
        this.f474384j = cursor.getInt(9);
        this.f474385k = cursor.getString(10);
        this.f474386l = cursor.getString(11);
        this.f474387m = cursor.getString(12);
        this.f474388n = cursor.getString(13);
        this.f474389o = cursor.getInt(14);
        this.f474390p = cursor.getString(15);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f474391q & 1) != 0) {
            contentValues.put("fbid", java.lang.Long.valueOf(this.f474375a));
        }
        if ((this.f474391q & 2) != 0) {
            java.lang.String str = this.f474376b;
            if (str == null) {
                str = "";
            }
            contentValues.put("fbname", str);
        }
        if ((this.f474391q & 4) != 0) {
            contentValues.put("fbimgkey", java.lang.Integer.valueOf(this.f474377c));
        }
        if ((this.f474391q & 8) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f474378d));
        }
        if ((this.f474391q & 16) != 0) {
            java.lang.String str2 = this.f474379e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str2);
        }
        if ((this.f474391q & 32) != 0) {
            java.lang.String str3 = this.f474380f;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("nickname", str3);
        }
        if ((this.f474391q & 64) != 0) {
            java.lang.String str4 = this.f474381g;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("nicknamepyinitial", str4);
        }
        if ((this.f474391q & 128) != 0) {
            java.lang.String str5 = this.f474382h;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("nicknamequanpin", str5);
        }
        if ((this.f474391q & 256) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f474383i));
        }
        if ((this.f474391q & 512) != 0) {
            contentValues.put("personalcard", java.lang.Integer.valueOf(this.f474384j));
        }
        if ((this.f474391q & 1024) != 0) {
            java.lang.String str6 = this.f474385k;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put("province", str6);
        }
        if ((this.f474391q & 2048) != 0) {
            java.lang.String str7 = this.f474386l;
            if (str7 == null) {
                str7 = "";
            }
            contentValues.put("city", str7);
        }
        if ((this.f474391q & 4096) != 0) {
            java.lang.String str8 = this.f474387m;
            if (str8 == null) {
                str8 = "";
            }
            contentValues.put("signature", str8);
        }
        if ((this.f474391q & 8192) != 0) {
            java.lang.String str9 = this.f474388n;
            if (str9 == null) {
                str9 = "";
            }
            contentValues.put("alias", str9);
        }
        if ((this.f474391q & 16384) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f474389o));
        }
        if ((this.f474391q & 32768) != 0) {
            java.lang.String str10 = this.f474390p;
            contentValues.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, str10 != null ? str10 : "");
        }
        return contentValues;
    }
}
