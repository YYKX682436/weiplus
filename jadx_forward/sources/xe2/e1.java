package xe2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bk1 f535388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.f1 f535389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.bk1 bk1Var, xe2.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535388e = bk1Var;
        this.f535389f = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xe2.e1(this.f535388e, this.f535389f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f535387d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L86
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.b72 r8 = new r45.b72
            r8.<init>()
            r45.bk1 r1 = r7.f535388e
            com.tencent.mm.protobuf.g r1 = r1.m75934xbce7f2f(r2)
            r3 = 0
            if (r1 == 0) goto L2c
            byte[] r1 = r1.g()
            goto L2d
        L2c:
            r1 = r3
        L2d:
            if (r1 != 0) goto L31
        L2f:
            r8 = r3
            goto L42
        L31:
            r8.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L35
            goto L42
        L35:
            r8 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r4 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r1, r8)
            goto L2f
        L42:
            if (r8 == 0) goto L9b
            long r3 = r8.m75942xfb822ef2(r2)
            r1 = 0
            int r8 = r8.m75939xb282bd08(r1)
            if (r8 != 0) goto L9b
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L9b
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            int r1 = (int) r3
            int r8 = r8.nextInt(r1)
            xe2.f1 r1 = r7.f535389f
            java.lang.String r1 = r1.f535393c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "receive RefreshShopShelf msg, refresh after "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = " seconds"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            long r3 = (long) r8
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r7.f535387d = r2
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r7)
            if (r8 != r0) goto L86
            return r0
        L86:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r0 = "PARAM_FINDER_LIVE_SHOPPING_REFRESH_WHEN_OPEN"
            r8.putBoolean(r0, r2)
            dk2.ef r0 = dk2.ef.f314905a
            com.tencent.mm.plugin.finder.live.view.k0 r0 = dk2.ef.f314913e
            if (r0 == 0) goto L9b
            qo0.b r1 = qo0.b.f446892h2
            r0.mo46557x60d69242(r1, r8)
        L9b:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.e1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
