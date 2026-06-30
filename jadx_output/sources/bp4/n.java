package bp4;

/* loaded from: classes10.dex */
public final class n extends yt3.a implements bp4.m2, bp4.a0, bp4.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23273f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23274g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23275h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23276i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f23277m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23278n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f23279o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f23280p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f23281q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f23282r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23283s;

    /* renamed from: t, reason: collision with root package name */
    public long f23284t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23285u;

    /* renamed from: v, reason: collision with root package name */
    public bp4.c0 f23286v;

    /* renamed from: w, reason: collision with root package name */
    public final bp4.p f23287w;

    /* renamed from: x, reason: collision with root package name */
    public final bp4.i f23288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23273f = layout;
        android.content.Context context = layout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = new com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder(context);
        layout.addView(editorPanelHolder);
        editorPanelHolder.setVisibility(8);
        this.f23274g = editorPanelHolder;
        this.f23275h = jz5.h.b(new bp4.j(this));
        this.f23276i = jz5.h.b(new bp4.m(this));
        this.f23277m = jz5.h.b(new bp4.g(this));
        this.f23278n = jz5.h.b(new bp4.a(this));
        this.f23279o = jz5.h.b(new bp4.h(this));
        this.f23280p = jz5.h.b(new bp4.l(this));
        this.f23281q = jz5.h.b(new bp4.f(this));
        this.f23282r = jz5.h.b(new bp4.k(this));
        this.f23287w = new bp4.p();
        this.f23288x = new bp4.i(this, status);
    }

    public static final android.view.ViewGroup z(bp4.n nVar) {
        return (android.view.ViewGroup) ((jz5.n) nVar.f23275h).getValue();
    }

    public final com.tencent.mm.plugin.vlog.model.h1 A(com.tencent.mm.plugin.vlog.model.h1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        bp4.p pVar = this.f23287w;
        pVar.getClass();
        java.util.Map map = pVar.f23334a;
        ((java.util.LinkedHashMap) map).clear();
        java.util.Iterator it = composition.f175597c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
            int i17 = i1Var.f175625j;
            rm5.j jVar = i1Var.f175627l;
            map.put(java.lang.Integer.valueOf(i1Var.f175619d), new bp4.o(i17, jVar.f397504f, jVar.f397505g));
            so4.g.f410776a.e(i1Var, 0);
        }
        return composition;
    }

    public final com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView B() {
        return (com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView) ((jz5.n) this.f23276i).getValue();
    }

    public final com.tencent.mm.plugin.vlog.model.h1 C(com.tencent.mm.plugin.vlog.model.h1 composition, boolean z17) {
        kotlin.jvm.internal.o.g(composition, "composition");
        bp4.p pVar = this.f23287w;
        pVar.getClass();
        java.util.Iterator it = composition.f175597c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
            bp4.o oVar = (bp4.o) ((java.util.LinkedHashMap) pVar.f23334a).get(java.lang.Integer.valueOf(i1Var.f175619d));
            if (oVar != null) {
                if (z17) {
                    i1Var.d(oVar.f23303b);
                    i1Var.c(oVar.f23304c);
                }
                so4.g.f410776a.e(i1Var, oVar.f23302a);
            }
        }
        return composition;
    }

    public final void D(com.tencent.mm.plugin.vlog.model.h1 composition, long j17) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.f23285u = false;
        boolean z17 = this.f23283s;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23274g;
        if (!z17) {
            this.f23283s = true;
            editorPanelHolder.setCloseTouchOutside(false);
            B().setCallback(this.f23288x);
            ((android.widget.ImageView) ((jz5.n) this.f23278n).getValue()).setOnClickListener(new bp4.b(this));
            ((android.widget.ImageView) ((jz5.n) this.f23279o).getValue()).setOnClickListener(new bp4.c(this));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f23282r).getValue()).setOnClickListener(new bp4.d(this));
            editorPanelHolder.setOnVisibleChangeCallback(new bp4.e(this));
        }
        this.f23284t = j17;
        editorPanelHolder.setShow(true);
        B().setTrack(composition);
        E();
    }

    public final void E() {
        a06.d.d(((float) B().getCutDuration()) / 1000.0f);
        long c17 = a06.d.c(((float) java.lang.Math.min(this.f23284t, B().getCutDuration())) / 1000.0f);
        jz5.g gVar = this.f23277m;
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(this.f23274g.getContext().getString(com.tencent.mm.R.string.k8_, java.lang.Long.valueOf(c17)));
        ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(B().getSourceDuration() > this.f23284t ? 0 : 4);
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
        if (h1Var == null || j17 < 0) {
            return;
        }
        B().b(h1Var, j17);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f23274g.h()) {
            B().setProgress(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f23286v = c0Var;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23274g;
        if (!editorPanelHolder.h()) {
            return false;
        }
        this.f23285u = false;
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // bp4.m2
    public void onVideoPause() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f23282r).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e(this.f23273f.getContext(), com.tencent.mm.R.raw.icons_filled_play, -1));
    }

    @Override // bp4.m2
    public void onVideoPlay() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f23282r).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e(this.f23273f.getContext(), com.tencent.mm.R.raw.icons_filled_pause, -1));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 8) {
            this.f23285u = false;
            this.f23274g.setShow(false);
        }
    }
}
