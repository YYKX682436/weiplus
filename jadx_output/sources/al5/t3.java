package al5;

/* loaded from: classes4.dex */
public final class t3 implements al5.b4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.w3 f6033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f6034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f6035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ al5.v3 f6036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ al5.x3 f6037h;

    public t3(al5.w3 w3Var, com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout, android.view.View view, al5.v3 v3Var, al5.x3 x3Var) {
        this.f6033d = w3Var;
        this.f6034e = touchMediaPreviewLayout;
        this.f6035f = view;
        this.f6036g = v3Var;
        this.f6037h = x3Var;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        al5.w3 w3Var = this.f6033d;
        if (w3Var == null) {
            return false;
        }
        this.f6034e.getCurrentScale();
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$e snsOnlineVideoActivity$$e = (com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$e) w3Var;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = snsOnlineVideoActivity$$e.f167345a;
        snsOnlineVideoActivity.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onCreate$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (snsOnlineVideoActivity$$e.f167346b) {
            snsOnlineVideoActivity.e7(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onCreate$3", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        al5.u3 u3Var = al5.y3.f6102a;
        android.view.View view = this.f6035f;
        db5.e7 a17 = u3Var.a(view);
        al5.v3 v3Var = this.f6036g;
        android.graphics.Rect a18 = v3Var != null ? v3Var.a() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.TouchLayoutHelper", "initScale >> onScaleBegin: " + a18);
        if (a17 != null) {
            a17.setInterceptDetach(true);
        }
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = this.f6034e;
        if (a18 != null) {
            if (a18.bottom - a18.top > 0) {
                touchMediaPreviewLayout.setRealViewHeight(r3 - r4);
                touchMediaPreviewLayout.setViewRect(a18);
            }
        }
        touchMediaPreviewLayout.b(view);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        al5.x3 x3Var = this.f6037h;
        if (x3Var != null) {
            x3Var.a(2, this.f6034e.getCurrentScale());
        }
    }
}
