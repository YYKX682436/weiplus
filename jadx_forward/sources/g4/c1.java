package g4;

/* loaded from: classes4.dex */
public final class c1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g4.d1 f349754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g4.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f349754d = d1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.c1 c1Var = new g4.c1(this.f349754d, continuation);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f349754d.getClass();
        return jz5.f0.f384359a;
    }
}
