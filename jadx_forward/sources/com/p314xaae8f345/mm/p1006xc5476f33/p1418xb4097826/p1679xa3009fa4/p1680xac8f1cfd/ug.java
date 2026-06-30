package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ug extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f217668d;

    /* renamed from: e, reason: collision with root package name */
    public int f217669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f217670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f217671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(boolean z17, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217670f = z17;
        this.f217671g = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ug(this.f217670f, this.f217671g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ug) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
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
            int r1 = r6.f217669e
            androidx.appcompat.app.AppCompatActivity r2 = r6.f217671g
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r0 = r6.f217668d
            com.tencent.mm.protobuf.g r0 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L74
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            kotlinx.coroutines.flow.j2 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215414e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ig.f216273e
            kotlinx.coroutines.flow.h3 r7 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r7
            r7.k(r1)
            boolean r7 = r6.f217670f
            r1 = 0
            if (r7 == 0) goto L5f
            kotlinx.coroutines.flow.j2 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215415f
            kotlinx.coroutines.flow.h3 r7 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r7
            java.lang.Object r7 = r7.mo144003x754a37bb()
            bw5.ig r7 = (bw5.ig) r7
            if (r7 == 0) goto L41
            int r4 = r7.f110105e
            if (r4 == 0) goto L41
            com.tencent.mm.protobuf.g r7 = r7.m12152x44e5026c()
            goto L60
        L41:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestOftenReadAuthor loadMore refresh: old.continueFlag="
            r4.<init>(r5)
            if (r7 == 0) goto L52
            int r7 = r7.f110105e
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r7)
            goto L53
        L52:
            r5 = r1
        L53:
            r4.append(r5)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "Finder.FollowAggregationRepo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r7)
        L5f:
            r7 = r1
        L60:
            kotlinx.coroutines.p0 r4 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.plugin.finder.viewmodel.component.tg r5 = new com.tencent.mm.plugin.finder.viewmodel.component.tg
            r5.<init>(r2, r7, r1)
            r6.f217668d = r7
            r6.f217669e = r3
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r6)
            if (r1 != r0) goto L72
            return r0
        L72:
            r0 = r7
            r7 = r1
        L74:
            bw5.ig r7 = (bw5.ig) r7
            kotlinx.coroutines.flow.j2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215414e
            com.tencent.mm.plugin.finder.viewmodel.component.ig r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ig.f216274f
            kotlinx.coroutines.flow.h3 r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r1
            r1.k(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.bh r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.a(r1, r2, r7, r0)
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ug.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
