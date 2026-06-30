package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class w2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI f99711d;

    public w2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI) {
        this.f99711d = exdeviceFollowsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        p32.j jVar = this.f99711d.f99275e;
        if (jVar != null) {
            gm0.j1.d().d(jVar);
        }
        dialogInterface.dismiss();
    }
}
