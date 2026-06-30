package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI f99560d;

    public m(com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI) {
        this.f99560d = exdeviceAddDataSourceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f99560d;
        com.tencent.mm.plugin.exdevice.ui.t tVar = exdeviceAddDataSourceUI.f99164e;
        java.util.List list = exdeviceAddDataSourceUI.f99165f;
        java.util.LinkedList linkedList = (java.util.LinkedList) tVar.f99662d;
        linkedList.clear();
        if (list != null && ((java.util.LinkedList) list).size() != 0) {
            linkedList.addAll(list);
        }
        exdeviceAddDataSourceUI.f99164e.notifyDataSetChanged();
    }
}
