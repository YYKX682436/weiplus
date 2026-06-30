package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p32.l f99531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99532e;

    public j6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI, p32.l lVar) {
        this.f99532e = exdeviceRankInfoUI;
        this.f99531d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99532e;
        exdeviceRankInfoUI.f99334e.f99505e = exdeviceRankInfoUI.B;
        p32.l lVar = this.f99531d;
        if (lVar.H() != null) {
            exdeviceRankInfoUI.Q = ((r45.tq3) lVar.H()).f386700w;
            exdeviceRankInfoUI.f99334e.g(exdeviceRankInfoUI.Q);
        }
        exdeviceRankInfoUI.f99334e.notifyDataSetChanged();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V6(exdeviceRankInfoUI);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.U6(exdeviceRankInfoUI, exdeviceRankInfoUI.R);
    }
}
