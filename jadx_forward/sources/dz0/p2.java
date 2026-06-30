package dz0;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326506d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326507e;

    /* renamed from: f, reason: collision with root package name */
    public int f326508f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326510h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(az0.n7 n7Var, com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326510h = n7Var;
        this.f326511i = c11015x5b190a3b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dz0.p2 p2Var = new dz0.p2(this.f326510h, this.f326511i, interfaceC29045xdcb5ca57);
        p2Var.f326509g = obj;
        return p2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.p2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0092 A[Catch: all -> 0x00a6, TryCatch #0 {all -> 0x00a6, blocks: (B:7:0x001b, B:10:0x0092, B:11:0x00a1, B:21:0x0034, B:22:0x005a, B:24:0x005e, B:26:0x006a, B:28:0x0072, B:31:0x007c, B:39:0x0044), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f326508f
            java.lang.String r2 = "MaasMultiTemplate.MaasSdkUIC"
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            jz5.f0 r6 = jz5.f0.f384359a
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 == r5) goto L28
            if (r1 != r4) goto L20
            java.lang.Object r0 = r11.f326506d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r0 = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) r0
            java.lang.Object r1 = r11.f326509g
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: java.lang.Throwable -> La6
            goto L8c
        L20:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L28:
            java.lang.Object r1 = r11.f326507e
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r1 = (com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) r1
            java.lang.Object r5 = r11.f326506d
            az0.n7 r5 = (az0.n7) r5
            java.lang.Object r8 = r11.f326509g
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)     // Catch: java.lang.Throwable -> La6
            goto L5a
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.Object r12 = r11.f326509g
            r8 = r12
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            az0.n7 r12 = r11.f326510h
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r1 = r11.f326511i
            kotlin.Result$Companion r9 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> La6
            java.lang.String r9 = r1.f151323n     // Catch: java.lang.Throwable -> La6
            r11.f326509g = r8     // Catch: java.lang.Throwable -> La6
            r11.f326506d = r12     // Catch: java.lang.Throwable -> La6
            r11.f326507e = r1     // Catch: java.lang.Throwable -> La6
            r11.f326508f = r5     // Catch: java.lang.Throwable -> La6
            java.lang.Object r5 = r12.j(r3, r9, r11)     // Catch: java.lang.Throwable -> La6
            if (r5 != r0) goto L57
            return r0
        L57:
            r10 = r5
            r5 = r12
            r12 = r10
        L5a:
            com.tencent.maas.model.MJTemplateRecommendResult r12 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2) r12     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L8f
            dz0.e0 r9 = r1.D     // Catch: java.lang.Throwable -> La6
            r9.b(r12)     // Catch: java.lang.Throwable -> La6
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b.R6(r1)     // Catch: java.lang.Throwable -> La6
            dz0.k r12 = r1.f151318f     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L8f
            com.tencent.maas.instamovie.MJMovieSession r5 = r5.f97275a     // Catch: java.lang.Throwable -> La6
            com.tencent.maas.model.MJTemplateInfo r5 = r5.m33395x7a30592b()     // Catch: java.lang.Throwable -> La6
            if (r5 == 0) goto L77
            java.lang.String r5 = r5.m33907x3bfa570b()     // Catch: java.lang.Throwable -> La6
            goto L78
        L77:
            r5 = r7
        L78:
            if (r5 != 0) goto L7b
            goto L7c
        L7b:
            r3 = r5
        L7c:
            r11.f326509g = r8     // Catch: java.lang.Throwable -> La6
            r11.f326506d = r1     // Catch: java.lang.Throwable -> La6
            r11.f326507e = r7     // Catch: java.lang.Throwable -> La6
            r11.f326508f = r4     // Catch: java.lang.Throwable -> La6
            java.lang.Object r12 = r12.z2(r3, r11)     // Catch: java.lang.Throwable -> La6
            if (r12 != r0) goto L8b
            return r0
        L8b:
            r0 = r1
        L8c:
            r1 = r0
            r12 = r6
            goto L90
        L8f:
            r12 = r7
        L90:
            if (r12 != 0) goto La1
            java.lang.String r12 = "triggerRecommend: recommend error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r12)     // Catch: java.lang.Throwable -> La6
            androidx.lifecycle.j0 r12 = r1.f151319g     // Catch: java.lang.Throwable -> La6
            az0.o7 r0 = new az0.o7     // Catch: java.lang.Throwable -> La6
            r0.<init>(r7)     // Catch: java.lang.Throwable -> La6
            r12.mo7808x76db6cb1(r0)     // Catch: java.lang.Throwable -> La6
        La1:
            java.lang.Object r12 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)     // Catch: java.lang.Throwable -> La6
            goto Lb1
        La6:
            r12 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r12 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r12)
            java.lang.Object r12 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r12)
        Lb1:
            java.lang.Throwable r12 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r12)
            if (r12 == 0) goto Lbc
            java.lang.String r12 = "triggerRecommend: recommend onFailure"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r12)
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.p2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
