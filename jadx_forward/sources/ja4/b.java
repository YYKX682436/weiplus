package ja4;

/* loaded from: classes.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f380152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f380153e;

    public b(android.app.Dialog dialog, android.view.View view) {
        this.f380152d = dialog;
        this.f380153e = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
        android.app.Dialog dialog = this.f380152d;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        android.view.View view2 = this.f380153e;
        if (view2 != null) {
            view2.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/lucky/ui/SnsLuckyCommentAlertUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$2");
    }
}
