package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f213513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f213514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f213515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5 f5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f213514e = f5Var;
        this.f213515f = c14994x9b99c079;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e5(this.f213514e, this.f213515f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f213513d
            r2 = 0
            com.tencent.mm.plugin.finder.view.f5 r3 = r6.f213514e
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L30
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r7 = r3.f213600a
            if (r7 == 0) goto L37
            com.tencent.mm.plugin.finder.feed.a7 r7 = r7.getPresenter()
            if (r7 == 0) goto L37
            r6.f213513d = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r6.f213515f
            java.lang.Object r7 = r7.J0(r1, r6)
            if (r7 != r0) goto L30
            return r0
        L30:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L38
        L37:
            r7 = r2
        L38:
            if (r7 == 0) goto Lba
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r7 = r3.f213600a
            if (r7 == 0) goto Lba
            com.tencent.mm.plugin.finder.feed.a7 r7 = r7.getPresenter()
            if (r7 == 0) goto Lba
            yw2.a0 r0 = r7.f187749o
            if (r0 == 0) goto Lba
            android.widget.TextView r0 = r0.f548143f
            if (r0 == 0) goto Lb3
            com.tencent.mm.plugin.finder.feed.f7 r1 = r7.X
            java.lang.String r3 = "Finder.DrawerPresenter"
            if (r1 == 0) goto L76
            com.tencent.mm.plugin.finder.feed.e7 r1 = r1.f188242a
            com.tencent.mm.plugin.finder.feed.e7 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e7.f188166e
            if (r1 != r5) goto L5a
            r1 = r4
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 != r4) goto L5f
            r1 = r4
            goto L60
        L5f:
            r1 = r2
        L60:
            if (r1 != 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showEducationPopupWindow but curCommentSelectType="
            r0.<init>(r1)
            com.tencent.mm.plugin.finder.feed.f7 r7 = r7.X
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r7)
            goto Lba
        L76:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_COMMENT_SELECT_EDUCATION_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.m(r5, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 > 0) goto Lad
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.x(r5, r2)
            com.tencent.mm.plugin.finder.feed.g6 r1 = new com.tencent.mm.plugin.finder.feed.g6
            r1.<init>(r7, r0)
            r0.post(r1)
            goto Lba
        Lad:
            java.lang.String r7 = "showEducationPopupWindow but have show!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            goto Lba
        Lb3:
            java.lang.String r7 = "headerTitleTv"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r7)
            r7 = 0
            throw r7
        Lba:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e5.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
