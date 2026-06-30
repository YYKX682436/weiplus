package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakeItemListUI */
/* loaded from: classes11.dex */
public class ActivityC17664x1adcec2b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y f243628f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f243629g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f243630h;

    /* renamed from: i, reason: collision with root package name */
    public int f243631i;

    /* renamed from: n, reason: collision with root package name */
    public int f243633n;

    /* renamed from: d, reason: collision with root package name */
    public long f243626d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243627e = false;

    /* renamed from: m, reason: collision with root package name */
    public n11.a f243632m = null;

    /* renamed from: o, reason: collision with root package name */
    public final db5.t4 f243634o = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.u(this);

    public int T6(int i17) {
        return (i17 == -12 || i17 == 11) ? com.p314xaae8f345.mm.R.C30867xcad56011.j2g : i17 != 100 ? i17 != -6 ? (i17 == -5 || i17 == 4) ? com.p314xaae8f345.mm.R.C30867xcad56011.f574648j30 : i17 != 5 ? com.p314xaae8f345.mm.R.C30867xcad56011.j2_ : com.p314xaae8f345.mm.R.C30867xcad56011.j3k : com.p314xaae8f345.mm.R.C30867xcad56011.j3k : com.p314xaae8f345.mm.R.C30867xcad56011.j2d;
    }

    public final void U6(c34.r rVar) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        y24.a aVar = new y24.a(null, 103);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(aVar, 100L, null);
        r45.gh4 gh4Var = new r45.gh4();
        try {
            gh4Var.mo11468x92b714fd(rVar.f66430xbcdbef);
            java.util.LinkedList linkedList = gh4Var.f456784i;
            if (linkedList != null && linkedList.size() == 1) {
                r45.eh4 eh4Var = (r45.eh4) gh4Var.f456784i.get(0);
                b21.r a17 = h34.v.a(eh4Var);
                android.content.Intent intent = new android.content.Intent();
                if (eh4Var.f455024q != null) {
                    intent.putExtra("key_copyright", true);
                }
                intent.putExtra("key_music_wrapper", a17);
                intent.putExtra("key_offset", a17.f98880f);
                intent.putExtra("key_pure", eh4Var.f455032y);
                intent.putExtra("key_byuser", eh4Var.f455014d);
                intent.putExtra("key_history", true);
                j45.l.j(mo55332x76847179(), "mv", ".ui.shake.MusicMainUINew", intent, null);
                return;
            }
            java.util.LinkedList linkedList2 = gh4Var.f456784i;
            if (linkedList2 == null || linkedList2.size() <= 1) {
                return;
            }
            r45.eh4 eh4Var2 = (r45.eh4) gh4Var.f456784i.get(0);
            b21.r a18 = h34.v.a(eh4Var2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 1; i17 < gh4Var.f456784i.size(); i17++) {
                b21.r a19 = h34.v.a((r45.eh4) gh4Var.f456784i.get(i17));
                if (a18 != null) {
                    arrayList.add(a19);
                }
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_music_wrapper", a18);
            intent2.putExtra("key_offset", a18.f98880f);
            intent2.putExtra("key_pure", eh4Var2.f455032y);
            intent2.putExtra("key_recommend_list", arrayList);
            intent2.putExtra("key_byuser", eh4Var2.f455014d);
            intent2.putExtra("key_history", true);
            j45.l.j(mo55332x76847179(), "mv", ".ui.shake.MusicMainUINew", intent2, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeItemListUI", e17, "catch Exception in NewShake History", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cmj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f243632m = new n11.a(this);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) c01.d9.b().p().l(12290, null), 0);
        this.f243631i = getIntent().getIntExtra("_key_show_type_", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("_key_title_");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            mo54450xbf7c1df6(stringExtra);
        }
        this.f243627e = getIntent().getBooleanExtra("_key_show_from_shake_", false);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.n(this));
        this.f243629g = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.k5q);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cml, (android.view.ViewGroup) null);
        this.f243630h = inflate;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.mqo).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.o(this));
        this.f243629g.addFooterView(this.f243630h);
        if (this.f243631i == -1) {
            android.view.View findViewById = this.f243630h.findViewById(com.p314xaae8f345.mm.R.id.mqo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = this.f243630h.findViewById(com.p314xaae8f345.mm.R.id.mqo);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/shake/ui/ShakeItemListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y(this, this);
        this.f243628f = yVar;
        yVar.f243885o = this.f243631i;
        yVar.o();
        if (this.f243628f.getCount() <= 0) {
            this.f243629g.setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k5s);
            textView.setText(T6(this.f243631i));
            textView.setVisibility(0);
            m78501x43e00957(false);
        } else {
            this.f243629g.setAdapter((android.widget.ListAdapter) this.f243628f);
            this.f243629g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.p(this, j17));
            this.f243629g.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.q(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.r(this));
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.s(this));
        this.f243629g.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.t(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        c34.h0.Ni().add(this.f243628f);
        this.f243628f.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeItemListUI", "onResume");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f243633n = ((c34.r) this.f243628f.getItem(adapterContextMenuInfo.position)).f66439x8756c24f;
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f243628f.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.y yVar = this.f243628f;
        bb5.g gVar = yVar.f243887q;
        if (gVar != null) {
            gVar.a();
            yVar.f243887q = null;
        }
        c34.h0.Ni().mo49775xc84af884(this.f243628f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeItemListUI", "onPause");
        n11.a aVar = this.f243632m;
        if (aVar != null) {
            aVar.c();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
