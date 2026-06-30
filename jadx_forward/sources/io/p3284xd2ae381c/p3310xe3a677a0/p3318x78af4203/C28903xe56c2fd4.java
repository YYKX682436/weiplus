package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28903xe56c2fd4 extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelFlutterApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72082xd32bb158;

    public C28903xe56c2fd4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(interfaceC28679x1b8c77f2);
        this.f72082xd32bb158 = c28897x97be6938;
    }

    /* renamed from: getIdentifierForJavaScriptChannel */
    private long m139298x8535382c(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696 c28900x16eda696) {
        java.lang.Long m139289x102c196a = this.f72082xd32bb158.m139289x102c196a(c28900x16eda696);
        if (m139289x102c196a != null) {
            return m139289x102c196a.longValue();
        }
        throw new java.lang.IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    /* renamed from: postMessage */
    public void m139299x58d00b47(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28900x16eda696 c28900x16eda696, java.lang.String str, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.JavaScriptChannelFlutterApi.Reply<java.lang.Void> reply) {
        super.m139054x58d00b47(java.lang.Long.valueOf(m139298x8535382c(c28900x16eda696)), str, reply);
    }
}
