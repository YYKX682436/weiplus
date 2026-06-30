package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f74261d;

    public v1(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        this.f74261d = gateWayMobileUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.r1 r1Var = com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p;
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f74261d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(gateWayMobileUI.getContext(), 1, 0, true);
        gateWayMobileUI.f73286o = z2Var;
        z2Var.m(gateWayMobileUI.getResources().getString(com.tencent.mm.R.string.f490347sg), gateWayMobileUI.getResources().getString(com.tencent.mm.R.string.f490502ww));
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = gateWayMobileUI.f73286o;
        if (z2Var2 != null) {
            z2Var2.o(0);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = gateWayMobileUI.f73286o;
        if (z2Var3 != null) {
            z2Var3.v(gateWayMobileUI.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var4 = gateWayMobileUI.f73286o;
        if (z2Var4 != null) {
            com.tencent.mm.plugin.account.ui.a2 a2Var = new com.tencent.mm.plugin.account.ui.a2(gateWayMobileUI);
            com.tencent.mm.plugin.account.ui.b2 b2Var = new com.tencent.mm.plugin.account.ui.b2(gateWayMobileUI);
            z2Var4.D = a2Var;
            z2Var4.E = b2Var;
        }
        if (z2Var4 != null) {
            android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(gateWayMobileUI);
            com.tencent.mm.ui.widget.dialog.z2 z2Var5 = gateWayMobileUI.f73286o;
            android.view.KeyEvent.Callback callback = z2Var5 != null ? z2Var5.f212058g : null;
            android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.duo, callback instanceof android.view.ViewGroup ? (android.view.ViewGroup) callback : null, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rqc);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.rq9);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.rq8);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.rqa);
            android.widget.CheckBox checkBox2 = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.rq_);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rqb);
            gateWayMobileUI.f73284m = false;
            gateWayMobileUI.f73285n = false;
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.account.ui.c2(gateWayMobileUI, checkBox));
            linearLayout2.setOnClickListener(new com.tencent.mm.plugin.account.ui.d2(gateWayMobileUI, checkBox2));
            textView2.setText(gateWayMobileUI.getString(com.tencent.mm.R.string.msn, gateWayMobileUI.T6().get(0)));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = gateWayMobileUI.getContext();
            int intValue = ((java.lang.Number) ((jz5.n) gateWayMobileUI.f73283i).getValue()).intValue();
            java.lang.String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "" : "https://e.189.cn/sdk/agreement/show.do?order=2&type=main&appKey=&hidetop=true&returnUrl=" : "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true" : "https://wap.cmpassport.com/resources/html/contract.html";
            java.lang.String str2 = (java.lang.String) ((jz5.n) gateWayMobileUI.f73280f).getValue();
            if (str2 != null) {
                if (str2.length() > 0) {
                    str = str2;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GateWayMobileUI", "get Link: ".concat(str));
            java.util.List k17 = kz5.c0.k(str);
            java.lang.String string = gateWayMobileUI.getString(com.tencent.mm.R.string.msn, gateWayMobileUI.T6().get(0));
            java.util.List T6 = gateWayMobileUI.T6();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ((ke0.e) xVar).getClass();
            com.tencent.mm.pluginsdk.ui.span.c0.v(context, k17, string, T6, bool, textView2, true, null);
            z2Var4.j(inflate);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var6 = gateWayMobileUI.f73286o;
        if (z2Var6 != null) {
            z2Var6.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
