package mt1;

/* loaded from: classes12.dex */
public final class c implements mt1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f412738a;

    public c(long j17) {
        this.f412738a = j17;
    }

    @Override // mt1.r0
    public void a(boolean z17, long j17, int i17, int i18) {
        if (java.lang.System.nanoTime() % 1024 == 0) {
            mt1.b0.s(z17 ? 1 : 0, java.lang.System.currentTimeMillis() - this.f412738a, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(i18));
        }
        if (z17) {
            throw new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26993xde8292f();
        }
    }

    @Override // mt1.r0
    /* renamed from: onProgress */
    public void mo9155x696ee52c(long j17, long j18) {
    }
}
