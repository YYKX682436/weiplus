package km3;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.p f390782d;

    public o(km3.p pVar) {
        this.f390782d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        km3.p pVar = this.f390782d;
        km3.n nVar = pVar.f390788g;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = pVar.f390787f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15635xf0ea441b);
            int i17 = c15635xf0ea441b.f219979x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b2 = pVar.f390787f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15635xf0ea441b2);
            ((km3.l) nVar).a(pVar, i17, c15635xf0ea441b2.f219975t);
        }
    }
}
