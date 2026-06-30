package com.p314xaae8f345.p457x3304c6.p469xb845a2f1;

/* renamed from: com.tencent.maas.imagestudio.MJImageExportSettings */
/* loaded from: classes5.dex */
public class C4057xc8435155 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c f129592a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129593b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f129594c;

    public C4057xc8435155(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c cVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4) {
        this.f129592a = cVar;
        this.f129593b = c3974x289f3e;
        this.f129594c = c4069xbe747ef4;
    }

    /* renamed from: getImageLimitedPixelSize */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33016x959594f2() {
        return this.f129593b;
    }

    /* renamed from: getImageType */
    public int m33017xcb15f87f() {
        return this.f129592a.f129624d;
    }

    /* renamed from: getVideoExportSettings */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 m33018x27c10a1c() {
        return this.f129594c;
    }

    public C4057xc8435155(int i17, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 c4069xbe747ef4) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c cVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c.Invalid;
        if (i17 != 0) {
            if (i17 == 1) {
                cVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c.JPEG;
            } else if (i17 == 2) {
                cVar = com.p314xaae8f345.p457x3304c6.p469xb845a2f1.c.PNG;
            }
        }
        this.f129592a = cVar;
        this.f129593b = c3974x289f3e;
        this.f129594c = c4069xbe747ef4;
    }
}
