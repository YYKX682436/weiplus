package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class b1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f100508d;

    public b1(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f100508d = favCleanUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f100508d;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = favCleanUI.f100307e;
        if (cVar != null) {
            cVar.D = num;
            cVar.c();
            favCleanUI.f100307e.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
