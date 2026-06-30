package bt3;

/* loaded from: classes5.dex */
public class i2 implements x51.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f105823a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105824b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f105826d;

    public i2(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f105823a = str;
        this.f105824b = str2;
        this.f105825c = i17;
        this.f105826d = i18;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c01.d9.b().e() + "web/");
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
        if (m18.a()) {
            m18.f294799a.r(m18.f294800b);
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
        return this.f105823a;
    }

    @Override // x51.o0
    public java.lang.String d() {
        return this.f105823a;
    }

    @Override // x51.o0
    public android.graphics.Bitmap e() {
        return com.p314xaae8f345.mm.p786x600aa8b.e.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.bkt);
    }

    @Override // x51.o0
    public void f() {
    }

    @Override // x51.o0
    public java.lang.String g() {
        return this.f105824b;
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
        return c01.d9.b().e() + "web/" + kk.k.g(this.f105824b.getBytes());
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
            int r1 = r4.f105825c     // Catch: java.io.IOException -> L46
            if (r1 <= 0) goto L16
            int r2 = r4.f105826d     // Catch: java.io.IOException -> L46
            if (r2 <= 0) goto L16
            r3 = 1
            android.graphics.Bitmap r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(r5, r1, r2, r3)     // Catch: java.io.IOException -> L46
        L16:
            java.lang.String r1 = r4.k()     // Catch: java.io.IOException -> L46
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6     // Catch: java.io.IOException -> L46
            r2.<init>(r1)     // Catch: java.io.IOException -> L46
            r2.k()     // Catch: java.io.IOException -> L46
            r1 = 0
            java.io.OutputStream r1 = com.p314xaae8f345.mm.vfs.w6.H(r2)     // Catch: java.lang.Throwable -> L35 java.io.FileNotFoundException -> L37
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r2, r7, r3)     // Catch: java.lang.Throwable -> L35
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r1, r7, r6)
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.i2.l(android.graphics.Bitmap, x51.m0, java.lang.String):android.graphics.Bitmap");
    }
}
