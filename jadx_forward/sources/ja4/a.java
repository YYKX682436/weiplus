package ja4;

/* loaded from: classes.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f380151d;

    public a(android.app.Dialog dialog) {
        this.f380151d = dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onCancel");
        android.app.Dialog dialog = this.f380151d;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
    }
}
