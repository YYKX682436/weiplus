package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.di f71453a = new o45.di();

    /* renamed from: b, reason: collision with root package name */
    public final o45.ei f71454b = new o45.ei();

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f71453a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f71454b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 26;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/sendcard";
    }
}
