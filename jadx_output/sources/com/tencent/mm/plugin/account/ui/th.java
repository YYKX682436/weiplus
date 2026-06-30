package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class th implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74231d;

    public th(com.tencent.mm.plugin.account.ui.SetPwdUI setPwdUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f74231d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74231d);
    }
}
