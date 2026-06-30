package be1;

/* loaded from: classes7.dex */
public final class k1 implements be1.v1 {
    @Override // be1.o
    public java.util.Map a(java.lang.String type, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.mm.plugin.appbrand.y component = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        android.content.Context context = component.getContext();
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.i1 i1Var = be1.j1.f19478b;
        java.util.Iterator it = ((java.util.Map) ((jz5.n) be1.j1.f19479c).getValue()).entrySet().iterator();
        while (it.hasNext()) {
            ((yz5.p) ((java.util.Map.Entry) it.next()).getValue()).invoke(context, hashMap);
        }
        return hashMap;
    }
}
