package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class f implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.h f52692d;

    public f(com.tencent.matrix.lifecycle.h hVar) {
        this.f52692d = hVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f52692d.onExitForeground();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f52692d.onEnterForeground();
    }
}
