package bq;

/* loaded from: classes10.dex */
public abstract class e extends com.p314xaae8f345.mm.p944x882e457a.i implements cz2.j {

    /* renamed from: m, reason: collision with root package name */
    public final r45.qt2 f105016m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f105017n;

    public e(r45.qt2 qt2Var) {
        this.f105016m = qt2Var;
        this.f105017n = jz5.h.b(new bq.d(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public final void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        jz5.g gVar = this.f105017n;
        cz2.i iVar = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar.f306545e = iVar.f306544d.a();
        s(i17, i18, str, resp, m1Var);
        cz2.i iVar2 = (cz2.i) ((jz5.n) gVar).mo141623x754a37bb();
        iVar2.f306546f = iVar2.f306544d.a();
        ((cz2.i) ((jz5.n) gVar).mo141623x754a37bb()).a(i17, i18, str, this.f152179f);
        hz2.d dVar = hz2.d.f367846a;
        dVar.g(i17, i18, str);
        dVar.i(i17, i18, str);
        dVar.e(i17, i18, str);
        az2.m.b(az2.m.f97677a, i18, str, 0, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", "[dispatchCgi] " + this.f152179f.f152245c);
        ((cz2.i) ((jz5.n) this.f105017n).mo141623x754a37bb()).c(this.f152179f);
        az2.k.f97672a.a(this.f152179f.f152246d);
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }

    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }

    @Override // cz2.j
    public cz2.f v() {
        return cz2.f.f306535d;
    }

    @Override // cz2.j
    public org.json.JSONObject w() {
        return null;
    }

    @Override // cz2.j
    public org.json.JSONObject z() {
        return null;
    }

    public /* synthetic */ e(r45.qt2 qt2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : qt2Var);
    }
}
