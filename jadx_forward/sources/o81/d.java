package o81;

/* loaded from: classes7.dex */
public final class d extends o81.b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.nio.ByteOrder f425170f = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f425171d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f425172e = -1;

    @Override // o81.a
    public java.util.Map E(java.nio.channels.FileChannel fileChannel, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11678x9381b035 c11678x9381b035 = null;
        if (fileChannel == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgNormalImpl", "fileChannel is null");
            return null;
        }
        if (r6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgNormalImpl", "file is null");
            return null;
        }
        fileChannel.position(14L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f425171d);
        allocateDirect.order(f425170f);
        fileChannel.read(allocateDirect);
        byte[] a17 = ik1.f.a(allocateDirect);
        int i17 = 0;
        this.f425172e = o81.b.a(a17, 0, 4);
        x.b bVar = new x.b();
        int i18 = 4;
        while (i17 < this.f425172e) {
            int a18 = o81.b.a(a17, i18, 4);
            int i19 = i18 + 4;
            java.lang.String str = new java.lang.String(a17, i19, a18);
            int i27 = i19 + a18;
            int a19 = o81.b.a(a17, i27, 4);
            int i28 = i27 + 4;
            int a27 = o81.b.a(a17, i28, 4);
            i18 = i28 + 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11678x9381b035 c11678x9381b0352 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.pkg.C11678x9381b035(r6Var.o(), str, a19, a27);
            bVar.put(str, c11678x9381b0352);
            i17++;
            c11678x9381b035 = c11678x9381b0352;
        }
        if (c11678x9381b035 != null && c11678x9381b035.f156923f + c11678x9381b035.f156924g > r6Var.C()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgNormalImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", java.lang.Integer.valueOf(c11678x9381b035.f156923f), java.lang.Integer.valueOf(c11678x9381b035.f156924g), java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(bVar.f532379f), java.lang.Integer.valueOf(this.f425172e));
        }
        return bVar;
    }

    @Override // o81.a
    public int J0() {
        return this.f425171d;
    }

    @Override // o81.a
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46) {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f425171d = 0;
        this.f425172e = -1;
    }

    @Override // o81.a
    public boolean g(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(14);
        allocateDirect.order(f425170f);
        fileChannel.read(allocateDirect);
        if (-66 != allocateDirect.get(0) || -19 != allocateDirect.get(13)) {
            return false;
        }
        byte[] a17 = ik1.f.a(allocateDirect);
        o81.b.a(a17, 1, 4);
        this.f425171d = o81.b.a(a17, 5, 4);
        o81.b.a(a17, 9, 4);
        return true;
    }

    @Override // o81.a
    public java.io.InputStream j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46) {
        return null;
    }

    @Override // o81.a
    public int r() {
        return this.f425172e;
    }
}
