package zk3;

/* loaded from: classes8.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f555045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f555046e;

    public u0(kk3.d dVar, android.graphics.Bitmap bitmap) {
        this.f555045d = dVar;
        this.f555046e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f555045d;
        if (dVar != null) {
            kk3.d.c(dVar, this.f555046e, false, 0, 6, null);
        }
    }
}
