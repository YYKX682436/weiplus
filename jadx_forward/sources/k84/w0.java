package k84;

/* loaded from: classes4.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f386836d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f386837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(k84.q1 q1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386838f = q1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        k84.w0 w0Var = new k84.w0(this.f386838f, interfaceC29045xdcb5ca57);
        w0Var.f386837e = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        return w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        java.lang.Object mo150x989b7ca4 = ((k84.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0057 -> B:5:0x005d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startCheckContinuousEnd$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r12.f386836d
            r4 = 1
            if (r3 == 0) goto L25
            if (r3 != r4) goto L1a
            java.lang.Object r3 = r12.f386837e
            kotlinx.coroutines.y0 r3 = (p3325xe03a0797.p3326xc267989b.y0) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            goto L5d
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r13
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f386837e
            kotlinx.coroutines.y0 r13 = (p3325xe03a0797.p3326xc267989b.y0) r13
            long r5 = java.lang.System.currentTimeMillis()
            r3 = r13
            r13 = r12
        L32:
            k84.l r7 = k84.q1.Y
            java.lang.String r7 = "access$getContinuousEndTime$p"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            k84.q1 r9 = r13.f386838f
            long r10 = r9.V
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 >= 0) goto L62
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r8)
            long r9 = r9.V
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r8)
            long r9 = r9 - r5
            r13.f386837e = r3
            r13.f386836d = r4
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r9, r13)
            if (r5 != r2) goto L5d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L5d:
            long r5 = java.lang.System.currentTimeMillis()
            goto L32
        L62:
            boolean r13 = p3325xe03a0797.p3326xc267989b.z0.h(r3)
            if (r13 == 0) goto Ld2
            java.lang.String r13 = "access$setContinuousCount$p"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r8)
            r9.N = r4
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r8)
            java.lang.String r13 = "getContinuousCountAnim"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r8)
            android.animation.ValueAnimator r2 = r9.M
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r8)
            if (r2 == 0) goto L81
            r2.end()
        L81:
            java.lang.String r13 = "getContinuousBreezeAnim"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r8)
            android.animation.ValueAnimator r2 = r9.L
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r8)
            if (r2 == 0) goto L90
            r2.cancel()
        L90:
            android.view.ViewGroup r13 = r9.H()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L99
            goto L9c
        L99:
            r13.setScaleX(r2)
        L9c:
            android.view.ViewGroup r13 = r9.H()
            if (r13 != 0) goto La3
            goto La6
        La3:
            r13.setScaleY(r2)
        La6:
            android.view.ViewGroup r13 = r9.I()
            if (r13 != 0) goto Lad
            goto Lb0
        Lad:
            r13.setScaleX(r2)
        Lb0:
            android.view.ViewGroup r13 = r9.I()
            if (r13 != 0) goto Lb7
            goto Lba
        Lb7:
            r13.setScaleY(r2)
        Lba:
            java.lang.String r13 = r9.j()
            java.lang.String r2 = "continuousLikeStateFlow startCheckContinuousEnd!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r13, r2)
            kotlinx.coroutines.flow.j2 r13 = k84.q1.z(r9)
            k84.m r2 = new k84.m
            r3 = 0
            r2.<init>(r4, r3, r3)
            kotlinx.coroutines.flow.h3 r13 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r13
            r13.k(r2)
        Ld2:
            jz5.f0 r13 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.w0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
