package qb2;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qb2.t f442761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qb2.l0 f442762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f442763c;

    public k0(qb2.t tVar, qb2.l0 l0Var, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f442761a = tVar;
        this.f442762b = l0Var;
        this.f442763c = adapterContextMenuInfo;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            qb2.t tVar = this.f442761a;
            boolean mo60485xc9e4dcd4 = Kj.mo60485xc9e4dcd4(tVar.f72763xa3c65b86, false);
            if (mo60485xc9e4dcd4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
                java.lang.String field_sessionId = tVar.f65866xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                pk6.y0(field_sessionId, false);
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().mo142179xf35bbb4(tVar.f65866xbed8694c, 6, tVar);
                yz5.a aVar = this.f442762b.f442766d;
                if (aVar != null) {
                }
            }
            c01.w9.h(tVar.f65866xbed8694c, new qb2.j0(mo60485xc9e4dcd4, this.f442763c));
        }
        return jz5.f0.f384359a;
    }
}
