package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class r0 {

    /* renamed from: i, reason: collision with root package name */
    public int f70537i = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f70529a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f70530b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f70531c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f70532d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f70533e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f70534f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f70535g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f70536h = 0;

    public void a(android.database.Cursor cursor) {
        this.f70529a = cursor.getString(0);
        this.f70530b = cursor.getInt(1);
        this.f70531c = cursor.getInt(2);
        this.f70533e = cursor.getString(3);
        this.f70532d = cursor.getString(4);
        this.f70534f = cursor.getInt(5);
        this.f70535g = cursor.getInt(6);
        this.f70536h = cursor.getInt(7);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f70537i & 1) != 0) {
            contentValues.put(dm.i4.COL_USERNAME, e());
        }
        if ((this.f70537i & 2) != 0) {
            contentValues.put("imgflag", java.lang.Integer.valueOf(this.f70530b));
        }
        if ((this.f70537i & 4) != 0) {
            contentValues.put("lastupdatetime", java.lang.Integer.valueOf(this.f70531c));
        }
        if ((this.f70537i & 8) != 0) {
            contentValues.put("reserved1", c());
        }
        if ((this.f70537i & 16) != 0) {
            contentValues.put("reserved2", d());
        }
        if ((this.f70537i & 32) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f70534f));
        }
        if ((this.f70537i & 64) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f70535g));
        }
        if ((this.f70537i & 128) != 0) {
            contentValues.put("updateflag", java.lang.Integer.valueOf(this.f70536h));
        }
        return contentValues;
    }

    public java.lang.String c() {
        java.lang.String str = this.f70533e;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        java.lang.String str = this.f70532d;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f70529a;
        return str == null ? "" : str;
    }

    public void f() {
        this.f70535g = (int) (com.tencent.mm.sdk.platformtools.t8.i1() / 60);
        this.f70537i |= 64;
    }
}
