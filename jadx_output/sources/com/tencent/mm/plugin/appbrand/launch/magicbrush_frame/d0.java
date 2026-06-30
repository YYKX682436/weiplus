package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f84269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f84270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fj1.y yVar, fh1.z zVar) {
        super(0);
        this.f84269d = yVar;
        this.f84270e = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recreateCallback old bizInstanceName: ");
        fj1.y yVar = this.f84269d;
        sb6.append(yVar.f263143c.f84254i);
        sb6.append(" update ");
        fh1.z zVar = this.f84270e;
        sb6.append(zVar.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameLauncher", sb6.toString());
        yVar.f263143c.f84254i = zVar.c();
        return jz5.f0.f302826a;
    }
}
