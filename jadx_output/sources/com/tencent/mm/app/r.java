package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.s f53745e;

    public r(com.tencent.mm.app.s sVar, java.lang.String str) {
        this.f53745e = sVar;
        this.f53744d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f53745e.f53758e.f53777c.f53889n) {
            this.f53745e.f53758e.f53776b.a(false, this.f53744d);
        }
    }
}
