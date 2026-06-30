package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class r0 {

    /* renamed from: i, reason: collision with root package name */
    public int f152070i = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f152062a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f152063b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f152064c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152065d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152066e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f152067f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f152068g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f152069h = 0;

    public void a(android.database.Cursor cursor) {
        this.f152062a = cursor.getString(0);
        this.f152063b = cursor.getInt(1);
        this.f152064c = cursor.getInt(2);
        this.f152066e = cursor.getString(3);
        this.f152065d = cursor.getString(4);
        this.f152067f = cursor.getInt(5);
        this.f152068g = cursor.getInt(6);
        this.f152069h = cursor.getInt(7);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f152070i & 1) != 0) {
            contentValues.put(dm.i4.f66875xa013b0d5, e());
        }
        if ((this.f152070i & 2) != 0) {
            contentValues.put("imgflag", java.lang.Integer.valueOf(this.f152063b));
        }
        if ((this.f152070i & 4) != 0) {
            contentValues.put("lastupdatetime", java.lang.Integer.valueOf(this.f152064c));
        }
        if ((this.f152070i & 8) != 0) {
            contentValues.put("reserved1", c());
        }
        if ((this.f152070i & 16) != 0) {
            contentValues.put("reserved2", d());
        }
        if ((this.f152070i & 32) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f152067f));
        }
        if ((this.f152070i & 64) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f152068g));
        }
        if ((this.f152070i & 128) != 0) {
            contentValues.put("updateflag", java.lang.Integer.valueOf(this.f152069h));
        }
        return contentValues;
    }

    public java.lang.String c() {
        java.lang.String str = this.f152066e;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        java.lang.String str = this.f152065d;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f152062a;
        return str == null ? "" : str;
    }

    public void f() {
        this.f152068g = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() / 60);
        this.f152070i |= 64;
    }
}
