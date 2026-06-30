package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class j8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f216360i;

    /* renamed from: m, reason: collision with root package name */
    public final int f216361m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216362n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216360i = "Finder.FinderCreateAccountHalfScreenUIC";
        this.f216361m = 20002;
        this.f216362n = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public int O6() {
        return this.f216361m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public void Q6() {
        android.view.View view;
        if (m158359x1e885992().getIntExtra("create_account_style", 0) == 1) {
            if (!(this.f217193f.length() == 0)) {
                android.app.Activity m80379x76847179 = m80379x76847179();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
                e4Var.f293309c = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7n);
                e4Var.c();
                Z6(4);
                return;
            }
            java.lang.String stringExtra = m158359x1e885992().getStringExtra("param_extra_info");
            android.widget.TextView textView = null;
            cl0.g gVar = (stringExtra == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) ? null : new cl0.g(stringExtra);
            if (gVar != null) {
                cl0.g b17 = gVar.b("tipsWording");
                if (b17 == null) {
                    java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("tipsWording");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15082x48bce8a4)) {
                        b17 = new cl0.g(mo15082x48bce8a4);
                    }
                }
                if (b17 != null) {
                    java.lang.String mo15082x48bce8a42 = b17.mo15082x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
                    this.f216362n = mo15082x48bce8a42;
                }
            }
            super.Q6();
            if (this.f216362n.length() > 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f217191d;
                if (y1Var != null && (view = y1Var.f293560f) != null) {
                    textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ebe);
                }
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9n, this.f216362n));
                }
            }
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public void R6() {
        Z6(2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public void S6() {
        Z6(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public void T6() {
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7m);
        e4Var.c();
        Z6(5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4
    public void V6(r45.r01 r01Var) {
        super.V6(r01Var);
        android.app.Activity m80379x76847179 = m80379x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
        e4Var.f293309c = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m7m);
        e4Var.c();
        Z6(5);
    }

    public final void Z6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f216360i, "sendEvent :" + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092 c5462x48e46092 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092();
        c5462x48e46092.f135801g.f89981a = i17;
        c5462x48e46092.e();
        if (m158354x19263085().isFinishing()) {
            return;
        }
        m158354x19263085().finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q4, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != this.f216361m || i18 == 1) {
            return;
        }
        m158354x19263085().finish();
    }
}
