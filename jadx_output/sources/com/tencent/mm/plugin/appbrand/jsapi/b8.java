package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79834d;

    public b8(com.tencent.mm.plugin.appbrand.jsapi.e8 e8Var, com.tencent.mm.plugin.appbrand.y yVar) {
        this.f79834d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f79834d;
        if (yVar == null || yVar.t3() == null) {
            return;
        }
        yVar.t3().l0();
    }
}
