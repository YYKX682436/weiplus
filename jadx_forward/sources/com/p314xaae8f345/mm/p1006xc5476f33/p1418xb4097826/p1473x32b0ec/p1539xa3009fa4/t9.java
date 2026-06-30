package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class t9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 f198960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.of1 f198961e;

    public t9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var, r45.of1 of1Var) {
        this.f198960d = v9Var;
        this.f198961e = of1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var = this.f198960d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            rl5.r rVar = v9Var.f199023i;
            if (rVar != null) {
                rVar.a();
            }
            v9Var.getClass();
            v9Var.f199024m = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) v9Var.m80379x76847179(), 1, false);
            android.view.View inflate = android.view.View.inflate(v9Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bqn, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.i77);
            textView.setText(v9Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehp));
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = v9Var.f199024m;
            if (k0Var != null) {
                k0Var.s(inflate, false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = v9Var.f199024m;
            if (k0Var2 != null) {
                k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n9(v9Var);
            }
            if (k0Var2 != null) {
                k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r9(v9Var);
            }
            if (k0Var2 != null) {
                k0Var2.v();
                return;
            }
            return;
        }
        rl5.r rVar2 = v9Var.f199023i;
        if (rVar2 != null) {
            rVar2.a();
        }
        int e17 = c01.id.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v9Var.f199018d, "showPopupMenu modifyTime:" + v9Var.f199031t + ",serverTime:" + e17);
        java.lang.String string = v9Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        long j17 = v9Var.f199031t;
        if (j17 == Long.MIN_VALUE) {
            db5.t7.m123883x26a183b(v9Var.m80379x76847179(), string, 0).show();
            return;
        }
        if (j17 - c01.id.e() <= 0) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v9Var.m158354x19263085();
            android.content.Intent intent = new android.content.Intent();
            r45.of1 of1Var = this.f198961e;
            intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", of1Var.m75945x2fec8307(0));
            intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", of1Var.m75945x2fec8307(1));
            intent.putExtra("KEY_SOURCE", v9Var.m158359x1e885992().getIntExtra("KEY_SOURCE", 0));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Gj(m158354x19263085, intent, 1);
            return;
        }
        v9Var.getClass();
        android.text.format.Time time = new android.text.format.Time();
        time.set(v9Var.f199031t * 1000);
        java.lang.String string2 = v9Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehq, k35.s.a(v9Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), time));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(v9Var.m80379x76847179());
        if (string.length() == 0) {
            u1Var.g(string2);
        } else {
            u1Var.u(string);
            u1Var.g(string2);
        }
        java.lang.String string3 = v9Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        u1Var.n(string3);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m9(v9Var));
        u1Var.q(false);
    }
}
