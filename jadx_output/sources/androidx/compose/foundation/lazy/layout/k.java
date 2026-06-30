package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final w0.h f10410a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f10411b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f10412c;

    /* renamed from: d, reason: collision with root package name */
    public p2.f f10413d;

    /* renamed from: e, reason: collision with root package name */
    public long f10414e;

    public k(w0.h saveableStateHolder, yz5.a itemProvider) {
        kotlin.jvm.internal.o.g(saveableStateHolder, "saveableStateHolder");
        kotlin.jvm.internal.o.g(itemProvider, "itemProvider");
        this.f10410a = saveableStateHolder;
        this.f10411b = itemProvider;
        this.f10412c = new java.util.LinkedHashMap();
        this.f10413d = new p2.g(0.0f, 0.0f);
        this.f10414e = p2.d.b(0, 0, 0, 0, 15, null);
    }

    public final yz5.p a(int i17, java.lang.Object key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map map = this.f10412c;
        androidx.compose.foundation.lazy.layout.j jVar = (androidx.compose.foundation.lazy.layout.j) ((java.util.LinkedHashMap) map).get(key);
        java.lang.Object a17 = ((androidx.compose.foundation.lazy.layout.l) this.f10411b.invoke()).a(i17);
        if (jVar != null && ((java.lang.Number) ((n0.q4) jVar.f10407c).getValue()).intValue() == i17 && kotlin.jvm.internal.o.b(jVar.f10406b, a17)) {
            yz5.p pVar = jVar.f10408d;
            if (pVar != null) {
                return pVar;
            }
            u0.a c17 = u0.j.c(1403994769, true, new androidx.compose.foundation.lazy.layout.i(jVar.f10409e, jVar));
            jVar.f10408d = c17;
            return c17;
        }
        androidx.compose.foundation.lazy.layout.j jVar2 = new androidx.compose.foundation.lazy.layout.j(this, i17, key, a17);
        map.put(key, jVar2);
        yz5.p pVar2 = jVar2.f10408d;
        if (pVar2 != null) {
            return pVar2;
        }
        u0.a c18 = u0.j.c(1403994769, true, new androidx.compose.foundation.lazy.layout.i(jVar2.f10409e, jVar2));
        jVar2.f10408d = c18;
        return c18;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        androidx.compose.foundation.lazy.layout.j jVar = (androidx.compose.foundation.lazy.layout.j) ((java.util.LinkedHashMap) this.f10412c).get(obj);
        if (jVar != null) {
            return jVar.f10406b;
        }
        androidx.compose.foundation.lazy.layout.l lVar = (androidx.compose.foundation.lazy.layout.l) this.f10411b.invoke();
        java.lang.Integer num = (java.lang.Integer) lVar.b().get(obj);
        if (num != null) {
            return lVar.a(num.intValue());
        }
        return null;
    }
}
