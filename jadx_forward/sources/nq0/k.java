package nq0;

/* loaded from: classes7.dex */
public final class k implements jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f420466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nq0.p f420467e;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, nq0.p pVar) {
        this.f420466d = h0Var;
        this.f420467e = pVar;
    }

    @Override // jc3.l0
    /* renamed from: onDestroy */
    public void mo252xac79a11b() {
        iq0.b bVar = iq0.c.f375175e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f420466d;
        bVar.a((iq0.c) h0Var.f391656d);
        nq0.p pVar = this.f420467e;
        pVar.f420477f.remove(h0Var.f391656d);
        pVar.f420478g.remove(h0Var.f391656d);
    }
}
