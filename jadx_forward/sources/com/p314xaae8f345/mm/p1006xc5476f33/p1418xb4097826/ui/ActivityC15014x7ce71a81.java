package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickCancelBtn", "onClickBackBtn", "onClickClearTextBtn", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI */
/* loaded from: classes10.dex */
public final class ActivityC15014x7ce71a81 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements tj5.w, tj5.n {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f210054z = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f210055t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f210056u;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 f210059x;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f210057v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f210058w = "";

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f210060y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u1(this));

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            c7("");
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f210055t;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.lang.String m80978xc3706fda = c22482x50bddb92.m80997xdc5215a6().m80978xc3706fda();
        if (m80978xc3706fda == null || (str = r26.n0.u0(m80978xc3706fda).toString()) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        c7(str);
        return false;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final void c7(java.lang.String str) {
        android.database.Cursor U = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, str, this.f210058w, "", null);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (U.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(U);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            c19782x23db1cfa.m76240x66bc2758(z3Var.d1());
            linkedList.add(c19782x23db1cfa);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(new so2.i0((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next()));
        }
        java.util.ArrayList arrayList2 = this.f210057v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f210056u;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        ((vb2.d) ((jz5.n) this.f210060y).mo141623x754a37bb()).f516064b.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aee;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        jz5.g gVar = this.f210060y;
        ((vb2.d) ((jz5.n) gVar).mo141623x754a37bb()).f516064b.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        this.f210056u = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI$initView$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == so2.i0.class.getName().hashCode()) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
                throw new jz5.d();
            }
        }, this.f210057v, true);
        ((vb2.d) ((jz5.n) gVar).mo141623x754a37bb()).f516064b.mo7960x6cab2c8d(this.f210056u);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f210056u;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.f374637n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s1(this);
        }
        if (c22848x6ddd90cf == null) {
            return;
        }
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t1(this);
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    /* renamed from: onClickCancelBtn */
    public void m60879x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f210055t;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.f210055t = c22482x50bddb92;
        c22482x50bddb92.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f210055t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var = null;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f210055t;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.f210055t;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80980x55355581(false);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.f210055t;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = this.f210055t;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb926);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = this.f210055t;
        if (c22482x50bddb927 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb927.m80997xdc5215a6().m();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = this.f210055t;
        if (c22482x50bddb928 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb928.m80997xdc5215a6().t();
        mo43517x10010bd5();
        java.lang.String stringExtra = getIntent().getStringExtra("BLOCK_LIST_SEARCH_TYPE");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        this.f210058w = stringExtra;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "@finder.block.my.liked.android")) {
            uj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, "@finder.block.his.liked.android")) {
            uj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ua0();
        }
        this.f210059x = uj0Var;
        c7("");
    }
}
