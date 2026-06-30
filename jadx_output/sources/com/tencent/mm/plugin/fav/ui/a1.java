package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class a1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f100448d;

    public a1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f100448d = favCleanUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o72.j2 j2Var = (o72.j2) obj;
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f100448d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar != null) {
            cVar.C = j2Var;
            cVar.c();
            favCleanUI.f100307e.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
