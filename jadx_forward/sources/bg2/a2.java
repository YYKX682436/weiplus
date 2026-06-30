package bg2;

/* loaded from: classes3.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f101446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f101447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(bg2.d2 d2Var, r45.hc1 hc1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101446d = d2Var;
        this.f101447e = hc1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.a2(this.f101446d, this.f101447e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.a2 a2Var = (bg2.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.hc1 hc1Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.d2 d2Var = this.f101446d;
        java.util.Iterator it = d2Var.f498674d.f498677d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hc1Var = this.f101447e;
            if (!hasNext) {
                break;
            }
            java.lang.Object obj2 = (tc2.c) it.next();
            tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
            if (hVar != null) {
                hVar.d4(hc1Var);
            }
        }
        for (java.lang.Object obj3 : d2Var.f498674d.f498677d) {
            tc2.h hVar2 = obj3 instanceof tc2.h ? (tc2.h) obj3 : null;
            if (hVar2 != null) {
                hVar2.mo10403x39a513b7(hc1Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
