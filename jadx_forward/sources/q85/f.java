package q85;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q85.g f442333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q85.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442333d = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q85.f(this.f442333d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        q85.f fVar = (q85.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        q85.g gVar = this.f442333d;
        pk4.d dVar = gVar.f442340i;
        if (dVar != null) {
            if (dVar != null) {
                dVar.m158663x360a109e(null);
            }
            pk4.d dVar2 = gVar.f442340i;
            if (dVar2 != null) {
                dVar2.m158666x360802();
            }
            java.util.List list = q85.g.f442334o;
            pk4.d dVar3 = gVar.f442340i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar3);
            list.add(dVar3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiscroMsg.PlayerState", "onForgotten recycler :" + list.size() + ' ');
        }
        return jz5.f0.f384359a;
    }
}
