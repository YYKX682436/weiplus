package d32;

/* loaded from: classes10.dex */
public final class l extends d32.n implements d32.q {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f307721t;

    public l() {
        super(0, 1, null);
        this.f307721t = "MicroMsg.EmojiCapturePreviewRenderer";
    }

    @Override // d32.q
    public is0.c d() {
        java.lang.Object obj = this.f412484g;
        d32.q qVar = obj instanceof d32.q ? (d32.q) obj : null;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    @Override // ms0.c
    public os0.a f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f307721t, "doInitRenderProc, useCpuCrop:false");
        return new d32.a(this.f412478a, this.f412479b, this.f412480c, this.f412481d, this.f412482e, this.f412483f);
    }
}
