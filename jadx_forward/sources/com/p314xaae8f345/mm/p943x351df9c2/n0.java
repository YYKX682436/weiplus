package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes12.dex */
public class n0 {

    /* renamed from: l, reason: collision with root package name */
    public int f152036l = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f152025a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f152026b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f152027c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152028d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f152029e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f152030f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f152031g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152032h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f152033i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f152034j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f152035k = 0;

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f152036l & 1) != 0) {
            java.lang.String str = this.f152025a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((this.f152036l & 2) != 0) {
            contentValues.put("imgwidth", java.lang.Integer.valueOf(this.f152026b));
        }
        if ((this.f152036l & 4) != 0) {
            contentValues.put("imgheigth", java.lang.Integer.valueOf(this.f152027c));
        }
        if ((this.f152036l & 8) != 0) {
            java.lang.String str2 = this.f152028d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("imgformat", str2);
        }
        if ((this.f152036l & 16) != 0) {
            contentValues.put("totallen", java.lang.Integer.valueOf(this.f152029e));
        }
        if ((this.f152036l & 32) != 0) {
            contentValues.put("startpos", java.lang.Integer.valueOf(this.f152030f));
        }
        if ((this.f152036l & 64) != 0) {
            contentValues.put("headimgtype", java.lang.Integer.valueOf(this.f152031g));
        }
        if ((this.f152036l & 128) != 0) {
            java.lang.String str3 = this.f152032h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f152036l & 256) != 0) {
            java.lang.String str4 = this.f152033i;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f152036l & 512) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f152034j));
        }
        if ((this.f152036l & 1024) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f152035k));
        }
        return contentValues;
    }
}
