package ad5;

/* loaded from: classes10.dex */
public final class d extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.d f3242a = new ad5.d();

    public d() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.pb8;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.trash_on_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.trash_on_regular;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, payloads is null");
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
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj2 = map.get(ad5.o0.f3290a);
        if (!(obj2 instanceof com.tencent.mm.sdk.coroutines.LifecycleScope)) {
            obj2 = null;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (com.tencent.mm.sdk.coroutines.LifecycleScope) obj2;
        if (lifecycleScope == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, lifecycleScope is null");
        } else {
            java.lang.Object obj3 = map.get(ad5.n0.f3289a);
            db5.e1.B(context, context.getString(com.tencent.mm.R.string.bav), "", context.getString(com.tencent.mm.R.string.boo), context.getString(com.tencent.mm.R.string.f490347sg), new yc5.l(new ad5.c(context, lifecycleScope, list, (yz5.q) (kotlin.jvm.internal.m0.f(obj3, 3) ? obj3 : null), this)), null, com.tencent.mm.R.color.f478622ch);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -538076662;
    }

    public java.lang.String toString() {
        return "Delete";
    }
}
