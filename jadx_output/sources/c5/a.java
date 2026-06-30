package c5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j5.w f38570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c5.b f38571e;

    public a(c5.b bVar, j5.w wVar) {
        this.f38571e = bVar;
        this.f38570d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = c5.b.f38572d;
        j5.w wVar = this.f38570d;
        c17.a(str, java.lang.String.format("Scheduling work %s", wVar.f297764a), new java.lang.Throwable[0]);
        this.f38571e.f38573a.e(wVar);
    }
}
