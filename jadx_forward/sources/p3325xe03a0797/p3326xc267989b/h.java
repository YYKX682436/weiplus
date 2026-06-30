package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class h {
    public static final java.lang.Object a(java.util.Collection collection, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (collection.isEmpty()) {
            return kz5.p0.f395529d;
        }
        java.lang.Object[] array = collection.toArray(new p3325xe03a0797.p3326xc267989b.f1[0]);
        if (array != null) {
            return new p3325xe03a0797.p3326xc267989b.e((p3325xe03a0797.p3326xc267989b.f1[]) array).a(interfaceC29045xdcb5ca57);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final java.lang.Object b(p3325xe03a0797.p3326xc267989b.f1[] f1VarArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return f1VarArr.length == 0 ? kz5.p0.f395529d : new p3325xe03a0797.p3326xc267989b.e(f1VarArr).a(interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.Collection r4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            boolean r0 = r5 instanceof p3325xe03a0797.p3326xc267989b.g
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.g r0 = (p3325xe03a0797.p3326xc267989b.g) r0
            int r1 = r0.f392008f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392008f = r1
            goto L18
        L13:
            kotlinx.coroutines.g r0 = new kotlinx.coroutines.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f392007e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392008f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f392006d
            java.util.Iterator r4 = (java.util.Iterator) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L3c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.r2 r5 = (p3325xe03a0797.p3326xc267989b.r2) r5
            r0.f392006d = r4
            r0.f392008f = r3
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            jz5.f0 r4 = jz5.f0.f384359a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.h.c(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p3325xe03a0797.p3326xc267989b.r2[] r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof p3325xe03a0797.p3326xc267989b.f
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.f r0 = (p3325xe03a0797.p3326xc267989b.f) r0
            int r1 = r0.f391712h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391712h = r1
            goto L18
        L13:
            kotlinx.coroutines.f r0 = new kotlinx.coroutines.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f391711g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391712h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f391710f
            int r2 = r0.f391709e
            java.lang.Object r4 = r0.f391708d
            kotlinx.coroutines.r2[] r4 = (p3325xe03a0797.p3326xc267989b.r2[]) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f391708d = r7
            r0.f391709e = r2
            r0.f391710f = r6
            r0.f391712h = r3
            java.lang.Object r4 = r4.C(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.h.d(kotlinx.coroutines.r2[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
