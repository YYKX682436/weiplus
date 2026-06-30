package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class o1 implements com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.n1 f77821a;

    public o1(com.tencent.mm.plugin.appbrand.debugger.n1 n1Var) {
        this.f77821a = n1Var;
    }

    @Override // com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer
    public int notify(long j17, long j18, java.lang.String str) {
        return 0;
    }

    @Override // com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer
    public int sendData(long j17, java.lang.String str) {
        this.f77821a.c(j17, str);
        return 0;
    }
}
