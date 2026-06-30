package r61;

/* loaded from: classes8.dex */
public class v0 {

    /* renamed from: f, reason: collision with root package name */
    public int f474506f = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f474501a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f474502b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f474503c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474504d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474505e = "";

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f474506f & 1) != 0) {
            java.lang.String str = this.f474501a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((this.f474506f & 2) != 0) {
            contentValues.put("friendtype", java.lang.Integer.valueOf(this.f474502b));
        }
        if ((this.f474506f & 4) != 0) {
            contentValues.put("updatetime", java.lang.Integer.valueOf(this.f474503c));
        }
        if ((this.f474506f & 8) != 0) {
            contentValues.put("reserved1", (java.lang.Integer) 0);
        }
        if ((this.f474506f & 16) != 0) {
            contentValues.put("reserved2", (java.lang.Integer) 0);
        }
        if ((this.f474506f & 32) != 0) {
            java.lang.String str2 = this.f474504d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("reserved3", str2);
        }
        if ((this.f474506f & 64) != 0) {
            java.lang.String str3 = this.f474505e;
            contentValues.put("reserved4", str3 != null ? str3 : "");
        }
        return contentValues;
    }
}
