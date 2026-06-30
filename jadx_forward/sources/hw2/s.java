package hw2;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.p f367084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os5.o f367086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(os5.p pVar, hw2.t tVar, os5.o oVar) {
        super(0);
        this.f367084d = pVar;
        this.f367085e = tVar;
        this.f367086f = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hw2.h hVar = hw2.t.f367087v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#detailsView.onRequestReset suit=");
        os5.p pVar = this.f367084d;
        sb6.append(pVar != null ? java.lang.Integer.valueOf(pVar.getSuit()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordBeautifyPlugin", sb6.toString());
        hw2.t tVar = this.f367085e;
        for (qs5.c cVar : (java.lang.Iterable) ((jz5.n) tVar.f367105t).mo141623x754a37bb()) {
            tVar.b().remove(tVar.d(tVar.f367102q, cVar.f447956a));
            int i17 = tVar.f367102q;
            int i18 = cVar.f447956a;
            tVar.g(i18, tVar.c(i17, i18));
        }
        os5.o oVar = this.f367086f;
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7) oVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
            c14302xfcce20b7.m57259xcc82d0e(c14302xfcce20b7.getSelectedEffect());
        }
        tVar.f();
        return jz5.f0.f384359a;
    }
}
