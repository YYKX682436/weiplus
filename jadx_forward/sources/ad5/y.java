package ad5;

/* loaded from: classes10.dex */
public final class y extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.y f84861a = new ad5.y();

    public y() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pcj;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f78993x9ccb8f9;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f79003xa37f86e5;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onSaveFileClicked, payloads is null");
            return;
        }
        ad5.q0 q0Var = ad5.q0.f84833a;
        java.util.Map map = t0Var.f84847a;
        java.lang.Object obj = map.get(q0Var);
        if (!(obj instanceof java.util.List)) {
            obj = null;
        }
        java.util.List list = (java.util.List) obj;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onSaveFileClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj2 = map.get(ad5.n0.f84822a);
        yz5.q qVar = (yz5.q) (p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(obj2, 3) ? obj2 : null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        k0Var.f293405n = new ad5.v(context);
        k0Var.f293414s = new ad5.w(qVar, this, list, context);
        k0Var.f293387d = new ad5.x(qVar, this, list);
        k0Var.v();
        android.view.Window d17 = k0Var.d();
        if (d17 != null) {
            yc5.m.f542447a.b(d17);
            android.view.View view = k0Var.S;
            if (view != null) {
                yc5.g gVar = new yc5.g(view.getPaddingBottom());
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.u(view, gVar);
                n3.y0.c(view);
            }
        }
    }

    /* renamed from: equals */
    public boolean m1147xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.y)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m1148x8cdac1b() {
        return -293364424;
    }

    /* renamed from: toString */
    public java.lang.String m1149x9616526c() {
        return "SaveFile";
    }
}
