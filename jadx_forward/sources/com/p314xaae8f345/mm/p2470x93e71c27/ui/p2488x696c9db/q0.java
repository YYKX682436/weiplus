package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public final class q0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 f273381a;

    public q0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var) {
        this.f273381a = r0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        try {
            this.f273381a.m8146xced61ae5();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingHeaderFooterRvAdapter", th6, "onchanged err", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = this.f273381a;
            r0Var.m8151xc67946d3(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingHeaderFooterRvAdapter", th6, "onItemRangeChanged err", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = this.f273381a;
            r0Var.m8153xd399a4d9(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingHeaderFooterRvAdapter", th6, "onItemRangeInserted err", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = this.f273381a;
        try {
            r0Var.m8150x87567217(r0Var.y() + i17, r0Var.y() + i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingHeaderFooterRvAdapter", th6, "onItemRangeMoved err", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r0 r0Var = this.f273381a;
            r0Var.m8154xdb81fc7f(r0Var.y() + i17, i18);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingHeaderFooterRvAdapter", th6, "onItemRangeRemoved err", new java.lang.Object[0]);
        }
    }
}
