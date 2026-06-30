package aw1;

/* loaded from: classes12.dex */
public final class t implements mt1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw1.o f14681c;

    public t(com.tencent.wcdb.support.CancellationSignal cancellationSignal, aw1.o oVar) {
        this.f14680b = cancellationSignal;
        this.f14681c = oVar;
    }

    @Override // mt1.r0
    public void a(boolean z17, long j17, int i17, int i18) {
        this.f14679a = z17;
    }

    @Override // mt1.r0
    public void onProgress(long j17, long j18) {
        yv1.h1.f(2, this.f14680b);
        int i17 = (int) j18;
        this.f14681c.b(4, (int) j17, i17);
    }
}
