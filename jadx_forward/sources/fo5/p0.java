package fo5;

/* loaded from: classes14.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(fo5.r0 r0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346588d = r0Var;
        this.f346589e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.p0(this.f346588d, this.f346589e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.p0 p0Var = (fo5.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        lo5.h hVar = this.f346588d.f346628n;
        java.lang.String str = this.f346589e;
        if (str == null) {
            str = "";
        }
        hVar.getClass();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            hVar.f401749c.A(str);
        }
        return jz5.f0.f384359a;
    }
}
