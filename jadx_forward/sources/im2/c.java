package im2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd f373801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f373802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ng2.g f373803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mo0.a f373804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, ng2.g gVar, mo0.a aVar) {
        super(1);
        this.f373801d = c14380x23078afd;
        this.f373802e = c0Var;
        this.f373803f = gVar;
        this.f373804g = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = this.f373801d.f198514d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNotifyVisibilityFunction: ");
        sb6.append(intValue);
        sb6.append(" isHandler: ");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f373802e;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (intValue == 0 && !c0Var.f391645d) {
            c0Var.f391645d = true;
            this.f373803f.a();
            ig2.m.f372926a.d();
        }
        this.f373804g.f411789f = null;
        return jz5.f0.f384359a;
    }
}
