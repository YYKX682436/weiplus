package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickClearTextBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 */
/* loaded from: classes3.dex */
public final class ActivityC14122xff3e485 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements tj5.w, tj5.n {
    public static final /* synthetic */ int G = 0;
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 C;
    public final bm2.w7 D;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 E;
    public boolean F;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f191153v = "Finder_Sensitive_Word_Search_UI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f191154w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zp(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f191155x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xp(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f191156y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.up(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f191157z = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.tp(this));
    public java.util.LinkedList A = new java.util.LinkedList();
    public java.lang.String B = "";

    public ActivityC14122xff3e485() {
        bm2.w7 w7Var = new bm2.w7(this);
        w7Var.f103952g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pp(this);
        this.D = w7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14122xff3e485 activityC14122xff3e485, java.util.LinkedList linkedList) {
        ?? linkedList2;
        if (!r26.n0.N(activityC14122xff3e485.B)) {
            linkedList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (r26.n0.D((java.lang.String) obj, activityC14122xff3e485.B, false, 2, null)) {
                    linkedList2.add(obj);
                }
            }
        } else {
            linkedList2 = new java.util.LinkedList();
        }
        if (linkedList2.isEmpty()) {
            android.view.View f76 = activityC14122xff3e485.f7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View f77 = activityC14122xff3e485.f7();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(f77, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f77.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(f77, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", "updateList", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bm2.w7 w7Var = activityC14122xff3e485.D;
        w7Var.getClass();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) w7Var.f103950e;
        arrayList3.clear();
        arrayList3.addAll(linkedList2);
        w7Var.m8146xced61ae5();
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.C;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.lang.String obj = c22482x50bddb92.m80997xdc5215a6().m80966xdb574fcd().getText().toString();
        mo48674x36654fab();
        g7(obj);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_sensitive_word_search", "view_clk", kz5.b1.e(new jz5.l("sensitive_word", obj)));
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final java.lang.Object e7(int i17, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        new db2.a2(i17, xy2.c.e(this), linkedList).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.rp(this, nVar, i17));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final android.view.View f7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f191156y).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void g7(java.lang.String str) {
        this.B = str;
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f191155x).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View f76 = f7();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(f76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(f76, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f191157z).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        android.view.View view2 = (android.view.View) mo141623x754a37bb2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40", ya.a.f77450x918d59a8, "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yp(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570509az0;
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
    public void m56598x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.C;
        if (c22482x50bddb92 != null) {
            c22482x50bddb92.m80997xdc5215a6().e();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f191155x).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.view.View) mo141623x754a37bb).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sp(this));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        this.C = c22482x50bddb92;
        zl2.r4.f555483a.Z2(c22482x50bddb92.m80997xdc5215a6().m80966xdb574fcd(), null, 20, 10, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, null);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.C;
        if (c22482x50bddb922 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb922.m81002xcd6a5043(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.C;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb923.m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb924 = this.C;
        if (c22482x50bddb924 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb924.m80997xdc5215a6().m80988xce28f7ee(this);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb925 = this.C;
        if (c22482x50bddb925 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb925.m80997xdc5215a6().m80980x55355581(false);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb926 = this.C;
        if (c22482x50bddb926 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb926.m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb927 = this.C;
        if (c22482x50bddb927 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        mo2533x106ab264.y(c22482x50bddb927);
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb928 = this.C;
        if (c22482x50bddb928 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb928.m80997xdc5215a6().m();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb929 = this.C;
        if (c22482x50bddb929 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb929.m80997xdc5215a6().t();
        jz5.g gVar = this.f191154w;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb2).mo7960x6cab2c8d(this.D);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb3).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wp(this));
    }
}
