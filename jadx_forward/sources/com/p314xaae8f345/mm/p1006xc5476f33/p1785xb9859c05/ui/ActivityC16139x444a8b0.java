package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI */
/* loaded from: classes4.dex */
public class ActivityC16139x444a8b0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f224165d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2 f224166e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224167f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f224168g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f224169h = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o2(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570718bm1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g5f);
        this.f224168g = findViewById(com.p314xaae8f345.mm.R.id.hgq);
        this.f224165d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.hgr);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byg, (android.view.ViewGroup) null);
        this.f224167f = inflate;
        this.f224165d.addFooterView(inflate);
        this.f224166e = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2(this, this, new s83.g());
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2 q2Var = this.f224166e;
        q2Var.f294144h = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j2(this);
        this.f224165d.setAdapter((android.widget.ListAdapter) q2Var);
        this.f224165d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k2(this));
        this.f224165d.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l2(this));
        if (this.f224166e.getCount() == 0) {
            this.f224165d.setVisibility(8);
            android.view.View view = this.f224168g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(false);
        } else {
            this.f224165d.setVisibility(0);
            android.view.View view2 = this.f224168g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78501x43e00957(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2 q2Var2 = this.f224166e;
        if (q2Var2.f224519o >= q2Var2.f224520p) {
            this.f224165d.removeFooterView(this.f224167f);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2 q2Var3 = this.f224166e;
        if (q2Var3.f224519o >= q2Var3.f224520p) {
            this.f224165d.removeFooterView(this.f224167f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri().add(this.f224169h);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri().mo49775xc84af884(this.f224169h);
        this.f224166e.c();
        s83.h Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ri();
        Ri.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("isRead", (java.lang.Short) 1);
        Ri.f486413d.p(Ri.mo145255x88e404c3(), contentValues, "isRead!=? ", new java.lang.String[]{"1"});
        super.onDestroy();
    }
}
