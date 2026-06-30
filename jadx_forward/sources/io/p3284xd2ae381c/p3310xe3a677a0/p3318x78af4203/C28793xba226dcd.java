package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterWebViewFactory */
/* loaded from: classes13.dex */
class C28793xba226dcd extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72004xd32bb158;

    public C28793xba226dcd(io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495);
        this.f72004xd32bb158 = c28897x97be6938;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12
    /* renamed from: create */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc(android.content.Context context, int i17, java.lang.Object obj) {
        if (((java.lang.Integer) obj) == null) {
            throw new java.lang.IllegalStateException("An identifier is required to retrieve WebView instance.");
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) this.f72004xd32bb158.m139290x9cf0d20b(r3.intValue());
        if (interfaceC28717x1311f9d8 != null) {
            return interfaceC28717x1311f9d8;
        }
        throw new java.lang.IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
