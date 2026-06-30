package uw4;

/* loaded from: classes.dex */
public final class r implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f513280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f513281b;

    public r(java.lang.String str, android.content.Context context) {
        this.f513280a = str;
        this.f513281b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public final void a() {
        java.lang.String str = this.f513280a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMenuSheetHelper", "webview recent share: onContentClick: url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f513281b, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
