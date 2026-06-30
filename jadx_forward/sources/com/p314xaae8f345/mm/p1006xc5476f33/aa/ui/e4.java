package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 f154161f;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 g4Var, java.lang.String str, java.lang.String str2) {
        this.f154161f = g4Var;
        this.f154159d = str;
        this.f154160e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g4 g4Var = this.f154161f;
        if (com.p314xaae8f345.mm.vfs.w6.j(g4Var.f154195e.l7())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", " upload success , delete file");
            com.p314xaae8f345.mm.vfs.w6.h(g4Var.f154195e.l7());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = g4Var.f154195e;
        if (activityC11351x975a7907.f154038i != 4) {
            activityC11351x975a7907.w7(g4Var.f154191a, g4Var.f154192b, this.f154159d, this.f154160e, g4Var.f154193c, g4Var.f154194d);
        } else if (!activityC11351x975a7907.t7()) {
            g4Var.f154195e.x7(g4Var.f154191a, g4Var.f154192b, this.f154159d, this.f154160e, g4Var.f154193c, g4Var.f154194d);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a79072 = g4Var.f154195e;
            activityC11351x975a79072.x7(g4Var.f154191a, g4Var.f154192b, this.f154159d, this.f154160e, g4Var.f154193c, activityC11351x975a79072.H1);
        }
    }
}
