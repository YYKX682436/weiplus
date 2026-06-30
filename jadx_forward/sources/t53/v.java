package t53;

/* loaded from: classes8.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu5.c f497364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f497365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f497368h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wu5.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, java.lang.String str2, android.content.Context context) {
        super(1);
        this.f497364d = cVar;
        this.f497365e = h0Var;
        this.f497366f = str;
        this.f497367g = str2;
        this.f497368h = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        this.f497364d.cancel(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f497365e.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "[startChattingUI] sessionId=" + str);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a.d(this.f497366f);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_Self", this.f497367g);
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            j45.l.u(this.f497368h, ".ui.chatting.ChattingUI", intent, null);
        }
        return jz5.f0.f384359a;
    }
}
