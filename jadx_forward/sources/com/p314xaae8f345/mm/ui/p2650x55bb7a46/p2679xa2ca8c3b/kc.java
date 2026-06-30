package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mc f285856d;

    public kc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mc mcVar) {
        this.f285856d = mcVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan tag not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan msg not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String j17 = c17.j();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan content not valid");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17277xe9e90aaf.f37916x681a0c0c.a(j17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a17.f240296g);
        boolean z17 = a17.f240300n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan onClick codeType: %d, selectFromAlbum: %b", valueOf, java.lang.Boolean.valueOf(z17));
        java.lang.String b17 = tb5.o0.b(view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.he9), a17.f240299m);
        int i17 = view.getId() == com.p314xaae8f345.mm.R.id.khi ? 3 : 2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.mc mcVar = this.f285856d;
        tb5.o0.d(mcVar.f286104t, c17, null, b17, i17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j0.f240470a;
        java.lang.String str = a17.f240294e;
        java.lang.String str2 = a17.f240301o;
        int i18 = z17 ? 2 : 1;
        j0Var.a(str, str2, i18, a17.f240302p, 1, a17.f240303q + "");
        if (gm0.j1.d().n() == 0) {
            db5.e1.y(mcVar.f286104t.g(), mcVar.f286104t.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574197he4), "", mcVar.f286104t.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jc(this));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.c(a17.f240301o)) {
            java.lang.String str3 = a17.f240294e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan zBar result invalid");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((e04.f) mcVar.f286106v).b(mcVar.f286104t.g(), null, null, str3, a17.f240300n, a17.f240297h, a17.f240301o, a17.f240298i, 99, true, a17.f240302p, false, false, 0, null);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f240294e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgOfflineScan", "OfflineScan qBar result invalid");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((e04.p) mcVar.f286105u).h(mcVar.f286104t.g(), a17.f240294e, a17.f240295f, a17.f240301o, a17.f240296g, a17.f240297h, null, null, a17.f240298i, true, a17.f240302p, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgOfflineScan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
