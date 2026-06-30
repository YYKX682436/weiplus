package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class h0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public r45.re6 f227408d;

    /* renamed from: e, reason: collision with root package name */
    public int f227409e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f227410f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f227411g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f227412h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227413i = "";

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227414m;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227414m = c16344xea85a40c;
    }

    public void a() {
        if (this.f227410f <= 0 || this.f227409e <= 0) {
            r45.re6 re6Var = this.f227408d;
            float f17 = re6Var.f466310g / (re6Var.f466311h * 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227414m;
            if (f17 > 1.667f) {
                int i17 = c16344xea85a40c.f227313l1;
                this.f227410f = i17;
                this.f227409e = (int) (i17 / f17);
            } else if (f17 >= 1.667f) {
                this.f227410f = c16344xea85a40c.f227313l1;
                this.f227409e = c16344xea85a40c.f227326y0;
            } else {
                int i18 = c16344xea85a40c.f227326y0;
                this.f227409e = i18;
                this.f227410f = (int) (i18 * f17);
            }
        }
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
