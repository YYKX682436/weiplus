package hw2;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.o f367076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(os5.o oVar, hw2.t tVar) {
        super(1);
        this.f367076d = oVar;
        this.f367077e = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        os5.o oVar = this.f367076d;
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7) oVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
            c14302xfcce20b7.m57259xcc82d0e(c14302xfcce20b7.getSelectedEffect());
        }
        hw2.t tVar = this.f367077e;
        tVar.f367102q = intValue;
        tVar.b().putInt("beauty_suit", tVar.f367102q);
        java.util.Iterator it = ((java.lang.Iterable) ((jz5.n) tVar.f367105t).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            int i17 = ((qs5.c) it.next()).f447956a;
            tVar.g(i17, tVar.a(tVar.f367102q, i17));
        }
        tVar.f();
        return jz5.f0.f384359a;
    }
}
