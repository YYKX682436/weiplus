package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class b2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f239177d;

    /* renamed from: e, reason: collision with root package name */
    public int f239178e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f239179f;

    public b2(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576328wh);
        this.f239178e = 0;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ce9, null);
        this.f239177d = inflate;
        setContentView(inflate);
        ((android.widget.Button) this.f239177d.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(this);
        ((android.widget.Button) this.f239177d.findViewById(com.p314xaae8f345.mm.R.id.h87)).setOnClickListener(this);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2 c(android.content.Context context, int i17, double d17, double d18, java.lang.String str, double d19, double d27, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceChargeDialog", "showCostDetail");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b2(context);
        b2Var.f239178e = i17;
        if (d18 == 0.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
        }
        ((android.widget.TextView) b2Var.findViewById(com.p314xaae8f345.mm.R.id.lx8)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d18));
        ((android.widget.TextView) b2Var.findViewById(com.p314xaae8f345.mm.R.id.dij)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d19));
        if (d27 == 0.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
        }
        ((android.widget.TextView) b2Var.findViewById(com.p314xaae8f345.mm.R.id.oiz)).setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d27));
        android.view.View findViewById = b2Var.findViewById(com.p314xaae8f345.mm.R.id.f568148lv2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            android.widget.TextView textView = (android.widget.TextView) b2Var.findViewById(com.p314xaae8f345.mm.R.id.f568153lw1);
            textView.setText(str2);
            textView.setVisibility(0);
        }
        android.view.View findViewById2 = b2Var.findViewById(com.p314xaae8f345.mm.R.id.o_m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (onClickListener != null) {
            b2Var.f239179f = onClickListener;
            b2Var.findViewById(com.p314xaae8f345.mm.R.id.khs).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a2(b2Var));
        }
        b2Var.show();
        db5.e1.a(context, b2Var);
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 10, 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 1, 1);
        }
        return b2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() != com.p314xaae8f345.mm.R.id.khs) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RemittanceChargeDialog", "click cancel");
            dismiss();
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.b5i) {
            if (this.f239178e == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 11, 1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12689, 2, 1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
