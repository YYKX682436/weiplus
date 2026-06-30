package kj2;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f389935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kj2.o oVar, r45.x71 x71Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f389934d = oVar;
        this.f389935e = x71Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kj2.h(this.f389934d, this.f389935e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kj2.h hVar = (kj2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        kj2.o oVar = this.f389934d;
        oVar.f389960f.clear();
        java.util.ArrayList arrayList = oVar.f389960f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        r45.x71 x71Var = this.f389935e;
        arrayList2.addAll(x71Var.m75941xfb821914(1));
        arrayList.addAll(arrayList2);
        kj2.o.a(oVar, oVar.f389960f, x71Var);
        return jz5.f0.f384359a;
    }
}
