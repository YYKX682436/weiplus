package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class b2 implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f70591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f70592b;

    public b2(com.tencent.mm.modelbase.c2 c2Var, boolean z17, int i17) {
        this.f70591a = z17;
        this.f70592b = i17;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        boolean z17 = this.f70591a;
        int i17 = this.f70592b;
        ((com.tencent.mm.plugin.appbrand.networking.f) ((hm0.v) nVar)).getClass();
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWeakNetReceiver.MMReceiver", "mmNetReceiver.onReceiveWeakNet(weak:" + z17 + ", rtt:" + i17 + ')');
            com.tencent.mm.plugin.appbrand.networking.h.f86088a = z17;
            int a17 = com.tencent.mm.plugin.appbrand.networking.h.a();
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.networking.g(a17 != 4, a17));
        }
        return false;
    }
}
