package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public class l1 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.th f70681a = new o45.th();

    /* renamed from: b, reason: collision with root package name */
    public final o45.uh f70682b = new o45.uh();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f70681a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f70682b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 381;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/getcert";
    }
}
