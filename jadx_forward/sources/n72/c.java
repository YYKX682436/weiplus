package n72;

/* loaded from: classes14.dex */
public class c implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.q f416786d;

    public c(n72.q qVar) {
        this.f416786d = qVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        n72.q qVar = this.f416786d;
        if (qVar.N) {
            if (qVar.f416815q && this.f416786d.f416816r && this.f416786d.G == 2) {
                k72.j.f386258a.a(bArr, camera);
                return;
            }
            return;
        }
        if (qVar.f416804J != null) {
            if (qVar.M) {
                int i17 = qVar.L.get();
                n72.q qVar2 = this.f416786d;
                if (i17 >= qVar2.K) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceReflectCam", "drop frame  %d", java.lang.Integer.valueOf(qVar2.L.get()));
                    return;
                }
            }
            n72.q qVar3 = this.f416786d;
            qVar3.f416804J.m77784x795fa299(qVar3.M ? new n72.n(qVar3, bArr, camera) : new n72.o(qVar3, bArr, camera));
        }
    }
}
