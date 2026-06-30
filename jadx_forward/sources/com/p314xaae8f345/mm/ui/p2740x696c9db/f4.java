package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f291931e;

    public f4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, android.view.View view) {
        this.f291931e = s4Var;
        this.f291930d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291931e;
        int i17 = s4Var.f292251y;
        s4Var.getClass();
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
            this.f291930d.requestLayout();
        }
    }
}
