package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class f0 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.ih f71318a = new o45.ih();

    /* renamed from: b, reason: collision with root package name */
    public final o45.jh f71319b = new o45.jh();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f71318a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f71319b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 10;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return null;
    }
}
