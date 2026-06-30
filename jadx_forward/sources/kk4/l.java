package kk4;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f390090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ck4.b f390091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck4.b f390092f;

    public l(kk4.v vVar, ck4.b bVar, ck4.b bVar2) {
        this.f390090d = vVar;
        this.f390091e = bVar;
        this.f390092f = bVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.v vVar = this.f390090d;
        if (vVar.f390118j) {
            vVar.getClass();
            nk4.s sVar = this.f390090d.f390121m;
            if (sVar != null) {
                ck4.b bVar = this.f390091e;
                if (!(bVar instanceof ck4.b)) {
                    bVar = null;
                }
                ((kw2.m0) sVar).D(new nk4.f(bVar != null ? bVar.f124067d2 : 0L, android.os.SystemClock.uptimeMillis(), this.f390090d.S, null));
            }
            ((ku5.t0) ku5.t0.f394148d).k(new kk4.k(this.f390092f), 20L);
            this.f390090d.R = null;
        }
    }
}
