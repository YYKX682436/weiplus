package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl */
/* loaded from: classes16.dex */
public class C28788x78e39d76 implements io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi {

    /* renamed from: downloadListenerCreator */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76.DownloadListenerCreator f71996x68862f30;

    /* renamed from: flutterApi */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a f71997x2014845e;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f71998xd32bb158;

    /* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl$DownloadListenerCreator */
    /* loaded from: classes16.dex */
    public static class DownloadListenerCreator {
        /* renamed from: createDownloadListener */
        public io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76.DownloadListenerImpl m138959xcf655678(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a c28787xd006ac3a) {
            return new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76.DownloadListenerImpl(c28787xd006ac3a);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl$DownloadListenerImpl */
    /* loaded from: classes16.dex */
    public static class DownloadListenerImpl implements android.webkit.DownloadListener {

        /* renamed from: flutterApi */
        private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a f71999x2014845e;

        public DownloadListenerImpl(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a c28787xd006ac3a) {
            this.f71999x2014845e = c28787xd006ac3a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onDownloadStart$0 */
        public static /* synthetic */ void m138960xe59b8b4a(java.lang.Void r07) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
            this.f71999x2014845e.m138956x344c051b(this, str, str2, str3, str4, j17, new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28789x15672f77());
        }
    }

    public C28788x78e39d76(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28788x78e39d76.DownloadListenerCreator downloadListenerCreator, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28787xd006ac3a c28787xd006ac3a) {
        this.f71998xd32bb158 = c28897x97be6938;
        this.f71996x68862f30 = downloadListenerCreator;
        this.f71997x2014845e = c28787xd006ac3a;
    }

    @Override // io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerHostApi
    /* renamed from: create */
    public void mo138957xaf65a0fc(java.lang.Long l17) {
        this.f71998xd32bb158.m139285xa3622bbd(this.f71996x68862f30.m138959xcf655678(this.f71997x2014845e), l17.longValue());
    }
}
