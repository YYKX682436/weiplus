package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui;

/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI */
/* loaded from: classes9.dex */
public class ActivityC16778x6ec76dfd extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f234386e;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f234385d = null;

    /* renamed from: f, reason: collision with root package name */
    public fp3.v f234387f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f234388g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f234389h = true;

    /* renamed from: i, reason: collision with root package name */
    public int f234390i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f234391m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f234392n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f234393o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f234394p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f234395q = new java.util.HashMap();

    public void U6() {
        m83090x14f40144(nd1.u0.f72979x366c91de);
        m83090x14f40144(nd1.p1.f72967x366c91de);
    }

    public void V6(java.lang.String str, java.lang.String str2, int i17) {
        m83098x5406100e(new dp3.m(str, str2, i17));
    }

    public void W6() {
        m83098x5406100e(new dp3.k(10, this.f234391m, this.f234392n));
    }

    public java.lang.String X6(int i17) {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q(i17, new java.text.SimpleDateFormat("MM-dd HH:mm"), new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm"));
    }

    public final java.lang.String Y6(int i17, int i18) {
        return i17 + "-" + i18;
    }

    public void Z6(java.util.List list) {
        boolean z17;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f234388g == null) {
            this.f234388g = new java.util.ArrayList();
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            dp3.o oVar = (dp3.o) list.get(i17);
            java.lang.String str = oVar.f323757d;
            if (!android.text.TextUtils.isEmpty(str)) {
                for (int i18 = 0; i18 < this.f234388g.size(); i18++) {
                    dp3.o oVar2 = (dp3.o) this.f234388g.get(i18);
                    if (oVar2 != null && str.equals(oVar2.f323757d)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                this.f234388g.add(oVar);
            }
        }
    }

    public void a7() {
        m83121xf6ff5b27(nd1.u0.f72979x366c91de);
        m83121xf6ff5b27(nd1.p1.f72967x366c91de);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bwl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (com.p314xaae8f345.mm.p2802xd031a825.a.g(this) instanceof bp3.e) {
            this.f234394p = true;
            W6();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574005gr5);
        this.f234386e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e) findViewById(com.p314xaae8f345.mm.R.id.j_f);
        fp3.v vVar = new fp3.v(this);
        this.f234387f = vVar;
        this.f234386e.setAdapter((android.widget.ListAdapter) vVar);
        this.f234386e.setOnItemClickListener(new fp3.o(this));
        this.f234386e.setOnItemLongClickListener(new fp3.q(this));
        this.f234386e.m79055xb7d2c730(new fp3.r(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "6";
        c6241x543927b6.f273897d = new fp3.s(this, c6241x543927b6);
        c6241x543927b6.e();
        java.util.List list = bp3.f.wi().f104621g;
        if (list != null) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) arrayList.get(i17);
                if (weakReference != null) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(weakReference.get());
                }
                i17++;
            }
        }
        this.f234387f.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11036, java.lang.Integer.valueOf(bp3.f.wi().Ai().b()));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f234385d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        U6();
        mo43517x10010bd5();
        this.f234391m = 0;
        this.f234392n = null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        a7();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        fp3.v vVar = this.f234387f;
        if (vVar != null) {
            vVar.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof dp3.k) {
            dp3.k kVar = (dp3.k) m1Var;
            this.f234392n = kVar.f323751g;
            Z6(kVar.f323748d);
            java.util.List list = kVar.f323749e;
            if (list != null) {
                int i19 = 0;
                while (true) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    if (i19 >= linkedList.size()) {
                        break;
                    }
                    dp3.j jVar = (dp3.j) linkedList.get(i19);
                    if (jVar != null) {
                        ((java.util.HashMap) this.f234395q).put(Y6(jVar.f323745d, jVar.f323746e), jVar.f323747f);
                    }
                    i19++;
                }
            }
            int size = ((java.util.ArrayList) this.f234388g).size();
            this.f234390i = size;
            this.f234389h = kVar.f323750f > size;
            this.f234387f.notifyDataSetChanged();
            this.f234385d.mo50293x3498a0(new fp3.t(this));
            this.f234394p = false;
        } else if (m1Var instanceof dp3.m) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((dp3.m) m1Var).f323755e.f152243a.f152217a;
            if (((r45.w55) fVar).f470432d == 2) {
                java.util.List list2 = this.f234388g;
                if (list2 != null) {
                    ((java.util.ArrayList) list2).clear();
                }
                this.f234390i = 0;
                this.f234389h = false;
                this.f234386e.b();
            } else {
                java.lang.String str2 = ((r45.w55) fVar).f470433e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.util.Iterator it = ((java.util.ArrayList) this.f234388g).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dp3.o oVar = (dp3.o) it.next();
                        if (str2.equals(oVar.f323757d)) {
                            ((java.util.ArrayList) this.f234388g).remove(oVar);
                            this.f234390i = ((java.util.ArrayList) this.f234388g).size();
                            break;
                        }
                    }
                }
            }
            this.f234385d.mo50293x3498a0(new fp3.u(this));
        }
        if (this.f234390i > 0 || ((java.util.ArrayList) this.f234388g).size() != 0) {
            mo74408xb0dfae51(true);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dfu);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            mo74408xb0dfae51(false);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dfu);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
