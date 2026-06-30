package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f87557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.y f87558f;

    public v(com.tencent.mm.plugin.appbrand.pip.y yVar, boolean z17, float f17) {
        this.f87558f = yVar;
        this.f87556d = z17;
        this.f87557e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f87556d;
        com.tencent.mm.plugin.appbrand.pip.y yVar = this.f87558f;
        if (z17) {
            yVar.f87567a.f87523f.q(this.f87557e);
        } else {
            yVar.f87567a.f87523f.l();
        }
    }
}
