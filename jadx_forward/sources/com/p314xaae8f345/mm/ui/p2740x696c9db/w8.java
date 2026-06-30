package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class w8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f292416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f292417e;

    public w8(com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var, android.app.Activity activity) {
        this.f292417e = c9Var;
        this.f292416d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f292417e;
        if (c9Var.f291854f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c9Var.f291849a, "on post expand search menu, but item is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c9Var.f291849a, "try to expand action view, searchViewExpand %B", java.lang.Boolean.valueOf(c9Var.f291851c));
        if (c9Var.f291850b) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var = c9Var.f291865q;
            if (z8Var != null) {
                z8Var.mo81133xaaf2e435();
            }
        } else {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var2 = c9Var.f291865q;
            if (z8Var2 != null) {
                z8Var2.mo81133xaaf2e435();
            }
        }
        android.view.View actionView = c9Var.f291854f.getActionView();
        if (actionView == null || !c9Var.f291851c) {
            return;
        }
        actionView.findViewById(com.p314xaae8f345.mm.R.id.d98).requestFocus();
        if (c9Var.i()) {
            c9Var.f291855g.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2740x696c9db.v8(this, actionView), 128L);
        }
    }
}
