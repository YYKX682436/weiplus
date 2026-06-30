package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p32.j f99703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.h4 f99704e;

    public v3(com.tencent.mm.plugin.exdevice.ui.h4 h4Var, p32.j jVar) {
        this.f99704e = h4Var;
        this.f99703d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.exdevice.ui.h4 h4Var = this.f99704e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h4Var.f99475a.f99322z;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = h4Var.f99475a;
        java.util.ArrayList<java.lang.String> arrayList = this.f99703d.f351479q;
        exdeviceProfileUI.f99308i = arrayList;
        exdeviceProfileUI.f99310n.setAffectedUserInfo(arrayList);
    }
}
