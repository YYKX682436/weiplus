package nv4;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f422260a = new java.util.LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f422261b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f422262c = true;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f422263d = jz5.h.b(nv4.i.f422258d);

    public final void a() {
        this.f422262c = true;
        java.util.Map map = this.f422261b;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((nv4.h) it.next()).z();
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    public final void b(nv4.h hVar) {
        java.util.Map map = this.f422261b;
        nv4.h hVar2 = (nv4.h) ((java.util.LinkedHashMap) map).get(hVar.A());
        jz5.f0 f0Var = null;
        boolean z17 = true;
        if (hVar2 != null) {
            nv4.h B = hVar2.B(hVar);
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (B != null) {
                map.put(hVar.A(), B);
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                hVar.z();
                z17 = false;
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            map.put(hVar.A(), hVar);
        }
        if (z17 && this.f422262c) {
            this.f422262c = false;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f422263d).mo141623x754a37bb()).mo50293x3498a0(new nv4.j(this));
        }
    }

    public final void c(nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.toString();
        a();
        item.z();
    }

    public final boolean d(java.lang.String key, nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.Set set = this.f422260a;
        if (set.contains(key)) {
            item.toString();
            return false;
        }
        item.toString();
        set.add(key);
        b(item);
        return true;
    }
}
