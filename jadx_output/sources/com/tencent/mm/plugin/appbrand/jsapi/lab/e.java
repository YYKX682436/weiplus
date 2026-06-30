package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lab.h f81383f;

    public e(com.tencent.mm.plugin.appbrand.jsapi.lab.h hVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81383f = hVar;
        this.f81381d = lVar;
        this.f81382e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        com.tencent.mm.plugin.appbrand.jsapi.lab.h hVar = this.f81383f;
        int i17 = this.f81382e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81381d;
        if (iPCBoolean == null || !iPCBoolean.f68400d) {
            lVar.a(i17, hVar.o("fail"));
        } else {
            lVar.a(i17, hVar.o("ok"));
        }
    }
}
