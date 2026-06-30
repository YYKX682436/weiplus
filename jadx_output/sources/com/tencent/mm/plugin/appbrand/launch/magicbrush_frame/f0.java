package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f84279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f84280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(fj1.y yVar, fh1.z zVar, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams) {
        super(0);
        this.f84279d = yVar;
        this.f84280e = zVar;
        this.f84281f = wAMagicBrushFrameLaunchParams;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task(");
        fj1.y yVar = this.f84279d;
        sb6.append(yVar);
        sb6.append(") INITIALIZED, ");
        fh1.z zVar = this.f84280e;
        sb6.append(kotlinx.coroutines.z0.h(zVar.f262633g));
        com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameLauncher", sb6.toString());
        kotlinx.coroutines.y0 y0Var = zVar.f262633g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.e0(zVar, yVar, this.f84281f, null), 2, null);
        return jz5.f0.f302826a;
    }
}
