package m14;

/* loaded from: classes11.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f404408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m14.j f404409e;

    public h(m14.j jVar, java.util.ArrayList arrayList) {
        this.f404409e = jVar;
        this.f404408d = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 5, 4, "");
        m14.j jVar = this.f404409e;
        m14.f fVar = jVar.f404411d;
        fVar.f404404c = true;
        fVar.f404405d.m108007xae7a2e7a();
        java.util.ArrayList<java.lang.String> arrayList = this.f404408d;
        if (arrayList.size() > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putStringArrayListExtra("key_conversation_list", arrayList);
            j45.l.u(jVar.f404411d.f404402a, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", arrayList.get(0));
            intent2.addFlags(67108864);
            j45.l.u(jVar.f404411d.f404402a, ".ui.chatting.ChattingUI", intent2, null);
        }
    }
}
