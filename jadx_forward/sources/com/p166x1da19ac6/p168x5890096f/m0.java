package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public abstract class m0 extends com.p166x1da19ac6.p168x5890096f.f {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f125581c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f125582d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f125583e;

    public m0(android.content.Context context, java.lang.String str) {
        super(i(context, str), 1);
        this.f125583e = new java.util.HashMap();
        this.f125581c = context;
    }

    public static java.io.File i(android.content.Context context, java.lang.String str) {
        return new java.io.File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public static void m(java.io.File file, byte b17) {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b17);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                try {
                    randomAccessFile.close();
                } catch (java.lang.Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    @Override // com.p166x1da19ac6.p168x5890096f.f, com.p166x1da19ac6.p168x5890096f.d0
    public int a(java.lang.String str, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        int c17;
        synchronized (h(str)) {
            c17 = c(str, i17, this.f125555a, threadPolicy);
        }
        return c17;
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    public void b(int i17) {
        java.io.File file = this.f125555a;
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new java.io.IOException("cannot mkdir: " + file);
        }
        com.p166x1da19ac6.p168x5890096f.t tVar = new com.p166x1da19ac6.p168x5890096f.t(new java.io.File(file, "dso_lock"));
        try {
            java.util.Objects.toString(file);
            if (k(tVar, i17, g())) {
                tVar = null;
            } else {
                java.util.Objects.toString(file);
            }
            if (tVar != null) {
                return;
            }
            java.util.Objects.toString(file);
        } finally {
            java.util.Objects.toString(file);
            tVar.close();
        }
    }

    public final void d(com.p166x1da19ac6.p168x5890096f.g0[] g0VarArr) {
        java.io.File file = this.f125555a;
        java.lang.String[] list = file.list();
        if (list == null) {
            throw new java.io.IOException("unable to list directory " + file);
        }
        for (java.lang.String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z17 = false;
                for (int i17 = 0; !z17 && i17 < g0VarArr.length; i17++) {
                    if (g0VarArr[i17].f125563d.equals(str)) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    java.io.File file2 = new java.io.File(file, str);
                    file2.toString();
                    com.p166x1da19ac6.p168x5890096f.e0.a(file2);
                }
            }
        }
    }

    public final void e(com.p166x1da19ac6.p168x5890096f.i0 i0Var, byte[] bArr) {
        java.io.File file = this.f125555a;
        java.lang.String str = ((com.p166x1da19ac6.p168x5890096f.k0) i0Var).f125577d.f125563d;
        try {
            if (file.setWritable(true)) {
                f(i0Var, bArr);
            } else {
                throw new java.io.IOException("cannot make directory writable for us: " + file);
            }
        } finally {
            if (!file.setWritable(false)) {
                file.getCanonicalPath();
            }
        }
    }

    public final void f(com.p166x1da19ac6.p168x5890096f.i0 i0Var, byte[] bArr) {
        java.io.RandomAccessFile randomAccessFile;
        java.io.File file = new java.io.File(this.f125555a, ((com.p166x1da19ac6.p168x5890096f.k0) i0Var).f125577d.f125563d);
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    file.toString();
                }
                try {
                    randomAccessFile = new java.io.RandomAccessFile(file, "rw");
                } catch (java.io.IOException unused) {
                    file.toString();
                    com.p166x1da19ac6.p168x5890096f.e0.a(file);
                    randomAccessFile = new java.io.RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = ((com.p166x1da19ac6.p168x5890096f.k0) i0Var).f125578e.available();
                if (available > 1) {
                    com.p166x1da19ac6.p168x5890096f.C1552xea3b7391.m16735xad95626e(randomAccessFile2.getFD(), available);
                }
                com.p166x1da19ac6.p168x5890096f.k0 k0Var = (com.p166x1da19ac6.p168x5890096f.k0) i0Var;
                int i17 = 0;
                while (i17 < Integer.MAX_VALUE) {
                    int read = k0Var.f125578e.read(bArr, 0, java.lang.Math.min(bArr.length, Integer.MAX_VALUE - i17));
                    if (read == -1) {
                        break;
                    }
                    randomAccessFile2.write(bArr, 0, read);
                    i17 += read;
                }
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        file.toString();
                    }
                    randomAccessFile2.close();
                } else {
                    throw new java.io.IOException("cannot make file executable: " + file);
                }
            } catch (java.io.IOException e17) {
                com.p166x1da19ac6.p168x5890096f.e0.a(file);
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            if (!file.setWritable(false)) {
                file.toString();
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th6;
        }
    }

    public byte[] g() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        com.p166x1da19ac6.p168x5890096f.l0 j17 = j();
        try {
            com.p166x1da19ac6.p168x5890096f.g0[] g0VarArr = j17.a().f125568a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(g0VarArr.length);
            for (int i17 = 0; i17 < g0VarArr.length; i17++) {
                obtain.writeString(g0VarArr[i17].f125563d);
                obtain.writeString(g0VarArr[i17].f125564e);
            }
            j17.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                if (j17 != null) {
                    try {
                        j17.close();
                    } catch (java.lang.Throwable th8) {
                        th6.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        }
    }

    public final java.lang.Object h(java.lang.String str) {
        java.lang.Object obj;
        synchronized (this.f125583e) {
            obj = ((java.util.HashMap) this.f125583e).get(str);
            if (obj == null) {
                obj = new java.lang.Object();
                ((java.util.HashMap) this.f125583e).put(str, obj);
            }
        }
        return obj;
    }

    public abstract com.p166x1da19ac6.p168x5890096f.l0 j();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(com.p166x1da19ac6.p168x5890096f.t r12, int r13, byte[] r14) {
        /*
            r11 = this;
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "dso_state"
            java.io.File r7 = r11.f125555a
            r5.<init>(r7, r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r8 = 1
            r2 = 0
            byte r3 = r0.readByte()     // Catch: java.io.EOFException -> L1b java.lang.Throwable -> L1d
            if (r3 == r8) goto L29
            java.util.Objects.toString(r7)     // Catch: java.io.EOFException -> L1b java.lang.Throwable -> L1d
        L1b:
            r3 = r2
            goto L29
        L1d:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L1f
        L1f:
            r13 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r14 = move-exception
            r12.addSuppressed(r14)
        L28:
            throw r13
        L29:
            r0.close()
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "dso_deps"
            r4.<init>(r7, r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            r0.<init>(r4, r1)
            long r9 = r0.length()     // Catch: java.lang.Throwable -> Lb3
            int r1 = (int) r9     // Catch: java.lang.Throwable -> Lb3
            byte[] r6 = new byte[r1]     // Catch: java.lang.Throwable -> Lb3
            int r9 = r0.read(r6)     // Catch: java.lang.Throwable -> Lb3
            if (r9 == r1) goto L46
            r3 = r2
        L46:
            boolean r1 = java.util.Arrays.equals(r6, r14)     // Catch: java.lang.Throwable -> Lb3
            r1 = r1 ^ r8
            if (r1 == 0) goto L4e
            r3 = r2
        L4e:
            if (r3 == 0) goto L58
            r1 = r13 & 2
            if (r1 == 0) goto L55
            goto L58
        L55:
            r1 = 0
            r6 = r1
            goto L6d
        L58:
            m(r5, r2)     // Catch: java.lang.Throwable -> Lb3
            com.facebook.soloader.l0 r1 = r11.j()     // Catch: java.lang.Throwable -> Lb3
            com.facebook.soloader.h0 r6 = r1.a()     // Catch: java.lang.Throwable -> La5
            com.facebook.soloader.j0 r9 = r1.b()     // Catch: java.lang.Throwable -> La5
            r11.l(r3, r6, r9)     // Catch: java.lang.Throwable -> La1
            r1.close()     // Catch: java.lang.Throwable -> Lb3
        L6d:
            r0.close()
            if (r6 != 0) goto L73
            return r2
        L73:
            com.facebook.soloader.f0 r9 = new com.facebook.soloader.f0
            r0 = r9
            r1 = r11
            r2 = r4
            r3 = r14
            r4 = r6
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12 = r13 & 1
            if (r12 == 0) goto L9d
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "SoSync:"
            r13.<init>(r14)
            java.lang.String r14 = r7.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto La0
        L9d:
            r9.run()
        La0:
            return r8
        La1:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> La3
        La3:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> La5
        La5:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> La7
        La7:
            r13 = move-exception
            if (r1 == 0) goto Lb2
            r1.close()     // Catch: java.lang.Throwable -> Lae
            goto Lb2
        Lae:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lb3
        Lb2:
            throw r13     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r13 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r14 = move-exception
            r12.addSuppressed(r14)
        Lbe:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.m0.k(com.facebook.soloader.t, int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:64:0x0013, B:6:0x001f, B:7:0x0026, B:8:0x0030, B:10:0x0036, B:32:0x0083, B:42:0x0098, B:47:0x0095, B:44:0x008e, B:14:0x003e, B:16:0x0043, B:18:0x0054, B:22:0x0068, B:26:0x006b, B:30:0x0080, B:37:0x008a), top: B:63:0x0013, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #3 {all -> 0x0018, blocks: (B:64:0x0013, B:6:0x001f, B:7:0x0026, B:8:0x0030, B:10:0x0036, B:32:0x0083, B:42:0x0098, B:47:0x0095, B:44:0x008e, B:14:0x003e, B:16:0x0043, B:18:0x0054, B:22:0x0068, B:26:0x006b, B:30:0x0080, B:37:0x008a), top: B:63:0x0013, inners: #1, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(byte r10, com.p166x1da19ac6.p168x5890096f.h0 r11, com.p166x1da19ac6.p168x5890096f.j0 r12) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "dso_manifest"
            java.io.File r2 = r9.f125555a
            r0.<init>(r2, r1)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r1.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L1b
            com.facebook.soloader.h0 r10 = com.p166x1da19ac6.p168x5890096f.h0.a(r1)     // Catch: java.lang.Throwable -> L18 java.lang.Exception -> L1b
            goto L1c
        L18:
            r10 = move-exception
            goto L9d
        L1b:
            r10 = 0
        L1c:
            r3 = 0
            if (r10 != 0) goto L26
            com.facebook.soloader.h0 r10 = new com.facebook.soloader.h0     // Catch: java.lang.Throwable -> L18
            com.facebook.soloader.g0[] r4 = new com.p166x1da19ac6.p168x5890096f.g0[r3]     // Catch: java.lang.Throwable -> L18
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L18
        L26:
            com.facebook.soloader.g0[] r11 = r11.f125568a     // Catch: java.lang.Throwable -> L18
            r9.d(r11)     // Catch: java.lang.Throwable -> L18
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L18
        L30:
            boolean r4 = r12.a()     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L99
            com.facebook.soloader.i0 r4 = r12.b()     // Catch: java.lang.Throwable -> L18
            r5 = r0
            r6 = r3
        L3c:
            if (r5 == 0) goto L6b
            com.facebook.soloader.g0[] r7 = r10.f125568a     // Catch: java.lang.Throwable -> L89
            int r8 = r7.length     // Catch: java.lang.Throwable -> L89
            if (r6 >= r8) goto L6b
            r8 = r4
            com.facebook.soloader.k0 r8 = (com.p166x1da19ac6.p168x5890096f.k0) r8     // Catch: java.lang.Throwable -> L89
            com.facebook.soloader.g0 r8 = r8.f125577d     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.f125563d     // Catch: java.lang.Throwable -> L89
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r7.f125563d     // Catch: java.lang.Throwable -> L89
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L68
            com.facebook.soloader.g0[] r7 = r10.f125568a     // Catch: java.lang.Throwable -> L89
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r7.f125564e     // Catch: java.lang.Throwable -> L89
            r8 = r4
            com.facebook.soloader.k0 r8 = (com.p166x1da19ac6.p168x5890096f.k0) r8     // Catch: java.lang.Throwable -> L89
            com.facebook.soloader.g0 r8 = r8.f125577d     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.f125564e     // Catch: java.lang.Throwable -> L89
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L68
            r5 = r3
        L68:
            int r6 = r6 + 1
            goto L3c
        L6b:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L89
            r7 = r4
            com.facebook.soloader.k0 r7 = (com.p166x1da19ac6.p168x5890096f.k0) r7     // Catch: java.lang.Throwable -> L89
            com.facebook.soloader.g0 r7 = r7.f125577d     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = r7.f125563d     // Catch: java.lang.Throwable -> L89
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> L89
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L7e
            r5 = r0
        L7e:
            if (r5 == 0) goto L83
            r9.e(r4, r11)     // Catch: java.lang.Throwable -> L89
        L83:
            com.facebook.soloader.k0 r4 = (com.p166x1da19ac6.p168x5890096f.k0) r4     // Catch: java.lang.Throwable -> L18
            r4.close()     // Catch: java.lang.Throwable -> L18
            goto L30
        L89:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L8b
        L8b:
            r11 = move-exception
            if (r4 == 0) goto L98
            com.facebook.soloader.k0 r4 = (com.p166x1da19ac6.p168x5890096f.k0) r4     // Catch: java.lang.Throwable -> L94
            r4.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r12 = move-exception
            r10.addSuppressed(r12)     // Catch: java.lang.Throwable -> L18
        L98:
            throw r11     // Catch: java.lang.Throwable -> L18
        L99:
            r1.close()
            return
        L9d:
            throw r10     // Catch: java.lang.Throwable -> L9e
        L9e:
            r11 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r12 = move-exception
            r10.addSuppressed(r12)
        La7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p166x1da19ac6.p168x5890096f.m0.l(byte, com.facebook.soloader.h0, com.facebook.soloader.j0):void");
    }
}
