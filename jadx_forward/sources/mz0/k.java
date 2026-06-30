package mz0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y f414523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mz0.b2 b2Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.y yVar) {
        super(0);
        this.f414522d = b2Var;
        this.f414523e = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414522d;
        b2Var.f7().dismiss();
        dz0.d l76 = b2Var.l7();
        mz0.j jVar = new mz0.j(b2Var, this.f414523e);
        dz0.v vVar = (dz0.v) l76;
        p3325xe03a0797.p3326xc267989b.l.d(vVar.f326568g.m158345xefc66565(), null, null, new dz0.n(vVar.f326568g, b2Var.n7(), vVar, jVar, null), 3, null);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 g76 = b2Var.g7();
        if (g76 != null) {
            g76.c(dw3.o0.f325778i);
        }
        return jz5.f0.f384359a;
    }
}
