package zk2;

/* loaded from: classes2.dex */
public final class b extends by1.f {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r2, int r3) {
        /*
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 95
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk2.b.<init>(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // by1.f, by1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zk2.a
            if (r0 == 0) goto L13
            r0 = r5
            zk2.a r0 = (zk2.a) r0
            int r1 = r0.f554963g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554963g = r1
            goto L18
        L13:
            zk2.a r0 = new zk2.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f554961e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554963g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f554960d
            zk2.b r0 = (zk2.b) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            kotlinx.coroutines.f1 r5 = r4.f117896d
            if (r5 == 0) goto L3d
            r5.a()
        L3d:
            r0.f554960d = r4
            r0.f554963g = r3
            java.lang.Object r5 = by1.f.f(r4, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            com.tencent.mm.modelbase.f r5 = (com.p314xaae8f345.mm.p944x882e457a.f) r5
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestCache: errType = "
            r0.<init>(r1)
            r1 = 0
            if (r5 == 0) goto L60
            int r2 = r5.f152148a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L61
        L60:
            r3 = r1
        L61:
            r0.append(r3)
            java.lang.String r2 = ", errCode="
            r0.append(r2)
            if (r5 == 0) goto L73
            int r1 = r5.f152149b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = r2
        L73:
            r0.append(r1)
            java.lang.String r1 = ", cache="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LivePersonalCenterCache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zk2.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
