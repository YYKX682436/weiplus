package cw2;

/* loaded from: classes10.dex */
public final class j5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f305317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t85.j f305318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 f305319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(mu3.b bVar, t85.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14) {
        super(0);
        this.f305317d = bVar;
        this.f305318e = jVar;
        this.f305319f = c15186x26928e14;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mu3.b bVar = this.f305317d;
        p05.l4 l4Var = bVar.f412931v;
        t85.j jVar = this.f305318e;
        if (l4Var != null) {
            l4Var.i(jVar);
        }
        if (jVar != null) {
            pm0.v.V(2000L, new cw2.i5(bVar, this.f305319f));
        }
        return jz5.f0.f384359a;
    }
}
