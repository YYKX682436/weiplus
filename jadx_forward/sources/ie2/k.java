package ie2;

/* loaded from: classes13.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 f372526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f372527f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372526e = c14180x477b7cf1;
        this.f372527f = c14179xd6e3454a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ie2.k(this.f372526e, this.f372527f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ie2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
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
            int r1 = r10.f372525d
            java.lang.String r2 = "LinearBubbleAnimateContainer"
            r3 = 3
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r6 = r10.f372527f
            com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer r7 = r10.f372526e
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L88
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L7f
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L6b
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "runBubbleShow isNeedAnimateShow: "
            r11.<init>(r1)
            boolean r1 = r7.f193052h
            r11.append(r1)
            java.lang.String r1 = " size = "
            r11.append(r1)
            java.util.LinkedList r1 = r7.f193048d
            int r1 = r1.size()
            r11.append(r1)
            java.lang.String r1 = " curContent = "
            r11.append(r1)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11)
            boolean r11 = r7.f193052h
            r7.e(r11, r6)
            boolean r11 = r7.f193052h
            if (r11 == 0) goto L88
            long r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1.a(r7)
            r10.f372525d = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.k1.b(r8, r10)
            if (r11 != r0) goto L6b
            return r0
        L6b:
            java.lang.String r11 = "runBubbleShow delay end "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r11)
            ie2.h r11 = r6.getSceneStateListener()
            if (r11 == 0) goto L7f
            r10.f372525d = r4
            java.lang.Object r11 = r11.q(r10)
            if (r11 != r0) goto L7f
            return r0
        L7f:
            r10.f372525d = r3
            java.lang.Object r11 = r6.g(r10)
            if (r11 != r0) goto L88
            return r0
        L88:
            java.util.LinkedList r11 = r7.f193049e
            r11.remove(r6)
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1.c(r7)
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ie2.k.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
