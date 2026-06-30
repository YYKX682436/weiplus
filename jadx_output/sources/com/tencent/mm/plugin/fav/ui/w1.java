package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.x1 f101506d;

    public w1(com.tencent.mm.plugin.fav.ui.x1 x1Var) {
        this.f101506d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.x1 x1Var = this.f101506d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = x1Var.f101593e.f100452g.f100335o;
        if (cVar != null) {
            cVar.c();
            x1Var.f101593e.f100452g.f100335o.notifyDataSetChanged();
        }
    }
}
