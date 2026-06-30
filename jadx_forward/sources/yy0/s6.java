package yy0;

/* loaded from: classes5.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f549854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 f549855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(yy0.m7 m7Var, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4000x86998277 c4000x86998277, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549854d = m7Var;
        this.f549855e = c4000x86998277;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yy0.s6(this.f549854d, this.f549855e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yy0.s6 s6Var = (yy0.s6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f549854d.f549758d, "notifySCSelectBeautyParam, beautyDesc: presetID=" + this.f549855e.m32548x2fc1edb0() + ", skinSmoothness=" + this.f549855e.m32550x53670f58() + ", twowayBrightRate=" + this.f549855e.m32553x58d12bf3() + ", faceSlimness=" + this.f549855e.m32532x8c4bad07() + ", eyeEnhancement=" + this.f549855e.m32530xeb0e2311() + ", noseShrinkage=" + this.f549855e.m32545x6106d40d() + ", smileFoldReduction=" + this.f549855e.m32551xff25c340() + ", lipShape=" + this.f549855e.m32536xc5289e44() + ", eyeDistanceFactor=" + this.f549855e.m32529xc3ef997f() + ", cheekboneShrinkage=" + this.f549855e.m32524x43a50a62() + ", innerEyeCorner=" + this.f549855e.m32534x4b7c1f26());
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4082xa6fd740c c4082xa6fd740c = this.f549854d.f549761g;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (c4082xa6fd740c != null) {
            c4082xa6fd740c.Y1(this.f549855e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f549854d.f549758d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
