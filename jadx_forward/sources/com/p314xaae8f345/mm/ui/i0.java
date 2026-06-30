package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.n0 f290423d;

    public i0(com.p314xaae8f345.mm.ui.n0 n0Var, com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f) {
        this.f290423d = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.o0 o0Var = (com.p314xaae8f345.mm.ui.o0) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onClick] :%s", o0Var);
        com.p314xaae8f345.mm.ui.n0 n0Var = this.f290423d;
        com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f = n0Var.f290928i;
        java.lang.String str = o0Var.f290967a;
        long j17 = o0Var.f290972f;
        n0Var.getClass();
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] username is null");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).o2(str, j17);
            if (o27 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] msg is null");
            }
            long m124847x74d37ac6 = o27 == null ? -1L : o27.m124847x74d37ac6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] msgLocalId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                if (((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(str) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] member is null! username:%s", str);
                    db5.e1.t(activityC21341x70473b8f, activityC21341x70473b8f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), activityC21341x70473b8f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", m124847x74d37ac6);
                putExtra.setClass(activityC21341x70473b8f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(putExtra);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC21341x70473b8f, arrayList2.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21341x70473b8f.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC21341x70473b8f, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 == null || !n17.r2()) {
                    if (n17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] contact is null! username:%s", str);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.AllRemindMsgUI", "[gotoChattingUIWithPosition] isContact not ! username:%s", str);
                    }
                    db5.e1.t(activityC21341x70473b8f, activityC21341x70473b8f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hy6), activityC21341x70473b8f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
                }
                android.content.Intent putExtra2 = new android.content.Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("need_hight_item", true).putExtra("msg_local_id", m124847x74d37ac6);
                putExtra2.setClass(activityC21341x70473b8f, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                arrayList22.add(putExtra2);
                java.util.Collections.reverse(arrayList22);
                yj0.a.d(activityC21341x70473b8f, arrayList22.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC21341x70473b8f.startActivity((android.content.Intent) arrayList22.get(0));
                yj0.a.f(activityC21341x70473b8f, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder", "goToChattingUI", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
