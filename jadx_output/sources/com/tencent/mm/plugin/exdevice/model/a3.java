package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class a3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.f3 f98850d;

    public a3(com.tencent.mm.plugin.exdevice.model.f3 f3Var) {
        this.f98850d = f3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f98850d.f98903k = true;
    }
}
