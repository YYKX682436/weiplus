package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da f155794d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da) {
        this.f155794d = activityC11404xb70180da;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r1 r1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da.f154810p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da activityC11404xb70180da = this.f155794d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC11404xb70180da.mo55332x76847179(), 1, 0, true);
        activityC11404xb70180da.f154819o = z2Var;
        z2Var.m(activityC11404xb70180da.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), activityC11404xb70180da.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = activityC11404xb70180da.f154819o;
        if (z2Var2 != null) {
            z2Var2.o(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = activityC11404xb70180da.f154819o;
        if (z2Var3 != null) {
            z2Var3.v(activityC11404xb70180da.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = activityC11404xb70180da.f154819o;
        if (z2Var4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a2(activityC11404xb70180da);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b2(activityC11404xb70180da);
            z2Var4.D = a2Var;
            z2Var4.E = b2Var;
        }
        if (z2Var4 != null) {
            android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(activityC11404xb70180da);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var5 = activityC11404xb70180da.f154819o;
            android.view.KeyEvent.Callback callback = z2Var5 != null ? z2Var5.f293591g : null;
            android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.duo, callback instanceof android.view.ViewGroup ? (android.view.ViewGroup) callback : null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rqc);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.rq9);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.rq8);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.rqa);
            android.widget.CheckBox checkBox2 = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.rq_);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rqb);
            activityC11404xb70180da.f154817m = false;
            activityC11404xb70180da.f154818n = false;
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c2(activityC11404xb70180da, checkBox));
            linearLayout2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d2(activityC11404xb70180da, checkBox2));
            textView2.setText(activityC11404xb70180da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.msn, activityC11404xb70180da.T6().get(0)));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11404xb70180da.mo55332x76847179();
            int intValue = ((java.lang.Number) ((jz5.n) activityC11404xb70180da.f154816i).mo141623x754a37bb()).intValue();
            java.lang.String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "" : "https://e.189.cn/sdk/agreement/show.do?order=2&type=main&appKey=&hidetop=true&returnUrl=" : "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true" : "https://wap.cmpassport.com/resources/html/contract.html";
            java.lang.String str2 = (java.lang.String) ((jz5.n) activityC11404xb70180da.f154813f).mo141623x754a37bb();
            if (str2 != null) {
                if (str2.length() > 0) {
                    str = str2;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GateWayMobileUI", "get Link: ".concat(str));
            java.util.List k17 = kz5.c0.k(str);
            java.lang.String string = activityC11404xb70180da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.msn, activityC11404xb70180da.T6().get(0));
            java.util.List T6 = activityC11404xb70180da.T6();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((ke0.e) xVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.v(mo55332x76847179, k17, string, T6, bool, textView2, true, null);
            z2Var4.j(inflate);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var6 = activityC11404xb70180da.f154819o;
        if (z2Var6 != null) {
            z2Var6.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
