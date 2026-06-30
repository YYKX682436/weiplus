package c24;

/* loaded from: classes.dex */
public final class e extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f119607d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f119608e;

    public e(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f119607d = list;
        this.f119608e = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        u26.k0 k0Var = new u26.k0();
        ym3.d dVar = new ym3.d(request);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingDataSource", "get data, size : " + this.f119608e.size());
        dVar.f544682c.addAll(this.f119608e);
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f119608e = new java.util.LinkedList();
        int i17 = 0;
        for (java.lang.Object obj : this.f119607d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            a24.i iVar = (a24.i) obj;
            if (iVar.getF243481p()) {
                this.f119608e.add(new c24.f(i17, iVar));
            }
            i17 = i18;
        }
    }
}
