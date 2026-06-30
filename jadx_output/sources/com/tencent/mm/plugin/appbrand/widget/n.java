package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f91766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.q f91767e;

    public n(com.tencent.mm.plugin.appbrand.widget.q qVar, java.lang.Runnable runnable) {
        this.f91767e = qVar;
        this.f91766d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91767e.a(this.f91766d);
    }
}
