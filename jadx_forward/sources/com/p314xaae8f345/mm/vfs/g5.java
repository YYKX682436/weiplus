package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class g5 extends com.p314xaae8f345.mm.vfs.a implements com.p314xaae8f345.mm.vfs.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f294487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22764xd9befb26 f294488g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.mm.vfs.C22764xd9befb26 c22764xd9befb26, com.p314xaae8f345.mm.vfs.q2 q2Var, java.util.Map map) {
        super(c22764xd9befb26, map);
        this.f294488g = c22764xd9befb26;
        this.f294487f = false;
        this.f294486e = q2Var;
        if ((q2Var.o() & 2) == 0) {
            throw new java.lang.IllegalArgumentException("The wrapped filesystem must have CAP_DIRECT_ACCESS.");
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.lang.Iterable C(java.lang.String str) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, true);
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(l17)) {
            return null;
        }
        boolean isEmpty = l17.isEmpty();
        java.lang.Iterable C = this.f294486e.C(l17);
        if (C == null) {
            return null;
        }
        return new pm5.l(C, new com.p314xaae8f345.mm.vfs.e5(this, isEmpty), null, false);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.lang.String D(java.lang.String str, boolean z17) {
        java.lang.String M;
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        java.lang.String D = q2Var.D(str, z17);
        return (q2Var.F(str) || (M = M(str)) == null) ? D : q2Var.D(com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M), z17);
    }

    @Override // com.p314xaae8f345.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f294486e);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean F(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        if (!q2Var.F(str)) {
            if (!q2Var.F(str + (char) 8982)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public long G(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.q2 q2Var2 = this.f294486e;
        if (z17 && q2Var == this && (m17 = m(str2)) != null && !m17.f294769f) {
            long j17 = this.f294488g.f294284f;
            long j18 = m17.f294766c;
            if (j18 >= j17) {
                try {
                    N(str);
                    K(str2, str);
                    if (q2Var2.F(str) && !q2Var2.d(str)) {
                        throw new java.io.IOException("Cannot delete old plain file: " + str);
                    }
                    return j18;
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("VFS.RefCountedFileSystem", e17, "Cannot create link, fallback to plain copy.");
                }
            }
        }
        long i17 = q2Var2.i(str, q2Var, str2, z17);
        N(str);
        return i17;
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public boolean H(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.q2 q2Var2 = this.f294486e;
        if (q2Var != this || M(str2) == null) {
            if (!q2Var2.t(str, q2Var, str2)) {
                return false;
            }
            N(str);
            return true;
        }
        N(str);
        K(str2, str);
        q2Var2.d(str);
        return N(str2);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    public boolean I(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2) {
        return q2Var == this || M(str) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0184 A[Catch: all -> 0x01a3, TryCatch #2 {all -> 0x01a3, blocks: (B:51:0x0164, B:53:0x016e, B:42:0x0184, B:44:0x018e, B:45:0x01a2), top: B:50:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.g5.K(java.lang.String, java.lang.String):void");
    }

    public final com.p314xaae8f345.mm.vfs.x1 L(java.lang.String str, com.p314xaae8f345.mm.vfs.x1 x1Var) {
        int i17;
        java.lang.String M = M(str);
        if (M == null || M.isEmpty()) {
            return null;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M);
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        com.p314xaae8f345.mm.vfs.x1 m17 = q2Var.m(c17);
        if (m17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.x1 m18 = q2Var.m(com.p314xaae8f345.mm.vfs.C22764xd9befb26.e(M));
        if (m18 != null) {
            long j17 = m18.f294766c;
            if (j17 != 0) {
                i17 = (int) j17;
                java.lang.String str2 = x1Var.f294765b;
                java.lang.String substring = str2.substring(0, str2.length() - 1);
                long j18 = m17.f294766c;
                long j19 = m17.f294767d;
                return new com.p314xaae8f345.mm.vfs.k5(this, str, substring, j18, ((4096 + j19) / i17) + x1Var.f294767d, m17.f294768e, m17.f294769f, M, i17, j19);
            }
        }
        i17 = 1;
        java.lang.String str22 = x1Var.f294765b;
        java.lang.String substring2 = str22.substring(0, str22.length() - 1);
        long j182 = m17.f294766c;
        long j192 = m17.f294767d;
        return new com.p314xaae8f345.mm.vfs.k5(this, str, substring2, j182, ((4096 + j192) / i17) + x1Var.f294767d, m17.f294768e, m17.f294769f, M, i17, j192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    public final java.lang.String M(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.i5 i5Var;
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        java.lang.String D = q2Var.D(str + (char) 8982, true);
        ?? r17 = 0;
        try {
            if (D == null) {
                return null;
            }
            try {
                i5Var = new com.p314xaae8f345.mm.vfs.i5(D, false);
            } catch (java.io.FileNotFoundException unused) {
                i5Var = null;
            } catch (java.io.IOException e17) {
                e = e17;
                i5Var = null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.mm.vfs.e8.d(r17);
                throw th;
            }
            try {
                byte[] bArr = new byte[64];
                int i17 = 0;
                while (i17 < 64) {
                    int read = i5Var.f294530d.read(bArr, i17, 64 - i17);
                    if (read == -1) {
                        break;
                    }
                    i17 += read;
                }
                java.lang.String str2 = i17 > 0 ? new java.lang.String(bArr, 0, i17) : null;
                com.p314xaae8f345.mm.vfs.e8.d(i5Var);
                return str2;
            } catch (java.io.FileNotFoundException unused2) {
                com.p314xaae8f345.mm.vfs.e8.d(i5Var);
                return null;
            } catch (java.io.IOException e18) {
                e = e18;
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("VFS.RefCountedFileSystem", e, "Cannot read link file: " + str);
                com.p314xaae8f345.mm.vfs.e8.d(i5Var);
                return null;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r17 = q2Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.M(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r8 = 8982(0x2316, float:1.2586E-41)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.mm.vfs.q2 r2 = r7.f294486e
            boolean r8 = r2.d(r8)
            if (r8 != 0) goto L22
            return r1
        L22:
            java.lang.String r8 = ".ref/maintenance"
            r2.d(r8)
            java.lang.String r8 = com.p314xaae8f345.mm.vfs.C22764xd9befb26.e(r0)
            r3 = 1
            java.lang.String r4 = r2.D(r8, r3)
            if (r4 == 0) goto L5d
            r5 = 0
            com.tencent.mm.vfs.j5 r6 = new com.tencent.mm.vfs.j5     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
            r4 = -1
            int r4 = r6.a(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            if (r4 != 0) goto L40
            r1 = r3
        L40:
            com.p314xaae8f345.mm.vfs.e8.d(r6)
            goto L51
        L44:
            r8 = move-exception
            r5 = r6
            goto L4a
        L47:
            r5 = r6
            goto L4e
        L49:
            r8 = move-exception
        L4a:
            com.p314xaae8f345.mm.vfs.e8.d(r5)
            throw r8
        L4e:
            com.p314xaae8f345.mm.vfs.e8.d(r5)
        L51:
            if (r1 == 0) goto L5d
            r2.d(r8)
            java.lang.String r8 = com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(r0)
            r2.d(r8)
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.g5.N(java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        try {
            return q2Var.a(str);
        } catch (java.io.FileNotFoundException e17) {
            java.lang.String M = M(str);
            if (M != null) {
                return q2Var.a(com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M));
            }
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        if (z17 && M(str) != null) {
            throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
        }
        java.io.OutputStream c17 = this.f294486e.c(str, z17);
        N(str);
        return c17;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            return false;
        }
        return this.f294486e.d(str) | N(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean e(java.lang.String str, boolean z17) {
        boolean z18;
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        if (!z17) {
            return q2Var.e(str, false);
        }
        java.lang.Iterable p17 = com.p314xaae8f345.mm.vfs.e8.p(this, str, true, null);
        if (p17 != null) {
            java.util.Iterator it = ((pm5.b) p17).iterator();
            z18 = true;
            while (it.hasNext()) {
                z18 &= ((com.p314xaae8f345.mm.vfs.x1) it.next()).b(false);
            }
        } else {
            z18 = true;
        }
        return q2Var.e(str, false) && z18;
    }

    /* renamed from: equals */
    public boolean m82395xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.g5) {
            if (this.f294486e.equals(((com.p314xaae8f345.mm.vfs.g5) obj).f294486e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.o2 g(java.lang.String str) {
        return this.f294486e.g(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        if (z17 && M(str) != null) {
            throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
        }
        java.nio.channels.WritableByteChannel h17 = this.f294486e.h(str, z17);
        if (!z17) {
            N(str);
        }
        return h17;
    }

    /* renamed from: hashCode */
    public int m82396x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.C22764xd9befb26.class.hashCode() ^ this.f294486e.hashCode();
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    /* renamed from: list */
    public java.lang.Iterable mo82286x32b09e(java.lang.String str) {
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, true);
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(l17)) {
            return null;
        }
        boolean isEmpty = l17.isEmpty();
        java.lang.Iterable mo82286x32b09e = this.f294486e.mo82286x32b09e(l17);
        if (mo82286x32b09e == null) {
            return null;
        }
        return new pm5.l(mo82286x32b09e, new com.p314xaae8f345.mm.vfs.d5(this, isEmpty), null, false);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.x1 m(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        com.p314xaae8f345.mm.vfs.x1 m17 = q2Var.m(str);
        if (m17 != null) {
            return new com.p314xaae8f345.mm.vfs.x1(this, m17.f294764a, m17.f294765b, m17.f294766c, m17.f294767d, m17.f294768e, m17.f294769f);
        }
        com.p314xaae8f345.mm.vfs.x1 m18 = q2Var.m(str + (char) 8982);
        if (m18 == null) {
            return null;
        }
        return L(str, m18);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean n(java.lang.String str, long j17) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            return false;
        }
        java.lang.String M = M(str);
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        return q2Var.n(str, j17) | (M != null ? q2Var.n(com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M), j17) : false);
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public int o() {
        return this.f294486e.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023b A[Catch: all -> 0x027b, TryCatch #5 {all -> 0x027b, blocks: (B:14:0x007d, B:18:0x0089, B:19:0x00a7, B:21:0x00ad, B:25:0x00bc, B:28:0x00c2, B:31:0x00d0, B:34:0x00e2, B:41:0x00ea, B:37:0x00f2, B:52:0x00f8, B:54:0x0100, B:57:0x0109, B:58:0x0110, B:60:0x0116, B:63:0x012d, B:66:0x013b, B:68:0x0143, B:71:0x0148, B:75:0x014f, B:78:0x0167, B:82:0x0193, B:84:0x0199, B:87:0x01c2, B:88:0x01ce, B:90:0x01d4, B:95:0x01f7, B:99:0x023b, B:112:0x0225, B:122:0x022e, B:123:0x0231, B:119:0x0233, B:129:0x0245), top: B:13:0x007d }] */
    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.g5.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public boolean r(java.lang.String str) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str)) {
            return false;
        }
        return this.f294486e.r(str);
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        try {
            return q2Var.s(str);
        } catch (java.io.FileNotFoundException e17) {
            java.lang.String M = M(str);
            if (M != null) {
                return q2Var.s(com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M));
            }
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "refCount <- " + this.f294486e;
    }

    @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.vfs.C22764xd9befb26.d(str) && str2.contains("w")) {
            throw new java.io.FileNotFoundException("Internal path referenced: ".concat(str));
        }
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case 114:
                if (str2.equals("r")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3653:
                if (str2.equals("rw")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3786:
                if (str2.equals("wa")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = this.f294486e;
        switch (c17) {
            case 0:
                try {
                    return q2Var.x(str, str2);
                } catch (java.io.FileNotFoundException e17) {
                    java.lang.String M = M(str);
                    if (M != null) {
                        return q2Var.x(com.p314xaae8f345.mm.vfs.C22764xd9befb26.c(M), str2);
                    }
                    throw e17;
                }
            case 1:
            case 2:
                if (M(str) == null) {
                    return q2Var.x(str, str2);
                }
                throw new java.lang.RuntimeException("Appending a reference counting file is not supported!");
            default:
                android.os.ParcelFileDescriptor x17 = q2Var.x(str, str2);
                N(str);
                return x17;
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294488g;
    }
}
