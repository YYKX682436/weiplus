package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class x8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f292440d;

    public x8(com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var) {
        this.f292440d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f292440d;
        if (c9Var.f291854f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c9Var.f291849a, "post do expand search menu, but search menu item is null");
            return;
        }
        if (c9Var.f291850b) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var = c9Var.f291865q;
            if (z8Var != null) {
                z8Var.mo81133xaaf2e435();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var2 = c9Var.f291865q;
        if (z8Var2 != null) {
            z8Var2.mo81133xaaf2e435();
        }
    }
}
