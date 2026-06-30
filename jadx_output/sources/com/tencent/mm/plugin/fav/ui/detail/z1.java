package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a2 f100822d;

    public z1(com.tencent.mm.plugin.fav.ui.detail.a2 a2Var) {
        this.f100822d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.a2 a2Var = this.f100822d;
        a2Var.f100695a.finish();
        a2Var.f100695a.overridePendingTransition(0, 0);
    }
}
