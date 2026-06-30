package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f239173a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0 f239174b;

    /* renamed from: c, reason: collision with root package name */
    public r45.o10 f239175c;

    public b0(android.content.Context context) {
        this.f239173a = context;
    }

    public void a(int i17, java.lang.String str, r45.o10 o10Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a0 a0Var, java.lang.String str2, java.lang.String str3) {
        this.f239174b = a0Var;
        this.f239175c = o10Var;
        android.content.Context context = this.f239173a;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccc, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ht7);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.g6u);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi)).b(this.f239175c.f463344e);
        textView.setText(o10Var.f463345f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(this.f239175c.f463343d);
        u1Var.d(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1.class)).m42291x53d8522f("real_name_dialog_title_key", this.f239175c.f463343d);
        java.lang.String string = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str2 : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572101yq);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        }
        u1Var.n(string);
        u1Var.j(str3);
        ck5.f b17 = ck5.f.b(editText);
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
        b17.f124094f = 1;
        b17.f124093e = 1;
        b17.f124089a = false;
        b17.f124090b = false;
        b17.d(null);
        editText.setMaxLines(1);
        editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r(this, u1Var, editText));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s(this, editText), 200L);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49 c7058x50451a49 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49();
        c7058x50451a49.f143661f = i17;
        c7058x50451a49.p(str);
        c7058x50451a49.f143659d = 1L;
        c7058x50451a49.k();
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t(this, i17, str, editText));
        u1Var.q(false);
        if (u1Var.f293531c == null || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(editText.getText())) {
            return;
        }
        u1Var.f293531c.f(-1).setEnabled(false);
        u1Var.f293531c.B(-2141754475);
    }
}
