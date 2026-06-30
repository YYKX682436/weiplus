package ws2;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f530673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f530674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ws2.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var) {
        super(0);
        this.f530673d = yVar;
        this.f530674e = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ws2.y yVar = this.f530673d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(yVar.f530625b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f530674e;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ayb, (android.view.ViewGroup) k0Var, false);
        k0Var.addView(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        at2.n1 n1Var = new at2.n1((android.view.ViewGroup) inflate, k0Var);
        yVar.f530700o = n1Var;
        return n1Var;
    }
}
