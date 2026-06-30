package al5;

/* loaded from: classes4.dex */
public final class s3 implements al5.z3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f6021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f6022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ al5.v3 f6023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.x3 f6024d;

    public s3(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout, android.view.View view, al5.v3 v3Var, al5.x3 x3Var) {
        this.f6021a = touchMediaPreviewLayout;
        this.f6022b = view;
        this.f6023c = v3Var;
        this.f6024d = x3Var;
    }

    @Override // al5.z3
    public void a() {
        al5.x3 x3Var = this.f6024d;
        if (x3Var != null) {
            x3Var.a(1, this.f6021a.getCurrentScale());
        }
    }

    @Override // al5.z3
    public void onDoubleTap(float f17, float f18) {
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f6021a;
        if (!touchMediaPreviewLayout.getAddTouchView()) {
            al5.u3 u3Var = al5.y3.f6102a;
            android.view.View view = this.f6022b;
            db5.e7 a17 = u3Var.a(view);
            al5.v3 v3Var = this.f6023c;
            android.graphics.Rect a18 = v3Var != null ? v3Var.a() : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.TouchLayoutHelper", "initScale >> doubleTap: " + a18);
            if (a17 != null) {
                a17.setInterceptDetach(true);
            }
            if (a18 != null) {
                if (a18.bottom - a18.top > 0) {
                    touchMediaPreviewLayout.setRealViewHeight(r1 - r4);
                    touchMediaPreviewLayout.setViewRect(a18);
                }
            }
            touchMediaPreviewLayout.b(view);
        }
        touchMediaPreviewLayout.e(f17, f18);
    }
}
