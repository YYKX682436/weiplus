package rm0;

/* loaded from: classes4.dex */
public abstract class h {
    public static java.lang.Object a(com.p314xaae8f345.mm.p944x882e457a.i iVar, long j17, lm5.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        if ((i17 & 2) != 0) {
            dVar = null;
        }
        return p3325xe03a0797.p3326xc267989b.a4.b(j17, new rm0.c(iVar, dVar, null), interfaceC29045xdcb5ca57);
    }

    public static final java.lang.Object b(com.p314xaae8f345.mm.p944x882e457a.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Cgi_");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = iVar.f152179f;
        sb6.append(oVar != null ? oVar.f152246d : 0);
        return c(iVar, new t65.g(sb6.toString()), interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.p314xaae8f345.mm.p944x882e457a.i r8, lm5.d r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            boolean r0 = r10 instanceof rm0.d
            if (r0 == 0) goto L13
            r0 = r10
            rm0.d r0 = (rm0.d) r0
            int r1 = r0.f478942g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f478942g = r1
            goto L18
        L13:
            rm0.d r0 = new rm0.d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f478941f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f478942g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f478940e
            com.tencent.mm.protobuf.f r8 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r8
            java.lang.Object r9 = r0.f478939d
            com.tencent.mm.modelbase.i r9 = (com.p314xaae8f345.mm.p944x882e457a.i) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r5 = r8
            r7 = r9
            goto L65
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.modelbase.o r10 = r8.f152179f
            r2 = 0
            if (r10 == 0) goto L46
            com.tencent.mm.modelbase.n r10 = r10.f152244b
            com.tencent.mm.protobuf.f r10 = r10.f152233a
            goto L47
        L46:
            r10 = r2
        L47:
            boolean r4 = r10 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f
            if (r4 == 0) goto L4c
            goto L4d
        L4c:
            r10 = r2
        L4d:
            rm0.g r4 = new rm0.g
            r4.<init>(r8, r9, r10, r2)
            r0.f478939d = r8
            r0.f478940e = r10
            r0.f478942g = r3
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.a4.c(r2, r4, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r8
            r5 = r10
            r10 = r9
        L65:
            com.tencent.mm.modelbase.f r10 = (com.p314xaae8f345.mm.p944x882e457a.f) r10
            if (r10 != 0) goto L75
            r2 = 3
            r3 = -13
            java.lang.String r4 = "Cgi Timeout"
            com.tencent.mm.modelbase.g r6 = r7.f152177d
            com.tencent.mm.modelbase.f r8 = com.p314xaae8f345.mm.p944x882e457a.f.a(r2, r3, r4, r5, r6, r7)
            return r8
        L75:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rm0.h.c(com.tencent.mm.modelbase.i, lm5.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
