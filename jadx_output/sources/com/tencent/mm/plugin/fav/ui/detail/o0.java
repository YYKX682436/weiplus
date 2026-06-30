package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f100769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.p0 f100770e;

    public o0(com.tencent.mm.plugin.fav.ui.detail.p0 p0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f100770e = p0Var;
        this.f100769d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.p0 p0Var = this.f100770e;
        p0Var.f100776d.f100781d.f100786e.f100600g.f343491p = true;
        this.f100769d.dismiss();
        long j17 = p0Var.f100776d.f100781d.f100786e.f100627o.field_localId;
        p0Var.f100776d.f100781d.f100786e.finish();
    }
}
