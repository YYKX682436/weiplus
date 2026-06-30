package cl4;

/* loaded from: classes.dex */
public final class t implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f124502c;

    public t(java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f124500a = str;
        this.f124501b = str2;
        this.f124502c = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f124500a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f124501b);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.v(this.f124502c, ".ui.transmit.MsgRetransmitUI", intent, 1006);
        }
    }
}
