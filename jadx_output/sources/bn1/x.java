package bn1;

/* loaded from: classes14.dex */
public final class x extends cn1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f22837a;

    public x(bn1.c0 c0Var) {
        this.f22837a = c0Var;
    }

    @Override // cn1.g
    public void b(bn1.v layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        bn1.c0 c0Var = this.f22837a;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = c0Var.f22789d;
        java.util.Iterator it = c0Var.f22797o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(false, false, 0);
        }
    }

    @Override // cn1.g
    public void c(bn1.v layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        bn1.c0 c0Var = this.f22837a;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = c0Var.f22789d;
        java.util.Iterator it = c0Var.f22797o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
        }
    }

    @Override // cn1.g
    public void e(bn1.v layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.e(layout, f17, source);
        bn1.c0 c0Var = this.f22837a;
        for (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar : c0Var.f22797o) {
            float f18 = 1.0f;
            float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / (layout.getBorderClose() - layout.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f18 = borderExpand;
            }
            com.tencent.mars.xlog.Log.i(c0Var.f22796n, "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
