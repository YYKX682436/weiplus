package uu0;

/* loaded from: classes5.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f512765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uu0.c f512766e;

    public g(uu0.c cVar, java.lang.Boolean bool) {
        this.f512766e = cVar;
        this.f512765d = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f512766e.f512741c) {
            uu0.c.b(this.f512766e, this.f512765d);
        }
    }
}
