package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes9.dex */
public class ja {

    /* renamed from: a, reason: collision with root package name */
    public int f276590a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f276591b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.ia f276592c;

    /* renamed from: d, reason: collision with root package name */
    public int f276593d;

    /* renamed from: e, reason: collision with root package name */
    public int f276594e;

    public ja() {
        this.f276590a = 135;
        this.f276592c = null;
        this.f276591b = "";
        this.f276593d = 0;
        this.f276594e = 0;
    }

    public void a(android.database.Cursor cursor) {
        if ((this.f276590a & 2) != 0) {
            java.lang.String string = cursor.getString(1);
            this.f276591b = string;
            if (this.f276592c == null) {
                this.f276592c = new com.p314xaae8f345.mm.p2621x8fb0427b.ia(string);
            }
        }
        if ((this.f276590a & 4) != 0) {
            this.f276593d = cursor.getInt(2);
        }
        if ((this.f276590a & 128) != 0) {
            this.f276594e = cursor.getInt(7);
        }
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f276590a & 2) != 0) {
            contentValues.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f276591b);
        }
        if ((this.f276590a & 4) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f276593d));
        }
        if ((this.f276590a & 128) != 0) {
            contentValues.put("int_reserved1", java.lang.Integer.valueOf(this.f276594e));
        }
        return contentValues;
    }

    public boolean c() {
        return (this.f276593d & 1) != 0;
    }

    public ja(java.lang.String str, boolean z17, boolean z18, int i17) {
        this.f276590a = 135;
        this.f276591b = "";
        this.f276592c = null;
        this.f276592c = new com.p314xaae8f345.mm.p2621x8fb0427b.ia(str);
        this.f276591b = str;
        this.f276593d = (z18 ? 2 : 0) | (z17 ? 1 : 0);
        this.f276594e = i17;
    }
}
