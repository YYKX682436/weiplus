package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class wa extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287449s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570042vb);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.va vaVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.va();
        vaVar.a(xgVar, true);
        xgVar.setTag(vaVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgLocationShare$ChattingItemAppMsgLocationShareFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgLocationShare$ChattingItemAppMsgLocationShareFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.r(c01.w9.l(this.f287449s.D(), f9Var.j(), f9Var.A0()));
        ot0.q v17 = ot0.q.v(c01.w9.l(this.f287449s.D(), f9Var.j(), f9Var.A0()));
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        j45.l.g("favorite");
        if (j17 == null || !j17.k()) {
            int i17 = v17.f430199i;
            if (i17 != 10 && i17 != 13 && i17 != 20 && i17 != 130) {
                switch (i17) {
                }
            }
            g4Var.c(d17, 116, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        if (this.f287449s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f287449s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(android.view.View r6, yb5.d r7, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r8) {
        /*
            r5 = this;
            android.content.Context r0 = r6.getContext()
            boolean r0 = iq.b.C(r0)
            r1 = 0
            if (r0 != 0) goto La5
            android.content.Context r6 = r6.getContext()
            boolean r6 = iq.b.v(r6)
            if (r6 != 0) goto La5
            android.app.Activity r6 = r7.g()
            boolean r6 = iq.b.e(r6)
            if (r6 == 0) goto L21
            goto La5
        L21:
            java.lang.String r6 = r7.x()
            boolean r0 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r6)
            r2 = 1
            if (r0 == 0) goto L3e
            java.lang.Class<rv1.f> r0 = rv1.f.class
            lm0.a r0 = gm0.j1.s(r0)
            rv1.f r0 = (rv1.f) r0
            qv1.a r0 = (qv1.a) r0
            boolean r0 = r0.c(r6)
            if (r0 == 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r6)
            if (r3 == 0) goto L5a
            java.lang.Class<qy.i> r3 = qy.i.class
            i95.m r3 = i95.n0.c(r3)
            qy.i r3 = (qy.i) r3
            py.a r3 = (py.a) r3
            r3.getClass()
            boolean r6 = c01.v1.x(r6, r1)
            if (r6 != 0) goto L5a
            r6 = r2
            goto L5b
        L5a:
            r6 = r1
        L5b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "isChatroomDismiss = "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", inChatRoom = "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.ChattingItemAppMsgLocationShareFrom"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            if (r0 != 0) goto L7a
            if (r6 == 0) goto L7b
        L7a:
            r1 = r2
        L7b:
            if (r1 == 0) goto L7e
            return r2
        L7e:
            java.lang.Class<bx1.t> r6 = bx1.t.class
            i95.m r6 = i95.n0.c(r6)
            bx1.t r6 = (bx1.t) r6
            java.lang.String r8 = r8.Q0()
            fq3.w r6 = (fq3.w) r6
            r6.Di(r8, r2)
            com.tencent.mm.ui.chatting.manager.c r6 = r7.f542241c
            java.lang.Class<sb5.j2> r8 = sb5.j2.class
            yn.e r6 = r6.a(r8)
            sb5.j2 r6 = (sb5.j2) r6
            java.lang.String r7 = r7.x()
            java.lang.String r8 = "fromMessage"
            com.tencent.mm.ui.chatting.component.sm r6 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sm) r6
            r6.q0(r7, r8, r2)
            return r2
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wa.R(android.view.View, yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.va vaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.va) g0Var;
        this.f287449s = dVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            vaVar.f287376b.setText(v17.f430187f);
            vaVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), vaVar, null));
            vaVar.f39493x8ad70635.setOnClickListener(w(dVar));
            vaVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
            vaVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(dVar.x())) {
                vaVar.f287376b.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                vaVar.f287377c.setAlpha(1.0f);
                vaVar.f39493x8ad70635.setClickable(true);
                vaVar.f39493x8ad70635.setEnabled(true);
                return;
            }
        }
        vaVar.f287376b.setTextColor(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
        vaVar.f287377c.setAlpha(0.3f);
        vaVar.f39493x8ad70635.setClickable(false);
        vaVar.f39493x8ad70635.setEnabled(false);
    }
}
