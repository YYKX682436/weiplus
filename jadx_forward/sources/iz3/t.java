package iz3;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.r f377633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f377634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry3.q f377635f;

    public t(ry3.r rVar, long j17, ry3.q qVar) {
        this.f377633d = rVar;
        this.f377634e = j17;
        this.f377635f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.r rVar = this.f377633d;
        if (rVar != null) {
            rVar.a(this.f377634e, this.f377635f);
        }
    }
}
