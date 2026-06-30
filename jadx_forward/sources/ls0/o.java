package ls0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f402409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f402410e;

    public o(ls0.v vVar, android.media.MediaFormat mediaFormat) {
        this.f402409d = vVar;
        this.f402410e = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls0.v vVar = this.f402409d;
        yz5.p pVar = vVar.f402464c;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f402410e, vVar);
        }
    }
}
