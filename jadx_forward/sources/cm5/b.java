package cm5;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f124957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124958b;

    public b(android.content.Context context, java.lang.String str) {
        this.f124957a = context;
        this.f124958b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Context context;
        if (z17) {
            java.lang.String str2 = this.f124958b;
            if ((str2 == null || str2.length() == 0) || (context = this.f124957a) == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
