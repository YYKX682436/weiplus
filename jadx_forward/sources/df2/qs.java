package df2;

/* loaded from: classes3.dex */
public final class qs extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.h f312718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(dk2.h hVar, df2.lt ltVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312718d = hVar;
        this.f312719e = ltVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qs(this.f312718d, this.f312719e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.qs qsVar = (df2.qs) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qsVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList d17 = kz5.c0.d(this.f312718d);
        df2.lt ltVar = this.f312719e;
        df2.lt.b7(ltVar, d17);
        df2.lt.f7(ltVar, d17);
        return jz5.f0.f384359a;
    }
}
