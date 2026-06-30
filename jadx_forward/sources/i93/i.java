package i93;

/* loaded from: classes11.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 f371284d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530) {
        this.f371284d = activityC16176xdf6c8530;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530.f224918u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530 = this.f371284d;
        activityC16176xdf6c8530.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) ((java.util.LinkedList) activityC16176xdf6c8530.f224927o.f371262f).toArray(new java.lang.String[0]));
        if (P1 == null) {
            P1 = new java.util.ArrayList();
        }
        java.lang.String string = activityC16176xdf6c8530.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9w, java.lang.Integer.valueOf(P1.size()));
        if (activityC16176xdf6c8530.f224931s) {
            dp.a.m125854x26a183b(activityC16176xdf6c8530, string, 0).show();
        }
        intent.putExtra("contact_choose_label_list", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(P1, ","));
        activityC16176xdf6c8530.setResult(-1, intent);
        activityC16176xdf6c8530.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
