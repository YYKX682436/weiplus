package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f86847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86850g;

    public l3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.String str, java.lang.String str2) {
        this.f86850g = i3Var;
        this.f86847d = w2Var;
        this.f86848e = str;
        this.f86849f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int indexOf;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86850g;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f86847d;
        synchronized (i3Var.f86709o) {
            indexOf = i3Var.f86710p.indexOf(w2Var);
        }
        if (indexOf < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageContainer", "navigateBack with appId(%s) Page(%s), but already off stack, maybe frequent clicks were performed", i3Var.getAppId(), w2Var.getCurrentUrl());
        } else {
            com.tencent.mm.plugin.appbrand.page.i3.f(this.f86850g, indexOf + 1, this.f86848e, null, null, this.f86849f);
        }
    }
}
