package qw2;

/* loaded from: classes10.dex */
public final class i implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 f448662a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3) {
        this.f448662a = c15211x75b8b4d3;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        qw2.f fVar;
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3 = this.f448662a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15211x75b8b4d3.f212344x, task.f507252f.f275223e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15211x75b8b4d3.f212342v, "onLoaderFin: " + c15211x75b8b4d3.f212344x + ", " + status);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3.A(c15211x75b8b4d3, status);
            java.util.Iterator it = c15211x75b8b4d3.f212343w.f448668d.iterator();
            while (it.hasNext()) {
                qw2.k kVar = (qw2.k) it.next();
                if (kVar != null && (fVar = kVar.f448667c) != null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f448656f, c15211x75b8b4d3.f212344x) && fVar.f448657g) {
                        fVar.f448657g = false;
                        fVar.m8147xed6e4d18(fVar.f448655e);
                    }
                }
            }
        }
    }
}
