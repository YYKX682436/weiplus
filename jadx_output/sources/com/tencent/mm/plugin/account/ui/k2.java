package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class k2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.m2 f73972a;

    public k2(com.tencent.mm.plugin.account.ui.m2 m2Var) {
        this.f73972a = m2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.account.ui.m2 m2Var = this.f73972a;
        if (m2Var.M) {
            yz5.a aVar = m2Var.S;
            if (aVar != null) {
                aVar.invoke();
            }
            m2Var.B();
        }
    }
}
