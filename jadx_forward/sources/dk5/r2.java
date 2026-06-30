package dk5;

/* loaded from: classes9.dex */
public class r2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316380b;

    public r2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.lang.String str) {
        this.f316380b = activityC22571x51759e93;
        this.f316379a = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316380b;
        if (activityC22571x51759e93.L1 == 4) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f316379a);
        intent.putExtra("hide_option_menu", true);
        j45.l.j(activityC22571x51759e93.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
