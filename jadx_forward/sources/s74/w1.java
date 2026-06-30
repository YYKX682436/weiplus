package s74;

/* loaded from: classes4.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f486107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f486108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f486109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f486111h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s74.o2 o2Var, java.lang.String str, s74.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f486108e = c17933xe8d1b226;
        this.f486109f = o2Var;
        this.f486110g = str;
        this.f486111h = f3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        s74.w1 w1Var = new s74.w1(this.f486108e, this.f486109f, this.f486110g, this.f486111h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        return w1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        java.lang.Object mo150x989b7ca4 = ((s74.w1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onBindDynamicComponent$2$4"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            pz5.a r3 = pz5.a.f440719d
            int r4 = r0.f486107d
            r5 = 1
            if (r4 == 0) goto L23
            if (r4 != r5) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto Lce
        L18:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            throw r3
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f486108e
            boolean r4 = i64.y.i(r4)
            if (r4 == 0) goto Lce
            i64.y r4 = i64.y.f370890d
            s74.o2 r6 = r0.f486109f
            s74.f3 r6 = r6.D()
            r4.getClass()
            java.lang.String r7 = "updateProductWithLocalCache"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            java.lang.String r9 = r0.f486110g
            if (r6 != 0) goto L4c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
        L48:
            r5 = r1
            r16 = r2
            goto Laf
        L4c:
            if (r9 != 0) goto L52
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            goto L48
        L52:
            java.util.concurrent.ConcurrentHashMap r10 = i64.y.f370892f
            java.lang.Object r10 = r10.get(r9)
            i64.x r10 = (i64.x) r10
            if (r10 != 0) goto L60
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            goto L48
        L60:
            java.lang.String r11 = r4.d()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "updateAdFinderLivingProductWithLocalCache, snsId="
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r13 = ", component.size="
            r12.append(r13)
            java.lang.String r13 = "getAttrArray"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.model.AdFinderLiveProductModelManager$LivingProductResp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r14)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r14)
            org.json.JSONArray r15 = r10.f370887c
            int r5 = r15.length()
            r12.append(r5)
            java.lang.String r5 = ", productId="
            r12.append(r5)
            java.lang.String r5 = "getProductId"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r14)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r14)
            r5 = r1
            r16 = r2
            long r1 = r10.f370886b
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r14)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r14)
            r4.k(r6, r15)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
        Laf:
            kotlinx.coroutines.flow.j r1 = r4.e(r9)
            s74.v1 r2 = new s74.v1
            s74.f3 r4 = r0.f486111h
            r2.<init>(r4, r9)
            r4 = 1
            r0.f486107d = r4
            kotlinx.coroutines.flow.h3 r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r1
            java.lang.Object r1 = r1.a(r2, r0)
            if (r1 != r3) goto Lcb
            r1 = r16
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            return r3
        Lcb:
            r1 = r16
            goto Ld0
        Lce:
            r5 = r1
            r1 = r2
        Ld0:
            jz5.f0 r2 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.w1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
