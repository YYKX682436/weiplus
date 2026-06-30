package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes11.dex */
public class t7 implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266954e;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266954e = c1Var;
        this.f266953d = y2Var;
    }

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String str = "enterEnterpriseChat:fail";
        nw4.y2 y2Var = this.f266953d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266954e;
        if (i17 != 0) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        s01.f0 f0Var = (s01.f0) m1Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = f0Var.f483400e;
        r45.h90 h90Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.h90) fVar;
        if (i17 < 0) {
            if (h90Var != null && (gi5Var = h90Var.f457483d) != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gi5Var.f456822e)) {
                str = "enterEnterpriseChat:fail_" + h90Var.f457483d.f456822e;
            }
            c1Var.i5(y2Var, str, null);
            return;
        }
        java.lang.String str2 = h90Var.f457484e;
        java.lang.String str3 = f0Var.f483401f;
        if (str3 == null) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(str3);
        if (D0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            c1Var.i5(y2Var, "enterEnterpriseChat:fail", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str2);
        intent.putExtra("key_biz_chat_id", D0.f69168x92559640);
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_need_send_video", false);
        intent.putExtra("key_is_biz_chat", true);
        j45.l.u(c1Var.f266508d, ".ui.chatting.ChattingUI", intent, null);
        c1Var.i5(y2Var, "enterEnterpriseChat:ok", null);
    }
}
