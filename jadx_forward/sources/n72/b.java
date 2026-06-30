package n72;

/* loaded from: classes14.dex */
public class b implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera.PreviewCallback f416784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n72.q f416785e;

    public b(n72.q qVar, android.hardware.Camera.PreviewCallback previewCallback) {
        this.f416785e = qVar;
        this.f416784d = previewCallback;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n72.a(this));
        android.hardware.Camera.PreviewCallback previewCallback = this.f416784d;
        if (previewCallback != null) {
            previewCallback.onPreviewFrame(bArr, camera);
        }
        camera.addCallbackBuffer(bArr);
    }
}
