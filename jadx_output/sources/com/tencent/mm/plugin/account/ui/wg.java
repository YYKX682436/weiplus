package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class wg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.m1 f74302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.xg f74303e;

    public wg(com.tencent.mm.plugin.account.ui.xg xgVar, r61.m1 m1Var) {
        this.f74303e = xgVar;
        this.f74302d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74302d);
        gm0.j1.d().q(com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff, this.f74303e.f74326e);
    }
}
