package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f256271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f256272e;

    /* renamed from: f, reason: collision with root package name */
    public int f256273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0 f256274g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f256275h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f256276i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f256277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.e0 e0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f256274g = e0Var;
        this.f256275h = z17;
        this.f256276i = interfaceC29045xdcb5ca57;
        this.f256277m = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.b0(this.f256274g, this.f256275h, this.f256276i, this.f256277m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:5:0x0056). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f256273f
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = "MicroMsg.TingFloatBallAnimationUICWrapper"
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 != r4) goto L1d
            java.lang.Object r1 = r9.f256272e
            com.tencent.mm.plugin.ting.uic.i r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i) r1
            java.lang.Object r5 = r9.f256271d
            java.util.Iterator r5 = (java.util.Iterator) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r9
            goto L56
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.plugin.ting.uic.e0 r10 = r9.f256274g
            java.util.ArrayList r10 = r10.O6()
            java.util.Iterator r10 = r10.iterator()
            r5 = r10
            r10 = r9
        L34:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r5.next()
            com.tencent.mm.plugin.ting.uic.i r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i) r1
            r10.f256271d = r5
            r10.f256272e = r1
            r10.f256273f = r4
            boolean r6 = r10.f256275h
            r7 = 0
            java.lang.Object r6 = r1.d(r6, r7, r10)
            if (r6 != r0) goto L50
            return r0
        L50:
            r8 = r0
            r0 = r10
            r10 = r6
            r6 = r5
            r5 = r1
            r1 = r8
        L56:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7d
            java.lang.Class r10 = r5.getClass()
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r1 = "exitWithAnimation handled by "
            java.lang.String r10 = r1.concat(r10)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)
            kotlin.coroutines.Continuation r0 = r0.f256276i
            r0.mo48700xdecd0e93(r10)
            return r2
        L7d:
            r10 = r0
            r0 = r1
            r5 = r6
            goto L34
        L81:
            java.lang.String r0 = "exitWithAnimation handled: false"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
            kotlin.coroutines.Continuation r1 = r10.f256276i
            r1.mo48700xdecd0e93(r0)
            boolean r0 = r10.f256277m
            if (r0 == 0) goto La0
            com.tencent.mm.plugin.ting.uic.e0 r10 = r10.f256274g
            androidx.appcompat.app.AppCompatActivity r10 = r10.m158354x19263085()
            r10.finish()
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.b0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
