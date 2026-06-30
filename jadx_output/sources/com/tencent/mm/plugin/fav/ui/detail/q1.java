package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes11.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.u1 f100782d;

    public q1(com.tencent.mm.plugin.fav.ui.detail.u1 u1Var) {
        this.f100782d = u1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.fav.ui.detail.u1 u1Var = this.f100782d;
        if (u1Var.f100803d.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true)) {
            g4Var.f(2, u1Var.f100803d.getString(com.tencent.mm.R.string.ccw));
        }
        g4Var.f(0, u1Var.f100803d.getString(com.tencent.mm.R.string.f491194ca3));
        g4Var.f(1, u1Var.f100803d.getString(com.tencent.mm.R.string.ccl));
        g4Var.f(3, u1Var.f100803d.getString(com.tencent.mm.R.string.f491195ca4));
        g4Var.f(4, u1Var.f100803d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
