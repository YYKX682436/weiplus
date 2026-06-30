package be1;

/* loaded from: classes7.dex */
public final class m extends be1.j {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f19484c;

    static {
        new be1.l(null);
        f19484c = jz5.h.b(be1.k.f19481d);
    }

    @Override // be1.j, be1.g
    /* renamed from: b */
    public java.util.Map a(java.lang.String type, com.tencent.mm.plugin.appbrand.y component) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        jz5.g gVar = f19484c;
        ((be1.y1) ((jz5.n) gVar).getValue()).getClass();
        java.util.Map a17 = kotlin.jvm.internal.o.b("windowInfo", type) ? ((be1.y1) ((jz5.n) gVar).getValue()).a(type, component) : null;
        return a17 == null ? super.a(type, component) : a17;
    }
}
