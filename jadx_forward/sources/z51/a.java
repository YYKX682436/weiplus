package z51;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.c f551702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq.u0 f551703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z51.c cVar, aq.u0 u0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551702d = cVar;
        this.f551703e = u0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z51.a(this.f551702d, this.f551703e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        z51.a aVar = (z51.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        z51.c cVar = this.f551702d;
        aq.u0 u0Var = this.f551703e;
        cVar.f551710i = u0Var;
        if (u0Var.f94508a.f94493a) {
            cVar.f551709h = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get videoData success mediaId: ");
            a61.c cVar2 = cVar.f551707f;
            if (cVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
            sb6.append(cVar2.f83255d);
            cVar.f(sb6.toString());
        } else {
            cVar.f551709h = false;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("get videoData mediaIdL ");
            a61.c cVar3 = cVar.f551707f;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                throw null;
            }
            sb7.append(cVar3.f83255d);
            sb7.append(" error code: ");
            sb7.append(u0Var.f94508a.f94494b);
            cVar.e(sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
