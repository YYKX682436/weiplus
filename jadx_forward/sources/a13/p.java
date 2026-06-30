package a13;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f82098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f82099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a13.t tVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82098d = tVar;
        this.f82099e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a13.p(this.f82098d, this.f82099e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        a13.p pVar = (a13.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        b13.m mVar = this.f82098d.f82110m;
        if (mVar != null) {
            boolean z17 = this.f82099e;
            mVar.o0(z17 ? 3 : 4);
            mVar.z0(z17 ? "Speaker" : "Receiver", 20);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onSpeakerStateChanged, isSpeakerOn: %b", java.lang.Boolean.valueOf(z17));
            vq4.m0 m0Var = (vq4.m0) mVar.f257906d;
            m0Var.getClass();
            if (mx3.f0.h()) {
                if (m0Var.C) {
                    m0Var.f520888s = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                    m0Var.f520887r = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                } else {
                    m0Var.f520888s = z17 ? new cv.v0(1, null, 0, 6, null) : new cv.v0(2, null, 0, 6, null);
                }
            }
            if (z17) {
                m0Var.l(1, true);
            } else {
                m0Var.l(2, true);
            }
            m0Var.f520885p = true;
        }
        return jz5.f0.f384359a;
    }
}
