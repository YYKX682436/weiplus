package be;

/* loaded from: classes7.dex */
public final class c extends be1.j {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f19445c;

    static {
        new be.b(null);
        f19445c = jz5.h.b(be.a.f19444d);
    }

    @Override // be1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.tencent.luggage.sdk.jsapi.component.service.y component) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        jz5.g gVar = f19445c;
        ((be.d) ((jz5.n) gVar).getValue()).getClass();
        java.util.Map a17 = kotlin.jvm.internal.o.b("windowInfo", type) ? ((be.d) ((jz5.n) gVar).getValue()).a(type, component) : null;
        return a17 == null ? super.a(type, component) : a17;
    }
}
