package pz5;

/* loaded from: classes14.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 a(yz5.p pVar, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        if (pVar instanceof qz5.a) {
            return ((qz5.a) pVar).mo148xaf65a0fc(obj, completion);
        }
        oz5.l mo48699x76847179 = completion.mo48699x76847179();
        return mo48699x76847179 == oz5.m.f431862d ? new pz5.d(completion, pVar, obj) : new pz5.e(completion, mo48699x76847179, pVar, obj);
    }

    public static final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> m161166x716f04e1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC29045xdcb5ca57, "<this>");
        qz5.d dVar = interfaceC29045xdcb5ca57 instanceof qz5.d ? (qz5.d) interfaceC29045xdcb5ca57 : null;
        return (dVar == null || (m161166x716f04e1 = dVar.m161166x716f04e1()) == null) ? interfaceC29045xdcb5ca57 : m161166x716f04e1;
    }
}
