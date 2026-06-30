package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class j3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 f292041d;

    public j3(com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8) {
        this.f292041d = c22502x1bc6a5e8;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = this.f292041d;
        com.p314xaae8f345.mm.ui.p2740x696c9db.l3 l3Var = c22502x1bc6a5e8.f291582n;
        l3Var.f292077d = i17;
        l3Var.notifyDataSetChanged();
        try {
            com.p314xaae8f345.mm.ui.p2740x696c9db.n3 n3Var = com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8.f291574r[i17];
            c22502x1bc6a5e8.f291583o = n3Var.f292132f;
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8.a(c22502x1bc6a5e8, n3Var.f292128b, n3Var.f292129c, n3Var.f292130d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", e17.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FilterView", e17, "", new java.lang.Object[0]);
        } catch (java.lang.OutOfMemoryError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilterView", e18.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FilterView", e18, "", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
