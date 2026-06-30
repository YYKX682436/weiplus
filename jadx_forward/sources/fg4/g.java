package fg4;

/* loaded from: classes8.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc f344007d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc) {
        this.f344007d = c18530x30d9cdbc;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc = this.f344007d;
        if (c18530x30d9cdbc.M.c(i17)) {
            fg4.e eVar = c18530x30d9cdbc.M;
            eVar.f344004e = false;
            eVar.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (c18530x30d9cdbc.M.f344004e) {
            android.widget.AdapterView.OnItemClickListener onItemClickListener = c18530x30d9cdbc.P;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i17, j17);
            }
        } else {
            android.widget.AdapterView.OnItemClickListener onItemClickListener2 = c18530x30d9cdbc.N;
            if (onItemClickListener2 != null) {
                onItemClickListener2.onItemClick(adapterView, view, i17, j17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
