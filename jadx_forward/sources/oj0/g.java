package oj0;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f427268d;

    public g(oj0.h hVar) {
        this.f427268d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f480829a;
        oj0.h hVar = this.f427268d;
        rs0.h hVar2 = hVar.f427274f;
        if (hVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEGLEnvironment");
            throw null;
        }
        gVar.u(hVar2);
        hVar.f427270b.quit();
        android.os.HandlerThread handlerThread = hVar.f427272d;
        if (handlerThread == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callbackThread");
            throw null;
        }
        handlerThread.quit();
        rh0.d0 d0Var = hVar.f427278j;
        if (d0Var != null) {
            ((p05.l4) d0Var).o();
        }
        hVar.f427278j = null;
    }
}
