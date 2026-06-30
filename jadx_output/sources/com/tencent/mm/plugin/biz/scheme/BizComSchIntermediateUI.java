package com.tencent.mm.plugin.biz.scheme;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-biz_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class BizComSchIntermediateUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f93872v = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93875f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93876g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f93877h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f93878i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f93873d = "MicroMsg.BizComSchIntermediateUI";

    /* renamed from: e, reason: collision with root package name */
    public final cq1.s f93874e = new cq1.s();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f93879m = jz5.h.b(new cq1.h(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f93880n = jz5.h.b(new cq1.k(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f93881o = jz5.h.b(new cq1.j(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f93882p = jz5.h.b(new cq1.i(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f93883q = jz5.h.b(new cq1.c(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f93884r = jz5.h.b(new cq1.m(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f93885s = jz5.h.b(new cq1.p(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f93886t = jz5.h.b(new cq1.g(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f93887u = jz5.h.b(new cq1.l(this));

    public static final void T6(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI, r45.r00 r00Var, dq1.b bVar) {
        java.lang.String str = bizComSchIntermediateUI.f93873d;
        com.tencent.mars.xlog.Log.i(str, "canPass");
        int i17 = r00Var.f384394d;
        dq1.u[] uVarArr = dq1.u.f242358d;
        dq1.k qVar = i17 == 2 ? new dq1.q() : i17 == 1 ? new dq1.t() : i17 == 3 ? new dq1.j() : i17 == 4 ? new dq1.m() : i17 == 5 ? new dq1.i() : i17 == 6 ? new dq1.n() : i17 == 7 ? new dq1.d() : i17 == 8 ? new dq1.h() : i17 == 9 ? new dq1.g() : new dq1.o();
        com.tencent.mm.protobuf.g action_buffer = r00Var.f384395e;
        kotlin.jvm.internal.o.f(action_buffer, "action_buffer");
        boolean a17 = qVar.a(bizComSchIntermediateUI, bVar, action_buffer, r00Var.f384396f, r00Var.f384397g);
        if (!a17) {
            bizComSchIntermediateUI.Z6();
        }
        com.tencent.mars.xlog.Log.i(str, "handler is " + qVar.getClass().getName() + ", ret = " + a17);
    }

    public static final void U6(com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI, r45.r00 r00Var, dq1.b bVar) {
        java.lang.String str = bizComSchIntermediateUI.f93873d;
        com.tencent.mars.xlog.Log.i(str, "needToBlock");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = bizComSchIntermediateUI.f93877h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(r00Var.f384398h.f381793f) && com.tencent.mm.sdk.platformtools.t8.K0(r00Var.f384398h.f381794g)) {
            com.tencent.mars.xlog.Log.i(str, "title and desc empty");
            bizComSchIntermediateUI.Z6();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(r00Var.f384398h.f381795h)) {
            com.tencent.mars.xlog.Log.i(str, "antispam_button empty");
            bizComSchIntermediateUI.Z6();
            return;
        }
        if (r00Var.f384398h.f381795h.size() > 2) {
            com.tencent.mars.xlog.Log.i(str, "antispam_button.size > 2");
            bizComSchIntermediateUI.Z6();
            return;
        }
        java.util.LinkedList antispam_button = r00Var.f384398h.f381795h;
        kotlin.jvm.internal.o.f(antispam_button, "antispam_button");
        java.util.Iterator it = kz5.n0.K0(antispam_button, 2).iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.p00) it.next()).f382644e)) {
                com.tencent.mars.xlog.Log.i(str, "btn content is empty!");
                bizComSchIntermediateUI.Z6();
                return;
            }
        }
        bizComSchIntermediateUI.X6().setText(r00Var.f384398h.f381793f);
        bizComSchIntermediateUI.W6().setText(r00Var.f384398h.f381794g);
        java.util.LinkedList antispam_button2 = r00Var.f384398h.f381795h;
        kotlin.jvm.internal.o.f(antispam_button2, "antispam_button");
        java.util.List K0 = kz5.n0.K0(antispam_button2, 2);
        if (K0.size() <= 1) {
            bizComSchIntermediateUI.d7(bizComSchIntermediateUI.V6(), bizComSchIntermediateUI.X6(), bizComSchIntermediateUI.W6(), bizComSchIntermediateUI.Y6());
            android.widget.Button Y6 = bizComSchIntermediateUI.Y6();
            java.lang.Object X = kz5.n0.X(K0);
            kotlin.jvm.internal.o.f(X, "first(...)");
            bizComSchIntermediateUI.b7(bVar, Y6, (r45.p00) X, r00Var);
            return;
        }
        java.lang.Object value = ((jz5.n) bizComSchIntermediateUI.f93885s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        jz5.g gVar = bizComSchIntermediateUI.f93886t;
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        jz5.g gVar2 = bizComSchIntermediateUI.f93887u;
        java.lang.Object value3 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        bizComSchIntermediateUI.d7(bizComSchIntermediateUI.V6(), bizComSchIntermediateUI.X6(), bizComSchIntermediateUI.W6(), (android.view.View) value, (android.widget.Button) value2, (android.widget.Button) value3);
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        java.lang.Object obj = K0.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        bizComSchIntermediateUI.b7(bVar, (android.widget.Button) value4, (r45.p00) obj, r00Var);
        java.lang.Object value5 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        java.lang.Object obj2 = K0.get(1);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        bizComSchIntermediateUI.b7(bVar, (android.widget.Button) value5, (r45.p00) obj2, r00Var);
    }

    public final android.view.View V6() {
        java.lang.Object value = ((jz5.n) this.f93879m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView W6() {
        java.lang.Object value = ((jz5.n) this.f93882p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView X6() {
        java.lang.Object value = ((jz5.n) this.f93881o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.Button Y6() {
        java.lang.Object value = ((jz5.n) this.f93884r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.Button) value;
    }

    public final void Z6() {
        com.tencent.mars.xlog.Log.i(this.f93873d, "go2UnknownPage");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f93877h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        d7(V6(), W6(), Y6());
        W6().setText(getContext().getResources().getString(com.tencent.mm.R.string.ajc));
        Y6().setText(getContext().getResources().getString(com.tencent.mm.R.string.f489810cd));
        Y6().setOnClickListener(new cq1.d(this));
    }

    public final void a7() {
        moveTaskToBack(true);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f93877h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        finish();
    }

    public final void b7(dq1.b bVar, android.widget.Button button, r45.p00 p00Var, r45.r00 r00Var) {
        com.tencent.mars.xlog.Log.i(this.f93873d, "btn text = " + p00Var.f382644e + ", btn type = " + p00Var.f382643d);
        button.setText(p00Var.f382644e);
        button.setOnClickListener(new cq1.f(p00Var, this, r00Var, bVar));
    }

    public final void c7(boolean z17) {
        jz5.g gVar = this.f93883q;
        jz5.g gVar2 = this.f93880n;
        if (z17) {
            java.lang.Object value = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.ImageView) value).getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams)).topMargin = i65.a.b(getContext(), 20);
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.ViewGroup.LayoutParams layoutParams2 = ((android.view.View) value2).getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams2)).bottomMargin = i65.a.b(getContext(), 20);
            return;
        }
        java.lang.Object value3 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams3 = ((android.widget.ImageView) value3).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3)).topMargin = i65.a.b(getContext(), 80);
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams4 = ((android.view.View) value4).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams4)).bottomMargin = i65.a.b(getContext(), 96);
    }

    public final void d7(android.view.View... viewArr) {
        java.lang.Object value = ((jz5.n) this.f93885s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.Object value2 = ((jz5.n) this.f93886t).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        java.lang.Object value3 = ((jz5.n) this.f93887u).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        java.util.Set e17 = kz5.p1.e(V6(), X6(), W6(), Y6(), (android.view.View) value, (android.widget.Button) value2, (android.widget.Button) value3);
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
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r4 = this;
            int r0 = r4.getTaskId()
            android.app.ActivityManager$RunningTaskInfo r0 = com.tencent.mm.sdk.platformtools.t8.z(r4, r0)
            r1 = 0
            if (r0 == 0) goto L41
            android.content.ComponentName r2 = r0.topActivity
            android.content.ComponentName r3 = r4.getComponentName()
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 != 0) goto L18
            goto L41
        L18:
            android.content.ComponentName r2 = r0.baseActivity
            android.content.ComponentName r3 = r4.getComponentName()
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.finish():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488214kq;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        a7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        c7(newConfig.orientation == 2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackBtn(new cq1.e(this));
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String stringExtra = getIntent().getStringExtra("biz_common_scheme_url");
        this.f93878i = stringExtra;
        com.tencent.mars.xlog.Log.i(this.f93873d, "check url = " + stringExtra);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            kotlin.jvm.internal.o.d(stringExtra);
            if (r26.i0.y(stringExtra, "weixin://biz/", false) && stringExtra.length() > 13) {
                z17 = true;
            }
        }
        if (!z17) {
            Z6();
            return;
        }
        java.lang.String str = this.f93878i;
        kotlin.jvm.internal.o.d(str);
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new cq1.o(this, str, null), 2, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f93873d, "onResume() " + hashCode());
        super.onResume();
        c7(getContext().getResources().getConfiguration().orientation == 2);
        if (!this.f93875f || this.f93876g) {
            return;
        }
        a7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f93873d, "onStart() " + hashCode());
        super.onStart();
        if (!this.f93875f || this.f93876g) {
            return;
        }
        a7();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        this.f93875f = true;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        this.f93875f = true;
    }
}
