package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.CustomViewCallbackFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28784xe0a588b9 {
    private io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi api;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71987x56f9c012;

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f71988xd32bb158;

    public C28784xe0a588b9(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        this.f71987x56f9c012 = interfaceC28679x1b8c77f2;
        this.f71988xd32bb158 = c28897x97be6938;
        this.api = new io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi(interfaceC28679x1b8c77f2);
    }

    /* renamed from: create */
    public void m138948xaf65a0fc(android.webkit.WebChromeClient.CustomViewCallback customViewCallback, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f71988xd32bb158.m139288x591dfd4(customViewCallback)) {
            return;
        }
        this.api.m138997xaf65a0fc(java.lang.Long.valueOf(this.f71988xd32bb158.m139286xeaafee74(customViewCallback)), reply);
    }

    /* renamed from: setApi */
    public void m138949xca025258(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.CustomViewCallbackFlutterApi customViewCallbackFlutterApi) {
        this.api = customViewCallbackFlutterApi;
    }
}
