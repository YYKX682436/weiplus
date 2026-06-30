package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class q0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity f93786d;

    public q0(com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f93786d = wXCustomSchemeEntryActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f93786d.finish();
    }
}
