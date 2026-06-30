package hl0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl0.b f363573d;

    public a(hl0.b bVar) {
        this.f363573d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f363573d.f363574d) {
            bm0.c cVar = this.f363573d.f363574d.f363585a;
            if (cVar != null) {
                cVar.d();
                this.f363573d.f363574d.f363585a = null;
            }
        }
    }
}
