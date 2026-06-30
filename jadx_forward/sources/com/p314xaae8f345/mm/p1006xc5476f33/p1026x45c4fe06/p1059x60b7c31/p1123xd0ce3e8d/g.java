package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f165355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.p3371xd0ce3e8d.C29838x24207153 f165356e;

    public g(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        this.f165355d = bVar;
        this.f165356e = c29838x24207153;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p817x5682e1b2.C10823x808d2998 c10823x808d2998;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.a0 y17 = this.f165355d.v3().y1();
        synchronized (y17) {
            c10823x808d2998 = y17.f128897h;
        }
        if (c10823x808d2998 != null) {
            c10823x808d2998.m46416xbae2a94a(this.f165356e);
        }
    }
}
