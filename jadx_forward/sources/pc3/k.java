package pc3;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f434913d;

    public k(pc3.m mVar) {
        this.f434913d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.m mVar = this.f434913d;
        if (mVar.f434916b.isEmpty()) {
            pc3.m.a(mVar, false);
        }
    }
}
