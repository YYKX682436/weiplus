package ad5;

/* loaded from: classes10.dex */
public final class f extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.f f84782a = new ad5.f();

    public f() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pbn;
    }

    @Override // ad5.l0
    public int b() {
        return com.p314xaae8f345.mm.R.raw.f79975xc091258d;
    }

    @Override // ad5.l0
    public int c() {
        return com.p314xaae8f345.mm.R.raw.f79976xc548acd1;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onLocateToChatClicked, payloads is null");
            return;
        }
        java.lang.Object obj = t0Var.f84847a.get(ad5.q0.f84833a);
        if (!(obj instanceof java.util.List)) {
            obj = null;
        }
        java.util.List list = (java.util.List) obj;
        if (list == null || list.size() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onLocateToChatClicked, msgInfoList is null or size is not 1");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.X(list);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", f9Var.Q0());
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_global_search", true);
        intent.putExtra("msg_local_id", f9Var.m124847x74d37ac6());
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    /* renamed from: equals */
    public boolean m1097xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.f)) {
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m1098x8cdac1b() {
        return -952555644;
    }

    /* renamed from: toString */
    public java.lang.String m1099x9616526c() {
        return "LocateToChat";
    }
}
