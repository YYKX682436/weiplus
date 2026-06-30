package com.tencent.liteav.base.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class p implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.base.util.l.a f46461a;

    private p(com.tencent.liteav.base.util.l.a aVar) {
        this.f46461a = aVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.base.util.l.a aVar) {
        return new com.tencent.liteav.base.util.p(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.base.util.l.a aVar = this.f46461a;
        com.tencent.liteav.base.util.l.this.f46448a.execute(aVar.f46452b);
    }
}
