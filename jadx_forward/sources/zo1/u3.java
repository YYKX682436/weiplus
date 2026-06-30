package zo1;

/* loaded from: classes5.dex */
public final class u3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f556317e;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8, android.widget.PopupWindow popupWindow) {
        this.f556316d = activityC12872x8baa24f8;
        this.f556317e = popupWindow;
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
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2 a2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8 = this.f556316d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.b(a2Var, activityC12872x8baa24f8.f174396w, 4L, null, 4, null);
        wo1.v vVar = activityC12872x8baa24f8.f174394u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar);
        vVar.m174243x6546a9bd(i17);
        wo1.v vVar2 = activityC12872x8baa24f8.f174394u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar2);
        java.lang.String m174238xb593a3ae = vVar2.m174238xb593a3ae();
        android.widget.TextView textView = activityC12872x8baa24f8.f174382f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortTypeTv");
            throw null;
        }
        textView.setText(m174238xb593a3ae);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "change sort type to position=" + i17 + ", desc=" + m174238xb593a3ae);
        this.f556317e.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
