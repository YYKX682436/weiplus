package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class j7 {
    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e7 e7Var, java.util.List list, r45.kv2 kv2Var) {
        r45.iv2 iv2Var = (r45.iv2) list.get(0);
        int a17 = e7Var.a(e7Var.f39494xbf64baf8.getContext());
        float f17 = a17;
        int m75938x746dc8a6 = (int) ((iv2Var.m75938x746dc8a6(4) * f17) / iv2Var.m75938x746dc8a6(3));
        int i17 = (int) ((f17 * 4.0f) / 3.0f);
        android.view.ViewGroup.LayoutParams layoutParams = e7Var.f285394r.getLayoutParams();
        if (a17 > m75938x746dc8a6) {
            layoutParams.width = i17;
            layoutParams.height = a17;
        } else {
            layoutParams.width = a17;
            layoutParams.height = i17;
        }
        e7Var.f285394r.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.app.Activity r14, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r15) {
        /*
            java.lang.String r0 = r15.U1()
            ot0.q r0 = ot0.q.v(r0)
            if (r0 == 0) goto Le3
            java.lang.Class<zy2.i> r1 = zy2.i.class
            ot0.h r1 = r0.y(r1)
            zy2.i r1 = (zy2.i) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L59
            r45.gv2 r4 = new r45.gv2
            r4.<init>()
            java.lang.String r5 = r15.Q0()
            boolean r5 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r5)
            r6 = 2
            r7 = 3
            if (r5 == 0) goto L2f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.set(r7, r5)
            goto L36
        L2f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.set(r7, r5)
        L36:
            r45.kv2 r5 = r1.f558944b
            r7 = 30
            r5.set(r7, r4)
            r45.kv2 r4 = r1.f558944b
            r5 = 31
            int r4 = r4.m75939xb282bd08(r5)
            if (r4 != r6) goto L4a
            r1 = r2
            r4 = r3
            goto L5b
        L4a:
            r45.kv2 r1 = r1.f558944b
            r4 = 25
            int r1 = r1.m75939xb282bd08(r4)
            r1 = r1 & 4
            if (r1 <= 0) goto L59
            r4 = r2
            r1 = r3
            goto L5b
        L59:
            r1 = r3
            r4 = r1
        L5b:
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.transmit.MsgRetransmitUI> r6 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class
            r5.<init>(r14, r6)
            java.lang.String r6 = "Retr_Msg_Id"
            long r7 = r15.m124847x74d37ac6()
            r5.putExtra(r6, r7)
            java.lang.String r6 = "Retr_MsgTalker"
            java.lang.String r15 = r15.Q0()
            r5.putExtra(r6, r15)
            java.lang.String r15 = "Retr_Msg_Type"
            if (r1 == 0) goto L7e
            r1 = 42
            r5.putExtra(r15, r1)
            goto L8b
        L7e:
            if (r4 == 0) goto L86
            r1 = 36
            r5.putExtra(r15, r1)
            goto L8b
        L86:
            r1 = 18
            r5.putExtra(r15, r1)
        L8b:
            java.lang.String r15 = "Multi_Retr"
            r5.putExtra(r15, r2)
            r15 = 0
            java.lang.String r15 = ot0.q.u(r0, r15, r15)
            java.lang.String r0 = "Retr_Msg_content"
            r5.putExtra(r0, r15)
            java.lang.String r15 = "Retr_go_to_chattingUI"
            r5.putExtra(r15, r3)
            java.lang.String r15 = "Retr_show_success_tips"
            r5.putExtra(r15, r2)
            java.lang.String r15 = "scene_from"
            r0 = 17
            r5.putExtra(r15, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r15.add(r5)
            java.util.Collections.reverse(r15)
            java.lang.Object[] r7 = r15.toArray()
            java.lang.String r8 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed"
            java.lang.String r9 = "retransmit"
            java.lang.String r10 = "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r14
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = r15.get(r3)
            android.content.Intent r15 = (android.content.Intent) r15
            r14.startActivity(r15)
            java.lang.String r1 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderFeed"
            java.lang.String r2 = "retransmit"
            java.lang.String r3 = "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r14
            yj0.a.f(r0, r1, r2, r3, r4, r5, r6)
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j7.b(android.app.Activity, com.tencent.mm.storage.f9):void");
    }

    public static void c(android.view.View view, yb5.d dVar, zy2.i iVar, android.content.Intent intent, boolean z17, boolean z18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.app.Activity g17 = dVar.g();
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(((b92.s2) ((zy2.db) i95.n0.c(zy2.db.class))).wi(iVar.f558944b), null, null));
        intent.putExtra("KEY_FINDER_FORWARD_SOURCE", iVar.f558944b.m75945x2fec8307(22));
        intent.putExtra("KEY_FINDER_MSG_ID", f9Var.m124847x74d37ac6());
        intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", f9Var.mo78012x3fdd41df());
        intent.putExtra("KEY_FINDER_MSG_TALKER", f9Var.Q0());
        if (z18) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
        }
        intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        intent.putExtra("key_finder_teen_mode_user_name", iVar.g());
        intent.putExtra("key_finder_teen_mode_user_id", iVar.f558944b.m75945x2fec8307(1));
        intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
        ((wa2.u) ((xa2.e) i95.n0.c(xa2.e.class))).hj(intent, view, 280L);
        zy2.eb ebVar = (zy2.eb) i95.n0.c(zy2.eb.class);
        r45.md5 md5Var = new r45.md5();
        md5Var.set(0, java.lang.Long.valueOf(pm0.v.Z(iVar.f558944b.m75945x2fec8307(0))));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, f9Var, md5Var);
        vr2.f fVar = (vr2.f) ebVar;
        boolean wi6 = fVar.wi();
        ya2.e1 e1Var = ya2.e1.f542005a;
        int i17 = 58;
        if (!wi6 || !fVar.Ai()) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                i17 = 3;
            } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(f9Var.Q0())) {
                i17 = 2;
            }
            ((c61.l7) b6Var).Bj(i17, 2, 25, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.z(g17, intent, -1, true);
            return;
        }
        zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            i17 = 3;
        } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(f9Var.Q0())) {
            i17 = 2;
        }
        ((c61.l7) b6Var2).Bj(i17, 2, 20, intent);
        intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
        intent.putExtra("KEY_OBJECT_ID", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
        intent.putExtra("KEY_OBJECT_NONCE_ID", iVar.f558944b.m75945x2fec8307(8));
        intent.putExtra("FROM_SCENE_KEY", 6);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        e1Var.C(g17, intent);
    }
}
