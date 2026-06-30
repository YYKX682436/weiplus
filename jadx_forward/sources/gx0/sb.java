package gx0;

/* loaded from: classes5.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358483d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358485f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gx0.sb sbVar = new gx0.sb(this.f358485f, interfaceC29045xdcb5ca57);
        sbVar.f358484e = obj;
        return sbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.sb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358483d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f358484e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ex0.q qVar : this.f358485f.f338630g.f338712g) {
                if (!(!(qVar.f338697s.length == 0))) {
                    qVar.b(vu0.u.f521696h);
                    arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new gx0.rb(qVar, null), 3, null));
                }
            }
            this.f358483d = 1;
            obj = p3325xe03a0797.p3326xc267989b.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
