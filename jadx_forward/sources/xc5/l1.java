package xc5;

/* loaded from: classes3.dex */
public final class l1 extends lf3.n implements ag3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public void V6(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryLocateToChatComponent", "locateToChat: msgInfo is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", b17.Q0());
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_global_search", true);
        intent.putExtra("msg_local_id", b17.m124847x74d37ac6());
        j45.l.u(m158354x19263085(), ".ui.chatting.ChattingUI", intent, null);
    }
}
