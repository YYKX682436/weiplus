package cl4;

/* loaded from: classes.dex */
public final class t implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42969c;

    public t(java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f42967a = str;
        this.f42968b = str2;
        this.f42969c = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f42967a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f42968b);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.v(this.f42969c, ".ui.transmit.MsgRetransmitUI", intent, 1006);
        }
    }
}
