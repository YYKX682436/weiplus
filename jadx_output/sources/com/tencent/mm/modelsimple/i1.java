package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public final class i1 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.ni f71349a = new o45.ni();

    /* renamed from: b, reason: collision with root package name */
    public final o45.oi f71350b = new o45.oi();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f71349a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f71350b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 100017;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return null;
    }
}
