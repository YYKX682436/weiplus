package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z65.a f134959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f134961f;

    public g4(z65.a aVar, java.lang.String str, boolean[] zArr) {
        this.f134959d = aVar;
        this.f134960e = str;
        this.f134961f = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((gm0.s) this.f134959d).a(this.f134960e);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCrashReporter", th6, "callbackReset invoke failed.", new java.lang.Object[0]);
        }
        synchronized (this.f134961f) {
            boolean[] zArr = this.f134961f;
            zArr[0] = false;
            zArr.notifyAll();
        }
    }
}
