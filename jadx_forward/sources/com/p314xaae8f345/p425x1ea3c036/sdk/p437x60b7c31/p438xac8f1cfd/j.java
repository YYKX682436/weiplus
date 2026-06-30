package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b f128880d;

    public j(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f128880d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar = this.f128880d;
        if (bVar.a2() == null || bVar.a2().mo14667x95a6d12e() == 0) {
            return;
        }
        bVar.E3();
        bVar.a2().mo14676x57c53c73(false);
        bVar.C(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.i(this));
    }
}
