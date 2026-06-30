package d61;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f308249a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f308250b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f308251c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f308252d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f308253e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f308254f;

    static {
        d(new byte[]{102, 114, 101, 101});
        d(new byte[]{106, 117, 110, 107});
        f308249a = d(new byte[]{109, 100, 97, 116});
        f308250b = d(new byte[]{109, 111, 111, 118});
        d(new byte[]{112, 110, 111, 116});
        d(new byte[]{115, 107, 105, 112});
        d(new byte[]{119, 105, 100, 101});
        d(new byte[]{80, 73, 67, 84});
        f308251c = d(new byte[]{102, 116, 121, 112});
        d(new byte[]{117, 117, 105, 100});
        f308252d = d(new byte[]{99, 109, 111, 118});
        f308253e = d(new byte[]{115, 116, 99, 111});
        f308254f = d(new byte[]{99, 111, 54, 52});
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        java.io.InputStream D;
        byte[] bArr;
        byte[] bArr2;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.x1 m18;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        java.io.InputStream inputStream2 = null;
        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        long j17 = 0;
        long j18 = (m19.a() && (m18 = m19.f294799a.m(m19.f294800b)) != null) ? m18.f294766c : 0L;
        com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m27.a() && (m17 = m27.f294799a.m(m27.f294800b)) != null) {
            j17 = m17.f294766c;
        }
        if (j18 != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "check size not right");
            return false;
        }
        long a19 = new d61.b().a(str);
        d61.k kVar = new d61.k();
        kVar.a(str, a19);
        int i17 = kVar.f308280f;
        long a27 = new d61.b().a(str2);
        d61.k kVar2 = new d61.k();
        kVar2.a(str2, a27);
        int i18 = kVar2.f308280f;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "check duration not right");
            return false;
        }
        int nextInt = new java.util.Random().nextInt(i18 - 1) + 1;
        int i19 = nextInt + 1;
        if (i19 <= i18) {
            i18 = i19;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        kVar.b(nextInt, i18, c19767x257d7f, c19767x257d7f2);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        kVar2.b(nextInt, i18, c19767x257d7f3, c19767x257d7f4);
        if (c19767x257d7f4.f38864x6ac9171 != c19767x257d7f2.f38864x6ac9171) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "check len not right");
            return false;
        }
        try {
            D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m19));
            try {
                D.skip(c19767x257d7f.f38864x6ac9171);
                bArr = new byte[4096];
                D.read(bArr);
                inputStream2 = com.p314xaae8f345.mm.vfs.w6.D(a18, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, m27));
                inputStream2.skip(c19767x257d7f3.f38864x6ac9171);
                bArr2 = new byte[4096];
                D.read(bArr2);
            } catch (java.lang.Exception e17) {
                e = e17;
                java.io.InputStream inputStream3 = inputStream2;
                inputStream2 = D;
                inputStream = inputStream3;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "fast start error: " + e.toString());
                    e(inputStream2);
                    e(inputStream);
                    return true;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    e(inputStream2);
                    e(inputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                java.io.InputStream inputStream4 = inputStream2;
                inputStream2 = D;
                inputStream = inputStream4;
                e(inputStream2);
                e(inputStream);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            inputStream = null;
        }
        if (!java.util.Arrays.equals(bArr, bArr2)) {
            e(D);
            e(inputStream2);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "check data not right");
        e(D);
        e(inputStream2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r11, java.lang.String r12, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r13) {
        /*
            java.lang.String r0 = "fast start error: "
            com.tencent.mm.vfs.z7 r1 = com.p314xaae8f345.mm.vfs.z7.a(r11)
            r2 = 0
            java.lang.String r3 = r1.f294812f
            if (r3 == 0) goto L24
            java.lang.String r7 = com.p314xaae8f345.mm.vfs.e8.l(r3, r2, r2)
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L24
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7
            java.lang.String r5 = r1.f294810d
            java.lang.String r6 = r1.f294811e
            java.lang.String r8 = r1.f294813g
            java.lang.String r9 = r1.f294814h
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r1 = r3
        L24:
            com.tencent.mm.vfs.z7 r3 = com.p314xaae8f345.mm.vfs.z7.a(r12)
            java.lang.String r4 = r3.f294812f
            if (r4 == 0) goto L45
            java.lang.String r8 = com.p314xaae8f345.mm.vfs.e8.l(r4, r2, r2)
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L45
            com.tencent.mm.vfs.z7 r4 = new com.tencent.mm.vfs.z7
            java.lang.String r6 = r3.f294810d
            java.lang.String r7 = r3.f294811e
            java.lang.String r9 = r3.f294813g
            java.lang.String r10 = r3.f294814h
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r3 = r4
        L45:
            r4 = 0
            com.tencent.mm.vfs.b3 r5 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            com.tencent.mm.vfs.z2 r5 = r5.m(r1, r4)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.nio.channels.ReadableByteChannel r1 = com.p314xaae8f345.mm.vfs.w6.F(r1, r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.nio.channels.FileChannel r1 = (java.nio.channels.FileChannel) r1     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            com.tencent.mm.vfs.b3 r5 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7a
            com.tencent.mm.vfs.z2 r5 = r5.m(r3, r4)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L7a
            java.nio.channels.WritableByteChannel r6 = com.p314xaae8f345.mm.vfs.w6.L(r3, r5, r2)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.nio.channels.FileChannel r6 = (java.nio.channels.FileChannel) r6     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            boolean r2 = c(r1, r6, r13)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            if (r2 == 0) goto L68
            boolean r2 = a(r11, r12)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L68:
            e(r1)
        L6b:
            e(r6)
            goto La0
        L6f:
            r11 = move-exception
            goto L78
        L71:
            r11 = move-exception
            goto L7d
        L73:
            r11 = move-exception
            goto L77
        L75:
            r11 = move-exception
            goto L7c
        L77:
            r6 = r4
        L78:
            r4 = r1
            goto Lb7
        L7a:
            r11 = move-exception
            r5 = r4
        L7c:
            r6 = r4
        L7d:
            r4 = r1
            goto L87
        L7f:
            r11 = move-exception
            goto L83
        L81:
            r11 = move-exception
            goto L85
        L83:
            r6 = r4
            goto Lb7
        L85:
            r5 = r4
            r6 = r5
        L87:
            java.lang.String r12 = "MicroMsg.FastStart"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r13.<init>(r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lb6
            r13.append(r11)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Throwable -> Lb6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r12, r11)     // Catch: java.lang.Throwable -> Lb6
            e(r4)
            goto L6b
        La0:
            if (r2 != 0) goto Lb5
            com.tencent.mm.vfs.b3 r11 = com.p314xaae8f345.mm.vfs.a3.f294314a
            com.tencent.mm.vfs.z2 r11 = r11.m(r3, r5)
            boolean r12 = r11.a()
            if (r12 == 0) goto Lb5
            com.tencent.mm.vfs.q2 r12 = r11.f294799a
            java.lang.String r11 = r11.f294800b
            r12.d(r11)
        Lb5:
            return r2
        Lb6:
            r11 = move-exception
        Lb7:
            e(r4)
            e(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.e.b(java.lang.String, java.lang.String, com.tencent.mm.pointers.PInt):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        r0 = -1;
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        if (r11 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        if (r4 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        if (r12 != r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if (r0 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fd, code lost:
    
        r10 = f(r13);
        r3 = java.nio.ByteBuffer.allocateDirect(r10).order(java.nio.ByteOrder.BIG_ENDIAN);
        r3.clear();
        r4 = r6.read(r3, r0);
        r3.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        if (r4 != r3.capacity()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        if (r4 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0120, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "failed to read moov atom");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0130, code lost:
    
        if (r3.getInt(12) != d61.e.f308252d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "this utility does not support compressed moov atoms yet");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0138, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013f, code lost:
    
        if (r3.remaining() < 8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        r4 = r3.position();
        r12 = r3.getInt(r4 + 4);
        r13 = d61.e.f308254f;
        r14 = d61.e.f308253e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014f, code lost:
    
        if (r12 == r14) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0151, code lost:
    
        if (r12 == r13) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016e, code lost:
    
        if ((r3.getInt(r4) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) <= r3.remaining()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
    
        r20 = false;
        r3.position(r4 + 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        if (r3.remaining() >= 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
    
        r0 = f(r3.getInt());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0197, code lost:
    
        if (r12 != r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019f, code lost:
    
        if (r3.remaining() >= (r0 * 4)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a5, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a7, code lost:
    
        if (r1 >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a9, code lost:
    
        r4 = r3.getInt(r3.position());
        r6 = r4 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b3, code lost:
    
        if (r4 >= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b5, code lost:
    
        if (r6 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b7, code lost:
    
        return r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b8, code lost:
    
        r3.putInt(r6);
        r1 = r1 + 1;
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e2, code lost:
    
        r6 = r27;
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a1, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "bad atom size/element count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
    
        if (r12 != r13) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c8, code lost:
    
        if (r3.remaining() >= (r0 * 8)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cf, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d0, code lost:
    
        if (r1 >= r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d2, code lost:
    
        r3.putLong(r3.getLong(r3.position()) + r10);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ca, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "bad atom size/element count");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ce, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0186, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "malformed atom");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "bad atom size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0177, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        r3.position(r3.position() + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ea, code lost:
    
        r16 = r0;
        r6.position(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f0, code lost:
    
        if (r2 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f2, code lost:
    
        r2.rewind();
        r7 = r28;
        r7.write(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fd, code lost:
    
        r3.rewind();
        r7.write(r3);
        r27.transferTo(r8, r16 - r8, r28);
        r0 = r10;
        r27.transferTo(r16 + r0, (r27.size() - r16) - r0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0223, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01fb, code lost:
    
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x011d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0224, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "it can not find moov atom");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x022b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "it can not find moov or ftyp");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0231, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e5 A[LOOP:0: B:2:0x0018->B:14:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.nio.channels.FileChannel r27, java.nio.channels.FileChannel r28, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r29) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d61.e.c(java.nio.channels.FileChannel, java.nio.channels.FileChannel, com.tencent.mm.pointers.PInt):boolean");
    }

    public static int d(byte[] bArr) {
        return java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).getInt();
    }

    public static void e(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FastStart", "Failed to close file: ");
            }
        }
    }

    public static int f(long j17) {
        if (j17 > 2147483647L || j17 < 0) {
            throw new java.lang.Exception("uint32 value is too large");
        }
        return (int) j17;
    }
}
