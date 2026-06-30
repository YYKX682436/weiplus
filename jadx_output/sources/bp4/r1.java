package bp4;

/* loaded from: classes10.dex */
public final class r1 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f23361f;

    /* renamed from: g, reason: collision with root package name */
    public final cq4.n f23362g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f23363h;

    /* renamed from: i, reason: collision with root package name */
    public int f23364i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder = (com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder) layout.findViewById(com.tencent.mm.R.id.d8c);
        this.f23361f = holder;
        kotlin.jvm.internal.o.f(holder, "holder");
        cq4.n nVar = new cq4.n(holder);
        this.f23362g = nVar;
        android.widget.ImageView imageView = (android.widget.ImageView) layout.findViewById(com.tencent.mm.R.id.d7o);
        this.f23363h = imageView;
        this.f23364i = -1;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
        imageView.setOnClickListener(new bp4.p1(this, status));
        nVar.f221480g = new bp4.q1(status, this);
        com.tencent.mm.ui.a4.e(holder, false, false, 3, null);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (!this.f23361f.h()) {
            return false;
        }
        this.f23365m = false;
        z();
        return true;
    }

    @Override // yt3.r2
    public void reset() {
        this.f23365m = false;
        z();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23363h.setVisibility(i17);
    }

    public final void z() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f23361f;
        editorPanelHolder.setShow(false);
        ju3.d0.k(this.f465332d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f23363h;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, this.f23364i));
        editorPanelHolder.setShow(false);
    }
}
