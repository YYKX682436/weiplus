package r61;

/* loaded from: classes11.dex */
public class o0 {

    /* renamed from: g, reason: collision with root package name */
    public int f474462g = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f474456a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f474457b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f474458c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f474459d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474460e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474461f = "";

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f474462g & 1) != 0) {
            java.lang.String str = this.f474456a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((this.f474462g & 2) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f474457b));
        }
        if ((this.f474462g & 4) != 0) {
            contentValues.put("personalcard", java.lang.Integer.valueOf(this.f474458c));
        }
        if ((this.f474462g & 8) != 0) {
            java.lang.String str2 = this.f474459d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("province", str2);
        }
        if ((this.f474462g & 16) != 0) {
            java.lang.String str3 = this.f474460e;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("city", str3);
        }
        if ((this.f474462g & 32) != 0) {
            java.lang.String str4 = this.f474461f;
            contentValues.put("signature", str4 != null ? str4 : "");
        }
        return contentValues;
    }
}
