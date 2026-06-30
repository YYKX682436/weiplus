package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/chatroom/ui/m7", "com/tencent/mm/chatroom/ui/z7", "com/tencent/mm/chatroom/ui/a8", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationUI */
/* loaded from: classes5.dex */
public final class ActivityC10350x60fc0b2c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p648x55baa833.ui.a8 f145367h = new com.p314xaae8f345.mm.p648x55baa833.ui.a8(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145368d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f145369e = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.b8(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f145370f = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.d8(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f145371g = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.c8(this));

    public final void T6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.cge);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        java.lang.String stringExtra = getIntent().getStringExtra("intent_chatroom_username");
        com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var = null;
        if (stringExtra != null) {
            this.f145368d = stringExtra;
            p75.n0 n0Var = dm.w9.f322399o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.m0 j17 = dm.w9.f322401q.j(stringExtra);
            linkedList2.add(dm.w9.f322405u.u());
            p75.i0 g17 = dm.w9.f322399o.g(linkedList);
            g17.f434190d = j17;
            g17.d(linkedList2);
            g17.b(linkedList3);
            java.util.List k17 = g17.a().k(gm0.j1.u().f354686f, dm.w9.class);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("application count:");
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            sb6.append(arrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomAccessVerifyApplicationUI", sb6.toString());
            if (arrayList.size() > 0) {
                m7Var = new com.p314xaae8f345.mm.p648x55baa833.ui.m7(c1163xf1deaba4, k17);
            }
        }
        c1163xf1deaba4.mo7960x6cab2c8d(m7Var);
        if (c1163xf1deaba4.mo7946xf939df19() == null) {
            c1163xf1deaba4.setVisibility(8);
            ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dez)).setVisibility(0);
            return;
        }
        c1163xf1deaba4.setVisibility(0);
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dez)).setVisibility(8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569930s7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i3l);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.e8(this));
        dm.w9.G.m127126x9d92d11c(this, new com.p314xaae8f345.mm.p648x55baa833.ui.g8(this));
        T6();
        gm0.j1.n().f354821b.q(453, this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SeeAccessVerifyInfoUI);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("base_chatroom_invite_manage_source", java.lang.Integer.valueOf(getIntent().getBooleanExtra("intent_from_chattingui", false) ? 2 : 1));
        lVarArr[1] = new jz5.l("base_chatroom_user_role", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f145370f).mo141623x754a37bb()).booleanValue() ? 1 : ((java.lang.Boolean) ((jz5.n) this.f145371g).mo141623x754a37bb()).booleanValue() ? 2 : 3));
        lVarArr[2] = new jz5.l("room_username", this.f145368d);
        lVarArr[3] = new jz5.l("room_unread_count", java.lang.Integer.valueOf(((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(this.f145368d, 0L)));
        ((cy1.a) rVar).gk(this, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25772);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        f145367h.a(this.f145368d);
        gm0.j1.n().f354821b.q(453, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p648x55baa833.ui.h8(this));
        }
    }
}
