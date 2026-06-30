package l0;

/* loaded from: classes14.dex */
public final class k2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f395856d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ float f395857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l0.a3 a3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f395858f = a3Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        float floatValue = ((java.lang.Number) obj2).floatValue();
        l0.k2 k2Var = new l0.k2(this.f395858f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        k2Var.f395856d = (p3325xe03a0797.p3326xc267989b.y0) obj;
        k2Var.f395857e = floatValue;
        jz5.f0 f0Var = jz5.f0.f384359a;
        k2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) this.f395856d, null, null, new l0.j2(this.f395858f, this.f395857e, null), 3, null);
        return jz5.f0.f384359a;
    }
}
