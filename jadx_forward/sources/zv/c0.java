package zv;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f557454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557455e;

    public c0(long j17, java.lang.String str) {
        this.f557454d = j17;
        this.f557455e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f557454d != zv.e0.f557473d) {
            return;
        }
        zv.e0.f557474e = true;
        zv.e0.f557470a.b(this.f557455e);
    }
}
