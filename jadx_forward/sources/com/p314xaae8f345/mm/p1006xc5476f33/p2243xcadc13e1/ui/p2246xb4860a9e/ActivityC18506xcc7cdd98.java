package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI */
/* loaded from: classes4.dex */
public class ActivityC18506xcc7cdd98 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f253705p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f253706d;

    /* renamed from: e, reason: collision with root package name */
    public eg4.t1 f253707e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f253708f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f253709g;

    /* renamed from: m, reason: collision with root package name */
    public long f253712m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f253713n;

    /* renamed from: h, reason: collision with root package name */
    public int f253710h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f253711i = 0;

    /* renamed from: o, reason: collision with root package name */
    public final db5.t4 f253714o = new eg4.b2(this);

    public final void T6() {
        if (this.f253707e.getCount() > 0) {
            android.view.View findViewById = this.f253708f.findViewById(com.p314xaae8f345.mm.R.id.mfo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = this.f253709g.findViewById(com.p314xaae8f345.mm.R.id.f564231lm);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = this.f253708f.findViewById(com.p314xaae8f345.mm.R.id.mfo);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = this.f253709g.findViewById(com.p314xaae8f345.mm.R.id.f564231lm);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570636bb1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f253707e = new eg4.t1(mo55332x76847179());
        r21.w.wi().add(this.f253707e);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.f253707e);
        this.f253707e.f294144h = new eg4.u1(this);
        this.f253706d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.g_b);
        android.view.View inflate = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570640bb5, (android.view.ViewGroup) null);
        this.f253708f = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.mfo).setOnClickListener(new eg4.v1(this));
        this.f253706d.addHeaderView(this.f253708f);
        android.view.View inflate2 = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570637bb2, (android.view.ViewGroup) null);
        this.f253709g = inflate2;
        inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564229lk).setOnClickListener(new eg4.w1(this));
        this.f253706d.addHeaderView(this.f253709g);
        this.f253706d.setAdapter((android.widget.ListAdapter) this.f253707e);
        T6();
        this.f253706d.setOnTouchListener(new eg4.x1(this));
        this.f253706d.setOnItemLongClickListener(new eg4.y1(this, new rl5.r(this)));
        this.f253706d.setOnItemClickListener(new eg4.g1(mo55332x76847179(), this.f253707e, this.f253706d.getHeaderViewsCount() > 0));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gum), new eg4.z1(this));
        mo54448x9c8c0d33(new eg4.a2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fbf);
        mo78530x8b45058f();
        try {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FMessageConversationUI", e17, "try cancel notification fail", new java.lang.Object[0]);
        }
        if (!gm0.j1.a()) {
            finish();
            return;
        }
        mo43517x10010bd5();
        if (gm0.j1.a() && r61.q0.a() && !r61.q0.h()) {
            boolean z17 = (c01.z1.p() & 256) == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageConversationUI", "mark addr book had update. %b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                x51.e.a(x51.e.f533523b);
            }
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FMessageConversationUI)).Rj(this, iy1.a.NewFriends);
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("fmessage", 2);
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = (com.p314xaae8f345.mm.p2621x8fb0427b.m7) this.f253707e.getItem(adapterContextMenuInfo.position);
        if (m7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m7Var.f66365xd1eb2ea8)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = m7Var.f66365xd1eb2ea8;
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
        }
        contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
        this.f253712m = m7Var.f66370x5ea2cb68;
        this.f253713n = m7Var.f66376x114ef53e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f253707e != null) {
            r21.w.wi().mo49775xc84af884(this.f253707e);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f253707e);
        }
        if (gm0.j1.b().m()) {
            r21.w.wi().y0();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationUI", "account not init.");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.p314xaae8f345.mm.p957x53236a1b.g1.J("fmessage", 2);
        }
        c01.d9.b().p().w(143618, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (gm0.j1.a()) {
            return;
        }
        finish();
    }
}
