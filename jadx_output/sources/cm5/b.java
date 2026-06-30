package cm5;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43425b;

    public b(android.content.Context context, java.lang.String str) {
        this.f43424a = context;
        this.f43425b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Context context;
        if (z17) {
            java.lang.String str2 = this.f43425b;
            if ((str2 == null || str2.length() == 0) || (context = this.f43424a) == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            if (!com.tencent.mm.sdk.platformtools.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
