package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class b implements com.tencent.matrix.lifecycle.k, com.tencent.matrix.lifecycle.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f52821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f52822e;

    public b(java.util.Map.Entry entry, yz5.p pVar) {
        this.f52821d = entry;
        this.f52822e = pVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        this.f52822e.invoke(this.f52821d.getKey(), java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        this.f52822e.invoke(this.f52821d.getKey(), java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.matrix.lifecycle.j
    public boolean serial() {
        return true;
    }
}
