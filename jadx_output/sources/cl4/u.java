package cl4;

/* loaded from: classes11.dex */
public final class u implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f42971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f42973d;

    public u(java.lang.String str, bw5.lp0 lp0Var, java.lang.String str2, android.app.Activity activity) {
        this.f42970a = str;
        this.f42971b = lp0Var;
        this.f42972c = str2;
        this.f42973d = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f42970a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            bw5.lp0 lp0Var = this.f42971b;
            java.lang.String Ri = ((dl4.m0) tVar).Ri(rk4.j5.d(lp0Var));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f42972c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", rk4.j5.d(lp0Var));
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.v(this.f42973d, ".ui.transmit.MsgRetransmitUI", intent, 1001);
        }
    }
}
