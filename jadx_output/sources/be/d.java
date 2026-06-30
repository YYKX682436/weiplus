package be;

/* loaded from: classes7.dex */
public final class d extends be1.x1 {
    @Override // be1.x1
    public void c(com.tencent.mm.plugin.appbrand.y yVar, java.util.Map outRes) {
        com.tencent.luggage.sdk.jsapi.component.service.y component = (com.tencent.luggage.sdk.jsapi.component.service.y) yVar;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(outRes, "outRes");
        int a17 = he.b.a(component);
        if (a17 > 0) {
            outRes.put("statusBarHeight", java.lang.Integer.valueOf(a17));
        }
    }
}
