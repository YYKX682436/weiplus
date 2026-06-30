package bt3;

/* loaded from: classes5.dex */
public class i2 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f24290a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f24291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24292c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24293d;

    public i2(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f24290a = str;
        this.f24291b = str2;
        this.f24292c = i17;
        this.f24293d = i18;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c01.d9.b().e() + "web/");
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
        if (m18.a()) {
            m18.f213266a.r(m18.f213267b);
        }
    }

    @Override // x51.o0
    public boolean a() {
        return true;
    }

    @Override // x51.o0
    public x51.n0 b() {
        return null;
    }

    @Override // x51.o0
    public java.lang.String c() {
        return this.f24290a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f24290a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return com.tencent.mm.graphics.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.drawable.bkt);
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f24291b;
    }

    @Override // x51.o0
    public void h(x51.m0 m0Var, java.lang.String str) {
    }

    @Override // x51.o0
    public boolean i() {
        return false;
    }

    @Override // x51.o0
    public void j(java.lang.String str, boolean z17) {
    }

    @Override // x51.o0
    public java.lang.String k() {
        return c01.d9.b().e() + "web/" + kk.k.g(this.f24291b.getBytes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        if (r1 == null) goto L26;
     */
    @Override // x51.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap l(android.graphics.Bitmap r5, x51.m0 r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r7 = ""
            java.lang.String r0 = "MicroMsg.FavGetPicStrategy"
            x51.m0 r1 = x51.m0.NET
            if (r1 != r6) goto L4c
            r6 = 0
            int r1 = r4.f24292c     // Catch: java.io.IOException -> L46
            if (r1 <= 0) goto L16
            int r2 = r4.f24293d     // Catch: java.io.IOException -> L46
            if (r2 <= 0) goto L16
            r3 = 1
            android.graphics.Bitmap r5 = com.tencent.mm.sdk.platformtools.x.k0(r5, r1, r2, r3)     // Catch: java.io.IOException -> L46
        L16:
            java.lang.String r1 = r4.k()     // Catch: java.io.IOException -> L46
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6     // Catch: java.io.IOException -> L46
            r2.<init>(r1)     // Catch: java.io.IOException -> L46
            r2.k()     // Catch: java.io.IOException -> L46
            r1 = 0
            java.io.OutputStream r1 = com.tencent.mm.vfs.w6.H(r2)     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            r3 = 100
            r5.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
            r1.flush()     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
        L31:
            r1.close()     // Catch: java.io.IOException -> L46
            goto L4c
        L35:
            r2 = move-exception
            goto L40
        L37:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L35
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r2, r7, r3)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L4c
            goto L31
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.io.IOException -> L46
        L45:
            throw r2     // Catch: java.io.IOException -> L46
        L46:
            r1 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r7, r6)
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.i2.l(android.graphics.Bitmap, x51.m0, java.lang.String):android.graphics.Bitmap");
    }
}
