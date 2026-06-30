package vd2;

/* loaded from: classes3.dex */
public final class v4 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f517487e;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, boolean z17) {
        this.f517486d = c14167x40aca97c;
        this.f517487e = z17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.util.List list;
        km2.m E;
        this.f517486d.f193025q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = this.f517486d.f193025q.mo7946xf939df19();
        java.lang.Object obj = null;
        vd2.s1 s1Var = mo7946xf939df19 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df19 : null;
        gk2.e eVar = (s1Var == null || (E = s1Var.E(this.f517486d.f193028t.f517588f)) == null) ? null : E.f390663e;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        boolean z17 = false;
        boolean z18 = pm0.v.z(c1Var != null ? c1Var.f410340g2 : 0, 8);
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390703a, c1Var != null ? c1Var.m8() : null)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (km2.q) obj;
        }
        boolean z19 = obj != null;
        if (c1Var != null && c1Var.a8()) {
            z17 = true;
        }
        if (!z17 || z18 || z19) {
            return;
        }
        pm0.v.V(800L, new vd2.u4(this.f517486d, this.f517487e));
    }
}
