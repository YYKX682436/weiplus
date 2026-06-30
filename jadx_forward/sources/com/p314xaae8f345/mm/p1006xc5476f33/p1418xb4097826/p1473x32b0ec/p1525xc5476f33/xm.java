package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class xm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f196638d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f196639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn f196640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f196641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar, ce2.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196640f = bnVar;
        this.f196641g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xm xmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xm(this.f196640f, this.f196641g, interfaceC29045xdcb5ca57);
        xmVar.f196639e = obj;
        return xmVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0022 A[SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f196638d
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r12.f196639e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L21
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f196639e
            kotlinx.coroutines.y0 r13 = (p3325xe03a0797.p3326xc267989b.y0) r13
            r1 = r13
        L21:
            r13 = r12
        L22:
            com.tencent.mm.plugin.finder.live.plugin.bn r3 = r13.f196640f
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f193591v
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r2
            if (r4 == 0) goto Ld2
            boolean r4 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r4 == 0) goto Ld2
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f193591v
            java.lang.Object r4 = r4.poll()
            r45.yv1 r4 = (r45.yv1) r4
            if (r4 != 0) goto L3f
            goto Ld2
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "start random gift animation, animation_id:"
            r5.<init>(r6)
            r6 = 0
            java.lang.String r7 = r4.m75945x2fec8307(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "Finder.FinderLiveGiftPlayPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r5)
            ce2.i r5 = r13.f196641g
            r45.zq4 r5 = r5.f67808xc50d3cee
            r8 = 0
            if (r5 == 0) goto L88
            java.util.LinkedList r5 = r5.m75941xfb821914(r6)
            if (r5 == 0) goto L88
            java.util.Iterator r5 = r5.iterator()
        L68:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r5.next()
            r10 = r9
            r45.yq4 r10 = (r45.yq4) r10
            java.lang.String r10 = r10.m75945x2fec8307(r6)
            java.lang.String r11 = r4.m75945x2fec8307(r6)
            boolean r10 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r10, r11)
            if (r10 == 0) goto L68
            goto L85
        L84:
            r9 = r8
        L85:
            r45.yq4 r9 = (r45.yq4) r9
            goto L89
        L88:
            r9 = r8
        L89:
            if (r9 != 0) goto L91
            java.lang.String r3 = "start random gift animation, multiAnimation null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r3)
            goto L22
        L91:
            boolean r4 = r3.x0()
            if (r4 == 0) goto La5
            r4 = 2
            com.tencent.mm.protobuf.f r4 = r9.m75936x14adae67(r4)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto Lb2
            java.lang.String r4 = r4.m75945x2fec8307(r6)
            goto Lb3
        La5:
            com.tencent.mm.protobuf.f r4 = r9.m75936x14adae67(r2)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto Lb2
            java.lang.String r4 = r4.m75945x2fec8307(r6)
            goto Lb3
        Lb2:
            r4 = r8
        Lb3:
            com.tencent.mm.view.MMPAGView r5 = r3.f193585p
            r6 = 3
            r5.m82584xebcf33cb(r6)
            com.tencent.mm.view.MMPAGView r5 = r3.f193585p
            r5.m82583xcde73672(r2)
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.live.plugin.wm r6 = new com.tencent.mm.plugin.finder.live.plugin.wm
            r6.<init>(r3, r4, r8)
            r13.f196639e = r1
            r13.f196638d = r2
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r13)
            if (r3 != r0) goto L22
            return r0
        Ld2:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xm.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
