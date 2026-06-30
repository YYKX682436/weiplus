package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.profile.v f87705d;

    public s(com.tencent.mm.plugin.appbrand.profile.v vVar) {
        this.f87705d = vVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e;
        com.tencent.mm.plugin.appbrand.profile.v vVar = this.f87705d;
        com.tencent.mm.plugin.appbrand.e9 e9Var = vVar.f87696e;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (e9Var == null || (f147808e = e9Var.getF147808e()) == null) ? null : (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            return true;
        }
        f0Var.post(new com.tencent.mm.plugin.appbrand.profile.r(vVar));
        return true;
    }
}
