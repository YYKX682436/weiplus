package dk3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk3.e f315979d;

    public b(dk3.e eVar) {
        this.f315979d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewParent parent;
        dk3.e eVar = this.f315979d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2 = eVar.f315985d;
        if (c16600x72af54f2 != null) {
            if (c16600x72af54f2 != null) {
                try {
                    parent = c16600x72af54f2.getParent();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatMultiTaskIndicatorController", e17, "detachFloatIndicatorView exception:%s", e17);
                    return;
                }
            } else {
                parent = null;
            }
            if (parent != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f22 = eVar.f315985d;
                android.view.ViewParent parent2 = c16600x72af54f22 != null ? c16600x72af54f22.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent2).removeView(eVar.f315985d);
            }
        }
    }
}
