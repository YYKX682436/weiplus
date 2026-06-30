package l72;

/* loaded from: classes11.dex */
public class x implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398404a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61, android.content.Context context) {
        this.f398404a = context;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "click %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f398404a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
