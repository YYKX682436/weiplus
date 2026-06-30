package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class k6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99547d;

    public k6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99547d = exdeviceRankInfoUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99547d;
        if (exdeviceRankInfoUI.P) {
            g4Var.f(1, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.c4a));
        } else {
            g4Var.f(0, exdeviceRankInfoUI.getString(com.tencent.mm.R.string.c4d));
        }
    }
}
