package q50;

/* loaded from: classes.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f441682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, in5.s0 s0Var) {
        super(0);
        this.f441681d = str;
        this.f441682e = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f441681d;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        in5.s0 s0Var = this.f441682e;
        if (R4) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("RoomInfo_Id", str);
            intent.putExtra("Is_Chatroom", true);
            intent.putExtra("fromChatting", true);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f102455a.f102457a = s0Var.f374654e;
            cVar.e(true);
            cVar.c(false);
            cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10609x3df00f35.class.getName());
            cVar.g();
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            j45.l.j(s0Var.f374654e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
        }
        return jz5.f0.f384359a;
    }
}
