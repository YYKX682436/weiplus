package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f100701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.d0 f100702e;

    public c0(com.tencent.mm.plugin.fav.ui.detail.d0 d0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f100702e = d0Var;
        this.f100701d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.d0 d0Var = this.f100702e;
        d0Var.f100707d.f100711d.f100718g.f100600g.f343491p = true;
        this.f100701d.dismiss();
        long j17 = d0Var.f100707d.f100711d.f100718g.E.field_localId;
        int i17 = d0Var.f100707d.f100711d.f100718g.E.field_id;
        d0Var.f100707d.f100711d.f100718g.finish();
    }
}
