package sx3;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f495084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.g f495085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sx3.m mVar, ox3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495084d = mVar;
        this.f495085e = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sx3.c(this.f495084d, this.f495085e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sx3.c cVar = (sx3.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r3 == true) goto L27;
     */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            sx3.m r11 = r10.f495084d
            com.tencent.mm.view.refreshLayout.WxRefreshLayout r0 = r11.O6()
            r1 = 1
            r0.e(r1)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r11.f495101g
            r2 = 0
            if (r0 == 0) goto L1f
            java.util.List r0 = r0.m82898xfb7e5820()
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            goto L20
        L1f:
            r0 = r2
        L20:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = r11.f495101g
            ox3.g r4 = r10.f495085e
            if (r3 == 0) goto L59
            java.util.List r3 = r3.m82898xfb7e5820()
            if (r3 == 0) goto L59
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L34
        L32:
            r3 = r1
            goto L56
        L34:
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r3.next()
            ox3.f r5 = (ox3.f) r5
            long r6 = r4.mo2128x1ed62e84()
            long r8 = r5.mo2128x1ed62e84()
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L52
            r5 = r1
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 == 0) goto L38
            r3 = r2
        L56:
            if (r3 != r1) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L69
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = r11.f495101g
            if (r1 == 0) goto L69
            java.util.List r1 = r1.m82898xfb7e5820()
            if (r1 == 0) goto L69
            r1.add(r4)
        L69:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = r11.f495101g
            if (r11 == 0) goto L70
            r11.m8149x8b456734(r0)
        L70:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sx3.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
