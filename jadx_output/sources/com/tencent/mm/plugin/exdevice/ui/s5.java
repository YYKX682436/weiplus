package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class s5 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99660d;

    public s5(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99660d = exdeviceRankInfoUI;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99660d;
        android.widget.ListView listView = exdeviceRankInfoUI.f99333d;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int count = exdeviceRankInfoUI.f99333d.getCount();
        return count > 0 && childAt != null && childAt.getBottom() <= exdeviceRankInfoUI.f99333d.getHeight() && exdeviceRankInfoUI.f99333d.getLastVisiblePosition() == count - 1;
    }
}
