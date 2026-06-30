package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72617d;

    public d7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72617d = paylistAAUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f72617d.isFinishing() || this.f72617d.isDestroyed()) {
            return;
        }
        java.lang.String string = this.f72617d.getString(com.tencent.mm.R.string.f489759aw);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72617d;
        if (paylistAAUI.B == null) {
            paylistAAUI.B = new com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage(paylistAAUI, 20);
        }
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI2 = this.f72617d;
        com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = paylistAAUI2.B;
        paylistAARemarkInputHalfPage.f72540i = string;
        java.lang.String str = paylistAAUI2.f72561z;
        java.lang.String string2 = paylistAAUI2.getString(com.tencent.mm.R.string.hyh);
        com.tencent.mm.plugin.aa.ui.c7 c7Var = new com.tencent.mm.plugin.aa.ui.c7(this);
        paylistAARemarkInputHalfPage.a();
        boolean z17 = true;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(paylistAARemarkInputHalfPage.f72535d, 1, 2, false);
        paylistAARemarkInputHalfPage.f72537f = z2Var;
        int i17 = (!com.tencent.mm.ui.b4.c(paylistAARemarkInputHalfPage.f72535d) && fp.h.c(36)) ? 16 : 48;
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showDialog] softInputMode=" + i17);
        z2Var.A(i17);
        android.view.View view = z2Var.f212058g;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDialog: dialog rootView is not a ViewGroup, abort. type=");
            android.view.View view2 = z2Var.f212058g;
            sb6.append(view2 != null ? view2.getClass() : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.PaylistAARemarkInputHalfPage", sb6.toString());
            paylistAARemarkInputHalfPage.a();
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(paylistAARemarkInputHalfPage.f72535d).inflate(com.tencent.mm.R.layout.elq, viewGroup, false);
        android.view.ViewGroup viewGroup2 = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PaylistAARemarkInputHalfPage", "showDialog: inflated root is not a ViewGroup, abort. layout=paylist_aa_remark_input_half_page");
            paylistAARemarkInputHalfPage.a();
            return;
        }
        android.view.View findViewById = viewGroup2.findViewById(com.tencent.mm.R.id.upf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            mMEditText.setHint(string2);
        }
        z2Var.f212055d.setOnKeyListener(new com.tencent.mm.plugin.aa.ui.g6(z2Var, paylistAARemarkInputHalfPage, mMEditText));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mMEditText.setText(str);
            mMEditText.setSelection(str != null ? str.length() : 0);
            z2Var.b(!(com.tencent.mm.ui.tools.v4.f(str) > paylistAARemarkInputHalfPage.f72536e * 2));
        }
        mMEditText.setFilters(new android.text.InputFilter[]{new com.tencent.mm.ui.tools.v4(paylistAARemarkInputHalfPage.f72536e, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.aa.ui.h6(z2Var, paylistAARemarkInputHalfPage));
        mMEditText.setOnEditorActionListener(new com.tencent.mm.plugin.aa.ui.i6(z2Var, c7Var, mMEditText, paylistAARemarkInputHalfPage));
        z2Var.j(viewGroup2);
        java.lang.String str2 = paylistAARemarkInputHalfPage.f72540i;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            z2Var.q(paylistAARemarkInputHalfPage.f72535d.getString(com.tencent.mm.R.string.f489759aw));
        } else {
            z2Var.q(paylistAARemarkInputHalfPage.f72540i);
        }
        z2Var.m(paylistAARemarkInputHalfPage.f72535d.getString(com.tencent.mm.R.string.f490347sg), paylistAARemarkInputHalfPage.f72535d.getString(com.tencent.mm.R.string.f490507x1));
        com.tencent.mm.plugin.aa.ui.j6 j6Var = new com.tencent.mm.plugin.aa.ui.j6(c7Var, paylistAARemarkInputHalfPage, mMEditText);
        com.tencent.mm.plugin.aa.ui.k6 k6Var = new com.tencent.mm.plugin.aa.ui.k6(c7Var, mMEditText, paylistAARemarkInputHalfPage);
        z2Var.D = j6Var;
        z2Var.E = k6Var;
        paylistAARemarkInputHalfPage.f72538g.f();
        if (paylistAARemarkInputHalfPage.f72543o && android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.View view3 = z2Var.f212058g;
            if (view3 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PaylistAARemarkInputHalfPage", "[registerImeInsetsAnimation] rootView is null, skip");
            } else {
                n3.l1.o(view3, new com.tencent.mm.plugin.aa.ui.f6(paylistAARemarkInputHalfPage, z2Var, view3));
            }
        }
        z2Var.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showDialog] tryShow() called, dialogIsShowing=" + z2Var.h());
        com.tencent.mm.plugin.aa.ui.l6 l6Var = new com.tencent.mm.plugin.aa.ui.l6(paylistAARemarkInputHalfPage, z2Var, mMEditText);
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(l6Var, 50L, false);
    }
}
