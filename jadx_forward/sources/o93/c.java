package o93;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f425256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f425257e;

    /* renamed from: f, reason: collision with root package name */
    public long f425258f;

    public c(java.lang.String str, java.lang.String str2, long j17) {
        this.f425256d = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)).o();
        this.f425257e = str2;
        this.f425258f = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: access */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49300xab27b564(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        return (d17 == null || !com.p314xaae8f345.mm.vfs.w6.j(d17)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5(java.lang.String str) {
        java.lang.String str2 = this.f425256d;
        com.p314xaae8f345.mm.vfs.w6.u(str2);
        return new com.p314xaae8f345.mm.vfs.r6(str2 + "/" + str);
    }

    public final java.nio.ByteBuffer b(com.p314xaae8f345.mm.vfs.r6 r6Var, long j17, long j18) {
        if (r6Var == null || !r6Var.m() || !r6Var.A()) {
            return java.nio.ByteBuffer.allocateDirect(0);
        }
        int C = (int) r6Var.C();
        if (C >= 0 && (j17 + j18) - 1 <= C - 1) {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(C);
            long j19 = C;
            if (j18 < 0) {
                j18 = j19;
            }
            try {
                java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(r6Var.o(), false);
                try {
                    B.getChannel().read(allocateDirect);
                    allocateDirect.flip();
                    if (j17 == 0 && j18 == j19) {
                        B.close();
                        return allocateDirect;
                    }
                    int i17 = (int) j18;
                    byte[] bArr = new byte[i17];
                    allocateDirect.position((int) j17);
                    allocateDirect.get(bArr, 0, i17);
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    B.close();
                    return wrap;
                } catch (java.lang.Throwable th6) {
                    try {
                        B.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WxaLiteApp.LiteAppAppBrandFileSystem", e17, "readAsDirectByteBuffer", new java.lang.Object[0]);
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            } catch (java.nio.BufferOverflowException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaLiteApp.LiteAppAppBrandFileSystem", "BufferOverflow, file_length %d, byte_allocated %d", java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(allocateDirect.capacity()));
                nf.a.a(allocateDirect);
                return java.nio.ByteBuffer.allocateDirect(0);
            }
        }
        return java.nio.ByteBuffer.allocateDirect(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: createTempFileFrom */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, boolean z17, ik1.b0 b0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaLiteApp.LiteAppAppBrandFileSystem", "createTempFileFrom src[%s]", r6Var);
        b0Var.f373357a = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).wi(r6Var.o()).f264269e;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609(java.lang.String str, boolean z17) {
        return mo49620x1d537609(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getTempDirectory */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49624x5d68c543(ik1.b0 b0Var) {
        b0Var.f373357a = this.f425256d;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: initialize */
    public void mo49302x33ebcb90() {
        if (com.p314xaae8f345.mm.vfs.w6.u(this.f425256d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxaLiteApp.LiteAppAppBrandFileSystem", "Initialization Failed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832(java.lang.String str, ik1.b0 b0Var) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        if (d17 != null && com.p314xaae8f345.mm.vfs.w6.j(d17)) {
            b0Var.f373357a = b(new com.p314xaae8f345.mm.vfs.r6(d17), 0L, -1L);
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: readStream */
    public final java.io.InputStream mo49627xe22f8cb6(java.lang.String str) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        if (d17 != null && com.p314xaae8f345.mm.vfs.w6.j(d17)) {
            try {
                return com.p314xaae8f345.mm.vfs.w6.E(d17);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: stat */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49310x360654(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11700x155a0685 c11700x155a0685) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        if (d17 == null || !com.p314xaae8f345.mm.vfs.w6.j(d17)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_OP_FAIL;
        return (c11700x155a0685 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11699xd802b610.m49606x16a9a8b7(d17, c11700x155a0685) == 0) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK : j1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1
    /* renamed from: getAbsoluteFile */
    public com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609(java.lang.String str) {
        java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(this.f425257e, this.f425258f, str);
        if (zj6 != null && zj6.contains("DefaultWxaCacheManager")) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(this.f425257e, null, null) + "DefaultWxaCacheManager");
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(zj6));
            if (r6Var2.m()) {
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var, r6Var2.m82467xfb82e301());
                if (r6Var2.L(r6Var3)) {
                    return r6Var3;
                }
                return null;
            }
        }
        if (zj6 == null || zj6.isEmpty()) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(zj6));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11703x529c030f
    /* renamed from: readFile */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49306xcc440832(java.lang.String str, long j17, long j18, ik1.b0 b0Var) {
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(str);
        if (d17 != null && com.p314xaae8f345.mm.vfs.w6.j(d17)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(d17);
            long C = j18 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? r6Var.C() - j17 : j18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 a17 = a(j17, C, r6Var.C());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
            if (a17 != j1Var) {
                return a17;
            }
            b0Var.f373357a = b(r6Var, j17, C);
            return j1Var;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.RET_NOT_EXISTS;
    }
}
