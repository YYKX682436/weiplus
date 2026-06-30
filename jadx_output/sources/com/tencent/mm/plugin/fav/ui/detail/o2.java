package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f100772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.p2 f100773e;

    public o2(com.tencent.mm.plugin.fav.ui.detail.p2 p2Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, long j17, long j18) {
        this.f100773e = p2Var;
        this.f100772d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.p2 p2Var = this.f100773e;
        p2Var.f100778d.f100783d.f100789d.f100600g.f343491p = true;
        this.f100772d.dismiss();
        p2Var.f100778d.f100783d.f100789d.finish();
    }
}
