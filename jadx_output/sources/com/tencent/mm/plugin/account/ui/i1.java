package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class i1 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.m1 f73920a;

    public i1(com.tencent.mm.plugin.account.ui.m1 m1Var) {
        this.f73920a = m1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_logout", "view_clk", null);
        com.tencent.mm.plugin.account.ui.m1 m1Var = this.f73920a;
        if (m1Var.f74031g == null || m1Var.f74030f) {
            return;
        }
        m1Var.f74030f = true;
        m1Var.f74028d.a(true);
        wd0.e1 e1Var = new wd0.e1();
        wd0.d1[] d1VarArr = wd0.d1.f444702d;
        e1Var.f444703a = 9;
        e1Var.f444704b = "user canceled";
        m1Var.f74031g.a(e1Var);
    }
}
