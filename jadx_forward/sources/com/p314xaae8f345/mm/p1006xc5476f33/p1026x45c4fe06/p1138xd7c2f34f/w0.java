package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f166840d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f166841e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f166842f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 f166843g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b1 f166844h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f166845i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p f166846m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc launchParcel, java.lang.String instanceId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 a1Var) {
        this(launchParcel, instanceId, z17, a1Var, null, 16, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchParcel, "launchParcel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
    }

    public static final java.lang.Object a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w0 w0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        w0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x0(c12362x460991bc, w0Var.f166841e, w0Var.f166842f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v0(rVar, a1Var), w0Var.f166844h);
        x0Var.A = w0Var.f166846m;
        c12362x460991bc.P = x0Var.A;
        x0Var.run();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f166845i) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u0(this, null), 2, null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t0(this, null), 2, null);
        }
    }

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc launchParcel, java.lang.String instanceId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b1 b1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchParcel, "launchParcel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        this.f166840d = launchParcel;
        this.f166841e = instanceId;
        this.f166842f = z17;
        this.f166843g = a1Var;
        this.f166844h = b1Var;
        boolean z18 = false;
        if (!z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_launch_migrate_during_get_contact, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h <= 671096831 ? 1 : 0) == 1) {
                z18 = true;
            }
        }
        this.f166845i = z18;
        this.f166846m = com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.LEGACY;
    }

    public /* synthetic */ w0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b1 b1Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c12362x460991bc, str, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? null : a1Var, (i17 & 16) != 0 ? null : b1Var);
    }
}
