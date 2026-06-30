package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 f284196d;

    public s6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 t6Var) {
        this.f284196d = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        er3.b bVar = er3.c.f337555f;
        r45.zl3 a17 = bVar.a();
        java.lang.String str = a17 != null ? a17.f473726d : null;
        java.lang.String str2 = a17 != null ? a17.f473730h : null;
        java.lang.String str3 = a17 != null ? a17.f473727e : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.t6 t6Var = this.f284196d;
        t6Var.getClass();
        if (!(str == null)) {
            if (!(str2 == null)) {
                if (!(str3 == null)) {
                    java.lang.String t17 = r26.i0.t(str2, "{weapp_param}", str3, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingQQAssistantFooterHandler", "jump to:" + str + " pathWithParam: " + t17);
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
                        c12559xbdae8559.f169323f = 1035;
                        c12559xbdae8559.f169324g = "gh_051d9102de63";
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(t6Var.f284237b, "", str.toString(), j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20306x9e512605()) == 1 ? 2 : 0, 0, t17, c12559xbdae8559, "");
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingQQAssistantFooterHandler", "Error when jumpToMiniApp: " + th6);
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingQQAssistantFooterHandler", "need path or appID.");
        bVar.c();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingQQAssistantFooterHandler$setupSettingBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
