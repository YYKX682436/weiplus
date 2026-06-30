package cr3;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303485d;

    public j(cr3.d0 d0Var) {
        this.f303485d = d0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        cr3.d0 d0Var = this.f303485d;
        g0Var.d(14553, 2, 4, d0Var.f303465e.d1());
        d0Var.f303469i = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", d0Var.f303465e.d1());
        intent.addFlags(67108864);
        j45.l.u(d0Var.f303464d, ".ui.chatting.ChattingUI", intent, null);
    }
}
