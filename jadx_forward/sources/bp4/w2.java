package bp4;

/* loaded from: classes10.dex */
public final class w2 implements bp4.a3, bp4.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final bp4.b3 f104935d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104936e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104937f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f104938g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f104939h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f104940i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f104941m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f104942n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f104943o;

    /* renamed from: p, reason: collision with root package name */
    public bp4.c0 f104944p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f104945q;

    /* renamed from: r, reason: collision with root package name */
    public final bp4.q2 f104946r;

    /* renamed from: s, reason: collision with root package name */
    public final bp4.u2 f104947s;

    public w2(bp4.b3 provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f104935d = provider;
        this.f104936e = "MicroMsg.MultiVideoPreview";
        this.f104937f = new android.view.View(((bp4.y) provider).f104960a.f104746i.getContext());
        this.f104940i = new android.graphics.RectF();
        this.f104941m = new android.graphics.RectF();
        this.f104945q = new bp4.r2(this);
        this.f104946r = new bp4.q2(this);
        this.f104947s = new bp4.u2(this);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = this.f104938g;
        if (i1Var == null) {
            return;
        }
        int i17 = i1Var.f257154f;
        int i18 = i1Var.f257155g;
        bp4.b3 b3Var = this.f104935d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2343xd1075a44.C18829x236e8cfd c18829x236e8cfd = ((bp4.y) b3Var).f104960a.f104743f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
        c18829x236e8cfd.m81920x7c800d89(yVar.f257322f);
        ((bp4.y) b3Var).f104960a.f104743f.m81922xe91e3cf7(yVar.f257323g);
        boolean isEmpty = ((bp4.y) b3Var).f104960a.f104743f.getContentRect().isEmpty();
        ((bp4.y) b3Var).f104960a.f104743f.getContentRect().set(yVar.f257320d);
        ((bp4.y) b3Var).f104960a.f104743f.getContentRect().offset(0, (int) this.f104940i.top);
        ((bp4.y) b3Var).f104960a.f104743f.G(this.f104937f, i17, i18, yVar.f257317a, ml5.k.f409964e, new bp4.v2(isEmpty));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f104936e, "updateVideoCrop, viewWidth:" + i17 + ", viewHeight:" + i18);
    }

    @Override // bp4.a0
    public void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var;
        uq5.p pVar;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        if (this.f104942n) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = this.f104939h;
            if (h1Var == null || (arrayList = h1Var.f257130c) == null) {
                i1Var = null;
            } else {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    rm5.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257160l;
                    if (jVar.f479035d <= j17 && jVar.f479036e > j17) {
                        break;
                    }
                }
                i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i1Var, this.f104938g)) {
                return;
            }
            so4.g gVar = so4.g.f492309a;
            so4.a aVar = so4.g.f492313e;
            if (((aVar == null || (pVar = aVar.f492299a) == null) ? -1L : pVar.f511800a) > 0) {
                ((bp4.y) this.f104935d).f104960a.f104758x.setText(dp4.b.f323795a.b(gVar.a(i1Var != null ? i1Var.f257149a : null)));
            }
            pm0.v.X(new bp4.s2(this, i1Var));
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }
}
