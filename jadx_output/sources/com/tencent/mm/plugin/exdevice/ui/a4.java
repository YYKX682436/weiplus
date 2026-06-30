package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class a4 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99400d;

    public a4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99400d = exdeviceProfileUI;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99400d;
        android.widget.ListView listView = exdeviceProfileUI.f99312p;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int count = exdeviceProfileUI.f99312p.getAdapter().getCount();
        return count > 0 && childAt != null && childAt.getBottom() <= exdeviceProfileUI.f99312p.getHeight() && exdeviceProfileUI.f99312p.getLastVisiblePosition() >= count - 1;
    }
}
