package ls0;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f402415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f402416e;

    public q(ls0.v vVar, android.media.MediaFormat mediaFormat) {
        this.f402415d = vVar;
        this.f402416e = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls0.v vVar = this.f402415d;
        yz5.p pVar = vVar.f402464c;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f402416e, vVar);
        }
    }
}
