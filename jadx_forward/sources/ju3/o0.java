package ju3;

/* loaded from: classes10.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f383517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 f383518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383518e = c17018x4aa057d6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ju3.o0(this.f383518e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean booleanValue;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f383517d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17018x4aa057d6 c17018x4aa057d6 = this.f383518e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveCameraKitPluginLayout", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3.f33784x24728b);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ju3.n0 n0Var = new ju3.n0(c17018x4aa057d6, null);
            this.f383517d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, n0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    nu3.m mVar = nu3.m.f421762a;
                    mVar.t(android.os.SystemClock.elapsedRealtime());
                    mVar.p(booleanValue);
                    return jz5.f0.f384359a;
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                nu3.m mVar2 = nu3.m.f421762a;
                mVar2.t(android.os.SystemClock.elapsedRealtime());
                mVar2.p(booleanValue);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = ((-c17018x4aa057d6.getOrientationPlugin().f547252f) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        boolean a17 = c17018x4aa057d6.getOrientationPlugin().a();
        c17018x4aa057d6.getCameraUsage().mo9386xf597288(c17018x4aa057d6.getSwitchFlashPlugin().f546880f == yt3.c.f546906d);
        if (c17018x4aa057d6.getEnableLandscape()) {
            lu3.m recorder = c17018x4aa057d6.getRecorder();
            this.f383517d = 2;
            obj = recorder.i(0, false, this);
            if (obj == aVar) {
                return aVar;
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            nu3.m mVar22 = nu3.m.f421762a;
            mVar22.t(android.os.SystemClock.elapsedRealtime());
            mVar22.p(booleanValue);
            return jz5.f0.f384359a;
        }
        lu3.m recorder2 = c17018x4aa057d6.getRecorder();
        this.f383517d = 3;
        obj = recorder2.i(i18, a17, this);
        if (obj == aVar) {
            return aVar;
        }
        booleanValue = ((java.lang.Boolean) obj).booleanValue();
        nu3.m mVar222 = nu3.m.f421762a;
        mVar222.t(android.os.SystemClock.elapsedRealtime());
        mVar222.p(booleanValue);
        return jz5.f0.f384359a;
    }
}
