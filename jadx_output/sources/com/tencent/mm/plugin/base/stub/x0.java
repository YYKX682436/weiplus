package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class x0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93817d;

    public x0(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity) {
        this.f93817d = wXEntryActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f93817d.finish();
    }
}
