package uw;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f513055a;

    /* renamed from: b, reason: collision with root package name */
    public volatile p3321xbce91901.C29043x91b2b43d f513056b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yz5.l f513057c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f513058d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public final uw.s f513059e = new uw.s(this);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof uw.t
            if (r0 == 0) goto L13
            r0 = r11
            uw.t r0 = (uw.t) r0
            int r1 = r0.f513044g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f513044g = r1
            goto L18
        L13:
            uw.t r0 = new uw.t
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f513042e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f513044g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f513041d
            uw.y r0 = (uw.y) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Exception -> L2b
            goto L82
        L2b:
            r11 = move-exception
            goto L9d
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result r11 = r10.f513056b
            if (r11 == 0) goto L59
            kotlin.Result r11 = r10.f513056b
            r2 = 0
            if (r11 == 0) goto L4d
            java.lang.Object r11 = r11.getValue()
            boolean r11 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r11)
            if (r11 != r3) goto L4d
            r2 = r3
        L4d:
            if (r2 == 0) goto L59
            kotlin.Result r11 = r10.f513056b
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r11)
            java.lang.Object r11 = r11.getValue()
            return r11
        L59:
            kotlinx.coroutines.r2 r11 = r10.f513055a
            r2 = 0
            if (r11 == 0) goto L61
            p3325xe03a0797.p3326xc267989b.p2.a(r11, r2, r3, r2)
        L61:
            kotlinx.coroutines.y0 r4 = r10.f513058d
            r5 = 0
            r6 = 0
            uw.x r7 = new uw.x
            r7.<init>(r10, r2)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r11 = p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
            r10.f513055a = r11
            kotlinx.coroutines.r2 r11 = r10.f513055a     // Catch: java.lang.Exception -> L2b
            if (r11 == 0) goto L81
            r0.f513041d = r10     // Catch: java.lang.Exception -> L2b
            r0.f513044g = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = r11.C(r0)     // Catch: java.lang.Exception -> L2b
            if (r11 != r1) goto L81
            return r1
        L81:
            r0 = r10
        L82:
            kotlin.Result r11 = r0.f513056b
            if (r11 == 0) goto L8b
            java.lang.Object r11 = r11.getValue()
            goto L9c
        L8b:
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "No Location"
            r11.<init>(r0)
            java.lang.Object r11 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r11)
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
        L9c:
            return r11
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestLocationJob join failed: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FlutterBSGetPoiHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r11)
            kotlin.Result$Companion r11 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Location request failed"
            r11.<init>(r0)
            java.lang.Object r11 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r11)
            java.lang.Object r11 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: uw.y.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
