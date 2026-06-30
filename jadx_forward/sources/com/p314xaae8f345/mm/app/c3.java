package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.g3 f134892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f134894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f134895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f134896h;

    public c3(com.p314xaae8f345.mm.app.g3 g3Var, java.lang.String str, int i17, long j17, long j18) {
        this.f134892d = g3Var;
        this.f134893e = str;
        this.f134894f = i17;
        this.f134895g = j17;
        this.f134896h = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f134892d.c(this.f134893e, this.f134894f, this.f134895g, this.f134896h);
    }
}
