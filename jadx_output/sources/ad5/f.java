package ad5;

/* loaded from: classes10.dex */
public final class f extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.f f3249a = new ad5.f();

    public f() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.pbn;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.icons_locate_to_chat_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.icons_locate_to_chat_regular;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onLocateToChatClicked, payloads is null");
            return;
        }
        java.lang.Object obj = t0Var.f3314a.get(ad5.q0.f3300a);
        if (!(obj instanceof java.util.List)) {
            obj = null;
        }
        java.util.List list = (java.util.List) obj;
        if (list == null || list.size() != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onLocateToChatClicked, msgInfoList is null or size is not 1");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) kz5.n0.X(list);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", f9Var.Q0());
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_global_search", true);
        intent.putExtra("msg_local_id", f9Var.getMsgId());
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -952555644;
    }

    public java.lang.String toString() {
        return "LocateToChat";
    }
}
