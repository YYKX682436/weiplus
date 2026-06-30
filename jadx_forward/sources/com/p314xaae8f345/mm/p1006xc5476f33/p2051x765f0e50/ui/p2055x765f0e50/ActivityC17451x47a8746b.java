package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lvj5/k;", "mStatusBarHeightCallback", "Lvj5/k;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/hk", "com/tencent/mm/plugin/setting/ui/setting/ik", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI */
/* loaded from: classes.dex */
public final class ActivityC17451x47a8746b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f242130g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f242131d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jk.f242735d);

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f242132e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f242133f;
    private vj5.k mStatusBarHeightCallback;

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4), c01.z1.r(), null);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
        if (str != null) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kbq);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, str));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ovg);
        java.lang.String c17 = c01.z1.c();
        java.lang.String r17 = c01.z1.r();
        boolean z17 = true;
        if (!(c17 == null || c17.length() == 0)) {
            textView2.setText(c17);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(r17)) {
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ium));
        } else {
            textView2.setText(r17);
        }
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.gqj);
        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().c().l(12290, null), 0);
        if (j17 == 0) {
            textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy8));
        } else if (j17 == 1) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j1n);
        } else if (j17 == 2) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j1m);
        }
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d0t);
        c01.fb a17 = c01.fb.a();
        java.lang.String d17 = a17.d();
        if (d17 == null) {
            d17 = "";
        }
        java.lang.String c18 = a17.c();
        if (c18 == null) {
            c18 = "";
        }
        textView4.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(d17) + ' ' + c18);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568461mx0);
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(12291, null);
        if (str2 == null) {
            str2 = "";
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView5.getContext();
        if (str2.length() <= 0) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iy8);
        }
        ((ke0.e) xVar2).getClass();
        textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kux);
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str3 == null || str3.length() <= 0) {
            textView6.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipy));
        } else {
            textView6.setText(str3);
        }
        android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lel);
        java.lang.Object l17 = gm0.j1.u().c().l(9, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) l17).intValue();
        if (intValue != 0) {
            textView7.setText("" + new kk.v(intValue));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) != 1) {
            android.view.View findViewById = textView7.findViewById(com.p314xaae8f345.mm.R.id.lem);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ipy);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityQQ.h()) {
            android.view.View findViewById2 = textView7.findViewById(com.p314xaae8f345.mm.R.id.lem);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView8 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567364j84);
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(5, null);
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView8.setText(com.p314xaae8f345.mm.R.C30867xcad56011.inp);
        } else {
            textView8.setText(str4);
        }
        android.widget.TextView textView9 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a4b);
        textView9.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(textView9.getContext(), o45.wf.f424562g));
        findViewById(com.p314xaae8f345.mm.R.id.f567613k34).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lk(this));
        findViewById(com.p314xaae8f345.mm.R.id.f567231ip1).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mk(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        if (r26.i0.y((java.lang.String) r0, "http", false) == false) goto L17;
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            o25.n1.f(r5)
            r0 = 1
            r5.m78497xc03943d(r0)
            super.onCreate(r6)
            r6 = 2131296469(0x7f0900d5, float:1.8210856E38)
            android.view.View r6 = r5.findViewById(r6)
            r5.f242133f = r6
            if (r6 == 0) goto L3a
            boolean r6 = vj5.n.f519251k
            if (r6 != 0) goto L1a
            goto L3a
        L1a:
            vj5.n r6 = vj5.n.b(r5)
            com.tencent.mm.plugin.setting.ui.setting.kk r1 = new com.tencent.mm.plugin.setting.ui.setting.kk
            r1.<init>(r5)
            r5.mStatusBarHeightCallback = r1
            r6.d(r1)
            android.view.Window r6 = r5.getWindow()
            android.view.View r6 = r6.getDecorView()
            r6.requestApplyInsets()
            android.view.Window r6 = r5.getWindow()
            vj5.o.e(r6)
        L3a:
            android.view.Window r6 = r5.getWindow()
            android.view.View r6 = r6.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            r1 = 1280(0x500, float:1.794E-42)
            r6.setSystemUiVisibility(r1)
            java.lang.String r6 = ""
            r5.mo54450xbf7c1df6(r6)
            r5.mo78530x8b45058f()
            android.content.res.Resources r6 = r5.getResources()
            r1 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r6 = r6.getColor(r1)
            r5.mo64405x4dab7448(r6)
            androidx.appcompat.app.AppCompatActivity r6 = r5.mo55332x76847179()
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131099876(0x7f0600e4, float:1.7812118E38)
            int r6 = r6.getColor(r1)
            r5.m78554x41d7d42(r6)
            com.tencent.mm.plugin.setting.ui.setting.nk r6 = new com.tencent.mm.plugin.setting.ui.setting.nk
            r6.<init>(r5)
            r5.mo54448x9c8c0d33(r6)
            r5.m78605xc85f0ffa()
            kotlin.jvm.internal.c0 r6 = new kotlin.jvm.internal.c0
            r6.<init>()
            r6.f391645d = r0
            r1 = 2131301840(0x7f0915d0, float:1.822175E38)
            android.view.View r1 = r5.findViewById(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.ScrollView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            com.tencent.mm.plugin.setting.ui.setting.ok r2 = new com.tencent.mm.plugin.setting.ui.setting.ok
            r2.<init>(r5, r6)
            r1.setOnScrollChangeListener(r2)
            r6 = 2131316611(0x7f094f83, float:1.8251708E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto Le2
            com.tencent.mm.plugin.setting.ui.setting.pk r1 = new com.tencent.mm.plugin.setting.ui.setting.pk
            r1.<init>(r5, r6)
            r6.setOnClickListener(r1)
            jz5.g r1 = r5.f242131d
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            java.lang.String r3 = "getValue(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            r4 = 0
            if (r2 != 0) goto Lc7
            goto Lc8
        Lc7:
            r0 = r4
        Lc8:
            if (r0 != 0) goto Ldd
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r0 = r1.mo141623x754a37bb()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "http"
            boolean r0 = r26.i0.y(r0, r1, r4)
            if (r0 != 0) goto Le2
        Ldd:
            r0 = 8
            r6.setVisibility(r0)
        Le2:
            r5.mo43517x10010bd5()
            com.tencent.mm.autogen.events.RcptRecentAddrEvent r6 = new com.tencent.mm.autogen.events.RcptRecentAddrEvent
            r6.<init>()
            am.lp r0 = r6.f136177h
            r1 = -1
            r0.f88786a = r1
            com.tencent.mm.plugin.setting.ui.setting.qk r0 = new com.tencent.mm.plugin.setting.ui.setting.qk
            r0.<init>(r6, r5)
            r6.f273897d = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r6.b(r0)
            e71.f r6 = new e71.f
            r6.<init>()
            com.tencent.mm.modelbase.r1 r0 = gm0.j1.d()
            r0.g(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b.onCreate(android.os.Bundle):void");
    }
}
