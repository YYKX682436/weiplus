package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class b4 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99410d;

    public b4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99410d = exdeviceProfileUI;
    }

    @Override // db5.k5
    public boolean E0() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99410d;
        if (exdeviceProfileUI.f99312p.getFirstVisiblePosition() != 0) {
            return false;
        }
        android.widget.ListView listView = exdeviceProfileUI.f99312p;
        android.view.View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() >= 0;
    }
}
