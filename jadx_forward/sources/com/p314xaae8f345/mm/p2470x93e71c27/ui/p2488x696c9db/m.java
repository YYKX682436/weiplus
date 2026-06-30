package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273301d;

    public m(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273301d = activityC19725xad6fc40e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar;
        android.content.pm.ResolveInfo resolveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273301d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a0 a0Var = activityC19725xad6fc40e.f272866e;
        if (a0Var != null) {
            activityC19725xad6fc40e.A = a0Var.getItem(i17);
            activityC19725xad6fc40e.f272866e.notifyDataSetChanged();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d0 d0Var = activityC19725xad6fc40e.P;
            if (d0Var != null && d0Var.f273084b.isShowing()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar2 = activityC19725xad6fc40e.A;
                if (xVar2 == null || !xVar2.f272565h || (xVar2.f272568n && (xVar2.f272566i || activityC19725xad6fc40e.H >= activityC19725xad6fc40e.I))) {
                    activityC19725xad6fc40e.P.a(true);
                } else {
                    activityC19725xad6fc40e.P.a(false);
                }
            }
            if ((activityC19725xad6fc40e.f272884y == 6 || activityC19725xad6fc40e.f272879t == 2) && (xVar = activityC19725xad6fc40e.A) != null && (resolveInfo = xVar.f272561d) != null) {
                activityC19725xad6fc40e.X6(-1, resolveInfo.activityInfo.packageName, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 4, activityC19725xad6fc40e.A.f272561d.activityInfo.packageName);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
