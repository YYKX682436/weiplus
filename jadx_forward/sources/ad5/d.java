package ad5;

/* loaded from: classes10.dex */
public final class d extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.d f84775a = new ad5.d();

    public d() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pb8;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f81256x86b25b7b;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f81257xc34e34a3;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, payloads is null");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj2 = map.get(ad5.o0.f84823a);
        if (!(obj2 instanceof com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a)) {
            obj2 = null;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) obj2;
        if (c20976x6ba6452a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onDeleteClicked, lifecycleScope is null");
        } else {
            java.lang.Object obj3 = map.get(ad5.n0.f84822a);
            db5.e1.B(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new yc5.l(new ad5.c(context, c20976x6ba6452a, list, (yz5.q) (p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(obj3, 3) ? obj3 : null), this)), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
        }
    }

    /* renamed from: equals */
    public boolean m1089xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.d)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m1090x8cdac1b() {
        return -538076662;
    }

    /* renamed from: toString */
    public java.lang.String m1091x9616526c() {
        return "Delete";
    }
}
