package pi0;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: e */
    public static final pi0.b0 f436105e = new pi0.b0(null);

    /* renamed from: f */
    public static final java.util.HashMap f436106f = new java.util.HashMap();

    /* renamed from: g */
    public static boolean f436107g;

    /* renamed from: a */
    public final java.lang.String f436108a;

    /* renamed from: b */
    public aj0.l f436109b;

    /* renamed from: c */
    public aj0.e f436110c;

    /* renamed from: d */
    public final pi0.h0 f436111d = new pi0.h0();

    public g0(java.lang.String str) {
        this.f436108a = str;
    }

    public static /* synthetic */ java.lang.Object b(pi0.g0 g0Var, android.content.Context context, long j17, android.graphics.Point point, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = 300;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            point = null;
        }
        android.graphics.Point point2 = point;
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        return g0Var.a(context, j18, point2, z17, interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r8, long r9, android.graphics.Point r11, boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r7 = this;
            boolean r11 = r13 instanceof pi0.c0
            if (r11 == 0) goto L13
            r11 = r13
            pi0.c0 r11 = (pi0.c0) r11
            int r0 = r11.f436074g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.f436074g = r0
            goto L18
        L13:
            pi0.c0 r11 = new pi0.c0
            r11.<init>(r7, r13)
        L18:
            java.lang.Object r13 = r11.f436072e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f436074g
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = "MicroMsg.FlutterSnapshotHelper"
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L2f
            java.lang.Object r8 = r11.f436071d
            pi0.g0 r8 = (pi0.g0) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6b
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = 0
            java.lang.String r1 = r7.f436108a
            if (r1 == 0) goto L48
            int r1 = r1.length()
            if (r1 != 0) goto L46
            goto L48
        L46:
            r1 = r13
            goto L49
        L48:
            r1 = r4
        L49:
            if (r1 == 0) goto L4c
            return r2
        L4c:
            long r5 = java.lang.System.currentTimeMillis()
            pi0.h0 r1 = r7.f436111d
            r1.f436118a = r5
            pi0.f0 r1 = new pi0.f0     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6a
            if (r12 == 0) goto L59
            r13 = r4
        L59:
            r12 = 0
            r1.<init>(r7, r8, r13, r12)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6a
            r11.f436071d = r7     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6a
            r11.f436074g = r4     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6a
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.a4.b(r9, r1, r11)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L6a
            if (r8 != r0) goto L68
            return r0
        L68:
            r8 = r7
            goto L85
        L6a:
            r8 = r7
        L6b:
            pi0.h0 r9 = r8.f436111d
            r9.f436120c = r4
            java.lang.String r9 = "engineId"
            java.lang.String r10 = r8.f436108a
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r9)
            java.lang.String r9 = "prepareSnapshotTimeout:"
            java.lang.String r9 = r9.concat(r10)
            io.p3284xd2ae381c.Log.i(r3, r9)
            java.lang.String r9 = "snapshot timeout"
            io.p3284xd2ae381c.Log.w(r3, r9)
        L85:
            r8.getClass()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "prepareSnapshot cost:"
            r9.<init>(r10)
            long r10 = java.lang.System.currentTimeMillis()
            pi0.h0 r8 = r8.f436111d
            long r12 = r8.f436118a
            long r10 = r10 - r12
            r9.append(r10)
            java.lang.String r10 = ", timeout:"
            r9.append(r10)
            boolean r8 = r8.f436120c
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            io.p3284xd2ae381c.Log.i(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.g0.a(android.content.Context, long, android.graphics.Point, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
