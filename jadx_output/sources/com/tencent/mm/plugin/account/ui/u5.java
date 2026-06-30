package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class u5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginIndepPass f74238d;

    public u5(com.tencent.mm.plugin.account.ui.LoginIndepPass loginIndepPass) {
        this.f74238d = loginIndepPass;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f74238d.f73354f = null;
    }
}
