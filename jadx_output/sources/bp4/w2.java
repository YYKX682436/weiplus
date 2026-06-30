package bp4;

/* loaded from: classes10.dex */
public final class w2 implements bp4.a3, bp4.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final bp4.b3 f23402d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f23403e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23404f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.i1 f23405g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.h1 f23406h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f23407i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f23408m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23409n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23410o;

    /* renamed from: p, reason: collision with root package name */
    public bp4.c0 f23411p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f23412q;

    /* renamed from: r, reason: collision with root package name */
    public final bp4.q2 f23413r;

    /* renamed from: s, reason: collision with root package name */
    public final bp4.u2 f23414s;

    public w2(bp4.b3 provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f23402d = provider;
        this.f23403e = "MicroMsg.MultiVideoPreview";
        this.f23404f = new android.view.View(((bp4.y) provider).f23427a.f23213i.getContext());
        this.f23407i = new android.graphics.RectF();
        this.f23408m = new android.graphics.RectF();
        this.f23412q = new bp4.r2(this);
        this.f23413r = new bp4.q2(this);
        this.f23414s = new bp4.u2(this);
    }

    public final void a() {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.f23405g;
        if (i1Var == null) {
            return;
        }
        int i17 = i1Var.f175621f;
        int i18 = i1Var.f175622g;
        bp4.b3 b3Var = this.f23402d;
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout multiEditCropLayout = ((bp4.y) b3Var).f23427a.f23210f;
        com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
        multiEditCropLayout.setMaxScaleValue(yVar.f175789f);
        ((bp4.y) b3Var).f23427a.f23210f.setMinScaleValue(yVar.f175790g);
        boolean isEmpty = ((bp4.y) b3Var).f23427a.f23210f.getContentRect().isEmpty();
        ((bp4.y) b3Var).f23427a.f23210f.getContentRect().set(yVar.f175787d);
        ((bp4.y) b3Var).f23427a.f23210f.getContentRect().offset(0, (int) this.f23407i.top);
        ((bp4.y) b3Var).f23427a.f23210f.G(this.f23404f, i17, i18, yVar.f175784a, ml5.k.f328431e, new bp4.v2(isEmpty));
        com.tencent.mars.xlog.Log.i(this.f23403e, "updateVideoCrop, viewWidth:" + i17 + ", viewHeight:" + i18);
    }

    @Override // bp4.a0
    public void c(long j17) {
        com.tencent.mm.plugin.vlog.model.i1 i1Var;
        uq5.p pVar;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        if (this.f23409n) {
            com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f23406h;
            if (h1Var == null || (arrayList = h1Var.f175597c) == null) {
                i1Var = null;
            } else {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    rm5.j jVar = ((com.tencent.mm.plugin.vlog.model.i1) obj).f175627l;
                    if (jVar.f397502d <= j17 && jVar.f397503e > j17) {
                        break;
                    }
                }
                i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
            }
            if (kotlin.jvm.internal.o.b(i1Var, this.f23405g)) {
                return;
            }
            so4.g gVar = so4.g.f410776a;
            so4.a aVar = so4.g.f410780e;
            if (((aVar == null || (pVar = aVar.f410766a) == null) ? -1L : pVar.f430267a) > 0) {
                ((bp4.y) this.f23402d).f23427a.f23225x.setText(dp4.b.f242262a.b(gVar.a(i1Var != null ? i1Var.f175616a : null)));
            }
            pm0.v.X(new bp4.s2(this, i1Var));
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    public void onFinish() {
    }
}
