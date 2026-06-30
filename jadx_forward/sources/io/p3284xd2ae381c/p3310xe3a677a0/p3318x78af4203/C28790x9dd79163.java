package io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203;

/* renamed from: io.flutter.plugins.webviewflutter.FileChooserParamsFlutterApiImpl */
/* loaded from: classes16.dex */
public class C28790x9dd79163 extends io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserParamsFlutterApi {

    /* renamed from: instanceManager */
    private final io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 f72000xd32bb158;

    public C28790x9dd79163(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28897x97be6938 c28897x97be6938) {
        super(interfaceC28679x1b8c77f2);
        this.f72000xd32bb158 = c28897x97be6938;
    }

    /* renamed from: toFileChooserEnumData */
    private static io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserMode m138961xe1106b0f(int i17) {
        if (i17 == 0) {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserMode.OPEN;
        }
        if (i17 == 1) {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserMode.OPEN_MULTIPLE;
        }
        if (i17 == 3) {
            return io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserMode.SAVE;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Unsupported FileChooserMode: %d", java.lang.Integer.valueOf(i17)));
    }

    /* renamed from: create */
    public void m138962xaf65a0fc(android.webkit.WebChromeClient.FileChooserParams fileChooserParams, io.p3284xd2ae381c.p3310xe3a677a0.p3318x78af4203.C28794x4a559df9.FileChooserParamsFlutterApi.Reply<java.lang.Void> reply) {
        if (this.f72000xd32bb158.m139288x591dfd4(fileChooserParams)) {
            return;
        }
        m139014xaf65a0fc(java.lang.Long.valueOf(this.f72000xd32bb158.m139286xeaafee74(fileChooserParams)), java.lang.Boolean.valueOf(fileChooserParams.isCaptureEnabled()), java.util.Arrays.asList(fileChooserParams.getAcceptTypes()), m138961xe1106b0f(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), reply);
    }
}
