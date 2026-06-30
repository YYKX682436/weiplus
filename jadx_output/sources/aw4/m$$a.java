package aw4;

/* loaded from: classes8.dex */
public final /* synthetic */ class m$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView f14900d;

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = this.f14900d;
        android.graphics.Bitmap bitmap = baseWebSearchWebView.H;
        if (bitmap != null) {
            bitmap.recycle();
            baseWebSearchWebView.H = null;
            baseWebSearchWebView.invalidate();
        }
    }
}
