package e0;

/* loaded from: classes14.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f327068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f327069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f327070f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e0.f1 f1Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f327068d = f1Var;
        this.f327069e = i17;
        this.f327070f = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e0.d1(this.f327068d, this.f327069e, this.f327070f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        e0.d1 d1Var = (e0.d1) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        d1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        e0.f1 f1Var = this.f327068d;
        e0.z0 z0Var = f1Var.f327108a;
        z0Var.a(this.f327069e, this.f327070f);
        z0Var.f327268f = null;
        e0.q qVar = (e0.q) ((n0.q4) f1Var.f327119l).mo128745x754a37bb();
        if (qVar != null) {
            ((java.util.LinkedHashMap) qVar.f327204c).clear();
            qVar.f327205d = kz5.q0.f395534d;
            qVar.f327206e = -1;
            qVar.f327207f = 0;
            qVar.f327208g = -1;
            qVar.f327209h = 0;
        }
        s1.r1 r1Var = f1Var.f327117j;
        if (r1Var != null) {
            ((u1.w) r1Var).h();
        }
        return jz5.f0.f384359a;
    }
}
