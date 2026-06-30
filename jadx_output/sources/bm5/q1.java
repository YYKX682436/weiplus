package bm5;

/* loaded from: classes3.dex */
public final class q1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f22727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm5.r1 f22728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f22729f;

    public q1(android.view.View view, bm5.r1 r1Var, yz5.l lVar) {
        this.f22727d = view;
        this.f22728e = r1Var;
        this.f22729f = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f22727d.getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visibleHeight: ");
        sb6.append(height);
        sb6.append(", rootHeight: ");
        bm5.r1 r1Var = this.f22728e;
        sb6.append(r1Var.f22732c);
        com.tencent.mars.xlog.Log.i("MicroMsg.SoftKeyboardListener", sb6.toString());
        int i17 = r1Var.f22732c;
        if (i17 == 0) {
            r1Var.f22732c = height;
            return;
        }
        if (i17 == height) {
            return;
        }
        int i18 = i17 - height;
        yz5.l lVar = this.f22729f;
        if (i18 > 200) {
            r1Var.f22732c = height;
            lVar.invoke(java.lang.Boolean.TRUE);
        } else if (height - i17 > 200) {
            r1Var.f22732c = height;
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
