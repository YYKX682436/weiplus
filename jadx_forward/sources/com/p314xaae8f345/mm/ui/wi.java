package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class wi implements r35.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 f292772a;

    public wi(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2) {
        this.f292772a = activityC21437xf483c2;
    }

    @Override // r35.d2
    public void a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
    }

    @Override // r35.d2
    public void c(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f292772a;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(activityC21437xf483c2.f278610n)) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9y, activityC21437xf483c2.f278604e.g2());
            java.util.HashMap hashMap = new java.util.HashMap();
            int intExtra = activityC21437xf483c2.getIntent().getIntExtra("chat_from_scene", 0);
            java.lang.String stringExtra = activityC21437xf483c2.getIntent().getStringExtra("chat_session");
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("chat_name", activityC21437xf483c2.f278610n);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("yuanbao_toast_exp", hashMap, 34004);
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC21437xf483c2);
            e4Var.f293309c = string;
            e4Var.f293312f = false;
            e4Var.c();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10170, "1");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(activityC21437xf483c2.f278610n);
        linkedList.add(c01.z1.r());
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571466fw));
        intent.putExtra("list_type", 0);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288316d);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("recommend_chatroom", true);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J1(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.c(), ","));
        intent.putExtra("key_create_chatroom_from_username", activityC21437xf483c2.f278610n);
        pf5.j0.a(intent, aj5.i1.class);
        pf5.j0.a(intent, aj5.l1.class);
        intent.putExtra("from_create_group_scene", 3);
        pf5.j0.a(intent, aj5.r.class);
        pf5.j0.a(intent, kk5.c0.class);
        pf5.j0.a(intent, kk5.h0.class);
        pf5.j0.a(intent, aj5.r0.class);
        pf5.j0.a(intent, kk5.q.class);
        pf5.j0.a(intent, cj5.f.class);
        pf5.j0.a(intent, kj5.f.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        j45.l.u(activityC21437xf483c2, ".ui.mvvm.MvvmContactListUI", intent, null);
    }

    @Override // r35.d2
    public void d(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f292772a.f278606g;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.N();
        }
    }

    @Override // r35.d2
    public void e(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = this.f292772a;
        java.lang.String c17 = lz.a.c(activityC21437xf483c2.f278606g, i17);
        java.lang.String b17 = lz.a.b(activityC21437xf483c2.f278606g, i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (b17 == null) {
            b17 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(c17)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
            b17 = z07.f66692x4854b29d;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(activityC21437xf483c2.f278610n)) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d;
            oVar.f206733e++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordFinderChatProfile", "incChatInfoClickCount:" + oVar.f206733e);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
            java.lang.String h17 = m4Var.h(activityC21437xf483c2.f278610n);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(h17)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", h17);
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Bi(viewGroup.getContext(), intent, 0L, null, 0, 10, false, -1);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1.f542005a.w(viewGroup.getContext(), intent);
                return;
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.U3(h17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "talkerName :".concat(h17));
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            zy2.dc mj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).mj(h17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko koVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ko.f214053a;
            koVar.b(mj6, intent2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String c18 = m4Var.c(h17, 3);
            intent2.putExtra("IsPoster", true);
            intent2.putExtra("Action", 1);
            intent2.putExtra("SessionId", c18);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(viewGroup.getContext(), intent2, 2);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(activityC21437xf483c2.f278610n)) {
            android.content.Intent intent3 = new android.content.Intent(activityC21437xf483c2, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19646xabcfe59e.class);
            intent3.putExtra(dm.i4.f66875xa013b0d5, activityC21437xf483c2.f278610n);
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(activityC21437xf483c2.f278610n, 154);
            com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c22 = this.f292772a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent3);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC21437xf483c22, arrayList.toArray(), "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC21437xf483c22.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC21437xf483c22, "com/tencent/mm/ui/SingleChatInfoUI$6", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(activityC21437xf483c2.f278610n)) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Di(activityC21437xf483c2.mo55332x76847179(), activityC21437xf483c2.f278610n, 1);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(c17)) {
            q41.f.a(c17, 10, 0);
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("Contact_User", c17);
        intent4.putExtra("Contact_RemarkName", b17);
        java.lang.String a17 = lz.a.a(activityC21437xf483c2.f278606g, i17);
        intent4.putExtra("Contact_Nick", a17 != null ? a17 : "");
        intent4.putExtra("Contact_RoomMember", true);
        intent4.putExtra("chat_session", activityC21437xf483c2.getIntent().getStringExtra("chat_session"));
        intent4.putExtra("chat_from_scene", activityC21437xf483c2.getIntent().getIntExtra("chat_from_scene", 0));
        intent4.putExtra("CONTACT_INFO_UI_SOURCE", 9);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(c17, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent4, c17);
        }
        intent4.putExtra("Kdel_from", 0);
        j45.l.n(activityC21437xf483c2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent4, 0);
    }
}
