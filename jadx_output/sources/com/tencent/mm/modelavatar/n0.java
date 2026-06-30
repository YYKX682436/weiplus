package com.tencent.mm.modelavatar;

/* loaded from: classes12.dex */
public class n0 {

    /* renamed from: l, reason: collision with root package name */
    public int f70503l = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f70492a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f70493b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f70494c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f70495d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f70496e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f70497f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f70498g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f70499h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f70500i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f70501j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f70502k = 0;

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f70503l & 1) != 0) {
            java.lang.String str = this.f70492a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((this.f70503l & 2) != 0) {
            contentValues.put("imgwidth", java.lang.Integer.valueOf(this.f70493b));
        }
        if ((this.f70503l & 4) != 0) {
            contentValues.put("imgheigth", java.lang.Integer.valueOf(this.f70494c));
        }
        if ((this.f70503l & 8) != 0) {
            java.lang.String str2 = this.f70495d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("imgformat", str2);
        }
        if ((this.f70503l & 16) != 0) {
            contentValues.put("totallen", java.lang.Integer.valueOf(this.f70496e));
        }
        if ((this.f70503l & 32) != 0) {
            contentValues.put("startpos", java.lang.Integer.valueOf(this.f70497f));
        }
        if ((this.f70503l & 64) != 0) {
            contentValues.put("headimgtype", java.lang.Integer.valueOf(this.f70498g));
        }
        if ((this.f70503l & 128) != 0) {
            java.lang.String str3 = this.f70499h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f70503l & 256) != 0) {
            java.lang.String str4 = this.f70500i;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f70503l & 512) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f70501j));
        }
        if ((this.f70503l & 1024) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f70502k));
        }
        return contentValues;
    }
}
