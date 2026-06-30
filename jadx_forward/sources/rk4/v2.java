package rk4;

/* loaded from: classes.dex */
public final class v2 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 f478550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478552d;

    public v2(java.lang.String str, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238 c24953x8ceac238, rk4.l3 l3Var, yz5.l lVar) {
        this.f478549a = str;
        this.f478550b = c24953x8ceac238;
        this.f478551c = l3Var;
        this.f478552d = lVar;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "<anonymous parameter 2>");
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", this.f478549a);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("custom_send_text", str);
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", this.f478550b.m92455xe6ec16a5());
            j45.l.v(this.f478551c.f478350e, ".ui.transmit.MsgRetransmitUI", intent, 1006);
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f478552d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17))));
    }
}
