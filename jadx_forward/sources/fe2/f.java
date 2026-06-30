package fe2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f343042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.h f343043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList arrayList, fe2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f343042d = arrayList;
        this.f343043e = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fe2.f(this.f343042d, this.f343043e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fe2.f fVar = (fe2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = (java.lang.String) kz5.n0.i0(this.f343042d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        fe2.h hVar = this.f343043e;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) hVar.P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxGroupHintPlugin", "share to same group, do nothing");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
            if (xVar.g(str) || xVar.h(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxGroupHintPlugin", "share to invalid group, do nothing");
            } else {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new fe2.g(hVar, str, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
