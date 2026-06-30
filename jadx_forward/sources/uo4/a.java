package uo4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final uo4.a f511207a = new uo4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f511208b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MultiMediaIDKeyStatMuxMark");

    /* renamed from: c, reason: collision with root package name */
    public static final int f511209c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f511210d = 2;

    /* JADX WARN: Removed duplicated region for block: B:37:0x040b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r28, long r29, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo4.a.a(java.lang.String, long, boolean, boolean, boolean, boolean):void");
    }

    public final void b(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1371L, j17);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        java.util.ArrayList arrayList = composition.f257130c;
        boolean z18 = true;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l.f479048q.a()) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        boolean z19 = composition.f257136i;
        java.util.ArrayList arrayList2 = composition.f257130c;
        if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it6.next()).f257160l.f479039h == 1.0f)) {
                    break;
                }
            }
        }
        z18 = false;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1371L, 106L);
        }
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1371L, 107L);
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1371L, 114L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EDGE_INSN: B:27:0x0054->B:7:0x0054 BREAK  A[LOOP:0: B:16:0x0030->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:16:0x0030->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.List r7) {
        /*
            r6 = this;
            java.lang.String r0 = "itemList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
        Ld:
            r0 = r2
            goto L24
        Lf:
            java.util.Iterator r0 = r7.iterator()
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r0.next()
            zu3.a r3 = (zu3.a) r3
            boolean r3 = r3 instanceof zu3.d
            if (r3 == 0) goto L13
            r0 = r1
        L24:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L2c
        L2a:
            r1 = r2
            goto L54
        L2c:
            java.util.Iterator r7 = r7.iterator()
        L30:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r7.next()
            zu3.a r3 = (zu3.a) r3
            boolean r4 = r3 instanceof zu3.a0
            if (r4 == 0) goto L51
            zu3.a0 r3 = (zu3.a0) r3
            java.lang.String r3 = r3.f557301k
            int r3 = r3.length()
            if (r3 <= 0) goto L4c
            r3 = r1
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 == 0) goto L51
            r3 = r1
            goto L52
        L51:
            r3 = r2
        L52:
            if (r3 == 0) goto L30
        L54:
            r2 = 1371(0x55b, double:6.774E-321)
            if (r0 == 0) goto L5f
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r4 = 104(0x68, double:5.14E-322)
            r7.B(r2, r4)
        L5f:
            if (r1 == 0) goto L68
            com.tencent.mm.plugin.report.service.g0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r0 = 105(0x69, double:5.2E-322)
            r7.B(r2, r0)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uo4.a.d(java.util.List):void");
    }
}
