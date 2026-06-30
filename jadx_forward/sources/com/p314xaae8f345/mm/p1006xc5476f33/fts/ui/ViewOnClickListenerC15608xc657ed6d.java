package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI */
/* loaded from: classes12.dex */
public class ViewOnClickListenerC15608xc657ed6d extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca implements android.view.View.OnClickListener {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219520p;

    /* renamed from: q, reason: collision with root package name */
    public int f219521q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219522r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219523s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f219524t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f219525u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f219526v = true;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3 f219527w;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219527w == null) {
            this.f219527w = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.d3(w0Var, this.f219520p, this.f219521q);
        }
        return this.f219527w;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void V6(java.lang.String str) {
        super.V6(str);
        if (this.f219526v && this.f219521q == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 4, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, this.f219523s);
        }
        this.f219526v = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219520p = getIntent().getStringExtra("detail_username");
        this.f219521q = getIntent().getIntExtra("Search_Scene", 0);
        this.f219522r = getIntent().getStringExtra("Search_Str");
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("service_notify_session_id");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e3.f219579a = stringExtra;
        this.f219523s = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "initSearchData conversation=%s", this.f219520p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void Z6() {
        super.Z6();
        if (this.f219521q == 1) {
            android.view.View view = this.f219524t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setEmptyQueryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void a7() {
        super.a7();
        android.view.View view = this.f219524t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setExistResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void b7() {
        super.b7();
        android.view.View view = this.f219524t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void c7() {
        super.c7();
        android.view.View view = this.f219524t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo78530x8b45058f();
        this.f219524t = findViewById(com.p314xaae8f345.mm.R.id.mfb);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mfn);
        this.f219525u = textView;
        textView.setTextSize(15.0f);
        if (this.f219521q == 1) {
            android.view.View view = this.f219524t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f219525u.setVisibility(0);
            this.f219525u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.idu);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.gs6);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(mo55332x76847179(), 2));
            c1163xf1deaba4.N(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f3(this));
            c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h3(this));
        } else {
            android.view.View view2 = this.f219524t;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f219525u.setVisibility(8);
        }
        if (this.f219521q != 4 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219522r)) {
            return;
        }
        java.lang.String p17 = o13.n.p(this.f219522r);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219443n) && this.f219443n.equals(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "Same query %s %s", this.f219443n, p17);
            return;
        }
        java.lang.String str = this.f219522r;
        this.f219443n = str;
        this.f219440h.m80997xdc5215a6().n(str, null);
        V6(p17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view instanceof android.widget.TextView)) {
            yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchMemberDetail");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("from_scene", 1);
            intent.putExtra("RoomInfo_Id", "notifymessage");
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ic_));
            intent.putExtra("service_notify_session_id", this.f219523s);
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectServiceNotifySenderUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 2, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, this.f219523s);
        } else if (intValue == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("detail_username", "notifymessage");
            j45.l.u(this, "com.tencent.mm.chatroom.ui.SelectDateUI", intent2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 3, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, this.f219523s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSServiceNotifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        t13.g bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) bj6).f219302c = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f219527w.g();
        t13.g bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj();
        if (bj6 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) bj6).g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f219521q != 4) {
            this.f219524t.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.g3(this), 128L);
        }
    }
}
