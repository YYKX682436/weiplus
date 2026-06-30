package ap1;

/* loaded from: classes5.dex */
public final class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94247d;

    public o1(ap1.p1 p1Var) {
        this.f94247d = p1Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ap1.p1 p1Var = this.f94247d;
        ap1.i1 i1Var = p1Var.f94255d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d item = i1Var != null ? i1Var.getItem(i17) : null;
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamSearchContactUIC", "try to toggle selection of " + item.f288383s);
        if (item.f288383s == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        j75.f fVar = p1Var.f94258g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f94258g = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ap1.c2 c2Var = (ap1.c2) fVar.mo140437x75286adb();
        java.lang.String str = item.f288383s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getContactUsername(...)");
        boolean d17 = c2Var.d(str);
        for (ap1.a0 a0Var : ((ap1.c2) fVar.mo140437x75286adb()).f94162m) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a0Var.f94133a, item.f288383s)) {
                fVar.B3(new ap1.h2(!d17, a0Var, null, 4, null));
                ap1.p1.T6(p1Var);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
