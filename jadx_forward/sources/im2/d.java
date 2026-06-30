package im2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd f373814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f373815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ng2.g f373816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, ng2.g gVar) {
        super(0);
        this.f373814d = c14380x23078afd;
        this.f373815e = c0Var;
        this.f373816f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f373814d.f198514d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachToWindow safe remove isHandler: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f373815e;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            this.f373816f.a();
            ig2.m.f372926a.d();
        }
        return jz5.f0.f384359a;
    }
}
