package os3;

/* loaded from: classes8.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f429750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.v3 f429751e;

    public u3(os3.v3 v3Var, android.os.Bundle bundle) {
        this.f429751e = v3Var;
        this.f429750d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f429750d;
        if (bundle != null) {
            os3.v3 v3Var = this.f429751e;
            v3Var.f429770d.B = bundle.getString("mail_app_download_url", "");
            v3Var.f429770d.K = bundle.getString("mail_app_enter_url", "");
            v3Var.f429770d.A = bundle.getBoolean("mail_app_show_recommend", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = v3Var.f429770d;
            if (viewOnCreateContextMenuListenerC16941x4db497e1.A) {
                return;
            }
            android.view.View view = viewOnCreateContextMenuListenerC16941x4db497e1.f236474w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$13$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMailUI", "promote qq mail error:MailAppRecomend = %s", java.lang.Boolean.valueOf(v3Var.f429770d.A));
        }
    }
}
