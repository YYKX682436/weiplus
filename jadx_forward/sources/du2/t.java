package du2;

/* loaded from: classes2.dex */
public final class t implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu2.c f325034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f f325035b;

    public t(fu2.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f serviceC15002xfa6c787f) {
        this.f325034a = cVar;
        this.f325035b = serviceC15002xfa6c787f;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        fu2.c cVar = this.f325034a;
        fu2.a aVar2 = ((eu2.j) cVar).f338324b;
        aVar2.f348405a = bitmap;
        mn2.h3 h3Var = (mn2.h3) aVar.f375106a;
        aVar2.f348406b = h3Var != null ? h3Var.n() : null;
        du2.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.f210010r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f serviceC15002xfa6c787f = this.f325035b;
        serviceC15002xfa6c787f.h(cVar);
        ((du2.q) ((jz5.n) serviceC15002xfa6c787f.f210013p).mo141623x754a37bb()).c(serviceC15002xfa6c787f.f210011n, cVar, serviceC15002xfa6c787f.f210014q);
    }
}
