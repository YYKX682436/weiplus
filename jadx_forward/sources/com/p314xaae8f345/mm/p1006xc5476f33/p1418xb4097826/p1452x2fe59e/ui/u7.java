package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b f192130d;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b activityC13988x6c27dc7b) {
        this.f192130d = activityC13988x6c27dc7b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b activityC13988x6c27dc7b = this.f192130d;
        if (activityC13988x6c27dc7b.f190868y == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13988x6c27dc7b.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo55332x76847179, "null cannot be cast to non-null type android.app.Activity");
            activityC13988x6c27dc7b.f190868y = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(mo55332x76847179);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13988x6c27dc7b activityC13988x6c27dc7b2 = this.f192130d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = activityC13988x6c27dc7b2.f190868y;
            if (f5Var != null) {
                f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.t7(activityC13988x6c27dc7b2);
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = this.f192130d.f190868y;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
