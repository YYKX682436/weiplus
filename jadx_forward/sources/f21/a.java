package f21;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public int f340372h = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f340365a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f340366b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f340367c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f340368d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f340369e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f340370f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f340371g = 0;

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f340372h & 1) != 0) {
            java.lang.String str = this.f340365a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((this.f340372h & 2) != 0) {
            contentValues.put("bgflag", java.lang.Integer.valueOf(this.f340366b));
        }
        if ((this.f340372h & 4) != 0) {
            java.lang.String str2 = this.f340367c;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        }
        if ((this.f340372h & 8) != 0) {
            java.lang.String str3 = this.f340368d;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f340372h & 16) != 0) {
            java.lang.String str4 = this.f340369e;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f340372h & 32) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f340370f));
        }
        if ((this.f340372h & 64) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f340371g));
        }
        return contentValues;
    }
}
