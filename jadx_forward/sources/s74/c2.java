package s74;

/* loaded from: classes4.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f485759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z74.b f485761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f485762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f485763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(s74.o2 o2Var, z74.b bVar, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485760e = o2Var;
        this.f485761f = bVar;
        this.f485762g = i17;
        this.f485763h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        s74.c2 c2Var = new s74.c2(this.f485760e, this.f485761f, this.f485762g, this.f485763h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        return c2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        java.lang.Object mo150x989b7ca4 = ((s74.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$onVideoEvent$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r13.f485759d
            jz5.f0 r4 = jz5.f0.f384359a
            r5 = 1
            if (r3 == 0) goto L23
            if (r3 != r5) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L9a
        L18:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r14
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            s74.o2 r14 = r13.f485760e
            java.lang.String r3 = r14.j()
            java.lang.String r6 = "the video event it is going to send"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            java.lang.String r3 = "access$getTemplateEventHelper$p"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r6)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r6)
            r13.f485759d = r5
            s74.b3 r14 = r14.L
            r14.getClass()
            java.lang.String r3 = "emitVideoEvent"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicTemplateEventHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            z74.b r6 = z74.b.f552120g
            z74.b r7 = r13.f485761f
            if (r7 != r6) goto L90
            kotlinx.coroutines.flow.i2 r14 = r14.f485751a
            s74.z2 r12 = new s74.z2
            r7 = 0
            java.lang.String r8 = "onPlayEnd"
            java.lang.Integer r6 = new java.lang.Integer
            int r9 = r13.f485762g
            r6.<init>(r9)
            jz5.l r9 = new jz5.l
            java.lang.String r10 = "video_duration"
            r9.<init>(r10, r6)
            java.lang.Integer r6 = new java.lang.Integer
            int r10 = r13.f485763h
            r6.<init>(r10)
            jz5.l r10 = new jz5.l
            java.lang.String r11 = "video_progress"
            r10.<init>(r11, r6)
            jz5.l[] r6 = new jz5.l[]{r9, r10}
            java.util.Map r9 = kz5.c1.k(r6)
            r10 = 1
            r11 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            kotlinx.coroutines.flow.q2 r14 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) r14
            java.lang.Object r14 = r14.mo771x2f8fd3(r12, r13)
            if (r14 != r2) goto L90
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            goto L94
        L90:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            r14 = r4
        L94:
            if (r14 != r2) goto L9a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L9a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.c2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
