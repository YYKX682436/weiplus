package com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI */
/* loaded from: classes8.dex */
public final class ActivityC12955x181c0197 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f175405v = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175408f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175409g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f175410h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f175411i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f175406d = "MicroMsg.BizComSchIntermediateUI";

    /* renamed from: e, reason: collision with root package name */
    public final cq1.s f175407e = new cq1.s();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f175412m = jz5.h.b(new cq1.h(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f175413n = jz5.h.b(new cq1.k(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f175414o = jz5.h.b(new cq1.j(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f175415p = jz5.h.b(new cq1.i(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f175416q = jz5.h.b(new cq1.c(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f175417r = jz5.h.b(new cq1.m(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f175418s = jz5.h.b(new cq1.p(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f175419t = jz5.h.b(new cq1.g(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f175420u = jz5.h.b(new cq1.l(this));

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197, r45.r00 r00Var, dq1.b bVar) {
        java.lang.String str = activityC12955x181c0197.f175406d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "canPass");
        int i17 = r00Var.f465927d;
        dq1.u[] uVarArr = dq1.u.f323891d;
        dq1.k qVar = i17 == 2 ? new dq1.q() : i17 == 1 ? new dq1.t() : i17 == 3 ? new dq1.j() : i17 == 4 ? new dq1.m() : i17 == 5 ? new dq1.i() : i17 == 6 ? new dq1.n() : i17 == 7 ? new dq1.d() : i17 == 8 ? new dq1.h() : i17 == 9 ? new dq1.g() : new dq1.o();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g action_buffer = r00Var.f465928e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(action_buffer, "action_buffer");
        boolean a17 = qVar.a(activityC12955x181c0197, bVar, action_buffer, r00Var.f465929f, r00Var.f465930g);
        if (!a17) {
            activityC12955x181c0197.Z6();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handler is " + qVar.getClass().getName() + ", ret = " + a17);
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197, r45.r00 r00Var, dq1.b bVar) {
        java.lang.String str = activityC12955x181c0197.f175406d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "needToBlock");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12955x181c0197.f175410h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r00Var.f465931h.f463326f) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r00Var.f465931h.f463327g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "title and desc empty");
            activityC12955x181c0197.Z6();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r00Var.f465931h.f463328h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "antispam_button empty");
            activityC12955x181c0197.Z6();
            return;
        }
        if (r00Var.f465931h.f463328h.size() > 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "antispam_button.size > 2");
            activityC12955x181c0197.Z6();
            return;
        }
        java.util.LinkedList antispam_button = r00Var.f465931h.f463328h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(antispam_button, "antispam_button");
        java.util.Iterator it = kz5.n0.K0(antispam_button, 2).iterator();
        while (it.hasNext()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.p00) it.next()).f464177e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "btn content is empty!");
                activityC12955x181c0197.Z6();
                return;
            }
        }
        activityC12955x181c0197.X6().setText(r00Var.f465931h.f463326f);
        activityC12955x181c0197.W6().setText(r00Var.f465931h.f463327g);
        java.util.LinkedList antispam_button2 = r00Var.f465931h.f463328h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(antispam_button2, "antispam_button");
        java.util.List K0 = kz5.n0.K0(antispam_button2, 2);
        if (K0.size() <= 1) {
            activityC12955x181c0197.d7(activityC12955x181c0197.V6(), activityC12955x181c0197.X6(), activityC12955x181c0197.W6(), activityC12955x181c0197.Y6());
            android.widget.Button Y6 = activityC12955x181c0197.Y6();
            java.lang.Object X = kz5.n0.X(K0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X, "first(...)");
            activityC12955x181c0197.b7(bVar, Y6, (r45.p00) X, r00Var);
            return;
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) activityC12955x181c0197.f175418s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        jz5.g gVar = activityC12955x181c0197.f175419t;
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        jz5.g gVar2 = activityC12955x181c0197.f175420u;
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        activityC12955x181c0197.d7(activityC12955x181c0197.V6(), activityC12955x181c0197.X6(), activityC12955x181c0197.W6(), (android.view.View) mo141623x754a37bb, (android.widget.Button) mo141623x754a37bb2, (android.widget.Button) mo141623x754a37bb3);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        java.lang.Object obj = K0.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        activityC12955x181c0197.b7(bVar, (android.widget.Button) mo141623x754a37bb4, (r45.p00) obj, r00Var);
        java.lang.Object mo141623x754a37bb5 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb5, "getValue(...)");
        java.lang.Object obj2 = K0.get(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        activityC12955x181c0197.b7(bVar, (android.widget.Button) mo141623x754a37bb5, (r45.p00) obj2, r00Var);
    }

    public final android.view.View V6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175412m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.widget.TextView W6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175415p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.TextView X6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175414o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.Button Y6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175417r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.Button) mo141623x754a37bb;
    }

    public final void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175406d, "go2UnknownPage");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f175410h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        d7(V6(), W6(), Y6());
        W6().setText(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajc));
        Y6().setText(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571343cd));
        Y6().setOnClickListener(new cq1.d(this));
    }

    public final void a7() {
        moveTaskToBack(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f175410h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        finish();
    }

    public final void b7(dq1.b bVar, android.widget.Button button, r45.p00 p00Var, r45.r00 r00Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175406d, "btn text = " + p00Var.f464177e + ", btn type = " + p00Var.f464176d);
        button.setText(p00Var.f464177e);
        button.setOnClickListener(new cq1.f(p00Var, this, r00Var, bVar));
    }

    public final void c7(boolean z17) {
        jz5.g gVar = this.f175416q;
        jz5.g gVar2 = this.f175413n;
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.ImageView) mo141623x754a37bb).getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams)).topMargin = i65.a.b(mo55332x76847179(), 20);
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            android.view.ViewGroup.LayoutParams layoutParams2 = ((android.view.View) mo141623x754a37bb2).getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams2)).bottomMargin = i65.a.b(mo55332x76847179(), 20);
            return;
        }
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar2).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams3 = ((android.widget.ImageView) mo141623x754a37bb3).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams3)).topMargin = i65.a.b(mo55332x76847179(), 80);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams4 = ((android.view.View) mo141623x754a37bb4).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams4)).bottomMargin = i65.a.b(mo55332x76847179(), 96);
    }

    public final void d7(android.view.View... viewArr) {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f175418s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f175419t).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f175420u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        java.util.Set e17 = kz5.p1.e(V6(), X6(), W6(), Y6(), (android.view.View) mo141623x754a37bb, (android.widget.Button) mo141623x754a37bb2, (android.widget.Button) mo141623x754a37bb3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : e17) {
            if (kz5.z.G(viewArr, (android.view.View) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            android.view.View view2 = (android.view.View) it6.next();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "showThem", "([Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r26.i0.n(r0, "WXCustomSchemeEntryActivity", false) != false) goto L19;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r4 = this;
            int r0 = r4.getTaskId()
            android.app.ActivityManager$RunningTaskInfo r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z(r4, r0)
            r1 = 0
            if (r0 == 0) goto L41
            android.content.ComponentName r2 = r0.topActivity
            android.content.ComponentName r3 = r4.getComponentName()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 != 0) goto L18
            goto L41
        L18:
            android.content.ComponentName r2 = r0.baseActivity
            android.content.ComponentName r3 = r4.getComponentName()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 != 0) goto L40
            boolean r2 = r4.isTaskRoot()
            if (r2 != 0) goto L40
            android.content.ComponentName r0 = r0.baseActivity
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.toShortString()
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != 0) goto L38
            java.lang.String r0 = ""
        L38:
            java.lang.String r2 = "WXCustomSchemeEntryActivity"
            boolean r0 = r26.i0.n(r0, r2, r1)
            if (r0 == 0) goto L41
        L40:
            r1 = 1
        L41:
            if (r1 == 0) goto L47
            super.finishAndRemoveTask()
            return
        L47:
            super.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.finish():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569747kq;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        a7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        c7(newConfig.orientation == 2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo54448x9c8c0d33(new cq1.e(this));
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String stringExtra = getIntent().getStringExtra("biz_common_scheme_url");
        this.f175411i = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175406d, "check url = " + stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            if (r26.i0.y(stringExtra, "weixin://biz/", false) && stringExtra.length() > 13) {
                z17 = true;
            }
        }
        if (!z17) {
            Z6();
            return;
        }
        java.lang.String str = this.f175411i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3325xe03a0797.p3326xc267989b.y0 b17 = v65.m.b(this);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new cq1.o(this, str, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175406d, "onResume() " + hashCode());
        super.onResume();
        c7(mo55332x76847179().getResources().getConfiguration().orientation == 2);
        if (!this.f175408f || this.f175409g) {
            return;
        }
        a7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175406d, "onStart() " + hashCode());
        super.onStart();
        if (!this.f175408f || this.f175409g) {
            return;
        }
        a7();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        this.f175408f = true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        this.f175408f = true;
    }
}
