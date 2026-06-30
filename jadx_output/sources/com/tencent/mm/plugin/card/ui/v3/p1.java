package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class p1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f95357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f95359f;

    public p1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, kotlin.jvm.internal.c0 c0Var2) {
        this.f95357d = c0Var;
        this.f95358e = vipCardListUI;
        this.f95359f = c0Var2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = this.f95357d.f310112d;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95358e;
        if (z17) {
            g4Var.add(0, 1, 0, vipCardListUI.H);
        }
        if (this.f95359f.f310112d) {
            g4Var.add(0, 2, 1, vipCardListUI.D);
        }
    }
}
