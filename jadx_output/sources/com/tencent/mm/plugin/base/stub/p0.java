package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity f93782d;

    public p0(com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity wXCustomSchemeEntryActivity) {
        this.f93782d = wXCustomSchemeEntryActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f93782d.finish();
    }
}
