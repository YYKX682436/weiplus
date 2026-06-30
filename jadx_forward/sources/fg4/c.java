package fg4;

/* loaded from: classes8.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 f344001d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 activityC18528xb888b874) {
        this.f344001d = activityC18528xb888b874;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 activityC18528xb888b874 = this.f344001d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m M = activityC18528xb888b874.f253934e.M(i17);
        activityC18528xb888b874.getClass();
        M.f67391x10a0fed7 = 0;
        M.f67383x15b870c = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo9952xce0038c9(M, new java.lang.String[0]);
        activityC18528xb888b874.mo43517x10010bd5();
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
