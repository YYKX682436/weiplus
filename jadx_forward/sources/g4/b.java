package g4;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349738d;

    public b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        java.lang.Throwable throwable = (java.lang.Throwable) obj2;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.b bVar = new g4.b(continuation);
        bVar.f349738d = throwable;
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f349738d;
        if (th6 instanceof u26.g0) {
            return jz5.f0.f384359a;
        }
        throw th6;
    }
}
