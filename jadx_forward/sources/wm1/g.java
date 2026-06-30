package wm1;

/* loaded from: classes11.dex */
public final class g implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f528757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f528759d;

    public g(java.lang.String str, bw5.lp0 lp0Var, java.lang.String str2, android.app.Activity activity) {
        this.f528756a = str;
        this.f528757b = lp0Var;
        this.f528758c = str2;
        this.f528759d = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f528756a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            bw5.lp0 lp0Var = this.f528757b;
            java.lang.String Ri = ((dl4.m0) tVar).Ri(rk4.j5.d(lp0Var));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f528758c);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", rk4.j5.d(lp0Var));
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", str2);
            j45.l.v(this.f528759d, ".ui.transmit.MsgRetransmitUI", intent, 1001);
        }
    }
}
