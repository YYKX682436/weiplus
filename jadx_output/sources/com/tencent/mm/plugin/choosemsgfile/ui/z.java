package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes9.dex */
public class z implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95640d;

    public z(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95640d = chooseMsgFileUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95640d;
        g4Var.f(0, chooseMsgFileUI.getString(com.tencent.mm.R.string.b7c));
        g4Var.f(1, chooseMsgFileUI.getString(com.tencent.mm.R.string.b7e));
        g4Var.f(2, chooseMsgFileUI.getString(com.tencent.mm.R.string.b7f));
        g4Var.f(3, chooseMsgFileUI.getString(com.tencent.mm.R.string.b7d));
    }
}
