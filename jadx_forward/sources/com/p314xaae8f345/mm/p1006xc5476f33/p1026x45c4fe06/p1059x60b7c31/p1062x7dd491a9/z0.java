package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes15.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f160514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f160516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 f160517g;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 a1Var, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f160517g = a1Var;
        this.f160514d = i17;
        this.f160515e = i18;
        this.f160516f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str;
        int i17 = this.f160514d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.a1 a1Var = this.f160517g;
        if (i17 != 0 || this.f160515e != 0) {
            a1Var.f160463a.a(a1Var.f160464b, a1Var.f160472j.o("fail:check fail"));
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f160516f.f152244b.f152233a;
        int i18 = l14Var.f460604e;
        if (i18 != 0) {
            if (i18 != 2) {
                a1Var.f160463a.a(a1Var.f160464b, a1Var.f160472j.o("fail:check fail 1"));
                return;
            } else {
                a1Var.f160463a.a(a1Var.f160464b, a1Var.f160472j.o("fail:check fail forbidden scene 2"));
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.e1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.w0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a1Var.f160465c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = a1Var.f160463a;
        if (!K0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(a1Var.f160465c));
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
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(str)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x0(this, intent, l14Var, e1Var));
                    return;
                }
            }
        }
        java.lang.String str3 = a1Var.f160467e;
        boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
        android.os.Bundle bundle = a1Var.f160466d;
        java.lang.String str4 = a1Var.f160469g;
        if (!K02) {
            java.lang.String str5 = a1Var.f160468f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && (a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(e9Var.Z0(), str3, false)) != null && (signature = a17[0]) != null) {
                java.lang.String g17 = kk.k.g(signature.toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(str5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle2, str4);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                            android.app.Activity Z0 = e9Var.Z0();
                            ((kt.c) i0Var2).getClass();
                            e1Var.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(Z0, launchIntentForPackage, null, e1Var, bundle));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 c11970x4f4ad5f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2(e9Var.t3().r0());
        c11970x4f4ad5f2.f160413m = a1Var.f160470h;
        c11970x4f4ad5f2.f160414n = str4;
        c11970x4f4ad5f2.f160415o = a1Var.f160471i;
        c11970x4f4ad5f2.f160416p = bundle;
        c11970x4f4ad5f2.f160412i = l14Var.f460605f;
        c11970x4f4ad5f2.f160418r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.y0(this, c11970x4f4ad5f2);
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).add(c11970x4f4ad5f2);
        c11970x4f4ad5f2.a();
    }
}
