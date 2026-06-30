package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.c f99404d;

    public b(com.tencent.mm.plugin.exdevice.ui.c cVar) {
        this.f99404d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.plugin.exdevice.ui.c cVar = this.f99404d;
        r1Var.d(cVar.f99413e.f99173q);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = cVar.f99413e;
        exdeviceAddDataSourceUI.f99173q = null;
        com.tencent.mm.plugin.exdevice.ui.u a17 = exdeviceAddDataSourceUI.f99164e.a(cVar.f99412d);
        if (a17 != null) {
            a17.f99685e = com.tencent.mm.plugin.exdevice.ui.v.NORMAL;
        }
    }
}
