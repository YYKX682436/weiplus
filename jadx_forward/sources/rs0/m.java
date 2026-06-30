package rs0;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs0.n f480838d;

    public m(rs0.n nVar) {
        this.f480838d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.n nVar = this.f480838d;
        rs0.h hVar = nVar.f480841b;
        if (hVar != null) {
            rs0.g gVar = rs0.i.f480829a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            gVar.u(hVar);
        }
        android.os.HandlerThread handlerThread = nVar.f480840a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }
}
