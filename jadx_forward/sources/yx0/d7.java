package yx0;

/* loaded from: classes5.dex */
public final class d7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 f548788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f548789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.o f548791i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f548792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(yx0.b8 b8Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.l lVar, yx0.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548787e = b8Var;
        this.f548788f = c4116xf4b2c356;
        this.f548789g = h0Var;
        this.f548790h = lVar;
        this.f548791i = oVar;
        this.f548792m = c16997xb0aa383a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.d7(this.f548787e, this.f548788f, this.f548789g, this.f548790h, this.f548791i, this.f548792m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
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
            int r1 = r6.f548786d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L8a
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L3b
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            yx0.b8 r7 = r6.f548787e
            com.tencent.maas.model.MJMusicInfo r1 = r6.f548788f
            java.util.concurrent.locks.ReentrantLock r5 = yx0.b8.f548704c2
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = r7.w0(r1)
            yx0.b8 r1 = r6.f548787e
            pp0.p0 r1 = r1.K
            if (r1 == 0) goto L42
            r6.f548786d = r4
            java.lang.Object r7 = r1.r(r7, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 != 0) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "switchMusic >> but setMusic is error "
            r7.<init>(r0)
            kotlin.jvm.internal.h0 r0 = r6.f548789g
            java.lang.Object r0 = r0.f391656d
            java.lang.String r0 = (java.lang.String) r0
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            yx0.b8 r7 = r6.f548787e
            yx0.v r0 = yx0.v.f549228f
            java.util.concurrent.locks.ReentrantLock r1 = yx0.b8.f548704c2
            r7.q0(r0)
            yz5.l r7 = r6.f548790h
            if (r7 == 0) goto L70
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.mo146xb9724478(r0)
        L70:
            return r2
        L71:
            yx0.b8 r7 = r6.f548787e
            pp0.p0 r1 = r7.K
            if (r1 == 0) goto L7c
            com.tencent.maas.camstudio.MJCamMusicDesc r1 = r1.k()
            goto L7d
        L7c:
            r1 = 0
        L7d:
            r7.T = r1
            yx0.b8 r7 = r6.f548787e
            r6.f548786d = r3
            java.lang.Object r7 = yx0.b8.o(r7, r6)
            if (r7 != r0) goto L8a
            return r0
        L8a:
            yx0.b8 r7 = r6.f548787e
            yx0.o r0 = r6.f548791i
            yx0.o r1 = yx0.o.f549019d
            if (r0 != r1) goto L95
            yx0.r r0 = yx0.r.f549131a
            goto L9f
        L95:
            yx0.s r1 = new yx0.s
            com.tencent.maas.model.MJMusicInfo r3 = r6.f548788f
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r6.f548792m
            r1.<init>(r3, r0, r4)
            r0 = r1
        L9f:
            r7.U = r0
            yx0.b8 r7 = r6.f548787e
            yx0.v r0 = yx0.v.f549228f
            r7.q0(r0)
            yz5.l r7 = r6.f548790h
            if (r7 == 0) goto Lb1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.mo146xb9724478(r0)
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.d7.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
