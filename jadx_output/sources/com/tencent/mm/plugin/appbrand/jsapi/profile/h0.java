package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes11.dex */
public final class h0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.j0 f82798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult f82799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f82800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82801d;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.profile.j0 j0Var, com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult, com.tencent.mm.ui.widget.dialog.u3 u3Var, int i17) {
        this.f82798a = j0Var;
        this.f82799b = profileResult;
        this.f82800c = u3Var;
        this.f82801d = i17;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.plugin.appbrand.jsapi.profile.j0 j0Var = this.f82798a;
        activityContext = j0Var.getActivityContext();
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = this.f82799b;
        if (activityContext == null) {
            com.tencent.mars.xlog.Log.w("ProfileTask", "handleRequest, getNow callback, context has already been detached!");
            profileResult.f82765d = 0;
            j0Var.finishProcess(profileResult);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f82800c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
            z17 = false;
        } else {
            str = n17.d1();
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("ProfileTask", "handleRequest, getNow callback fail");
            profileResult.f82765d = 0;
            j0Var.finishProcess(profileResult);
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.f(str, 3);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().i(str);
        kotlin.jvm.internal.o.d(n17);
        if (n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ',' + this.f82801d);
            profileResult.f82766e = profileResult.f82766e | 1;
        }
        if (n17.r2()) {
            profileResult.f82766e |= 2;
        }
        profileResult.f82765d = 1;
        j0Var.finishProcess(profileResult);
    }
}
