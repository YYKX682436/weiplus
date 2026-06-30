package fp3;

/* loaded from: classes9.dex */
public class f implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d f346838d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d) {
        this.f346838d = activityC16776x1b9c0a0d;
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
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d = this.f346838d;
        dp3.b bVar = (dp3.b) ((java.util.ArrayList) activityC16776x1b9c0a0d.f234361e).get(i17);
        if (!android.text.TextUtils.isEmpty(bVar.f323732c)) {
            hp3.d.c(activityC16776x1b9c0a0d, bVar.f323732c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d.U6(activityC16776x1b9c0a0d, bVar.f323730a);
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
