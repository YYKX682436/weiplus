package b0;

/* loaded from: classes14.dex */
public final class z2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ float f98154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f98155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f98156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(n0.v2 v2Var, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f98155e = v2Var;
        this.f98156f = e5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj2).floatValue();
        b0.z2 z2Var = new b0.z2(this.f98155e, this.f98156f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        z2Var.f98154d = floatValue;
        jz5.f0 f0Var = jz5.f0.f384359a;
        z2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.d(((o1.e) this.f98155e.mo128745x754a37bb()).d(), null, null, new b0.y2(this.f98156f, this.f98154d, null), 3, null);
        return jz5.f0.f384359a;
    }
}
