package lx;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f403270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f403271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(lx.r1 r1Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403271e = r1Var;
        this.f403272f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lx.e1(this.f403271e, this.f403272f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "fetchBizPOIInfoAsync success "
            pz5.a r1 = pz5.a.f440719d
            int r2 = r8.f403270d
            yz5.l r3 = r8.f403272f
            java.lang.String r4 = "MicroMsg.FlutterBizLocationPlugin"
            r5 = 1
            r6 = 0
            lx.r1 r7 = r8.f403271e
            if (r2 == 0) goto L24
            if (r2 != r5) goto L1c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Exception -> L6f
            kotlin.Result r9 = (p3321xbce91901.C29043x91b2b43d) r9     // Catch: java.lang.Exception -> L6f
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Exception -> L6f
            goto L34
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            eq1.u r9 = r7.f403462f     // Catch: java.lang.Exception -> L6f
            if (r9 == 0) goto L39
            r8.f403270d = r5     // Catch: java.lang.Exception -> L6f
            java.lang.Object r9 = r9.c(r8)     // Catch: java.lang.Exception -> L6f
            if (r9 != r1) goto L34
            return r1
        L34:
            kotlin.Result r9 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r9)     // Catch: java.lang.Exception -> L6f
            goto L3a
        L39:
            r9 = r6
        L3a:
            if (r9 == 0) goto L54
            java.lang.Object r1 = r9.getValue()     // Catch: java.lang.Exception -> L6f
            boolean r1 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L54
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Exception -> L6f
            boolean r1 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r9)     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L51
            goto L52
        L51:
            r6 = r9
        L52:
            com.tencent.pigeon.biz.BizPOIInfo r6 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5) r6     // Catch: java.lang.Exception -> L6f
        L54:
            r7.getClass()     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r9.<init>(r0)     // Catch: java.lang.Exception -> L6f
            r9.append(r6)     // Catch: java.lang.Exception -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L6f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)     // Catch: java.lang.Exception -> L6f
            lx.c1 r9 = new lx.c1     // Catch: java.lang.Exception -> L6f
            r9.<init>(r3, r6)     // Catch: java.lang.Exception -> L6f
            pm0.v.X(r9)     // Catch: java.lang.Exception -> L6f
            goto L90
        L6f:
            r9 = move-exception
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fetchBizPOIInfoAsync failed: "
            r0.<init>(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r9)
            lx.d1 r9 = new lx.d1
            r9.<init>(r3)
            pm0.v.X(r9)
        L90:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.e1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
