package f21;

/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: l, reason: collision with root package name */
    public int f340457l = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f340446a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f340447b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f340448c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f340449d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f340450e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f340451f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f340452g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f340453h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f340454i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f340455j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f340456k = 0;

    public void a(android.database.Cursor cursor) {
        this.f340447b = cursor.getInt(2);
        this.f340448c = cursor.getString(3);
        this.f340449d = cursor.getInt(4);
        this.f340450e = cursor.getString(5);
        this.f340451f = cursor.getInt(6);
        this.f340453h = cursor.getString(8);
        this.f340454i = cursor.getString(9);
        this.f340452g = cursor.getInt(7);
        this.f340456k = cursor.getInt(11);
        this.f340446a = cursor.getInt(1);
        this.f340455j = cursor.getInt(10);
        cursor.getString(0);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f340457l & 2) != 0) {
            contentValues.put(dm.i4.f66865x76d1ec5a, java.lang.Integer.valueOf(this.f340446a));
        }
        if ((this.f340457l & 4) != 0) {
            contentValues.put("version", java.lang.Integer.valueOf(this.f340447b));
        }
        if ((this.f340457l & 8) != 0) {
            java.lang.String str = this.f340448c;
            if (str == null) {
                str = "";
            }
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
        }
        if ((this.f340457l & 16) != 0) {
            contentValues.put("size", java.lang.Integer.valueOf(this.f340449d));
        }
        if ((this.f340457l & 32) != 0) {
            java.lang.String str2 = this.f340450e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("packname", str2);
        }
        if ((this.f340457l & 64) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f340451f));
        }
        if ((this.f340457l & 128) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f340452g));
        }
        if ((this.f340457l & 256) != 0) {
            java.lang.String str3 = this.f340453h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f340457l & 512) != 0) {
            java.lang.String str4 = this.f340454i;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f340457l & 1024) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f340455j));
        }
        if ((this.f340457l & 2048) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f340456k));
        }
        if ((this.f340457l & 1) != 0) {
            contentValues.put(dm.i4.f66867x2a5c95c7, this.f340446a + "_" + this.f340452g);
        }
        return contentValues;
    }
}
