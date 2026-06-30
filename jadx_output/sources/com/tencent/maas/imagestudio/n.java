package com.tencent.maas.imagestudio;

/* loaded from: classes5.dex */
public class n extends com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.imagestudio.j f48101a;

    public n(com.tencent.maas.imagestudio.MJImageSession mJImageSession, com.tencent.maas.imagestudio.j jVar, boolean z17) {
        super(mJImageSession, z17);
        this.f48101a = jVar;
    }

    @Override // com.tencent.maas.imagestudio.MJImageSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.imagestudio.MJImageSession mJImageSession, java.lang.Object obj) {
        com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.ProgressArg progressArg = (com.tencent.maas.imagestudio.MJImageSessionCallback$MJImageSessionCallbackArg.ProgressArg) obj;
        com.tencent.maas.imagestudio.j jVar = this.f48101a;
        if (jVar == null || progressArg == null) {
            return;
        }
        float f17 = progressArg.progress;
        nu0.b4 b4Var = ((nu0.q3) ((nu0.h0) jVar).f339947a).f340083a;
        hx0.e eVar = b4Var.T;
        eVar.getClass();
        eVar.a(hx0.c.f285608h);
        nu0.z3 z3Var = new nu0.z3(b4Var, (int) (f17 * 100), null);
        kotlinx.coroutines.y0 mainScope = b4Var.getMainScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(mainScope, kotlinx.coroutines.internal.b0.f310484a, null, new nu0.l2(z3Var, null), 2, null);
    }
}
