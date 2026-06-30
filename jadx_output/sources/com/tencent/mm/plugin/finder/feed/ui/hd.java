package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class hd extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        super(2);
        this.f110117d = kdVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rm2.a aVar = (rm2.a) obj;
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110117d;
        if (aVar != null) {
            r45.hf5 hf5Var = (r45.hf5) kdVar.K1.getCustom(3);
            if (hf5Var != null) {
                hf5Var.set(0, java.lang.Integer.valueOf(aVar.f397431c));
            }
            kdVar.j0();
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = kdVar.F1;
        if (z2Var != null) {
            z2Var.B();
        }
        return jz5.f0.f302826a;
    }
}
