package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class r5 implements db5.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99642a;

    public r5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99642a = exdeviceRankInfoUI;
    }

    @Override // db5.h5
    public boolean a(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99642a;
        java.util.List list = exdeviceRankInfoUI.B;
        exdeviceRankInfoUI.M = (list == null || list.size() == 0) ? false : true;
        return false;
    }
}
