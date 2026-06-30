package bp4;

/* loaded from: classes10.dex */
public final class b1 implements yt3.r2, bp4.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23098d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f23099e;

    /* renamed from: f, reason: collision with root package name */
    public bp4.c0 f23100f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f23101g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23102h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23103i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f23104m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23105n;

    /* renamed from: o, reason: collision with root package name */
    public long f23106o;

    /* renamed from: p, reason: collision with root package name */
    public long f23107p;

    /* renamed from: q, reason: collision with root package name */
    public long f23108q;

    /* renamed from: r, reason: collision with root package name */
    public long f23109r;

    /* renamed from: s, reason: collision with root package name */
    public bp4.q0 f23110s;

    /* renamed from: t, reason: collision with root package name */
    public final bp4.y0 f23111t;

    public b1(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23098d = holder;
        this.f23099e = status;
        this.f23101g = jz5.h.b(new bp4.z0(this));
        this.f23102h = jz5.h.b(new bp4.a1(this));
        this.f23103i = jz5.h.b(new bp4.r0(this));
        this.f23104m = jz5.h.b(new bp4.x0(this));
        this.f23111t = new bp4.y0(this);
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f23101g).getValue();
    }

    @Override // bp4.a0
    public void c(long j17) {
        ((com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup) ((jz5.n) this.f23102h).getValue()).setProgress(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f23100f = c0Var;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23098d;
        if (!editorPanelHolder.h()) {
            return false;
        }
        bp4.q0 q0Var = this.f23110s;
        if (q0Var != null) {
            ((bp4.h1) q0Var).b();
        }
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 8) {
            bp4.q0 q0Var = this.f23110s;
            if (q0Var != null) {
                ((bp4.h1) q0Var).b();
            }
            this.f23098d.setShow(false);
        }
    }
}
