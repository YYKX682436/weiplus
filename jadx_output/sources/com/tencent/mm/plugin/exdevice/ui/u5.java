package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class u5 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99692d;

    public u5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99692d = exdeviceRankInfoUI;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View childAt;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99692d;
        int firstVisiblePosition = exdeviceRankInfoUI.f99333d.getFirstVisiblePosition();
        return firstVisiblePosition == 0 && (childAt = exdeviceRankInfoUI.f99333d.getChildAt(firstVisiblePosition)) != null && childAt.getTop() >= 0;
    }
}
