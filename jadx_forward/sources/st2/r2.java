package st2;

/* loaded from: classes3.dex */
public final class r2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f493968a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f493969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f493970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f493971d;

    public r2(tt2.e1 e1Var, r45.qt2 qt2Var, gk2.e eVar) {
        this.f493969b = e1Var;
        this.f493970c = qt2Var;
        this.f493971d = eVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            int m8183xf806b362 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next()).m8183xf806b362();
            tt2.e1 e1Var = this.f493969b;
            e1Var.getClass();
            so2.j5 P = e1Var.P(m8183xf806b362);
            if (P instanceof cm2.m0) {
                java.util.HashSet hashSet = this.f493968a;
                cm2.m0 m0Var = (cm2.m0) P;
                if (!hashSet.contains(java.lang.Long.valueOf(m0Var.f124902w))) {
                    hashSet.add(java.lang.Long.valueOf(m0Var.f124902w));
                    if (h0Var.f391656d == null) {
                        h0Var.f391656d = new java.util.LinkedList();
                    }
                    java.util.LinkedList linkedList = (java.util.LinkedList) h0Var.f391656d;
                    if (linkedList != null) {
                        linkedList.add(java.lang.Long.valueOf(m0Var.f124902w));
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "[onChildExposeChanged] exposed=" + h0Var.f391656d);
        boolean z17 = false;
        if (((java.util.LinkedList) h0Var.f391656d) != null && (!r6.isEmpty())) {
            z17 = true;
        }
        if (z17) {
            pm0.v.O("FinderLiveShoppingListExpose", new st2.q2(h0Var, this, this.f493970c, this.f493971d));
        }
    }
}
