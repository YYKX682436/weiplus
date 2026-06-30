package fp3;

/* loaded from: classes9.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d f346839d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d) {
        this.f346839d = activityC16776x1b9c0a0d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16776x1b9c0a0d activityC16776x1b9c0a0d = this.f346839d;
        if (activityC16776x1b9c0a0d.f234377x != null && activityC16776x1b9c0a0d.f234378y != null) {
            if (view.getId() == com.p314xaae8f345.mm.R.id.kkm) {
                activityC16776x1b9c0a0d.f234377x.setSelected(true);
                activityC16776x1b9c0a0d.f234378y.setSelected(false);
                activityC16776x1b9c0a0d.f234376w = 100;
            } else {
                activityC16776x1b9c0a0d.f234377x.setSelected(false);
                activityC16776x1b9c0a0d.f234378y.setSelected(true);
                activityC16776x1b9c0a0d.f234376w = -100;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
