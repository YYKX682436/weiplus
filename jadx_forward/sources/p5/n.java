package p5;

/* loaded from: classes16.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final p5.m f433523a = new p5.m();

    public void a(java.lang.Exception exc) {
        boolean z17;
        p5.m mVar = this.f433523a;
        synchronized (mVar.f433518a) {
            if (mVar.f433519b) {
                z17 = false;
            } else {
                mVar.f433519b = true;
                mVar.f433521d = exc;
                mVar.f433518a.notifyAll();
                mVar.b();
                z17 = true;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
