package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class z4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99737d;

    public z4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99737d = exdeviceProfileUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99737d;
        if (exdeviceProfileUI.A) {
            g4Var.f(6, exdeviceProfileUI.getString(com.tencent.mm.R.string.c4a));
        } else {
            g4Var.f(4, exdeviceProfileUI.getString(com.tencent.mm.R.string.c4d));
        }
    }
}
