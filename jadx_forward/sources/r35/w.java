package r35;

/* loaded from: classes15.dex */
public final class w implements p11.a {

    /* renamed from: a, reason: collision with root package name */
    public long f450845a;

    /* renamed from: b, reason: collision with root package name */
    public long f450846b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f450847c;

    /* renamed from: e, reason: collision with root package name */
    public final int f450849e;

    /* renamed from: d, reason: collision with root package name */
    public int f450848d = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f450850f = "";

    public w(int i17) {
        this.f450849e = i17;
        java.lang.String.valueOf(hashCode());
    }

    public void a(android.graphics.Bitmap bitmap) {
        this.f450846b = java.lang.System.currentTimeMillis();
        r35.y yVar = r35.y.f450859a;
        int i17 = this.f450849e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 6, this.f450850f, 0L, 4, null);
        }
        if (this.f450848d == 2 && yVar.a(i17)) {
            if (bitmap != null) {
                bitmap.isRecycled();
            }
            boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
            r35.x.f450853a.b(this.f450847c, z17);
            java.lang.String str = this.f450847c;
            long j17 = this.f450846b - this.f450845a;
            if (j17 >= 0) {
                int c17 = yVar.c(str);
                if (c17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 50L, j17);
                } else if (c17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 21L, j17);
                } else if (c17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 46L, j17);
                }
            }
            if (!yVar.d(this.f450847c) || z17) {
                return;
            }
            java.lang.String str2 = this.f450850f;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            if (i17 == 1 || i17 == 2 || i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17492, str2, 2, 2, java.lang.Integer.valueOf(i17));
            }
        }
    }

    public void b(java.lang.String str, q11.b bVar) {
        this.f450847c = bVar != null ? bVar.f441068e : null;
        this.f450848d = bVar != null ? bVar.f441065b : -1;
        this.f450845a = java.lang.System.currentTimeMillis();
        r35.y yVar = r35.y.f450859a;
        boolean z17 = false;
        int i17 = this.f450849e;
        if (i17 == 1) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 6, str, 0L, 4, null);
        }
        if (this.f450848d == 2 && yVar.a(i17)) {
            z17 = true;
        }
        if (z17) {
            int c17 = yVar.c(this.f450847c);
            if (c17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 47L, 1L);
            } else if (c17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 11L, 1L);
            } else {
                if (c17 != 2) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1111L, 43L, 1L);
            }
        }
    }

    public void c(java.io.InputStream inputStream) {
        java.lang.System.currentTimeMillis();
        if (r35.y.f450859a.b(this.f450849e)) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 5, this.f450850f, 0L, 4, null);
        }
    }

    public void d(java.lang.String str) {
        this.f450850f = str;
        java.lang.System.currentTimeMillis();
        if (r35.y.f450859a.b(this.f450849e)) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0.f270873a, 5, str, 0L, 4, null);
        }
    }
}
