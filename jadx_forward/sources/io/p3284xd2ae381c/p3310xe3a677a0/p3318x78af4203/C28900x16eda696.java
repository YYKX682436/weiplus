package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannel */
/* loaded from: classes16.dex */
public class C28900x16eda696 {

    /* renamed from: flutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4 f72079x2014845e;

    /* renamed from: javaScriptChannelName */
    final java.lang.String f72080x97300a61;

    /* renamed from: platformThreadHandler */
    private final android.os.Handler f72081xbc4f3c2d;

    public C28900x16eda696(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28903xe56c2fd4 c28903xe56c2fd4, java.lang.String str, android.os.Handler handler) {
        this.f72079x2014845e = c28903xe56c2fd4;
        this.f72080x97300a61 = str;
        this.f72081xbc4f3c2d = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$postMessage$0 */
    public static /* synthetic */ void m139295x8a425ff6(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$postMessage$1 */
    public /* synthetic */ void m139296x8a425ff7(java.lang.String str) {
        this.f72079x2014845e.m139299x58d00b47(this, str, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28901x31ad558b());
    }

    @android.webkit.JavascriptInterface
    /* renamed from: postMessage */
    public void m139297x58d00b47(final java.lang.String str) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.plugins.webviewflutter.JavaScriptChannel$$b
            @Override // java.lang.Runnable
            public final void run() {
                io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696.this.m139296x8a425ff7(str);
            }
        };
        if (this.f72081xbc4f3c2d.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            this.f72081xbc4f3c2d.post(runnable);
        }
    }
}
