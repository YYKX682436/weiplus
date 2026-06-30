package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes9.dex */
public class n2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.r2 f100767d;

    public n2(com.tencent.mm.plugin.fav.ui.detail.r2 r2Var) {
        this.f100767d = r2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.fav.ui.detail.r2 r2Var = this.f100767d;
        g4Var.f(0, r2Var.f100789d.getString(com.tencent.mm.R.string.f491195ca4));
        g4Var.a(2, com.tencent.mm.R.string.ccl);
        g4Var.f(1, r2Var.f100789d.getContext().getString(com.tencent.mm.R.string.f490367t0));
    }
}
