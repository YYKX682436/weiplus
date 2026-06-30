package bp4;

/* loaded from: classes10.dex */
public final class o4 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23316f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f23317g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23318h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23319i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f23320m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f23321n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f23322o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23323p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23324q;

    /* renamed from: r, reason: collision with root package name */
    public long f23325r;

    /* renamed from: s, reason: collision with root package name */
    public long f23326s;

    /* renamed from: t, reason: collision with root package name */
    public float f23327t;

    /* renamed from: u, reason: collision with root package name */
    public long f23328u;

    /* renamed from: v, reason: collision with root package name */
    public long f23329v;

    /* renamed from: w, reason: collision with root package name */
    public long f23330w;

    /* renamed from: x, reason: collision with root package name */
    public bp4.c0 f23331x;

    /* renamed from: y, reason: collision with root package name */
    public bp4.c0 f23332y;

    /* renamed from: z, reason: collision with root package name */
    public final bp4.l4 f23333z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23316f = holder;
        this.f23317g = "MicroMsg.VLogTrackEditPlugin";
        this.f23318h = jz5.h.b(new bp4.m4(this));
        this.f23319i = jz5.h.b(new bp4.n4(this));
        this.f23320m = jz5.h.b(new bp4.j4(this));
        this.f23321n = jz5.h.b(new bp4.f4(this));
        this.f23322o = jz5.h.b(new bp4.k4(this));
        this.f23327t = 1.0f;
        this.f23333z = new bp4.l4(this, status);
    }

    public static void A(bp4.o4 o4Var, com.tencent.mm.plugin.vlog.model.i1 track, boolean z17, long j17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        long j18 = (i17 & 4) != 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17;
        o4Var.getClass();
        kotlin.jvm.internal.o.g(track, "track");
        bp4.l4 l4Var = o4Var.f23333z;
        if (z18) {
            long j19 = o4Var.f23329v;
            if (j19 != 0) {
                l4Var.b(o4Var.f23328u, j19);
                return;
            }
        }
        o4Var.f23324q = false;
        boolean z19 = o4Var.f23323p;
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = o4Var.f23316f;
        if (!z19) {
            o4Var.f23323p = true;
            editorPanelHolder.setCloseTouchOutside(false);
            o4Var.z().setCallback(l4Var);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) o4Var.f23321n).getValue();
            if (imageView != null) {
                imageView.setOnClickListener(new bp4.g4(o4Var));
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) o4Var.f23322o).getValue();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new bp4.h4(o4Var));
            }
            editorPanelHolder.setOnVisibleChangeCallback(new bp4.i4(o4Var));
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = new com.tencent.mm.plugin.vlog.model.i1(track.f175616a, track.f175617b, 0, 4, null);
        rm5.j jVar = track.f175627l;
        i1Var.c(jVar.f397508j);
        i1Var.a(((float) jVar.f397508j) / jVar.f397506h);
        i1Var.b(jVar.f397506h);
        rm5.j jVar2 = i1Var.f175627l;
        jVar2.f397516r = 0L;
        jVar2.f397517s = jVar2.f397503e;
        jVar2.g();
        o4Var.f23325r = jVar.f397504f;
        o4Var.f23326s = java.lang.Math.min(jVar.f397505g, j18);
        o4Var.f23327t = jVar.f397506h;
        o4Var.f23328u = ((float) o4Var.f23325r) / r5;
        o4Var.f23329v = ((float) r3) / r5;
        o4Var.f23330w = jVar.f397508j;
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(kz5.b0.c(i1Var));
        float f17 = (float) o4Var.f23325r;
        float f18 = jVar.f397506h;
        h1Var.s(f17 / f18, ((float) o4Var.f23326s) / f18);
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView z27 = o4Var.z();
        kotlin.jvm.internal.o.f(z27, "<get-trackCropView>(...)");
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.b(z27, h1Var, 0L, 0L, 6, null);
        editorPanelHolder.setShow(true);
        o4Var.B();
    }

    public final void B() {
        java.lang.Math.round((((float) this.f23330w) / this.f23327t) / 1000.0f);
        ((android.widget.TextView) ((jz5.n) this.f23320m).getValue()).setText(this.f23316f.getContext().getString(com.tencent.mm.R.string.k8_, java.lang.Integer.valueOf(java.lang.Math.round(((float) (this.f23329v - this.f23328u)) / 1000.0f))));
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f23316f.h()) {
            z().setProgress(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23316f;
        if (!editorPanelHolder.h()) {
            return false;
        }
        this.f23324q = false;
        editorPanelHolder.setShow(false);
        return true;
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 8) {
            this.f23324q = false;
            this.f23316f.setShow(false);
        }
    }

    public final com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView z() {
        return (com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView) ((jz5.n) this.f23319i).getValue();
    }
}
