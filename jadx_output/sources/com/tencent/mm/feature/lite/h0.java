package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i0 f67162d;

    public h0(com.tencent.mm.feature.lite.i0 i0Var) {
        this.f67162d = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.lite.i0 i0Var = this.f67162d;
        q80.f0 f0Var = i0Var.f67192b;
        if (f0Var != null) {
            f0Var.fail();
        }
        com.tencent.mm.feature.lite.i iVar = i0Var.f67198h;
        android.content.Context context = i0Var.f67193c;
        android.os.Bundle bundle = i0Var.f67194d;
        boolean z17 = i0Var.f67195e;
        com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport = i0Var.f67196f;
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = i0Var.f67197g;
        q80.f0 f0Var2 = i0Var.f67192b;
        boolean z18 = com.tencent.mm.feature.lite.i.f67166r;
        iVar.mk(context, bundle, true, z17, wxaLiteAppStartReport, openExtraData, f0Var2);
    }
}
