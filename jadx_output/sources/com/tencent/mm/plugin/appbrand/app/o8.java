package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes4.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75217d;

    public o8(com.tencent.mm.plugin.appbrand.app.p8 p8Var, java.util.List list) {
        this.f75217d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        l91.d dVar = (l91.d) com.tencent.mm.plugin.appbrand.app.r9.fj(l91.d.class);
        if (dVar != null) {
            dVar.y0(this.f75217d);
        }
    }
}
