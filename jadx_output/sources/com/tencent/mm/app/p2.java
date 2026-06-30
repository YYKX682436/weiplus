package com.tencent.mm.app;

/* loaded from: classes13.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.r2 f53570e;

    public p2(com.tencent.mm.app.r2 r2Var, java.lang.String str) {
        this.f53570e = r2Var;
        this.f53569d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53570e.f53746d.onAppForeground(this.f53569d);
    }
}
