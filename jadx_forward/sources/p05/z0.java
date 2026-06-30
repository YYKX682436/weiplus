package p05;

/* loaded from: classes3.dex */
public final class z0 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f432272a = new java.util.LinkedHashSet();

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced
    public int a(int i17, java.lang.String message, tq5.g type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.util.Iterator it = this.f432272a.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced) it.next()).a(i17, message, type);
        }
        return 0;
    }
}
