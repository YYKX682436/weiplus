package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f91701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f91702e;

    public w(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var, com.tencent.mm.pointers.PBool pBool, java.lang.Runnable runnable) {
        this.f91701d = pBool;
        this.f91702e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f91701d.value) {
            return;
        }
        this.f91702e.run();
    }
}
