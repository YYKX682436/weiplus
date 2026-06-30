package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f163910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f163911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f163912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 f163913g;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f163913g = o7Var;
        this.f163910d = i17;
        this.f163911e = i18;
        this.f163912f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean a17;
        int i17;
        int i18 = this.f163910d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o7 o7Var = this.f163913g;
        if (i18 != 0 || this.f163911e != 0) {
            o7Var.f163981a.a(o7Var.f163982b, o7Var.f163993m.o("fail:check fail"));
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f163912f.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication check result(showType:%d, errCode:%d, jumpFlog:%d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e), java.lang.Integer.valueOf(l14Var.f460606g));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        boolean z17 = L != null ? L.getBoolean("AppBrandLaunchApplicationMockLogic#forceCheckLaunchAppSuccess", false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchApplicationMockLogic", "forceCheckLaunchAppSuccess#get, value: " + z17);
        if (!z17 && (i17 = l14Var.f460604e) != 0) {
            if (i17 != 2) {
                o7Var.f163981a.a(o7Var.f163982b, o7Var.f163993m.o("fail:check fail 1"));
                return;
            } else {
                o7Var.f163981a.a(o7Var.f163982b, o7Var.f163993m.o("fail:check fail forbidden scene 2"));
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c1 c1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c1.f161687a;
        boolean a18 = c1Var.a(o7Var.f163983c);
        java.lang.String str2 = o7Var.f163985e;
        java.lang.String str3 = o7Var.f163984d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = o7Var.f163981a;
        if (!a18) {
            if (str3 == null) {
                a17 = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByAppId, appId: ".concat(str3));
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) uk0.a.d(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str3), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b1.f161348a);
                if (c10750x9556b48c != null ? c10750x9556b48c.f149933d : false) {
                    a17 = true;
                } else {
                    a17 = c1Var.a(str3 + "://" + str2);
                }
            }
            if (!a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app");
                if (l14Var.f460606g == 1) {
                    e9Var.a(o7Var.f163982b, o7Var.f163993m.o("fail:install app denied"));
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication, no weishi app, go download it");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j7(this));
                    return;
                }
            }
        }
        java.lang.String str4 = o7Var.f163983c;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            intent.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(e9Var.getF229340d(), intent);
            if ((w17 != null && !w17.isEmpty()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                } else {
                    str = intent.getPackage();
                }
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (str5 == null) {
                    str5 = "";
                }
                if (!str5.equals(str)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l7(this, intent, l14Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k7(this))));
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 c11924x1ce6280 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280(e9Var.t3().r0());
        c11924x1ce6280.f160090m = str3;
        c11924x1ce6280.f160091n = str2;
        c11924x1ce6280.f160092o = o7Var.f163992l;
        c11924x1ce6280.f160093p = o7Var.f163991k;
        c11924x1ce6280.f160089i = l14Var.f460605f;
        c11924x1ce6280.f160095r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m7(this, c11924x1ce6280);
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).add(c11924x1ce6280);
        c11924x1ce6280.a();
    }
}
