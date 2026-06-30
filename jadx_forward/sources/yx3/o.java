package yx3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f549450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey3.a f549451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yx3.v vVar, ey3.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549450d = vVar;
        this.f549451e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx3.o(this.f549450d, this.f549451e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx3.o oVar = (yx3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do vibrate ");
        yx3.v vVar = this.f549450d;
        sb6.append(vVar.f549475b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", sb6.toString());
        ao4.b bVar = vVar.f549490q;
        if (bVar != null) {
            bVar.a(this.f549451e, new yx3.n(vVar));
        }
        ao4.b bVar2 = vVar.f549490q;
        if (bVar2 != null) {
            bVar2.b();
        }
        return jz5.f0.f384359a;
    }
}
