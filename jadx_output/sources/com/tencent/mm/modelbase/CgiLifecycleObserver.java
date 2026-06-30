package com.tencent.mm.modelbase;

/* loaded from: classes5.dex */
public class CgiLifecycleObserver implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.i f70582d;

    public CgiLifecycleObserver(com.tencent.mm.modelbase.i iVar) {
        this.f70582d = iVar;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy() {
        this.f70582d.dead();
    }
}
