package ap1;

/* loaded from: classes5.dex */
public final class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12714d;

    public o1(ap1.p1 p1Var) {
        this.f12714d = p1Var;
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
        ap1.p1 p1Var = this.f12714d;
        ap1.i1 i1Var = p1Var.f12722d;
        com.tencent.mm.ui.contact.item.d item = i1Var != null ? i1Var.getItem(i17) : null;
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("RoamSearchContactUIC", "try to toggle selection of " + item.f206850s);
        if (item.f206850s == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        j75.f fVar = p1Var.f12725g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f12725g = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ap1.c2 c2Var = (ap1.c2) fVar.getState();
        java.lang.String str = item.f206850s;
        kotlin.jvm.internal.o.f(str, "getContactUsername(...)");
        boolean d17 = c2Var.d(str);
        for (ap1.a0 a0Var : ((ap1.c2) fVar.getState()).f12629m) {
            if (kotlin.jvm.internal.o.b(a0Var.f12600a, item.f206850s)) {
                fVar.B3(new ap1.h2(!d17, a0Var, null, 4, null));
                ap1.p1.T6(p1Var);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
