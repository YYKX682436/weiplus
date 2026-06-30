package rn2;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final rn2.l0 f479325a = new rn2.l0();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rn2.l0 r12, android.content.Context r13, r45.dz1 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.l0.a(rn2.l0, android.content.Context, r45.dz1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0098 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(rn2.l0 r9, java.lang.String r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof rn2.c0
            if (r0 == 0) goto L16
            r0 = r11
            rn2.c0 r0 = (rn2.c0) r0
            int r1 = r0.f479196h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f479196h = r1
            goto L1b
        L16:
            rn2.c0 r0 = new rn2.c0
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f479194f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f479196h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f479193e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f479192d
            rn2.l0 r10 = (rn2.l0) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
        L34:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L4f
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.f479193e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f479192d
            rn2.l0 r10 = (rn2.l0) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L5f
        L4c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
        L4f:
            r0.f479192d = r9
            r0.f479193e = r10
            r0.f479196h = r4
            java.lang.Object r11 = r9.d(r10, r0)
            if (r11 != r1) goto L5c
            goto La1
        L5c:
            r8 = r10
            r10 = r9
            r9 = r8
        L5f:
            r45.kn1 r11 = (r45.kn1) r11
            r2 = 0
            java.lang.String r5 = "FinderLiveLotteryGiftCreate"
            if (r11 == 0) goto L9b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "checkBillStatus, bill status = "
            r6.<init>(r7)
            int r7 = r11.m75939xb282bd08(r4)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r6)
            int r5 = r11.m75939xb282bd08(r4)
            if (r5 == 0) goto L88
            if (r5 == r4) goto L86
            if (r5 == r3) goto L86
            goto La0
        L86:
            r1 = r11
            goto La1
        L88:
            r2 = 4
            int r11 = r11.m75939xb282bd08(r2)
            long r5 = (long) r11
            r0.f479192d = r10
            r0.f479193e = r9
            r0.f479196h = r3
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r0)
            if (r11 != r1) goto L34
            goto La1
        L9b:
            java.lang.String r9 = "pollResultAndCreateLottery fail!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r9)
        La0:
            r1 = r2
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.l0.b(rn2.l0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int c(java.lang.Integer num, int i17, java.util.List list) {
        int i18;
        if (list == null || list.isEmpty()) {
            i18 = 0;
        } else {
            java.util.Iterator it = list.iterator();
            float f17 = 0.0f;
            while (it.hasNext()) {
                f17 += ((rn2.y2) it.next()).f479462d.m75938x746dc8a6(9) * r3.f479461c.m75939xb282bd08(1);
            }
            i18 = (int) f17;
        }
        if (num != null && num.intValue() == 1) {
            return i18;
        }
        if (num != null && num.intValue() == 0) {
            return i18 * i17;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.l0.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r19, r45.dz1 r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.l0.e(android.content.Context, r45.dz1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
