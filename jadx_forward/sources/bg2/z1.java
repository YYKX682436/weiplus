package bg2;

/* loaded from: classes3.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f102214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r71 f102215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(bg2.d2 d2Var, r45.r71 r71Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102214d = d2Var;
        this.f102215e = r71Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.z1(this.f102214d, this.f102215e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.z1 z1Var = (bg2.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.r71 r71Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.d2 d2Var = this.f102214d;
        java.util.Iterator it = d2Var.f498674d.f498677d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r71Var = this.f102215e;
            if (!hasNext) {
                break;
            }
            java.lang.Object obj2 = (tc2.c) it.next();
            tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
            if (hVar != null) {
                hVar.H0(r71Var);
            }
        }
        for (java.lang.Object obj3 : d2Var.f498674d.f498677d) {
            tc2.h hVar2 = obj3 instanceof tc2.h ? (tc2.h) obj3 : null;
            if (hVar2 != null) {
                hVar2.mo10406x5aa1c816(r71Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
