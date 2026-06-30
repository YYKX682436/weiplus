package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f106205d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106205d;
        az2.f fVar = a7Var.f106228x0;
        if (fVar != null) {
            fVar.b();
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(a7Var.f106207d);
        e4Var.d(com.tencent.mm.R.string.eo9);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
