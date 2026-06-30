package ad5;

/* loaded from: classes10.dex */
public final class y extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.y f3328a = new ad5.y();

    public y() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.pcj;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.download_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.download_regular;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onSaveFileClicked, payloads is null");
            return;
        }
        ad5.q0 q0Var = ad5.q0.f3300a;
        java.util.Map map = t0Var.f3314a;
        java.lang.Object obj = map.get(q0Var);
        if (!(obj instanceof java.util.List)) {
            obj = null;
        }
        java.util.List list = (java.util.List) obj;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onSaveFileClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj2 = map.get(ad5.n0.f3289a);
        yz5.q qVar = (yz5.q) (kotlin.jvm.internal.m0.f(obj2, 3) ? obj2 : null);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new ad5.v(context);
        k0Var.f211881s = new ad5.w(qVar, this, list, context);
        k0Var.f211854d = new ad5.x(qVar, this, list);
        k0Var.v();
        android.view.Window d17 = k0Var.d();
        if (d17 != null) {
            yc5.m.f460914a.b(d17);
            android.view.View view = k0Var.S;
            if (view != null) {
                yc5.g gVar = new yc5.g(view.getPaddingBottom());
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.u(view, gVar);
                n3.y0.c(view);
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.y)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -293364424;
    }

    public java.lang.String toString() {
        return "SaveFile";
    }
}
