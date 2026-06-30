package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class o4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f191894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13961x4185f9c0 f191895e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13961x4185f9c0 activityC13961x4185f9c0, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f191895e = activityC13961x4185f9c0;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o4(this.f191895e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f191894d
            r2 = 1
            com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI r3 = r10.f191895e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L2c
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            yl2.g1 r4 = r3.B
            if (r4 == 0) goto L2f
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r10.f191894d = r2
            r7 = r10
            java.lang.Object r11 = yl2.g1.t(r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L2c
            return r0
        L2c:
            yl2.a0 r11 = (yl2.a0) r11
            goto L30
        L2f:
            r11 = 0
        L30:
            boolean r0 = r11 instanceof yl2.x
            if (r0 == 0) goto L4c
            java.lang.String r0 = r3.f190810w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "startLiveCheck failed, errCode:"
            r1.<init>(r2)
            yl2.x r11 = (yl2.x) r11
            int r11 = r11.f544614a
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r11)
            goto La7
        L4c:
            boolean r0 = r11 instanceof yl2.z
            if (r0 == 0) goto L63
            java.lang.String r0 = r3.f190810w
            java.lang.String r1 = "startLiveCheck continueLive"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            yl2.g1 r0 = r3.B
            if (r0 == 0) goto La7
            yl2.z r11 = (yl2.z) r11
            yl2.k r11 = r11.f544620a
            r0.d(r11)
            goto La7
        L63:
            boolean r11 = r11 instanceof yl2.y
            if (r11 == 0) goto La7
            java.lang.String r11 = r3.f190810w
            java.lang.String r0 = "startLiveCheck success"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r0)
            androidx.appcompat.app.AppCompatActivity r11 = r3.mo55332x76847179()
            java.lang.String r0 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r0)
            pf5.z r0 = pf5.z.f435481a
            pf5.v r11 = r0.a(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.h> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h.class
            androidx.lifecycle.c1 r11 = r11.a(r0)
            com.tencent.mm.plugin.finder.live.viewmodel.h r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h) r11
            java.lang.String r0 = r11.f198652d
            java.lang.String r1 = "jumpGamePostUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r11.f198654f     // Catch: java.lang.Throwable -> La0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La0
            com.tencent.mm.plugin.finder.assist.w7 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a     // Catch: java.lang.Throwable -> La0
            java.lang.String r11 = r11.f198653e     // Catch: java.lang.Throwable -> La0
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
            r4.d(r2, r11, r5)     // Catch: java.lang.Throwable -> La0
            goto La7
        La0:
            r11 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r11, r1, r2)
        La7:
            r3.finish()
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
