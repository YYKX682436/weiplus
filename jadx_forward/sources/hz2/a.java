package hz2;

/* loaded from: classes.dex */
public final class a implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f367841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f367842c;

    public a(java.lang.String str, int i17, android.content.Context context) {
        this.f367840a = str;
        this.f367841b = i17;
        this.f367842c = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.String linkUrl = this.f367840a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkUrl, "$linkUrl");
            if ((linkUrl.length() > 0) && this.f367841b == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", linkUrl);
                j45.l.j(this.f367842c, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}
