package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f73868d;

    public g(com.tencent.mm.plugin.account.ui.h hVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f73868d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73868d);
    }
}
