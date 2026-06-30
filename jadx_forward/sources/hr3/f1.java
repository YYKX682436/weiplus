package hr3;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365069d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2) {
        this.f365069d = activityC16840x4302a3e2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/ContactInfoUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root2");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365069d;
        if (android.text.TextUtils.equals(activityC16840x4302a3e2.getIntent().getStringExtra("Contact_User"), en1.a.a())) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            if (activityC16840x4302a3e2 != null) {
                bj4.a.f102696a.a(activityC16840x4302a3e2, -1, true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
