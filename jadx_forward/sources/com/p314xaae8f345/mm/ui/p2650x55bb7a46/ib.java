package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class ib implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f283379a;

    public ib(yb5.d dVar) {
        this.f283379a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(r35.m3 r28) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.ib.a(r35.m3):java.lang.Object");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    public java.lang.Object b(r35.m3 m3Var) {
        h45.g0.f360478a = 6;
        int i17 = m3Var.f450728d;
        yb5.d dVar = this.f283379a;
        if (i17 == 1) {
            return dVar.x();
        }
        if (i17 != 2) {
            if (i17 == 4) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.x())) {
                    int lastIndexOf = m3Var.e().lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        linkedList.add(m3Var.e().substring(lastIndexOf + 1));
                    }
                } else {
                    linkedList.add(dVar.x());
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                    linkedList2.add(6);
                }
                if (dVar.u() == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(dVar.u().d1())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingSpanClickCallback", "doSend, hrefInfo.getURL() = %s.", m3Var.e());
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.u().d1())) {
                        c(dVar.g(), dVar.u(), 6, m3Var, -1);
                    } else if (linkedList.size() <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) linkedList.getFirst())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingSpanClickCallback", "doSend, error.");
                    } else {
                        java.lang.String str = (java.lang.String) linkedList.getFirst();
                        gm0.j1.i();
                        c(dVar.g(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true), 6, m3Var, -1);
                    }
                } else {
                    new r35.e4(dVar.g(), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.jb(this)).f(linkedList, linkedList2, null);
                }
            } else if (i17 != 9) {
                if (i17 != 25 && i17 != 33) {
                    if (i17 != 6 && i17 != 7) {
                        if (i17 != 30 && i17 != 31) {
                            switch (i17) {
                                default:
                                    switch (i17) {
                                    }
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    dVar.d();
                                    break;
                            }
                        }
                    }
                }
                return dVar.x();
            }
            return null;
        }
        dVar.d();
        return null;
    }

    public final void c(android.app.Activity activity, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17, r35.m3 m3Var, int i18) {
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && i17 != 14 && i17 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jtx));
            return;
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.class : com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("Contact_Source_Add", 184);
        intent.putExtra("key_force_use_contact_label", true);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", "");
        intent.putExtra("sayhi_verify_add_errcode", i18);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = m3Var.f450739o;
        if (f9Var != null) {
            intent.putExtra("key_msg_id", f9Var.m124847x74d37ac6());
            intent.putExtra("key_msg_talker", m3Var.f450739o.Q0());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
