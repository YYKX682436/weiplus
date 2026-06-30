package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class k1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95340d;

    public k1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95340d = vipCardListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f95340d.finish();
        return false;
    }
}
