package androidx.compose.foundation.lazy.layout;

/* loaded from: classes13.dex */
public final class m implements s1.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.k f10415a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f10416b;

    public m(androidx.compose.foundation.lazy.layout.k factory) {
        kotlin.jvm.internal.o.g(factory, "factory");
        this.f10415a = factory;
        this.f10416b = new java.util.LinkedHashMap();
    }

    @Override // s1.n2
    public void a(s1.m2 slotIds) {
        kotlin.jvm.internal.o.g(slotIds, "slotIds");
        java.util.Map map = this.f10416b;
        ((java.util.LinkedHashMap) map).clear();
        java.util.Iterator it = slotIds.iterator();
        while (it.hasNext()) {
            java.lang.Object b17 = this.f10415a.b(it.next());
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) map).get(b17);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it.remove();
            } else {
                map.put(b17, java.lang.Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // s1.n2
    public boolean b(java.lang.Object obj, java.lang.Object obj2) {
        androidx.compose.foundation.lazy.layout.k kVar = this.f10415a;
        return kotlin.jvm.internal.o.b(kVar.b(obj), kVar.b(obj2));
    }
}
