package cw2;

/* loaded from: classes10.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305101d;

    /* renamed from: e, reason: collision with root package name */
    public int f305102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f305103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf f305104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(rm5.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f305103f = vVar;
        this.f305104g = c15189x4abd2ecf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw2.a8(this.f305103f, this.f305104g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.a8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f305102e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305104g;
        rm5.v vVar = this.f305103f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var2.f391656d = vVar.f479119n;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            cw2.z7 z7Var = new cw2.z7(vVar, c15189x4abd2ecf, h0Var2, null);
            this.f305101d = h0Var2;
            this.f305102e = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, z7Var, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f305101d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        vVar.f479119n = (android.graphics.Bitmap) h0Var.f391656d;
        c15189x4abd2ecf.K = false;
        super/*com.tencent.mm.videocomposition.play.VideoCompositionPlayView*/.o(vVar);
        return jz5.f0.f384359a;
    }
}
