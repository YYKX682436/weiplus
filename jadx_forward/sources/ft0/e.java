package ft0;

/* loaded from: classes14.dex */
public final class e implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft0.f f348000d;

    public e(ft0.f fVar) {
        this.f348000d = fVar;
    }

    @Override // di3.o
    public final boolean a(byte[] bArr) {
        ft0.f fVar = this.f348000d;
        if (bArr != null) {
            ms0.c cVar = fVar.f347995c;
            if (cVar != null) {
                ms0.c.l(cVar, bArr, false, 2, null);
            }
            fVar.f347993a.mo46859x511cb905();
        } else {
            fVar.getClass();
        }
        return false;
    }
}
