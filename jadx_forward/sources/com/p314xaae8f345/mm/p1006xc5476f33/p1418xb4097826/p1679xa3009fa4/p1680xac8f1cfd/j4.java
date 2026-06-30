package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l13 f216339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f216341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 f216342g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(r45.l13 l13Var, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 q4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216339d = l13Var;
        this.f216340e = str;
        this.f216341f = i17;
        this.f216342g = q4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j4(this.f216339d, this.f216340e, this.f216341f, this.f216342g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j4 j4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String m75945x2fec8307 = this.f216339d.m75945x2fec8307(3);
        if (m75945x2fec8307 != null) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.H1.a(this.f216340e, this.f216341f);
            if (a17.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.U1.put(a17, m75945x2fec8307);
            }
            this.f216342g.Y6(m75945x2fec8307);
        }
        return jz5.f0.f384359a;
    }
}
