package hx5;

/* loaded from: classes16.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(hx5.c r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof hx5.b
            if (r0 == 0) goto L13
            r0 = r7
            hx5.b r0 = (hx5.b) r0
            int r1 = r0.f367238e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f367238e = r1
            goto L18
        L13:
            hx5.b r0 = new hx5.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f367237d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f367238e
            java.lang.String r3 = "appId"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            jz5.l r7 = new jz5.l
            r7.<init>(r3, r6)
            java.util.Map r6 = kz5.b1.e(r7)
            r0.f367238e = r4
            ix5.h r5 = (ix5.h) r5
            java.lang.String r7 = "getAppInfo"
            java.lang.Object r7 = r5.g(r7, r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r7, r5)
            hx5.d r5 = new hx5.d
            java.lang.Object r6 = r7.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = ""
            if (r6 != 0) goto L5e
            r6 = r0
        L5e:
            java.lang.String r1 = "UUID"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L69
            r1 = r0
        L69:
            java.lang.String r2 = "versionCode"
            java.lang.Object r2 = r7.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L78
            int r2 = r2.intValue()
            goto L79
        L78:
            r2 = 0
        L79:
            java.lang.String r3 = "versionName"
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L84
            goto L85
        L84:
            r0 = r7
        L85:
            r5.<init>(r6, r1, r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hx5.a.a(hx5.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
