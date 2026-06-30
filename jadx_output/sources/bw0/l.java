package bw0;

/* loaded from: classes5.dex */
public abstract class l extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f24790n;

    /* renamed from: o, reason: collision with root package name */
    public sw0.b f24791o;

    /* renamed from: p, reason: collision with root package name */
    public sw0.b f24792p;

    /* renamed from: q, reason: collision with root package name */
    public ex0.o f24793q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f24794r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f24795s;

    /* renamed from: t, reason: collision with root package name */
    public final bw0.j f24796t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f24790n = jz5.h.b(new bw0.h(this));
        this.f24794r = jz5.h.b(new bw0.k(this));
        this.f24795s = com.tencent.mm.ui.widget.dialog.u3.c(getContext(), j65.q.b(getContext(), com.tencent.mm.R.string.lli), false, 0, null);
        this.f24796t = new bw0.j(this);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new bw0.a(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void Z6(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        bw0.a panel = (bw0.a) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        panel.setSelectedCallback(this.f24796t);
        panel.I(bw0.b.f24774d, new bw0.c(this, panel));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        bw0.a panel = (bw0.a) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        bw0.a aVar = (bw0.a) this.f69240i;
        com.tencent.maas.base.MJID mjid = aVar != null ? (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(aVar, "key_dest_segment", null, 2, null) : null;
        ex0.o k76 = mjid != null ? k7(mjid) : null;
        if (k76 == null) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(this, false, 1, null);
            return;
        }
        this.f24793q = k76;
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = k76.f257154q;
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
        java.lang.String D1 = D != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.D1(musicSegment, D) : "";
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = musicSegment.D();
        java.lang.String H1 = D2 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.H1(musicSegment, D2) : "";
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D3 = musicSegment.D();
        sw0.b bVar = new sw0.b("", D1, H1, D3 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.A1(musicSegment, D3) : "", k76.f257130f.g0());
        this.f24792p = bVar;
        this.f24791o = bVar;
        if (!l7().f457642f) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f24795s;
            if (!u3Var.isShowing()) {
                u3Var.show();
            }
        }
        l7().f457652p.observe(W6(), new bw0.d(panel, this));
        l7().f457654r.observe(W6(), new bw0.e(panel, this));
        l7().f457650n.observe(W6(), new bw0.g(panel, this));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f24790n).getValue();
        bw0.a aVar = (bw0.a) this.f69240i;
        if (aVar == null || (dVar = aVar.getPanelLevel()) == null) {
            dVar = zw0.d.f476561f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    public ex0.o k7(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return null;
    }

    public final xw0.r l7() {
        return (xw0.r) ((jz5.n) this.f24794r).getValue();
    }

    public abstract gx0.hf m7();

    public void n7() {
    }

    public void o7() {
    }

    public void p7() {
    }
}
