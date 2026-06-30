package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class s0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f67264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67266d;

    public s0(com.tencent.mm.feature.lite.i iVar, java.lang.String str, int i17, q80.f0 f0Var) {
        this.f67266d = iVar;
        this.f67263a = str;
        this.f67264b = i17;
        this.f67265c = f0Var;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mm.feature.lite.i iVar = this.f67266d;
        if (((java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) iVar.f67177o).get(str)) != null && java.lang.Integer.valueOf(r0.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) iVar.f67177o).remove(str);
        }
        q80.f0 f0Var = this.f67265c;
        if (f0Var != null) {
            f0Var.fail();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mm.feature.lite.i iVar = this.f67266d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) iVar.f67177o;
        java.lang.String str = this.f67263a;
        if (((java.lang.Integer) concurrentHashMap.get(str)) != null && java.lang.Integer.valueOf(r0.intValue() - 1).intValue() <= 0) {
            ((java.util.concurrent.ConcurrentHashMap) iVar.f67177o).remove(str);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.createStore(str, wxaLiteAppInfo.path, wxaLiteAppInfo.signatureKey, this.f67264b);
        q80.f0 f0Var = this.f67265c;
        if (f0Var != null) {
            f0Var.success();
        }
    }
}
