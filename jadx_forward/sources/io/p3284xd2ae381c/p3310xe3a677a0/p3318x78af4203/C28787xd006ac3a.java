package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28787xd006ac3a extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerFlutterApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f71995xd32bb158;

    public C28787xd006ac3a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(interfaceC28679x1b8c77f2);
        this.f71995xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getIdentifierForListener */
    private long m138955x5377567e(android.webkit.DownloadListener downloadListener) {
        java.lang.Long m139289x102c196a = this.f71995xd32bb158.m139289x102c196a(downloadListener);
        if (m139289x102c196a != null) {
            return m139289x102c196a.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for DownloadListener.");
    }

    /* renamed from: onDownloadStart */
    public void m138956x344c051b(android.webkit.DownloadListener downloadListener, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.DownloadListenerFlutterApi.Reply<java.lang.Void> reply) {
        m139004x344c051b(java.lang.Long.valueOf(m138955x5377567e(downloadListener)), str, str2, str3, str4, java.lang.Long.valueOf(j17), reply);
    }
}
