package zo1;

/* loaded from: classes5.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556177d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556177d = activityC12872x8baa24f8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8.f174379x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556177d;
        activityC12872x8baa24f8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "showSearchView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, activityC12872x8baa24f8.f174396w, 2L, null, 4, null);
        jz5.g gVar = activityC12872x8baa24f8.f174392s;
        activityC12872x8baa24f8.m78489xd6d59aa8(true, (com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) gVar).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) gVar).mo141623x754a37bb()).c(true);
        android.widget.ListView listView = activityC12872x8baa24f8.f174381e;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchResultLv");
            throw null;
        }
        listView.setVisibility(0);
        android.widget.RelativeLayout relativeLayout = activityC12872x8baa24f8.f174380d;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mainContentRl");
            throw null;
        }
        relativeLayout.setVisibility(8);
        android.widget.ListView listView2 = activityC12872x8baa24f8.f174381e;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchResultLv");
            throw null;
        }
        zo1.d3 d3Var = activityC12872x8baa24f8.f174393t;
        if (d3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "showSearchView, create new SearchResultAdapter");
            d3Var = new zo1.d3(new zo1.q3(activityC12872x8baa24f8), new zo1.s3(activityC12872x8baa24f8));
            activityC12872x8baa24f8.f174393t = d3Var;
        }
        listView2.setAdapter((android.widget.ListAdapter) d3Var);
        android.widget.ListView listView3 = activityC12872x8baa24f8.f174381e;
        if (listView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchResultLv");
            throw null;
        }
        listView3.setOnItemClickListener(new zo1.t3(activityC12872x8baa24f8));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
