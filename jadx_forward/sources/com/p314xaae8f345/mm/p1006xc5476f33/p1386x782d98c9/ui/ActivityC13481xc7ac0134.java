package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/SportHistoryUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/exdevice/ui/f7", "com/tencent/mm/plugin/exdevice/ui/n7", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI */
/* loaded from: classes12.dex */
public final class ActivityC13481xc7ac0134 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f180921d;

    /* renamed from: e, reason: collision with root package name */
    public p32.m f180922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f180923f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f180924g = "";

    public static final java.util.LinkedList U6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134, r45.ab0 ab0Var) {
        boolean z17;
        activityC13481xc7ac0134.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList sportrecord = ab0Var.f451415f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sportrecord, "sportrecord");
        java.util.Iterator it = sportrecord.iterator();
        java.util.LinkedList linkedList2 = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.util.LinkedList linkedList3 = null;
        boolean z18 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ed6 ed6Var = (r45.ed6) it.next();
            int i17 = ed6Var.f454868o;
            if (i17 == 0) {
                if (str == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ed6Var.f454860d)) {
                    if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                        if (linkedList2 != null) {
                            linkedList.add(linkedList2);
                        }
                        linkedList2 = new java.util.LinkedList();
                    }
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList3);
                        linkedList.add(linkedList3);
                    }
                    linkedList3 = new java.util.LinkedList();
                    str = ed6Var.f454860d;
                }
                if (linkedList3 != null) {
                    linkedList3.add(ed6Var);
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ed6Var.f454860d, "21f9d636b41b25be")) {
                    z18 = true;
                }
            } else if (i17 == 1) {
                if (str2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, ed6Var.f454861e)) {
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        if (linkedList3 != null) {
                            linkedList.add(linkedList3);
                        }
                        linkedList3 = new java.util.LinkedList();
                    }
                    if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                        linkedList.add(linkedList2);
                    }
                    linkedList2 = new java.util.LinkedList();
                    str2 = ed6Var.f454861e;
                }
                if (linkedList2 != null) {
                    linkedList2.add(ed6Var);
                }
            }
        }
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
            linkedList.add(linkedList2);
        }
        if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList3);
            linkedList.add(linkedList3);
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        if (!z18) {
            java.util.LinkedList linkedList5 = ab0Var.f451419m;
            if (linkedList5 != null && !linkedList5.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                r45.ed6 ed6Var2 = new r45.ed6();
                ed6Var2.f454860d = "21f9d636b41b25be";
                ed6Var2.f454868o = 0;
                ed6Var2.f454863g = null;
                linkedList4.add(ed6Var2);
                linkedList.add(linkedList4);
            }
        }
        return linkedList;
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134 activityC13481xc7ac0134, android.widget.TextView textView, float f17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13481xc7ac0134.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        java.lang.Object systemService = mo55332x76847179.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / mo55332x76847179.getResources().getDisplayMetrics().density);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cvd;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572688c56);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o7(this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f180921d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f180921d;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n7(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13481xc7ac0134.this);
                }
            }, this.f180923f, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f180921d;
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p7(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f180921d;
        if (c22849x81a93d254 != null) {
            ym5.a1.g(c22849x81a93d254, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q7(this));
        }
        gm0.j1.d().a(4835, this);
        r45.lo3 lo3Var = new r45.lo3();
        java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f180924g = stringExtra;
        lo3Var.f461207d = stringExtra;
        this.f180922e = new p32.m(lo3Var);
        gm0.j1.d().g(this.f180922e);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        p32.m mVar = this.f180922e;
        if (mVar != null) {
            gm0.j1.d().d(mVar);
        }
        gm0.j1.d().q(4835, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        r45.mo3 mo3Var;
        java.util.LinkedList linkedList;
        if (i17 == 0 && i18 == 0) {
            p32.m mVar = this.f180922e;
            if (mVar != null && (mo3Var = mVar.f433037f) != null && (linkedList = mo3Var.f462244d) != null) {
                int i19 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.ab0 ab0Var = (r45.ab0) obj;
                    java.util.ArrayList arrayList = this.f180923f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ab0Var);
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f7(this, i19, ab0Var));
                    i19 = i27;
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f180921d;
            if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ilt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180922e = null;
    }
}
