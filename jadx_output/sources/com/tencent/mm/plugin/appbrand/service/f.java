package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f88663d;

    public f(com.tencent.mm.ipcinvoker.r rVar) {
        this.f88663d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.r rVar = this.f88663d;
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
