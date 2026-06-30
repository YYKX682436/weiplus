package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCommentManagerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCommentManagerUI */
/* loaded from: classes3.dex */
public final class ActivityC13983x9b040529 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f190855J = 0;
    public bm2.v1 A;
    public android.view.View B;
    public android.widget.ScrollView C;
    public android.view.View D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp E;
    public long F;
    public long G;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f190859y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190860z;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f190856v = "Finder.FinderLiveAnchorCommentManagerUI";

    /* renamed from: w, reason: collision with root package name */
    public int f190857w = 5;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f190858x = new java.util.LinkedList();
    public final int H = 111;
    public final int I = 112;

    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 activityC13983x9b040529, int i17) {
        activityC13983x9b040529.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (i17 == activityC13983x9b040529.H) {
            intent.setClassName(activityC13983x9b040529.mo55332x76847179(), "com.tencent.mm.ui.contact.SelectContactUI");
            intent.putExtra("list_type", 1);
            intent.putExtra("titile", activityC13983x9b040529.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ece));
            intent.putExtra("without_openim", true);
            com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288315c & (-16777217), 131072));
            bm2.v1 v1Var = activityC13983x9b040529.A;
            if (v1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            intent.putExtra("block_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(v1Var.x(), ","));
            intent.putExtra("Forbid_SelectChatRoom", true);
            intent.putExtra("can_go_to_profile", true);
            intent.putExtra("too_many_member_tip_string", activityC13983x9b040529.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eab, java.lang.String.valueOf(activityC13983x9b040529.f190857w)));
            int i18 = activityC13983x9b040529.f190857w;
            bm2.v1 v1Var2 = activityC13983x9b040529.A;
            if (v1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            intent.putExtra("max_limit_num", i18 - ((java.util.ArrayList) v1Var2.x()).size());
        } else {
            intent.setClass(activityC13983x9b040529.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8.class);
            r45.g72 g72Var = new r45.g72();
            g72Var.m75941xfb821914(0).addAll(activityC13983x9b040529.f190858x);
            intent.putExtra("selectcontactitem", g72Var.mo14344x5f01b1f6());
        }
        activityC13983x9b040529.startActivityForResult(intent, i17);
    }

    public final java.util.LinkedList e7(java.lang.String str, java.lang.String str2) {
        r26.t tVar = new r26.t(str2);
        java.lang.String[] strArr = (java.lang.String[]) tVar.g(str, 0).toArray(new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str3 : strArr) {
            linkedList.add(str3);
        }
        return linkedList;
    }

    public final void f7() {
        pq5.g l17 = new ek2.i1(xy2.c.e(this), this.F, this.G).l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.m7(this));
        l17.f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.alm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.H) {
            if (intent == null || (stringExtra2 = intent.getStringExtra("Select_Contact")) == null) {
                return;
            }
            if (stringExtra2.length() == 0) {
                return;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            java.util.LinkedList<java.lang.String> e76 = e7(stringExtra3 != null ? stringExtra3 : "", ",");
            java.lang.String e17 = xy2.c.e(this);
            long j17 = this.F;
            long j18 = this.G;
            r45.fe1 fe1Var = new r45.fe1();
            for (java.lang.String str : e76) {
                java.util.LinkedList m75941xfb821914 = fe1Var.m75941xfb821914(0);
                r45.l82 l82Var = new r45.l82();
                l82Var.set(0, str);
                l82Var.set(1, 1);
                m75941xfb821914.add(l82Var);
            }
            pq5.g l17 = new ek2.s1(e17, j17, j18, 1, fe1Var, null, 32, null).l();
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.i7(this));
            l17.f(this);
            return;
        }
        if (i17 != this.I || intent == null || (stringExtra = intent.getStringExtra("Select_Contact")) == null) {
            return;
        }
        if (stringExtra.length() == 0) {
            return;
        }
        java.lang.String stringExtra4 = intent.getStringExtra("Select_Contact");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        java.util.LinkedList<java.lang.String> e77 = e7(stringExtra4, ",");
        java.lang.String e18 = xy2.c.e(this);
        long j19 = this.F;
        long j27 = this.G;
        r45.g72 g72Var = new r45.g72();
        for (java.lang.String str2 : e77) {
            java.util.LinkedList m75941xfb8219142 = g72Var.m75941xfb821914(0);
            r45.l82 l82Var2 = new r45.l82();
            l82Var2.set(0, str2);
            bm2.v1 v1Var = this.A;
            java.lang.Object obj = null;
            if (v1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            java.lang.String m75945x2fec8307 = l82Var2.m75945x2fec8307(0);
            java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            java.util.Iterator it = v1Var.f103907g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.ty1) next).m75945x2fec8307(0), str3)) {
                    obj = next;
                    break;
                }
            }
            r45.ty1 ty1Var = (r45.ty1) obj;
            l82Var2.set(1, java.lang.Integer.valueOf(ty1Var != null ? ty1Var.m75939xb282bd08(2) : 1));
            m75941xfb8219142.add(l82Var2);
        }
        pq5.g l18 = new ek2.s1(e18, j19, j27, 2, null, g72Var, 16, null).l();
        l18.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j7(this));
        l18.f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        vj5.o.e(getWindow());
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        this.F = getIntent().getLongExtra("objectid", 0L);
        this.G = getIntent().getLongExtra("liveid", 0L);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f190859y = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.c7k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f190860z = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qhr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.B = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.hiq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.D = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.c7n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.C = (android.widget.ScrollView) findViewById5;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f190859y;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a7(this));
        bm2.v1 v1Var = new bm2.v1();
        this.A = v1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190860z;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("managerList");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(v1Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d((android.content.Context) mo55332x76847179(), 4, 1, false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190860z;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("managerList");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(c1161x57298f5d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp(mo55332x76847179, null, null, 6, null);
        this.E = hpVar;
        bm2.v1 v1Var2 = this.A;
        if (v1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        v1Var2.f103904d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b7(this);
        v1Var2.f103905e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.c7(this);
        v1Var2.f103906f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d7(this);
        hpVar.K = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.e7(this);
        hpVar.f200112J = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f7.f191540d;
        hpVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g7(this);
        hpVar.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h7(this);
        hpVar.f0();
        if (m81210x448cda5d()) {
            android.view.View view = this.B;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avaterRoot");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, 0, 0);
            }
            view.setLayoutParams(layoutParams);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f190860z;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("managerList");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = c1163xf1deaba43.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(0, 48, 0, 0);
            }
            c1163xf1deaba43.setLayoutParams(layoutParams2);
            android.view.View view2 = this.D;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.setMargins(0, 5, 0, 0);
            }
            view2.setLayoutParams(layoutParams3);
            android.widget.ScrollView scrollView = this.C;
            if (scrollView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
                throw null;
            }
            scrollView.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.z6.f192326d);
        }
        f7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = this.E;
        if (hpVar != null) {
            hpVar.g0();
        }
    }
}
