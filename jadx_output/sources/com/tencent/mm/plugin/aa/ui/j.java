package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.l f72693d;

    public j(com.tencent.mm.plugin.aa.ui.l lVar) {
        this.f72693d = lVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.a(1, com.tencent.mm.R.string.gai);
        com.tencent.mm.plugin.aa.ui.l lVar = this.f72693d;
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = lVar.f72717a;
        if (aAImagPreviewUI.f72431e == 1) {
            g4Var.d(2, aAImagPreviewUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), lVar.f72717a.getString(com.tencent.mm.R.string.g_y));
        }
    }
}
