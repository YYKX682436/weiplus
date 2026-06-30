package hq5;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f364800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f364801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f364802f;

    public s0(java.util.Set set, java.util.Set set2, hq5.t0 t0Var) {
        this.f364800d = set;
        this.f364801e = set2;
        this.f364802f = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$setLastChooseStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set set = this.f364800d;
        for (java.lang.Object obj : set) {
            if (com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Set set2 = this.f364801e;
        for (java.lang.Object obj2 : set2) {
            if (com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        int size = arrayList2.size() + arrayList3.size();
        int size2 = set.size() + set2.size();
        hq5.t0 t0Var = this.f364802f;
        if (size == size2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f364804d, "use last select, img count: " + arrayList2.size() + ", video count: " + arrayList3.size());
            t0Var.V6(arrayList2, arrayList3, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f364804d, "use last select, img count: " + arrayList2.size() + '/' + set.size() + ", video count: " + arrayList3.size() + '/' + set2.size());
            int size3 = ((set.size() - arrayList2.size()) + set2.size()) - arrayList3.size();
            if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(t0Var.m80379x76847179());
                u1Var.u(t0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nze, java.lang.Integer.valueOf(size3)));
                u1Var.a(true);
                u1Var.j(t0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                u1Var.f293529a.f293354b.V = t0Var.m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c);
                u1Var.i(hq5.q0.f364791a);
                u1Var.q(false);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(t0Var.m80379x76847179());
                u1Var2.u(t0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzd, java.lang.Integer.valueOf(size3)));
                u1Var2.a(true);
                u1Var2.n(t0Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nza));
                u1Var2.b(new hq5.r0(t0Var, arrayList2, arrayList3));
                u1Var2.q(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$setLastChooseStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
