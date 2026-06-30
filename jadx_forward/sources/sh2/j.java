package sh2;

/* loaded from: classes3.dex */
public final class j extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final sh2.a f489559f;

    public j(sh2.a action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f489559f = action;
    }

    @Override // fp0.d
    public void a() {
        sh2.i iVar = new sh2.i(this);
        sh2.c cVar = (sh2.c) this.f489559f;
        cVar.getClass();
        cVar.f489542b++;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new sh2.b(cVar, iVar, null), 2, null);
        }
    }

    @Override // fp0.d
    public java.lang.String d() {
        sh2.c cVar = (sh2.c) this.f489559f;
        return "id_" + cVar.f489547d + '_' + cVar.f489548e + '_' + cVar.f489549f;
    }
}
