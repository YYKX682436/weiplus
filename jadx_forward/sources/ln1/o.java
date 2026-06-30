package ln1;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.z f401313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f401314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.r f401315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f401316g;

    public o(ln1.z zVar, long j17, ln1.r rVar, long j18) {
        this.f401313d = zVar;
        this.f401314e = j17;
        this.f401315f = rVar;
        this.f401316g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln1.z zVar = this.f401313d;
        ln1.y yVar = new ln1.y(zVar, zVar.run(), this.f401314e);
        ln1.r rVar = this.f401315f;
        rVar.f401319a.put(java.lang.Long.valueOf(this.f401316g), yVar);
        rVar.f401323e.c();
    }
}
