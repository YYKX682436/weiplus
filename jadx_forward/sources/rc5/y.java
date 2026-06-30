package rc5;

/* loaded from: classes11.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.db {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void b7() {
        m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public void c7() {
        m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean g7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        java.lang.String x17 = chattingContext.x();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", x17);
            intent.putExtra("RoomInfo_Id", x17);
            intent.putExtra("Is_Chatroom", true);
            intent.putExtra("fromChatting", true);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22424xe085c5a0.class);
            cVar.f102455a.f102457a = chattingContext.g();
            cVar.e(true);
            cVar.c(false);
            cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10609x3df00f35.class.getName());
            cVar.g();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.db
    public boolean h7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe headerComponent, com.p314xaae8f345.mm.ui.bc optionListener, yb5.d chattingContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerComponent, "headerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionListener, "optionListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(chattingContext.x())) {
            headerComponent.K0(0, com.p314xaae8f345.mm.R.C30867xcad56011.b59, com.p314xaae8f345.mm.R.raw.f78355x20db789a, optionListener);
        }
        return true;
    }
}
