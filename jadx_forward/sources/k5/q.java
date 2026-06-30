package k5;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f385684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k5.r f385685e;

    public q(k5.r rVar, l5.m mVar) {
        this.f385685e = rVar;
        this.f385684d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k5.r rVar = this.f385685e;
        try {
            a5.o oVar = (a5.o) this.f385684d.get();
            if (oVar == null) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Worker was marked important (%s) but did not provide ForegroundInfo", rVar.f385689f.f379299c));
            }
            a5.a0.c().a(k5.r.f385686m, java.lang.String.format("Updating notification for %s", rVar.f385689f.f379299c), new java.lang.Throwable[0]);
            p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f abstractC1260xfe49ee9f = rVar.f385690g;
            abstractC1260xfe49ee9f.f93995h = true;
            l5.m mVar = rVar.f385687d;
            a5.p pVar = rVar.f385691h;
            android.content.Context context = rVar.f385688e;
            java.util.UUID uuid = abstractC1260xfe49ee9f.f93992e.f93998a;
            k5.t tVar = (k5.t) pVar;
            tVar.getClass();
            l5.m mVar2 = new l5.m();
            ((m5.c) tVar.f385698a).a(new k5.s(tVar, mVar2, uuid, oVar, context));
            mVar.k(mVar2);
        } catch (java.lang.Throwable th6) {
            rVar.f385687d.j(th6);
        }
    }
}
