package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f100730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.i1 f100731e;

    public h1(com.tencent.mm.plugin.fav.ui.detail.i1 i1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f100731e = i1Var;
        this.f100730d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.i1 i1Var = this.f100731e;
        i1Var.f100739d.f100746d.f100750d.f100600g.f343491p = true;
        this.f100730d.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", java.lang.Long.valueOf(i1Var.f100739d.f100746d.f100750d.f100641r.field_localId), java.lang.Integer.valueOf(i1Var.f100739d.f100746d.f100750d.f100641r.field_id));
        i1Var.f100739d.f100746d.f100750d.finish();
    }
}
