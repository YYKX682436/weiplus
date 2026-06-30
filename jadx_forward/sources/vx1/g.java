package vx1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f522758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx1.i f522759e;

    public g(vx1.i iVar, android.os.Handler handler) {
        this.f522759e = iVar;
        this.f522758d = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f522759e.wi(this.f522758d);
    }
}
