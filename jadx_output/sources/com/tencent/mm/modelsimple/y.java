package com.tencent.mm.modelsimple;

/* loaded from: classes12.dex */
public class y extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.zg f71449a = new o45.og();

    /* renamed from: b, reason: collision with root package name */
    public final o45.ah f71450b = new o45.pg();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f71449a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f71450b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 3941;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/disasterauth";
    }
}
