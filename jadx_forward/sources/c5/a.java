package c5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j5.w f120103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c5.b f120104e;

    public a(c5.b bVar, j5.w wVar) {
        this.f120104e = bVar;
        this.f120103d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = c5.b.f120105d;
        j5.w wVar = this.f120103d;
        c17.a(str, java.lang.String.format("Scheduling work %s", wVar.f379297a), new java.lang.Throwable[0]);
        this.f120104e.f120106a.e(wVar);
    }
}
