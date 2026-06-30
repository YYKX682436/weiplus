package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI */
/* loaded from: classes5.dex */
public final class ActivityC12869xafc66e3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public long f174362d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174363e;

    /* renamed from: f, reason: collision with root package name */
    public po1.d f174364f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174365g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174366h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f174367i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f174368m;

    /* renamed from: n, reason: collision with root package name */
    public int f174369n;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3) {
        activityC12869xafc66e3.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC12869xafc66e3, 1, true);
        k0Var.f293405n = new zo1.g2(activityC12869xafc66e3);
        k0Var.f293414s = new zo1.h2(activityC12869xafc66e3, k0Var);
        k0Var.q(activityC12869xafc66e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mxc), 17);
        k0Var.v();
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12869xafc66e3 activityC12869xafc66e3) {
        activityC12869xafc66e3.getClass();
        qo1.j0 d17 = qo1.j1.f447056a.d(activityC12869xafc66e3.f174362d);
        jz5.l d18 = d17.d();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) d18.f384366d;
        if (n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING || n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z17 = d17 instanceof qo1.v0;
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            objArr[0] = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
            java.lang.String string = activityC12869xafc66e3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwu, objArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC12869xafc66e3);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
            e4Var.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PackageDeleteConfirmUI", "A task is running, skip delete action, isBackupTask=" + z17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        long j17 = activityC12869xafc66e3.f174362d;
        java.util.ArrayList d19 = kz5.c0.d(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = r0Var.k(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        java.lang.String a17 = go1.d.f355477a.a(k17);
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = k17.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        io1.a aVar = new io1.a(j17, io1.b.f374991d, cVar.a(uVar), 0.0f, false, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.c(j17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a.f174094e, aVar);
        r0Var.q(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1261x7643c6b5.ServiceC12852xd025bba9.f174257f.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.e().b(d19, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b0(java.lang.System.currentTimeMillis(), j17, k17, aVar, a17));
        android.content.Intent intent = new android.content.Intent(activityC12869xafc66e3, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", activityC12869xafc66e3.f174362d);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC12869xafc66e3, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI", "startDelete", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12869xafc66e3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC12869xafc66e3, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI", "startDelete", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC12869xafc66e3.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dxj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new zo1.e2(this));
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78530x8b45058f();
        m78563x4e0f6657(false);
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f174362d = longExtra;
        if (longExtra == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PackageDeleteConfirmUI", "Error: Fail to get packageId from intent");
            finish();
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        this.f174363e = k17;
        po1.c cVar = po1.d.f438827i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = k17.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        this.f174364f = cVar.a(uVar);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.rz7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174365g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rz8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174366h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f567765rz5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174367i = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f567764rz4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById4;
        this.f174368m = button;
        button.setOnClickListener(new zo1.f2(this));
        go1.d dVar = go1.d.f355477a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174363e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String a17 = dVar.a(gVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174365g;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("iconIv");
            throw null;
        }
        c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81255x7dbd245, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        android.widget.TextView textView = this.f174366h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        android.text.TextPaint paint = textView.getPaint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.25f);
        android.widget.TextView textView2 = this.f174366h;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mx_, a17));
        android.widget.TextView textView3 = this.f174367i;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintTv");
            throw null;
        }
        textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mxe);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = this.f174363e;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String S1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(gVar2.f297370o.f297371d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(S1, "toSizeKBSting(...)");
        sb6.append("(".concat(S1));
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        android.widget.Button button2 = this.f174368m;
        if (button2 != null) {
            button2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvv, sb7));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteBtn");
            throw null;
        }
    }
}
