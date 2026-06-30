package be1;

/* loaded from: classes7.dex */
public class j extends be1.g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f101009a = jz5.h.b(be1.h.f101005d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f101010b = jz5.h.b(be1.i.f101007d);

    @Override // be1.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component) {
        java.util.HashMap hashMap;
        java.util.Map a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        java.util.Iterator it = ((java.util.List) ((jz5.n) f101009a).mo141623x754a37bb()).iterator();
        do {
            hashMap = null;
            if (!it.hasNext()) {
                be1.v1 v1Var = (be1.v1) ((java.util.Map) ((jz5.n) f101010b).mo141623x754a37bb()).get(type);
                if (v1Var == null || (a17 = v1Var.a(type, component)) == null) {
                    return null;
                }
                return a17;
            }
            be1.w1 w1Var = (be1.w1) it.next();
            w1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetSystemInfoNewLU", "get#PartOfGetSystemInfo_TypeSpecificInfo, type: ".concat(type));
            yz5.p pVar = (yz5.p) w1Var.b().get(type);
            if (pVar != null) {
                android.content.Context mo50352x76847179 = component.mo50352x76847179();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                pVar.mo149xb9724478(mo50352x76847179, hashMap2);
                hashMap = hashMap2;
            }
        } while (hashMap == null);
        return hashMap;
    }
}
