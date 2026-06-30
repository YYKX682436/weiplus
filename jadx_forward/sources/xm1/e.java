package xm1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f536694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f536695e;

    public e(xm1.h hVar, boolean z17) {
        this.f536694d = hVar;
        this.f536695e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f536694d;
        boolean z17 = this.f536695e;
        hVar.f536706e = z17;
        hVar.c().setSpeakerphoneOn(z17);
    }
}
