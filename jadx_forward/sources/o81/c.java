package o81;

/* loaded from: classes7.dex */
public final class c extends o81.b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.nio.ByteOrder f425166g = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f425167d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f425168e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f425169f = -1;

    @Override // o81.a
    public java.util.Map E(java.nio.channels.FileChannel fileChannel, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11679x2aa3fa63 c11679x2aa3fa63 = null;
        if (fileChannel == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgMixedImpl", "fileChannel is null");
            return null;
        }
        if (r6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgMixedImpl", "file is null");
            return null;
        }
        fileChannel.position(18L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f425167d);
        allocateDirect.order(f425166g);
        fileChannel.read(allocateDirect);
        byte[] a17 = ik1.f.a(allocateDirect);
        this.f425169f = o81.b.a(a17, 0, 4);
        x.b bVar = new x.b();
        int i19 = 4;
        for (int i27 = 0; i27 < this.f425169f; i27++) {
            int a18 = o81.b.a(a17, i19, 4);
            int i28 = i19 + 4;
            java.lang.String str = new java.lang.String(a17, i28, a18);
            int i29 = i28 + a18;
            int a19 = o81.b.a(a17, i29, 1);
            int i37 = i29 + 1;
            int a27 = o81.b.a(a17, i37, 4);
            int i38 = i37 + 4;
            int a28 = o81.b.a(a17, i38, 4);
            i19 = i38 + 4;
            if (a19 == 0) {
                i18 = this.f425167d + 18 + this.f425168e;
            } else if (a19 == 1) {
                i18 = this.f425167d + 18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgMixedImpl", "encType error: %d", java.lang.Integer.valueOf(a19));
                i17 = 0;
                c11679x2aa3fa63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11679x2aa3fa63(r6Var.o(), str, i17, a28, a19);
                bVar.put(str, c11679x2aa3fa63);
            }
            i17 = i18 + a27;
            c11679x2aa3fa63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11679x2aa3fa63(r6Var.o(), str, i17, a28, a19);
            bVar.put(str, c11679x2aa3fa63);
        }
        if (c11679x2aa3fa63 != null && c11679x2aa3fa63.f156923f + c11679x2aa3fa63.f156924g > r6Var.C()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgMixedImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", java.lang.Integer.valueOf(c11679x2aa3fa63.f156923f), java.lang.Integer.valueOf(c11679x2aa3fa63.f156924g), java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(bVar.f532379f), java.lang.Integer.valueOf(this.f425169f));
        }
        return bVar;
    }

    @Override // o81.a
    public int J0() {
        return this.f425167d;
    }

    @Override // o81.a
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46) {
        return (c11663x8e8dee46 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11679x2aa3fa63) && c11663x8e8dee46.f156922e != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11679x2aa3fa63) c11663x8e8dee46).f157259h == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o81.a
    public boolean g(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(18);
        allocateDirect.order(f425166g);
        fileChannel.read(allocateDirect);
        if (-66 != allocateDirect.get(0) || -19 != allocateDirect.get(17)) {
            return false;
        }
        byte[] a17 = ik1.f.a(allocateDirect);
        o81.b.a(a17, 1, 4);
        this.f425167d = o81.b.a(a17, 5, 4);
        this.f425168e = o81.b.a(a17, 9, 4);
        o81.b.a(a17, 13, 4);
        return true;
    }

    @Override // o81.a
    public java.io.InputStream j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46) {
        return null;
    }

    @Override // o81.a
    public int r() {
        return this.f425169f;
    }
}
