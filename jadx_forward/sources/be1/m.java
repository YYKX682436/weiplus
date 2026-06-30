package be1;

/* loaded from: classes7.dex */
public final class m extends be1.j {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f101017c;

    static {
        new be1.l(null);
        f101017c = jz5.h.b(be1.k.f101014d);
    }

    @Override // be1.j, be1.g
    /* renamed from: b */
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        jz5.g gVar = f101017c;
        ((be1.y1) ((jz5.n) gVar).mo141623x754a37bb()).getClass();
        java.util.Map a17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("windowInfo", type) ? ((be1.y1) ((jz5.n) gVar).mo141623x754a37bb()).a(type, component) : null;
        return a17 == null ? super.a(type, component) : a17;
    }
}
