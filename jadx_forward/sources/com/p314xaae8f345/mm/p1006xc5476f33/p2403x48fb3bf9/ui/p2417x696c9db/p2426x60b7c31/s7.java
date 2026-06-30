package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes11.dex */
public class s7 implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266939f;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, java.lang.String str) {
        this.f266939f = c1Var;
        this.f266937d = y2Var;
        this.f266938e = str;
    }

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        nw4.y2 y2Var = this.f266937d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266939f;
        if (i17 != 0) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        s01.m0 m0Var = (s01.m0) m1Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = m0Var.f483436e;
        r45.uz3 uz3Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.uz3) fVar;
        if (uz3Var == null || (gi5Var = uz3Var.f469282d) == null || gi5Var.f456821d != 0) {
            if (uz3Var == null || uz3Var.f469282d == null) {
                c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_code", java.lang.Integer.valueOf(uz3Var.f469282d.f456821d));
            java.lang.String str = uz3Var.f469282d.f456822e;
            c1Var.i5(y2Var, str != null ? str : "openEnterpriseChat:fail", hashMap);
            return;
        }
        java.lang.String str2 = uz3Var.f469283e;
        java.lang.String str3 = m0Var.f483437f;
        if (str3 == null) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        s01.h D0 = r01.q3.Ui().D0(str3);
        if (D0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            c1Var.i5(y2Var, "openEnterpriseChat:fail", null);
            return;
        }
        java.lang.String str4 = this.f266938e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || !str4.equals("long")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str2);
            intent.putExtra("key_biz_chat_id", D0.f69168x92559640);
            intent.putExtra("finish_direct", true);
            intent.putExtra("key_need_send_video", false);
            intent.putExtra("key_is_biz_chat", true);
            j45.l.u(c1Var.f266508d, ".ui.chatting.ChattingUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
            intent2.putExtra("Main_User", str2);
            intent2.putExtra("biz_chat_chat_id", D0.f69168x92559640);
            intent2.putExtra("biz_chat_from_scene", 8);
            j45.l.u(c1Var.f266508d, ".ui.LauncherUI", intent2, null);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uz3Var.f469287i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uz3Var.f469288m)) {
            hashMap2.put("chat_type", uz3Var.f469287i);
            hashMap2.put("chat_id", uz3Var.f469288m);
        }
        c1Var.i5(y2Var, "openEnterpriseChat:ok", hashMap2);
    }
}
