package uy3;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513534d;

    public y(yz5.a aVar) {
        this.f513534d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper.myQueue().addIdleHandler(new uy3.x(this.f513534d));
    }
}
