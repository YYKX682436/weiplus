package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class i1 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f67199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.k1 f67201c;

    public i1(com.tencent.mm.feature.lite.k1 k1Var, com.tencent.mm.ipcinvoker.r rVar, java.lang.String str) {
        this.f67201c = k1Var;
        this.f67199a = rVar;
        this.f67200b = str;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        this.f67199a.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.ipcinvoker.r rVar = this.f67199a;
        if (wxaLiteAppInfo == null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(-1L));
        } else {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCLong(this.f67201c.a(this.f67200b)));
        }
    }
}
