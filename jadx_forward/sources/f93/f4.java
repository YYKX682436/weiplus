package f93;

/* loaded from: classes.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341870d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341870d = activityC16172xa598f868;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341870d;
        android.content.Intent intent = new android.content.Intent(activityC16172xa598f868, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.class);
        intent.putExtra("last_page_source_type", 1);
        intent.putExtra("key_label_click_source", 1);
        intent.putExtra("label_edit_mode", true);
        activityC16172xa598f868.startActivityForResult(intent, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/ContactLabelUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
