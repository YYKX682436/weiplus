package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/chatroom/ui/x5", "com/tencent/mm/chatroom/ui/t6", "com/tencent/mm/chatroom/ui/u6", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI */
/* loaded from: classes5.dex */
public final class ActivityC10349x67700120 extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p648x55baa833.ui.u6 f145361i = new com.p314xaae8f345.mm.p648x55baa833.ui.u6(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f145362d = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.w6(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f145363e = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.v6(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f145364f = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.y6(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f145365g = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.x6(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f145366h = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.d7(this));

    public final java.lang.String U6() {
        return (java.lang.String) ((jz5.n) this.f145362d).mo141623x754a37bb();
    }

    public final android.text.SpannableString V6(java.lang.String str, in.c cVar, android.content.Context context, android.widget.TextView textView) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str3 = cVar.f374254d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str3, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ApplicationByQrOrInvitationUI", "ct == null");
            return null;
        }
        java.lang.String w07 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0()) ? n17.w0() : ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).z0(cVar.f374254d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            w07 = n17.w0();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w07)) {
            w07 = n17.f2();
        }
        java.lang.String str4 = w07 + W6(cVar.f374258h, cVar.f374259i);
        if (textView == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            str2 = str4 != null ? str4 : "";
            ((ke0.e) xVar).getClass();
            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2);
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        str2 = str4 != null ? str4 : "";
        float textSize = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize);
    }

    public final java.lang.String W6(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                dm.w8 w8Var = new dm.w8();
                w8Var.f69018x28d46377 = str;
                w8Var.f69024xd0366ace = str2;
                w8Var.f69019xbd959cfd = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68});
                if (w8Var.f69023xcf77aa53 != null) {
                    java.lang.String str3 = "＠" + w8Var.f69023xcf77aa53;
                    if (str3 != null) {
                        return str3;
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                java.lang.String str4 = w8Var.f69019xbd959cfd;
                ((za0.k) b0Var).getClass();
                r1Var.g(new l41.z(str, str4, linkedList, 0));
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            r6 = this;
            r0 = 2131301838(0x7f0915ce, float:1.8221745E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r2 = r6.mo55332x76847179()
            r1.<init>(r2)
            r0.mo7967x900dcbe1(r1)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "intent_chatroom_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 == 0) goto L8d
            p75.n0 r2 = dm.w9.f322399o
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            p75.d r5 = dm.w9.f322401q
            p75.m0 r1 = r5.j(r1)
            p75.d r5 = dm.w9.f322405u
            p75.s r5 = r5.u()
            r3.add(r5)
            p75.n0 r5 = dm.w9.f322399o
            p75.i0 r2 = r5.g(r2)
            r2.f434190d = r1
            r2.f434192f = r3
            r2.f434193g = r4
            p75.l0 r1 = r2.a()
            gm0.b0 r2 = gm0.j1.u()
            l75.k0 r2 = r2.f354686f
            java.lang.Class<dm.w9> r3 = dm.w9.class
            java.util.List r1 = r1.k(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "application count:"
            r2.<init>(r3)
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.ApplicationByQrOrInvitationUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            int r2 = r3.size()
            if (r2 <= 0) goto L8d
            com.tencent.mm.chatroom.ui.x5 r2 = new com.tencent.mm.chatroom.ui.x5
            jz5.g r3 = r6.f145366h
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            com.tencent.mm.sdk.coroutines.LifecycleScope r3 = (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) r3
            r2.<init>(r6, r0, r1, r3)
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r0.mo7960x6cab2c8d(r2)
            androidx.recyclerview.widget.f2 r1 = r0.mo7946xf939df19()
            r2 = 8
            r3 = 2131303633(0x7f091cd1, float:1.8225386E38)
            r4 = 0
            if (r1 != 0) goto Lc0
            r0.setVisibility(r2)
            android.view.View r0 = r6.findViewById(r3)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r4)
            r0 = 2131303678(0x7f091cfe, float:1.8225477E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb5
            goto Ld5
        Lb5:
            r1 = 2131781527(0x7f106797, float:1.919467E38)
            java.lang.String r1 = r6.getString(r1)
            r0.setText(r1)
            goto Ld5
        Lc0:
            r0.setVisibility(r4)
            android.view.View r1 = r6.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r2)
            androidx.recyclerview.widget.f2 r0 = r0.mo7946xf939df19()
            if (r0 == 0) goto Ld5
            r0.m8146xced61ae5()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120.X6():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569930s7;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.p6d);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.z6(this));
        dm.w9.G.m127126x9d92d11c(this, new com.p314xaae8f345.mm.p648x55baa833.ui.b7(this));
        X6();
        gm0.j1.n().f354821b.q(453, this);
        g95.u.l(U6(), 7);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SeeAccessVerifyInfoUI);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("base_chatroom_invite_manage_source", java.lang.Integer.valueOf(getIntent().getBooleanExtra("intent_from_chattingui", false) ? 2 : 1));
        lVarArr[1] = new jz5.l("base_chatroom_user_role", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f145364f).mo141623x754a37bb()).booleanValue() ? 1 : ((java.lang.Boolean) ((jz5.n) this.f145365g).mo141623x754a37bb()).booleanValue() ? 2 : 3));
        lVarArr[2] = new jz5.l("room_username", U6());
        lVarArr[3] = new jz5.l("room_unread_count", java.lang.Integer.valueOf(((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(U6(), 0L)));
        ((cy1.a) rVar).gk(this, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25772);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.lang.String U6 = U6();
        if (U6 != null) {
            p75.n0 n0Var = dm.w9.f322399o;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("read", (java.lang.Integer) 1);
            p75.m0 j17 = dm.w9.f322401q.j(U6);
            p75.h1 j18 = dm.w9.f322399o.j(contentValues);
            j18.b(j17);
            j18.a().f(gm0.j1.u().f354686f);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo145247xf35bbb4(U6);
        }
        gm0.j1.n().f354821b.q(453, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p648x55baa833.ui.c7(this));
        }
    }
}
