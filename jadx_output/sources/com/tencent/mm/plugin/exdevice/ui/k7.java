package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class k7 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f99549b;

    public k7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, r45.ed6 ed6Var) {
        this.f99548a = sportHistoryUI;
        this.f99549b = ed6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(this.f99548a.getString(com.tencent.mm.R.string.k0e, v5Var.field_nickname));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.f490002i4);
            u1Var.b(new com.tencent.mm.plugin.exdevice.ui.j7(v5Var, this.f99549b));
            u1Var.q(false);
        }
    }
}
