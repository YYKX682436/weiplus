package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y4 f101597d;

    public x4(com.tencent.mm.plugin.fav.ui.y4 y4Var) {
        this.f101597d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.y4 y4Var = this.f101597d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = y4Var.f101619e.f100458g.f100400n;
        if (cVar != null) {
            cVar.c();
            y4Var.f101619e.f100458g.f100400n.notifyDataSetChanged();
        }
    }
}
