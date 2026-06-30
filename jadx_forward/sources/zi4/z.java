package zi4;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f554811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f554812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(zi4.g0 g0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554811e = g0Var;
        this.f554812f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zi4.z zVar = new zi4.z(this.f554811e, this.f554812f, interfaceC29045xdcb5ca57);
        zVar.f554810d = obj;
        return zVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zi4.z zVar = (zi4.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f554810d;
        java.util.Map map = zi4.g0.f554747g;
        zi4.g0 g0Var = this.f554811e;
        boolean z17 = g0Var.f554748a != null;
        yz5.a aVar2 = this.f554812f;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new zi4.y(aVar2, null), 2, null);
        } else {
            ((java.util.ArrayList) g0Var.f554753f).add(aVar2);
        }
        return jz5.f0.f384359a;
    }
}
