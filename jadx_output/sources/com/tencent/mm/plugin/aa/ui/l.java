package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class l implements com.tencent.mm.ui.tools.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72717a;

    public l(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72717a = aAImagPreviewUI;
    }

    @Override // com.tencent.mm.ui.tools.p5
    public void a() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f72717a, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.aa.ui.j(this);
        k0Var.f211881s = new com.tencent.mm.plugin.aa.ui.k(this);
        k0Var.v();
    }
}
