package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* renamed from: com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI */
/* loaded from: classes8.dex */
public class ActivityC16014x161f98d8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f223013d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f223015f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed f223016g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed f223017h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f223018i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c f223019m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.r f223020n;

    /* renamed from: o, reason: collision with root package name */
    public int f223021o;

    /* renamed from: p, reason: collision with root package name */
    public int f223022p;

    /* renamed from: e, reason: collision with root package name */
    public int f223014e = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f223023q = 0;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI$GameMsgCenterFragment */
    /* loaded from: classes8.dex */
    public static class GameMsgCenterFragment extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

        /* renamed from: d, reason: collision with root package name */
        public android.view.View f223024d;

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onCreateView */
        public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            return this.f223024d;
        }
    }

    public void T6(int i17) {
        int i18 = i17 % 2;
        this.f223023q = i18;
        if (i18 == 0) {
            this.f223016g.setSelected(true);
            this.f223017h.setSelected(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c cVar = this.f223019m;
            if (cVar != null) {
                cVar.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("tab", "1");
                hashMap.put("newmsg", java.lang.String.valueOf(cVar.f223064g));
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(cVar.getContext(), 13, 1300, 0, 1, cVar.f223061d, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
                cVar.f223064g = 0;
            }
        } else {
            this.f223016g.setSelected(false);
            this.f223017h.setSelected(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.r rVar = this.f223020n;
            if (rVar != null) {
                rVar.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("tab", "2");
                hashMap2.put("newnotice", java.lang.String.valueOf(rVar.f223155g));
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(rVar.getContext(), 13, 1300, 0, 1, rVar.f223152d, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap2));
                rVar.f223155g = 0;
            }
        }
        this.f223018i.m80844x940d026a(this.f223023q);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.jia;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bh7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo2533x106ab264().o();
        vj5.a.a(m78513xc2a54588(), getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), !com.p314xaae8f345.mm.ui.uk.g(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        this.f223013d = getIntent().getIntExtra("game_report_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        int intExtra = getIntent().getIntExtra("game_msg_center_tab_type", 0);
        if (intExtra == 1) {
            this.f223014e = 1;
        } else if (intExtra == 2) {
            this.f223014e = 2;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(stringExtra);
            if (b17 != null) {
                this.f223014e = b17.f68480x991217c;
            }
        }
        if (this.f223014e == 0) {
            this.f223021o = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
            int u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
            this.f223022p = u17;
            if (this.f223021o > 0) {
                this.f223014e = 1;
            } else if (u17 > 0) {
                this.f223014e = 2;
            } else {
                this.f223014e = 1;
            }
        }
        findViewById(com.p314xaae8f345.mm.R.id.f564043gi).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.d(this));
        findViewById(com.p314xaae8f345.mm.R.id.f564070h3).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.l(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564076h9);
        this.f223015f = textView;
        com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564075h8);
        this.f223015f.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/message/GameMsgCenterUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f223014e == 2) {
            this.f223015f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fny);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().X1(2);
        } else {
            this.f223015f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fnx);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed c16017x771bceed = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed) findViewById(com.p314xaae8f345.mm.R.id.nvr);
        this.f223016g = c16017x771bceed;
        c16017x771bceed.m64815x6260b659(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed c16017x771bceed2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16017x771bceed) findViewById(com.p314xaae8f345.mm.R.id.nvs);
        this.f223017h = c16017x771bceed2;
        c16017x771bceed2.m64815x6260b659(2);
        this.f223018i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) findViewById(com.p314xaae8f345.mm.R.id.jia);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.p(mo7595x9cdc264());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8.GameMsgCenterFragment gameMsgCenterFragment = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8.GameMsgCenterFragment();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c(this, this.f223013d, this.f223014e == 1);
        this.f223019m = cVar;
        cVar.m64817x6e7f4646(this.f223021o);
        gameMsgCenterFragment.f223024d = this.f223019m;
        java.util.List list = pVar.f223147i;
        ((java.util.ArrayList) list).add(gameMsgCenterFragment);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8.GameMsgCenterFragment gameMsgCenterFragment2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.ActivityC16014x161f98d8.GameMsgCenterFragment();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.r(this, this.f223013d, this.f223014e == 2);
        this.f223020n = rVar;
        rVar.m64819x6e7f4646(this.f223022p);
        gameMsgCenterFragment2.f223024d = this.f223020n;
        ((java.util.ArrayList) list).add(gameMsgCenterFragment2);
        this.f223018i.m78873x6e5cce43(false);
        this.f223018i.mo79164x6cab2c8d(pVar);
        this.f223016g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.m(this));
        this.f223017h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.n(this));
        this.f223018i.mo79170x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.o(this));
        if (this.f223014e == 2) {
            this.f223016g.m64816x30659cde(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1));
            T6(1);
        } else {
            this.f223017h.m64816x30659cde(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2));
            T6(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c1 c1Var;
        android.database.Cursor cursor;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.t0 t0Var;
        android.database.Cursor cursor2;
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.c cVar = this.f223019m;
        if (cVar != null && (t0Var = cVar.f223062e) != null && (cursor2 = t0Var.f223174d2.f223120d) != null) {
            cursor2.close();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.r rVar = this.f223020n;
        if (rVar != null && (c1Var = rVar.f223153e) != null && (cursor = c1Var.f223069d2.f223120d) != null) {
            cursor.close();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageStorage", "clearMessageStorage: [%b], [%s]", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().m145253xb158737d("GameRawMessage", "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)")), "delete from GameRawMessage where createTime < (select createTime from GameRawMessage order by createTime desc limit 100000,1)");
    }
}
