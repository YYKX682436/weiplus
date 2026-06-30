package com.tencent.mm.app;

/* loaded from: classes13.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.r2 f53720e;

    public q2(com.tencent.mm.app.r2 r2Var, java.lang.String str) {
        this.f53720e = r2Var;
        this.f53719d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f53720e.f53746d.onAppBackground(this.f53719d);
    }
}
