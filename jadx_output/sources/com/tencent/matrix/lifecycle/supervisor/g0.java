package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class g0 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f52839d;

    public g0(yz5.a aVar) {
        this.f52839d = aVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        com.tencent.matrix.lifecycle.q0.f52785f.a().post(new com.tencent.matrix.lifecycle.supervisor.f0(this));
    }
}
