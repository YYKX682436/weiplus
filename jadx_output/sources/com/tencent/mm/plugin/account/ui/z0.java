package com.tencent.mm.plugin.account.ui;

/* loaded from: classes8.dex */
public class z0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ContactsSyncUI f74352d;

    public z0(com.tencent.mm.plugin.account.ui.ContactsSyncUI contactsSyncUI) {
        this.f74352d = contactsSyncUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f74352d.finish();
    }
}
