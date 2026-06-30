package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveDelManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI */
/* loaded from: classes3.dex */
public final class ActivityC13997x866e3aa8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f190893m = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f190895e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f190896f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190897g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp f190898h;

    /* renamed from: d, reason: collision with root package name */
    public final bm2.m2 f190894d = new bm2.m2();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f190899i = new java.util.LinkedList();

    public final void T6() {
        int size = ((java.util.ArrayList) this.f190894d.x()).size();
        if (size > 0) {
            m78500x43e00957(1, true);
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.dc7, java.lang.Integer.valueOf(size)));
        } else {
            m78500x43e00957(1, false);
            mo60878xf6b21fea(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.dc6));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570413aq0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        super.onCreate(bundle);
        this.f190895e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.f565566cs2);
        this.f190896f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565567cs3);
        this.f190897g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.cs8);
        m78494xd9193382(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.dc6), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e9(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.dc8));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f9(this));
        m78500x43e00957(1, false);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        this.f190898h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp(mo55332x76847179, null, null, 6, null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190897g;
        bm2.m2 m2Var = this.f190894d;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(m2Var);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190897g;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(c1162x665295de);
        }
        m2Var.f103625f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g9(this);
        m2Var.f103626g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h9(this);
        m2Var.f103627h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.i9(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f190895e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j9(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f190895e;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.k9(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = this.f190895e;
        if (c22621x7603e0173 != null) {
            c22621x7603e0173.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l9(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.f190898h;
        if (hpVar != null) {
            hpVar.K = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.m9(this);
        }
        if (hpVar != null) {
            hpVar.f200112J = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b9.f191233d;
        }
        if (hpVar != null) {
            hpVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.c9(this);
        }
        if (hpVar != null) {
            hpVar.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d9(this);
        }
        if (hpVar != null) {
            hpVar.f0();
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("selectcontactitem");
        if (byteArrayExtra != null) {
            r45.g72 g72Var = new r45.g72();
            g72Var.mo11468x92b714fd(byteArrayExtra);
            java.util.LinkedList<r45.ty1> linkedList = new java.util.LinkedList();
            java.util.LinkedList<r45.l82> m75941xfb821914 = g72Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRoom_manager_list(...)");
            for (r45.l82 l82Var : m75941xfb821914) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(0, l82Var.m75945x2fec8307(0));
                ty1Var.set(2, java.lang.Integer.valueOf(l82Var.m75939xb282bd08(1)));
                r45.xn1 xn1Var = (r45.xn1) l82Var.m75936x14adae67(2);
                java.lang.String str = null;
                ty1Var.set(4, (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76175x6d346f39());
                r45.xn1 xn1Var2 = (r45.xn1) l82Var.m75936x14adae67(2);
                if (xn1Var2 != null) {
                    str = xn1Var2.m75945x2fec8307(6);
                }
                ty1Var.set(1, str);
                linkedList.add(ty1Var);
            }
            java.util.LinkedList linkedList2 = this.f190899i;
            linkedList2.clear();
            linkedList2.addAll(g72Var.m75941xfb821914(0));
            m2Var.getClass();
            java.util.ArrayList arrayList = m2Var.f103624e;
            arrayList.clear();
            for (r45.ty1 ty1Var2 : linkedList) {
                arrayList.add(new bm2.l2(ty1Var2, false));
                m2Var.f103623d.add(new bm2.l2(ty1Var2, false));
            }
            m2Var.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.f190898h;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}
