package k53;

/* loaded from: classes8.dex */
public class m0 implements k53.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f385906b;

    public m0(k53.u0 u0Var, int i17) {
        this.f385906b = u0Var;
        this.f385905a = i17;
    }

    @Override // k53.s0
    public void a(k53.t0 t0Var) {
        k53.u0 u0Var = this.f385906b;
        u0Var.getClass();
        ot0.q qVar = new ot0.q();
        qVar.f430199i = 5;
        qVar.f430187f = t0Var.f385921a;
        java.lang.String str = t0Var.f385922b;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.content.Context context = u0Var.f385928a;
        if (K0) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd);
        }
        qVar.f430191g = str;
        qVar.f430207k = t0Var.f385924d;
        qVar.f430267z = t0Var.f385923c;
        java.lang.String u17 = ot0.q.u(qVar, null, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", u17);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("src_username", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd));
        intent.putExtra("src_displayname", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd));
        j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, this.f385905a);
    }
}
