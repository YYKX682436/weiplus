package z25;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public int f551347a;

    /* renamed from: b, reason: collision with root package name */
    public int f551348b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f551349c;

    /* renamed from: d, reason: collision with root package name */
    public r45.z45 f551350d = null;

    /* renamed from: e, reason: collision with root package name */
    public z25.g f551351e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f551352f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f551353g = 3;

    /* renamed from: h, reason: collision with root package name */
    public g35.c f551354h = null;

    /* renamed from: i, reason: collision with root package name */
    public z25.l f551355i;

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0092: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:31:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r14 = this;
            java.lang.String r0 = "close VFSFileInputStream fail"
            java.lang.String r1 = "MicroMsg.CgiSectionUploadTask"
            java.lang.String r2 = "parseGlobalConfig: "
            boolean r3 = r14.f551352f
            if (r3 == 0) goto Lc
            return
        Lc:
            r3 = 1
            r14.f551352f = r3
            r3 = 0
            r4 = 0
            com.tencent.mm.vfs.r6 r5 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            z25.g r6 = r14.f551351e     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r6 = r6.f551340a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            com.tencent.mm.vfs.u6 r6 = new com.tencent.mm.vfs.u6     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            z25.g r4 = r14.f551351e     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r5 = r4.f551343d     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            byte[] r11 = new byte[r5]     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r4 = r4.f551342c     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            long r4 = (long) r4     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r6.skip(r4)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            z25.g r4 = r14.f551351e     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r4 = r4.f551343d     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r4 = r6.read(r11, r3, r4)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r5 = -1
            if (r5 != r4) goto L43
            java.lang.String r4 = "has no more to read"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r4)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r6.close()     // Catch: java.io.IOException -> L3f
            goto L42
        L3f:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        L42:
            return
        L43:
            g35.c r4 = new g35.c     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            java.lang.String r8 = r14.f551349c     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r45.z45 r9 = r14.f551350d     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            z25.g r5 = r14.f551351e     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r10 = r5.f551341b     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            z25.h r12 = new z25.h     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r12.<init>(r14, r14)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            int r13 = r5.f551344e     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r14.f551354h = r4     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            com.tencent.mm.modelbase.r1 r4 = gm0.j1.d()     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            g35.c r5 = r14.f551354h     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            r4.g(r5)     // Catch: java.lang.Exception -> L64 java.lang.Throwable -> L91
            goto L89
        L64:
            r4 = move-exception
            goto L6b
        L66:
            r2 = move-exception
            goto L93
        L68:
            r5 = move-exception
            r6 = r4
            r4 = r5
        L6b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r4.getMessage()     // Catch: java.lang.Throwable -> L91
            r5.append(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L91
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L91
            z25.l r2 = r14.f551355i     // Catch: java.lang.Throwable -> L91
            z25.a r2 = (z25.a) r2     // Catch: java.lang.Throwable -> L91
            r4 = -9999(0xffffffffffffd8f1, float:NaN)
            r2.a(r14, r3, r4)     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L90
        L89:
            r6.close()     // Catch: java.io.IOException -> L8d
            goto L90
        L8d:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        L90:
            return
        L91:
            r2 = move-exception
            r4 = r6
        L93:
            if (r4 == 0) goto L9c
            r4.close()     // Catch: java.io.IOException -> L99
            goto L9c
        L99:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
        L9c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z25.i.a():void");
    }
}
