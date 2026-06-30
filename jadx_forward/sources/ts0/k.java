package ts0;

/* loaded from: classes10.dex */
public final class k implements android.hardware.Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ts0.l f503088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f503089b;

    public k(ts0.l lVar, yz5.l lVar2) {
        this.f503088a = lVar;
        this.f503089b = lVar2;
    }

    @Override // android.hardware.Camera.PictureCallback
    public void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(camera);
            yj0.a.j(camera, "com/tencent/mm/media/widget/camera/CommonCamera1$takePhotoRawData$3", "onPictureTaken", "([BLandroid/hardware/Camera;)V", "android/hardware/Camera", "startPreview", "()V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f503088a.f503091w, "takePicture: resume preview fail, exception %s", e17.getMessage());
        }
        this.f503089b.mo146xb9724478(bArr);
    }
}
