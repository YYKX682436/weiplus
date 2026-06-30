package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class o7 extends com.p314xaae8f345.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 f281157e;

    public o7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 n7Var) {
        this.f281157e = n7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        e31.k a17;
        java.lang.String str = te5.v1.f500291b;
        int itemId = menuItem.getItemId();
        java.lang.String str2 = null;
        int i17 = 7;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 n7Var = this.f281157e;
        if (itemId == 4) {
            android.content.Intent intent = new android.content.Intent();
            if (n7Var.t0()) {
                intent.putExtra("detail_username", n7Var.f281082e);
                intent.putExtra("Search_Scene", 3);
            } else {
                intent.putExtra("Search_Scene", 1);
                i17 = 1;
            }
            intent.putExtra("service_notify_session_id", str);
            u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
            android.app.Activity g17 = n7Var.f280113d.g();
            ((s50.g0) vVar).getClass();
            o13.n.q(g17, ".ui.FTSServiceNotifyUI", intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, str);
            return;
        }
        if (menuItem.getItemId() == 5) {
            if (!n7Var.t0()) {
                android.content.Intent intent2 = new android.content.Intent(n7Var.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835.class);
                intent2.putExtra("container_enter_scene", 1);
                android.app.Activity g18 = n7Var.f280113d.g();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(g18, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g18.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(g18, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$1", "onRealClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 1, null, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, null, 0, 0, 0, 0, str);
                return;
            }
            java.lang.String str3 = n7Var.f281082e;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str3)) {
                a17 = e31.n.f328620a.a("name_wxa");
                k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str3);
                if (Bi != null) {
                    str2 = Bi.f68913x21f9b213;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingServiceNotifyComponent", "attrs is null");
                }
            } else {
                a17 = e31.n.f328620a.a("name_biz");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str2 = c01.a2.e(str3);
            }
            java.lang.String str4 = str2;
            if (a17 != null) {
                a17.b(n7Var.f280113d.g(), 4, str3, str4, str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingServiceNotifyComponent", "service is null");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 7, str3, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.c(str3)), str);
        }
    }
}
