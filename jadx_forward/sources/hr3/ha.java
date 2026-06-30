package hr3;

/* loaded from: classes11.dex */
public class ha implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.va f365143d;

    public ha(hr3.va vaVar) {
        this.f365143d = vaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        hr3.va vaVar = this.f365143d;
        g0Var.d(14553, 2, 4, vaVar.f365642e.L.d1());
        vaVar.f365641d = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", vaVar.f365642e.L.d1());
        intent.addFlags(67108864);
        j45.l.u(vaVar.f365642e.f279303d, ".ui.chatting.ChattingUI", intent, null);
    }
}
