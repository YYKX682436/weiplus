package cl4;

/* loaded from: classes11.dex */
public final class n implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f124487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124489d;

    public n(java.lang.String str, bw5.o50 o50Var, java.lang.String str2, android.app.Activity activity) {
        this.f124486a = str;
        this.f124487b = o50Var;
        this.f124488c = str2;
        this.f124489d = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f124486a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            java.lang.String k17 = il4.d.k(this.f124487b);
            java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(k17 == null ? "" : k17);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f124488c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", k17);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.v(this.f124489d, ".ui.transmit.MsgRetransmitUI", intent, 1001);
        }
    }
}
