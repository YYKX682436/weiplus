package tr0;

/* loaded from: classes14.dex */
public final class i implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f502842e;

    public i(tr0.t tVar, wo.d1 d1Var) {
        this.f502841d = tVar;
        this.f502842e = d1Var;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        tr0.t tVar = this.f502841d;
        nr0.y yVar = tVar.f492966g;
        if (yVar != null) {
            ((pr0.n) yVar).l("bufferUpdateFrame", new tr0.h(bArr, tVar, this.f502842e, null));
        }
    }
}
