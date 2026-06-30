package s1;

/* loaded from: classes14.dex */
public final class c2 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f483531a;

    public c2(n0.e5 e5Var) {
        this.f483531a = e5Var;
    }

    @Override // n0.a2
    /* renamed from: dispose */
    public void mo158x63a5261f() {
        s1.q0 a17 = ((s1.k2) this.f483531a.mo128745x754a37bb()).a();
        u1.w wVar = a17.f483594a;
        wVar.f505226q = true;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) a17.f483598e;
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            n0.f1 f1Var = ((s1.k0) it.next()).f483554c;
            if (f1Var != null) {
                f1Var.mo7062x63a5261f();
            }
        }
        wVar.E();
        wVar.f505226q = false;
        linkedHashMap.clear();
        ((java.util.LinkedHashMap) a17.f483599f).clear();
        a17.f483604k = 0;
        a17.f483603j = 0;
        ((java.util.LinkedHashMap) a17.f483601h).clear();
        a17.b();
    }
}
