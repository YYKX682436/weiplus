package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final class f implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.f f158233d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.f();

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.e(token, scene, z17), "MicroMsg.AVDeviceUsageClientService");
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        fb1.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.EnumC11723x613ffaf9.f158215e.a(scene));
        bundle.putBinder("onStatusChange", hVar == null ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.h0(hVar));
        bundle.putBoolean("shouldKeepObservingWhenBusy", z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80 c11722xfe5ba80 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.C11722xfe5ba80) uk0.a.d(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.b.f158219a);
        if (c11722xfe5ba80 != null && (cVar = c11722xfe5ba80.f158214f) != null) {
            return cVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AVDeviceUsageClientService", "IPC call returned null, using fallback value AVDeviceStatus.Idle");
        return fb1.b.f342361a;
    }
}
