package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167591a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f167592b;

    /* renamed from: c, reason: collision with root package name */
    public int f167593c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f167594d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w f167595e;

    public na(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mHostRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mHostRuntime, "mHostRuntime");
        this.f167591a = mHostRuntime;
        this.f167592b = "";
        this.f167594d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f167595e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ma(this);
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 host, boolean z17, java.lang.Runnable afterCloseTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterCloseTask, "afterCloseTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = host.f156329e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = hcVar != null ? hcVar.mo48805xd384d23c() : null;
        if (mo48805xd384d23c == null || !wa1.b.f525633a.c((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) host)) {
            return false;
        }
        mo48805xd384d23c.T(null, afterCloseTask);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = o6Var.H2.f172731d;
        if (f0Var != null) {
            f0Var.T(13);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "[onCloseEmbedWxaBeforeHostClose] mark down embedded wxa appid for re-show when host back to the front");
        if (z17) {
            b(o6Var);
        }
        return true;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar;
        java.lang.String str = o6Var.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        this.f167592b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = this.f167591a.N2();
        boolean z17 = false;
        this.f167593c = N2 != null ? N2.hashCode() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = o6Var.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        if (halfScreenConfig.c()) {
            if (halfScreenConfig.D == k91.x2.f387350e) {
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = null;
        if (z17 && (hcVar = o6Var.f156329e) != null && hcVar.n(o6Var)) {
            o6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) hcVar.i(o6Var);
        }
        if (o6Var2 == null || (x07 = o6Var2.x0()) == null || (m52174xaf156f4a = x07.m52174xaf156f4a()) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmbedHalfScreenWxaManager", "addOnDestroyListener for page view[" + m52174xaf156f4a.hashCode() + ']');
        m52174xaf156f4a.K(this.f167595e);
        m52174xaf156f4a.w(this.f167595e);
    }
}
