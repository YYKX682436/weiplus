package be1;

/* loaded from: classes7.dex */
public class j extends be1.g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f19476a = jz5.h.b(be1.h.f19472d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f19477b = jz5.h.b(be1.i.f19474d);

    @Override // be1.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.tencent.mm.plugin.appbrand.y component) {
        java.util.HashMap hashMap;
        java.util.Map a17;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(component, "component");
        java.util.Iterator it = ((java.util.List) ((jz5.n) f19476a).getValue()).iterator();
        do {
            hashMap = null;
            if (!it.hasNext()) {
                be1.v1 v1Var = (be1.v1) ((java.util.Map) ((jz5.n) f19477b).getValue()).get(type);
                if (v1Var == null || (a17 = v1Var.a(type, component)) == null) {
                    return null;
                }
                return a17;
            }
            be1.w1 w1Var = (be1.w1) it.next();
            w1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetSystemInfoNewLU", "get#PartOfGetSystemInfo_TypeSpecificInfo, type: ".concat(type));
            yz5.p pVar = (yz5.p) w1Var.b().get(type);
            if (pVar != null) {
                android.content.Context context = component.getContext();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                pVar.invoke(context, hashMap2);
                hashMap = hashMap2;
            }
        } while (hashMap == null);
        return hashMap;
    }
}
