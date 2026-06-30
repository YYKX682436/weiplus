package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.s f135278e;

    public r(com.p314xaae8f345.mm.app.s sVar, java.lang.String str) {
        this.f135278e = sVar;
        this.f135277d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f135278e.f135291e.f135310c.f135422n) {
            this.f135278e.f135291e.f135309b.a(false, this.f135277d);
        }
    }
}
