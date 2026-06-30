package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f107353d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107353d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(a7Var.f106207d);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491936ep3));
        u1Var.a(true);
        u1Var.l(com.tencent.mm.plugin.finder.feed.l5.f107275a);
        u1Var.q(false);
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = a0Var.k();
            yz5.a aVar = k17.interceptClose;
            if (!(aVar != null ? ((java.lang.Boolean) aVar.invoke()).booleanValue() : false)) {
                k17.u();
            }
        }
        return jz5.f0.f302826a;
    }
}
