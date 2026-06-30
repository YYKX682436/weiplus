package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87288e;

    public y3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        this.f87288e = i3Var;
        this.f87287d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87288e.O(this.f87287d);
    }
}
