package bp4;

/* loaded from: classes10.dex */
public final class m1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f23256d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f23257e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.u0 f23258f;

    /* renamed from: g, reason: collision with root package name */
    public final bp4.k0 f23259g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f23260h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23261i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23262m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23263n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f23264o;

    /* renamed from: p, reason: collision with root package name */
    public final bp4.o0 f23265p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f23266q;

    /* renamed from: r, reason: collision with root package name */
    public final ro4.c f23267r;

    /* renamed from: s, reason: collision with root package name */
    public ro4.b f23268s;

    /* renamed from: t, reason: collision with root package name */
    public final bp4.b1 f23269t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23270u;

    public m1(android.view.ViewGroup parent, ju3.d0 status, com.tencent.mm.plugin.vlog.model.u0 model, bp4.k0 previewPlugin) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(previewPlugin, "previewPlugin");
        this.f23256d = parent;
        this.f23257e = status;
        this.f23258f = model;
        this.f23259g = previewPlugin;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.d7m);
        this.f23260h = imageView;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) parent.findViewById(com.tencent.mm.R.id.d8k);
        this.f23261i = editorPanelHolder;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder timePanelHolder = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) parent.findViewById(com.tencent.mm.R.id.d8l);
        this.f23262m = timePanelHolder;
        this.f23263n = jz5.h.b(new bp4.k1(this));
        this.f23264o = jz5.h.b(new bp4.l1(this));
        this.f23265p = new bp4.o0();
        this.f23266q = new androidx.recyclerview.widget.GridLayoutManager(parent.getContext(), 5);
        this.f23267r = new ro4.c();
        kotlin.jvm.internal.o.f(timePanelHolder, "timePanelHolder");
        bp4.b1 b1Var = new bp4.b1(timePanelHolder, status);
        this.f23269t = b1Var;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(parent.getContext(), com.tencent.mm.R.raw.icons_filled_magic, i65.a.d(parent.getContext(), com.tencent.mm.R.color.a9z)));
        imageView.setOnClickListener(this);
        previewPlugin.L(b1Var);
        editorPanelHolder.setOnVisibleChangeCallback(new bp4.g1(this));
    }

    public static final void a(bp4.m1 m1Var, ro4.b bVar) {
        m1Var.f23268s = bVar;
        m1Var.f23259g.N(bVar.f398120d, bVar.f398121e);
        long j17 = bVar.f398120d;
        long j18 = bVar.f398121e;
        bp4.b1 b1Var = m1Var.f23269t;
        b1Var.f23106o = j17;
        b1Var.f23107p = j18;
        b1Var.f23108q = j17;
        b1Var.f23109r = j18;
        com.tencent.mm.plugin.vlog.model.h1 composition = m1Var.f23258f.f175743t;
        kotlin.jvm.internal.o.g(composition, "composition");
        boolean z17 = b1Var.f23105n;
        jz5.g gVar = b1Var.f23102h;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = b1Var.f23098d;
        if (!z17) {
            b1Var.f23105n = true;
            editorPanelHolder.setCloseTouchOutside(false);
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup = (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) gVar).getValue();
            bp4.y0 y0Var = b1Var.f23111t;
            timeCropViewGroup.setCallback(y0Var);
            ((com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) gVar).getValue()).setRealTimeCallback(y0Var);
            editorPanelHolder.setOnVisibleChangeCallback(new bp4.s0(b1Var));
            ((android.view.View) ((jz5.n) b1Var.f23103i).getValue()).setOnClickListener(new bp4.t0(b1Var));
            ((android.view.View) ((jz5.n) b1Var.f23104m).getValue()).setOnClickListener(new bp4.u0(b1Var));
            b1Var.a().findViewById(com.tencent.mm.R.id.j7t).setOnClickListener(new bp4.v0(b1Var));
            b1Var.a().findViewById(com.tencent.mm.R.id.j7u).setOnClickListener(new bp4.w0(b1Var));
        }
        long j19 = 1000;
        if (b1Var.f23107p > composition.i().getEndUs() / j19) {
            long endUs = composition.i().getEndUs() / j19;
            b1Var.f23107p = endUs;
            b1Var.f23109r = endUs;
        }
        ((com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) gVar).getValue()).b(composition, b1Var.f23106o, b1Var.f23107p);
        editorPanelHolder.setShow(true);
        b1Var.f23110s = new bp4.h1(m1Var);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        ro4.b bVar;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23261i;
        if (editorPanelHolder.h()) {
            editorPanelHolder.setShow(false);
            return true;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder2 = this.f23262m;
        if (!editorPanelHolder2.h()) {
            return false;
        }
        bp4.b1 b1Var = this.f23269t;
        long j17 = b1Var.f23106o;
        b1Var.f23108q = j17;
        long j18 = b1Var.f23107p;
        b1Var.f23109r = j18;
        bp4.q0 q0Var = b1Var.f23110s;
        if (q0Var != null && (bVar = ((bp4.h1) q0Var).f23186a.f23268s) != null) {
            bVar.f398120d = j17;
            bVar.f398121e = j18;
            uq5.y yVar = bVar.f398119c;
            if (yVar != null) {
                yVar.b(j17, j18);
            }
        }
        bp4.q0 q0Var2 = b1Var.f23110s;
        if (q0Var2 != null) {
            ((bp4.h1) q0Var2).b();
        }
        editorPanelHolder2.setShow(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23261i;
        if (editorPanelHolder.h()) {
            editorPanelHolder.setShow(false);
        } else {
            boolean z17 = this.f23270u;
            bp4.o0 o0Var = this.f23265p;
            if (!z17) {
                this.f23270u = true;
                android.view.View view2 = (android.view.View) ((jz5.n) this.f23263n).getValue();
                kotlin.jvm.internal.o.f(view2, "<get-panelRoot>(...)");
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, view2, null, 2, null);
                editorPanelHolder.setCloseTouchOutside(true);
                jz5.g gVar = this.f23264o;
                ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setAdapter(o0Var);
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f23266q;
                recyclerView.setLayoutManager(gridLayoutManager);
                gridLayoutManager.B = new bp4.i1(this);
                o0Var.f23306e = new bp4.j1(this);
            }
            o0Var.x(this.f23267r.a());
            editorPanelHolder.setShow(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        boolean c17 = com.tencent.mm.plugin.vlog.model.v0.c();
        android.widget.ImageView imageView = this.f23260h;
        if (c17) {
            imageView.setVisibility(i17);
        } else {
            imageView.setVisibility(8);
        }
    }
}
