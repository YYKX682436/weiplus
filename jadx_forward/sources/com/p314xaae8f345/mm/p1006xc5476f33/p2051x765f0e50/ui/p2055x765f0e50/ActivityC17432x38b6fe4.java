package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI */
/* loaded from: classes8.dex */
public class ActivityC17432x38b6fe4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f242017d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f242018e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf f242019f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f242020g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f242021h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f242022i;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f242023m;

    public final void T6() {
        m78548x39037dd1();
        if (((java.util.ArrayList) this.f242021h).isEmpty()) {
            android.view.View view = this.f242018e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f242018e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsManageAuthUI", "refreshOptionMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f242022i) {
            mo78491xd9193382(700, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pf(this));
        } else {
            mo78491xd9193382(700, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572004w0), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qf(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cll;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f242017d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.a8a);
        this.f242018e = findViewById(com.p314xaae8f345.mm.R.id.a8_);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf ufVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf(this, null);
        this.f242019f = ufVar;
        this.f242017d.setAdapter((android.widget.ListAdapter) ufVar);
        this.f242017d.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mf(this));
        this.f242017d.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nf(this));
        T6();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ipn);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.of(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(1146, this);
        gm0.j1.d().q(1127, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(1146, this);
        gm0.j1.d().a(1127, this);
        gm0.j1.d().g(new k14.c0(null));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageAuthUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f242020g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        java.util.List list = this.f242021h;
        if (mo808xfb85f7b0 == 1146) {
            k14.c0 c0Var = (k14.c0) m1Var;
            this.f242023m = c0Var.H();
            if (!(c0Var.f384847f != null)) {
                ((java.util.ArrayList) list).clear();
            }
            r45.cq3 cq3Var = c0Var.f384846e;
            ((java.util.ArrayList) list).addAll(cq3Var != null ? cq3Var.f453321e : java.util.Collections.emptyList());
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uf ufVar = this.f242019f;
            ufVar.f243143d = list;
            ufVar.notifyDataSetChanged();
            T6();
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1127) {
            java.lang.String str2 = ((k14.w) m1Var).f384925e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((r45.ov6) it.next()).f464093d.equals(str2)) {
                        it.remove();
                        break;
                    }
                }
            }
            this.f242019f.notifyDataSetChanged();
        }
    }
}
