package qa1;

/* loaded from: classes14.dex */
public class l implements qa1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa1.m f442537a;

    public l(qa1.m mVar) {
        this.f442537a = mVar;
    }

    @Override // qa1.o
    /* renamed from: onDone */
    public void mo159669xc3989e01() {
        qa1.m mVar = this.f442537a;
        int i17 = mVar.f442538d;
        qa1.p pVar = mVar.f442542h;
        if (i17 == 0) {
            pVar.f442544g = new qa1.a(pVar);
        } else {
            int i18 = qa1.p.f442543p;
            if ((i17 & 1) > 0) {
                if ((i17 & 2) > 0) {
                    throw new java.lang.IllegalArgumentException("not support live and record at same time now");
                }
            }
            if ((i17 & 2) > 0) {
                pVar.f442544g = new qa1.w(pVar);
            } else {
                if (!((i17 & 1) > 0)) {
                    throw new java.lang.IllegalArgumentException("invalid flag");
                }
                pVar.f442544g = new qa1.f0(pVar);
            }
        }
        pVar.f442544g.mo159664x316510();
        pVar.f442544g.A(pVar.f442545h, new qa1.k(this));
    }
}
