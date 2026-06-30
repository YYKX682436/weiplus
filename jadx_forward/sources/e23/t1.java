package e23;

/* loaded from: classes11.dex */
public class t1 extends e23.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.u1 f328500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(e23.u1 u1Var) {
        super(u1Var);
        this.f328500c = u1Var;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.u1 u1Var = (e23.u1) gVar;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.j4(u1Var.f328374s) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomeNotifyMessage.k(view.getContext(), null)) {
            return true;
        }
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(u1Var.f328374s) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(u1Var.f328374s)) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalWeCom.k(view.getContext(), null)) {
            return true;
        }
        a(this.f328500c.i(), u1Var.f328372q);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(u1Var.f328374s)) {
            java.lang.String wi6 = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).wi(u1Var.f328374s);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class))).Ai(context, u1Var.f328374s, null, wi6, 5, "", null);
        } else {
            android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", u1Var.f328374s).putExtra("finish_direct", true);
            putExtra.putExtra("chat_from_scene", 5);
            j45.l.u(context, ".ui.chatting.ChattingUI", putExtra, null);
            ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(u1Var.f328374s, 2);
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).hj(25, u1Var.f328374s);
        }
        return true;
    }
}
