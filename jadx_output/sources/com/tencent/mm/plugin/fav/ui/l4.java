package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.m4 f101240d;

    public l4(com.tencent.mm.plugin.fav.ui.m4 m4Var) {
        this.f101240d = m4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.m4 m4Var = this.f101240d;
        m4Var.f101270a.setResult(0);
        m4Var.f101270a.finish();
        m4Var.f101270a.overridePendingTransition(0, 0);
    }
}
