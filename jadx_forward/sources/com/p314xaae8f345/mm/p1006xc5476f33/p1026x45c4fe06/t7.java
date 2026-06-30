package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class t7 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe f170502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 f170503f;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 n7Var) {
        this.f170503f = n7Var;
    }

    @Override // wu5.b
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe oeVar = this.f170502e;
        if (oeVar != null) {
            oeVar.f167781d.set(true);
        }
        return super.b();
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "RuntimeLaunchTimeoutFallbackReloadTask|" + this.f170503f.f167571h;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 n7Var = this.f170503f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6 = n7Var.f167571h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 prepareTask = n7Var.f167569f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareTask, "prepareTask");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RuntimeLaunchTimeoutFallbackReloadTask", "start(" + rt6 + "), stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        android.content.Context r07 = rt6.r0();
        if (r07 == null) {
            r07 = rt6.f156328d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r07);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = rt6.u0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc a17 = k91.h0.a(u07);
        java.lang.String instanceId = rt6.u0().f158831k2.f169667d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(instanceId, "instanceId");
        a17.M = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(instanceId, wg1.b.f527245e.h());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe oeVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oe(rt6, prepareTask);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092(r07, a17, true, oeVar).G(true).I();
        this.f170502e = oeVar;
    }
}
