package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.q f99594d;

    public o(com.tencent.mm.plugin.exdevice.ui.q qVar) {
        this.f99594d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.exdevice.ui.q qVar = this.f99594d;
        ((java.util.LinkedList) qVar.f99624e.f99165f).remove(qVar.f99623d);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = qVar.f99624e;
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
