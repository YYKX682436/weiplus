package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195529d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f195530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f195531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f195532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, dk2.zf zfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195531f = mgVar;
        this.f195532g = zfVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf qfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf(this.f195531f, this.f195532g, interfaceC29045xdcb5ca57);
        qfVar.f195530e = obj;
        return qfVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:7:0x0038, B:9:0x0076, B:14:0x007c, B:19:0x0088, B:21:0x0090, B:28:0x00a3, B:29:0x00aa), top: B:6:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:7:0x0038, B:9:0x0076, B:14:0x007c, B:19:0x0088, B:21:0x0090, B:28:0x00a3, B:29:0x00aa), top: B:6:0x0038 }] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.tencent.mm.plugin.finder.live.plugin.qf] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [jz5.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Class<mm2.x4> r0 = mm2.x4.class
            java.lang.String r1 = "Finder.LiveCommentPlugin"
            pz5.a r2 = pz5.a.f440719d
            int r3 = r12.f195529d
            r4 = 1
            if (r3 == 0) goto L1e
            if (r3 != r4) goto L16
            java.lang.Object r3 = r12.f195530e
            kotlinx.coroutines.y0 r3 = (p3325xe03a0797.p3326xc267989b.y0) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            goto L34
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f195530e
            kotlinx.coroutines.y0 r13 = (p3325xe03a0797.p3326xc267989b.y0) r13
            r3 = r13
            r13 = r12
        L27:
            r13.f195530e = r3
            r13.f195529d = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r13)
            if (r5 != r2) goto L34
            return r2
        L34:
            dk2.zf r5 = r13.f195532g
            com.tencent.mm.plugin.finder.live.plugin.mg r6 = r13.f195531f
            bm2.o1 r7 = r6.D     // Catch: java.lang.Exception -> Laf
            java.util.ArrayList r7 = r7.f103713m     // Catch: java.lang.Exception -> Laf
            int r7 = r7.indexOf(r5)     // Catch: java.lang.Exception -> Laf
            androidx.lifecycle.c1 r8 = r6.P0(r0)     // Catch: java.lang.Exception -> Laf
            mm2.x4 r8 = (mm2.x4) r8     // Catch: java.lang.Exception -> Laf
            int r8 = r8.f411070r     // Catch: java.lang.Exception -> Laf
            androidx.lifecycle.c1 r9 = r6.P0(r0)     // Catch: java.lang.Exception -> Laf
            mm2.x4 r9 = (mm2.x4) r9     // Catch: java.lang.Exception -> Laf
            int r9 = r9.f411069q     // Catch: java.lang.Exception -> Laf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf
            r10.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = "#onStickTopShowingTitleMsgReceived indexInCommentList="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r7)     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = " firstVisible="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r8)     // Catch: java.lang.Exception -> Laf
            java.lang.String r11 = " lastVisible="
            r10.append(r11)     // Catch: java.lang.Exception -> Laf
            r10.append(r9)     // Catch: java.lang.Exception -> Laf
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> Laf
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)     // Catch: java.lang.Exception -> Laf
            if (r7 >= 0) goto L7c
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            goto L27
        L7c:
            int r8 = r8 + 1
            r10 = 0
            if (r8 > r7) goto L85
            if (r7 > r9) goto L85
            r11 = r4
            goto L86
        L85:
            r11 = r10
        L86:
            if (r11 == 0) goto L9c
            android.view.View r11 = r6.f195041u     // Catch: java.lang.Exception -> Laf
            boolean r11 = r11.isShown()     // Catch: java.lang.Exception -> Laf
            if (r11 == 0) goto L9c
            r5 = 0
            p3325xe03a0797.p3326xc267989b.z0.e(r3, r5, r4, r5)     // Catch: java.lang.Exception -> Laf
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            jz5.f0 r13 = jz5.f0.f384359a     // Catch: java.lang.Exception -> Laf
            return r13
        L9c:
            if (r8 > r7) goto La1
            if (r7 > r9) goto La1
            r10 = r4
        La1:
            if (r10 == 0) goto Laa
            com.tencent.mm.plugin.finder.live.plugin.me r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0     // Catch: java.lang.Exception -> Laf
            r6.G1()     // Catch: java.lang.Exception -> Laf
            goto L27
        Laa:
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.u1(r6, r5)     // Catch: java.lang.Exception -> Laf
            goto L27
        Laf:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r5)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qf.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
