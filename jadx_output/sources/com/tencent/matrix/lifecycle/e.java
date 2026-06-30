package com.tencent.matrix.lifecycle;

/* loaded from: classes12.dex */
public final class e implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.lifecycle.h f52691d;

    public e(com.tencent.matrix.lifecycle.h hVar) {
        this.f52691d = hVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f52691d.onExitForeground();
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f52691d.onEnterForeground();
    }
}
