package bp4;

/* loaded from: classes10.dex */
public final class z3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23437f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f23438g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23439h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23440i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f23441m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23442n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f23443o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String[] f23444p;

    /* renamed from: q, reason: collision with root package name */
    public float f23445q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23446r;

    /* renamed from: s, reason: collision with root package name */
    public int f23447s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f23448t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.l f23449u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23437f = holder;
        this.f23438g = "MicroMsg.TrackDurationScalePlugin";
        this.f23439h = jz5.h.b(new bp4.t3(this));
        this.f23440i = jz5.h.b(new bp4.y3(this));
        this.f23441m = jz5.h.b(new bp4.q3(this));
        this.f23442n = jz5.h.b(new bp4.r3(this));
        this.f23443o = kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.75f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f));
        java.lang.String[] stringArray = holder.getContext().getResources().getStringArray(com.tencent.mm.R.array.f478034ah);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        this.f23444p = stringArray;
        this.f23445q = 1.0f;
        this.f23448t = new bp4.s3(status);
        this.f23449u = new bp4.u3(status);
        holder.setOnVisibleChangeCallback(new bp4.p3(this));
        holder.setCloseTouchOutside(false);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23437f;
        if (!editorPanelHolder.h()) {
            return false;
        }
        editorPanelHolder.setShow(false);
        return true;
    }

    public final void z(float f17) {
        this.f23445q = f17;
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        java.util.List list = this.f23443o;
        int indexOf = list.indexOf(valueOf);
        if (indexOf < 0) {
            indexOf = list.size() / 2;
        }
        this.f23447s = indexOf;
        jz5.g gVar = this.f23440i;
        ((com.tencent.mm.plugin.vlog.ui.LabelSlider) ((jz5.n) gVar).getValue()).setLabelCount(list.size());
        ((com.tencent.mm.plugin.vlog.ui.LabelSlider) ((jz5.n) gVar).getValue()).setSelection(indexOf);
        ((com.tencent.mm.plugin.vlog.ui.LabelSlider) ((jz5.n) gVar).getValue()).setLabels(kz5.z.z0(this.f23444p));
        ((com.tencent.mm.plugin.vlog.ui.LabelSlider) ((jz5.n) gVar).getValue()).setCallback(new bp4.v3(this));
        ((android.view.View) ((jz5.n) this.f23441m).getValue()).setOnClickListener(new bp4.w3(this));
        ((android.view.View) ((jz5.n) this.f23442n).getValue()).setOnClickListener(new bp4.x3(this));
        this.f23446r = false;
        this.f23437f.setShow(true);
    }
}
