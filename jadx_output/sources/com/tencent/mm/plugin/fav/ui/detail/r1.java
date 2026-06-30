package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f100787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.s1 f100788e;

    public r1(com.tencent.mm.plugin.fav.ui.detail.s1 s1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f100788e = s1Var;
        this.f100787d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.s1 s1Var = this.f100788e;
        s1Var.f100792d.f100797d.f100803d.f100600g.f343491p = true;
        this.f100787d.dismiss();
        long j17 = s1Var.f100792d.f100797d.f100803d.f100654p;
        s1Var.f100792d.f100797d.f100803d.finish();
    }
}
