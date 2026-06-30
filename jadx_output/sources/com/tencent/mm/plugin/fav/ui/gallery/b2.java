package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class b2 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.l2 f100899c;

    public b2(com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var) {
        this.f100899c = l2Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = this.f100899c;
        return (i17 < l2Var.f100994b.size() && ((com.tencent.mm.plugin.fav.ui.gallery.o1) l2Var.f100994b.get(i17)).f101037c != Integer.MAX_VALUE) ? 1 : 4;
    }
}
