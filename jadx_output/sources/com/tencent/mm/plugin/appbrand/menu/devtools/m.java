package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f85915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85916e;

    public m(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str) {
        this.f85915d = yVar;
        this.f85916e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f85915d;
        dp.a.makeText(yVar.getF147807d(), this.f85916e, 0).show();
        yVar.t3().l0();
    }
}
