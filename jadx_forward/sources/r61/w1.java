package r61;

/* loaded from: classes11.dex */
public class w1 {

    /* renamed from: q, reason: collision with root package name */
    public int f474527q = -1;

    /* renamed from: a, reason: collision with root package name */
    public long f474511a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f474512b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f474513c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474514d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474515e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474516f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f474517g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f474518h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f474519i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f474520j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f474521k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f474522l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f474523m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f474524n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f474525o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f474526p = 0;

    public void a(android.database.Cursor cursor) {
        this.f474511a = cursor.getLong(0);
        int i17 = cursor.getInt(1);
        if (i17 == 65536) {
            this.f474512b = 0;
        } else {
            this.f474512b = i17;
        }
        this.f474513c = cursor.getInt(2);
        this.f474514d = cursor.getString(3);
        this.f474515e = cursor.getString(4);
        this.f474516f = cursor.getString(5);
        this.f474517g = cursor.getString(6);
        this.f474518h = cursor.getString(7);
        this.f474519i = cursor.getString(8);
        this.f474520j = cursor.getString(9);
        this.f474521k = cursor.getString(10);
        this.f474522l = cursor.getString(11);
        this.f474523m = cursor.getString(12);
        cursor.getString(13);
        this.f474524n = cursor.getString(14);
        this.f474525o = cursor.getInt(15);
        this.f474526p = cursor.getInt(16);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f474527q & 1) != 0) {
            contentValues.put("qq", java.lang.Long.valueOf(this.f474511a));
        }
        if ((this.f474527q & 2) != 0) {
            int i17 = this.f474512b;
            if (i17 == 0) {
                contentValues.put("wexinstatus", (java.lang.Integer) 65536);
            } else {
                contentValues.put("wexinstatus", java.lang.Integer.valueOf(i17));
            }
        }
        if ((this.f474527q & 4) != 0) {
            contentValues.put("groupid", java.lang.Integer.valueOf(this.f474513c));
        }
        if ((this.f474527q & 8) != 0) {
            java.lang.String str = this.f474514d;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((this.f474527q & 16) != 0) {
            java.lang.String str2 = this.f474515e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("nickname", str2);
        }
        if ((this.f474527q & 32) != 0) {
            java.lang.String str3 = this.f474516f;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("pyinitial", str3);
        }
        if ((this.f474527q & 64) != 0) {
            java.lang.String str4 = this.f474517g;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("quanpin", str4);
        }
        if ((this.f474527q & 128) != 0) {
            java.lang.String str5 = this.f474518h;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("qqnickname", str5);
        }
        if ((this.f474527q & 256) != 0) {
            java.lang.String str6 = this.f474519i;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put("qqpyinitial", str6);
        }
        if ((this.f474527q & 512) != 0) {
            java.lang.String str7 = this.f474520j;
            if (str7 == null) {
                str7 = "";
            }
            contentValues.put("qqquanpin", str7);
        }
        if ((this.f474527q & 1024) != 0) {
            java.lang.String str8 = this.f474521k;
            if (str8 == null) {
                str8 = "";
            }
            contentValues.put("qqremark", str8);
        }
        if ((this.f474527q & 2048) != 0) {
            java.lang.String str9 = this.f474522l;
            if (str9 == null) {
                str9 = "";
            }
            contentValues.put("qqremarkpyinitial", str9);
        }
        if ((this.f474527q & 4096) != 0) {
            java.lang.String str10 = this.f474523m;
            if (str10 == null) {
                str10 = "";
            }
            contentValues.put("qqremarkquanpin", str10);
        }
        if ((this.f474527q & 16384) != 0) {
            java.lang.String str11 = this.f474524n;
            contentValues.put("reserved2", str11 != null ? str11 : "");
        }
        if ((this.f474527q & 32768) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f474525o));
        }
        if ((this.f474527q & 65536) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f474526p));
        }
        return contentValues;
    }

    public java.lang.String c() {
        java.lang.String str = this.f474521k;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            java.lang.String str2 = this.f474518h;
            return str2 == null ? "" : str2;
        }
        java.lang.String str3 = this.f474521k;
        return str3 == null ? "" : str3;
    }

    /* renamed from: toString */
    public java.lang.String m161943x9616526c() {
        return "groupID\t:" + this.f474513c + "\nqq\t:" + this.f474511a + "\nusername\t:" + this.f474514d + "\nnickname\t:" + this.f474515e + "\nwexinStatus\t:" + this.f474512b + "\nreserved3\t:" + this.f474525o + "\nreserved4\t:" + this.f474526p + "\n";
    }
}
