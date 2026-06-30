package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.b f302245e;

    public d0(com.p3263xee53b379.b bVar, java.lang.String str) {
        this.f302245e = bVar;
        this.f302244d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f302245e.f302233d.loadUrl(this.f302244d);
    }
}
