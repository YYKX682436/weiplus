package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f224626d;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var) {
        this.f224626d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var = this.f224626d;
        int i17 = f2Var.f224353v;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 != 3) {
            java.lang.String trim = f2Var.A.getText().toString().trim();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                r45.m57 m57Var = new r45.m57();
                m57Var.f461690d = 0;
                m57Var.f461691e = trim;
                linkedList.add(m57Var);
            }
            java.util.ArrayList arrayList2 = f2Var.F;
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2) it.next();
                    if (e2Var.f224325c) {
                        r45.m57 m57Var2 = new r45.m57();
                        try {
                            m57Var2.f461690d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e2Var.f224323a, 0);
                            linkedList.add(m57Var2);
                        } catch (java.lang.NumberFormatException unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallFeedbackDialog", "getFeedbackList error, id = " + e2Var.f224323a);
                        }
                    }
                }
            }
        }
        c01.d9.e().g(new p83.m(f2Var.f224339e, i17, linkedList));
        if (f2Var.f224353v == 3) {
            f2Var.f(2);
        } else {
            f2Var.hide();
            f2Var.G.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d2(f2Var), 2000L);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(f2Var.f224342h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g5_), null, f2Var.f224341g, null, null);
            int i18 = f2Var.f224353v;
            q83.c.a(1, -1, i18, f2Var.e(i18), 0, -1, -1, f2Var.f224339e, f2Var.f224340f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
