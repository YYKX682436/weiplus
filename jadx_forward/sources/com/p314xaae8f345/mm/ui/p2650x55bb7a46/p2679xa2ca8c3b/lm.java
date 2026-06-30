package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class lm extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f286027s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater inflater, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(inflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570051vq);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm jmVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm();
        jmVar.a(xgVar, true);
        xgVar.setTag(jmVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (item.getItemId() != 111) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.om.f286747a.b(ui6, f9Var);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        if (msgData.f475787d.f526833b == null) {
            return true;
        }
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
        yb5.d dVar = this.f286027s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        menu.c(d17, 111, 0, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        menu.removeItem(116);
        yb5.d dVar2 = this.f286027s;
        if (dVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
            if (!dVar2.F()) {
                menu.c(d17, 100, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if ((r8.f385550a.length() == 0) != false) goto L9;
     */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r5, yb5.d r6, rd5.d r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r8 = "tag"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r8)
            java.lang.String r8 = "ui"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r8)
            java.lang.String r8 = "msgData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            we5.a r8 = r7.f475787d
            com.tencent.mm.storage.f9 r8 = r8.f526833b
            r4.f286027s = r6
            com.tencent.mm.ui.chatting.viewitems.jm r5 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.jm) r5
            android.view.View r0 = r5.f39493x8ad70635
            int r1 = r5.f285810f
            r5.m80053x54fd00d3(r0, r1)
            java.lang.Class<j41.y> r0 = j41.y.class
            i95.m r0 = i95.n0.c(r0)
            j41.y r0 = (j41.y) r0
            java.lang.String r8 = r8.j()
            l41.b2 r0 = (l41.b2) r0
            r0.getClass()
            k41.k0 r8 = k41.o0.b(r8)
            if (r8 == 0) goto L43
            java.lang.String r0 = r8.f385550a
            int r0 = r0.length()
            if (r0 != 0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 == 0) goto L4a
        L43:
            java.lang.String r0 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
            java.lang.String r1 = "fillingOpenIMKefuCard content invalid"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L4a:
            com.tencent.mm.ui.chatting.viewitems.nm r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.om.f286747a
            r0.a(r6, r8, r5)
            android.view.View r0 = r5.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.er r1 = new com.tencent.mm.ui.chatting.viewitems.er
            boolean r2 = r6.D()
            if (r8 == 0) goto L5d
            java.lang.String r3 = r8.f385550a
            if (r3 != 0) goto L5f
        L5d:
            java.lang.String r3 = ""
        L5f:
            r1.<init>(r7, r2, r5, r3)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = r8.f385556g
            java.lang.String r2 = "kefu_card_ticket"
            r7.putString(r2, r8)
            r1.f285437J = r7
            r0.setTag(r1)
            android.view.View r7 = r5.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.km r8 = new com.tencent.mm.ui.chatting.viewitems.km
            r8.<init>(r6)
            r7.setOnClickListener(r8)
            android.view.View r7 = r5.f39493x8ad70635
            com.tencent.mm.ui.chatting.viewitems.q0 r8 = r4.u(r6)
            r7.setOnLongClickListener(r8)
            android.view.View r5 = r5.f39493x8ad70635
            com.tencent.mm.ui.chatting.manager.c r6 = r6.f542241c
            java.lang.Class<sb5.z> r7 = sb5.z.class
            yn.e r6 = r6.a(r7)
            sb5.z r6 = (sb5.z) r6
            com.tencent.mm.ui.chatting.adapter.k r6 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) r6
            com.tencent.mm.ui.chatting.e6 r6 = r6.B1
            r5.setOnTouchListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lm.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
