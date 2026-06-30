package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93803d;

    public v0(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity) {
        this.f93803d = wXEntryActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = this.f93803d;
        wXEntryActivity.j7();
        wXEntryActivity.finish();
    }
}
