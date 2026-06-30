package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.g3 f134934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134936f;

    public e3(com.p314xaae8f345.mm.app.g3 g3Var, int i17, java.lang.String str) {
        this.f134934d = g3Var;
        this.f134935e = i17;
        this.f134936f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f134934d.b(this.f134935e, this.f134936f);
    }
}
