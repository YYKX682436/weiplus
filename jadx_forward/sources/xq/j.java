package xq;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f537517d;

    public j(xq.m mVar) {
        this.f537517d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.d dVar;
        xq.m mVar = this.f537517d;
        if (mVar.f537533l) {
            xq.c cVar = mVar.f537532k;
            java.lang.Runnable runnable = mVar.f537536o;
            if (cVar != null && (dVar = cVar.f537506d) != null && dVar.f537507b == -1) {
                ((xq.h) runnable).run();
            }
            pm0.v.C(runnable);
            mVar.b();
            mVar.f537524c = 0L;
            mVar.f537523b = "";
            mVar.f537528g = null;
            xq.f fVar = mVar.f537539r;
            if (fVar != null) {
                xq.p pVar = ((xq.o) fVar).f537541a.f537547f;
            }
            if (fVar != null) {
                xq.n nVar = ((xq.o) fVar).f537541a.f537544c;
                nVar.getClass();
                nVar.f537540a.remove(mVar);
            }
        }
    }
}
