package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class rk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI) {
        super(0);
        this.f110505d = finderSharePostUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110505d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = finderSharePostUI.f109546u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        finderSharePostUI.finish();
        return jz5.f0.f302826a;
    }
}
