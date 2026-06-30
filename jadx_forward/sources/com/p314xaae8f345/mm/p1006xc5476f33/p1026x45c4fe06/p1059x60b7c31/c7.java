package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f161692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 f161693g;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f161693g = d7Var;
        this.f161690d = i17;
        this.f161691e = i18;
        this.f161692f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str;
        int i17 = this.f161690d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d7 d7Var = this.f161693g;
        if (i17 != 0 || this.f161691e != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = d7Var.f162272a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i7 i7Var = d7Var.f162282k;
            e9Var.a(d7Var.f162273b, i7Var.o("fail:check fail"));
            i7Var.D(d7Var.f162274c, "fail", "fail:check fail");
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f161692f.f152244b.f152233a;
        int i18 = l14Var.f460604e;
        if (i18 != 0) {
            if (i18 != 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = d7Var.f162272a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i7 i7Var2 = d7Var.f162282k;
                e9Var2.a(d7Var.f162273b, i7Var2.o("fail:check fail 1"));
                i7Var2.D(d7Var.f162274c, "fail", "fail:check fail 1");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = d7Var.f162272a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i7 i7Var3 = d7Var.f162282k;
            e9Var3.a(d7Var.f162273b, i7Var3.o("fail:check fail forbidden scene 2"));
            i7Var3.D(d7Var.f162274c, "fail", "fail:check fail forbidden scene 2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h7 h7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h7(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z6(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d7Var.f162275d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var4 = d7Var.f162272a;
        if (!K0) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(d7Var.f162275d));
            intent.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(e9Var4.getF229340d(), intent);
            if (w17 != null && !w17.isEmpty()) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17.size() == 1) {
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
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a7(this, intent, l14Var, h7Var));
                    return;
                }
            }
        }
        java.lang.String str3 = d7Var.f162277f;
        boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
        android.os.Bundle bundle = d7Var.f162276e;
        java.lang.String str4 = d7Var.f162279h;
        if (!K02) {
            java.lang.String str5 = d7Var.f162278g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && (a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(e9Var4.Z0(), str3, false)) != null && (signature = a17[0]) != null) {
                java.lang.String g17 = kk.k.g(signature.toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(str5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle2, str4);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                            android.app.Activity Z0 = e9Var4.Z0();
                            ((kt.c) i0Var2).getClass();
                            h7Var.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(Z0, launchIntentForPackage, null, h7Var, bundle));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11921xb466dbaa c11921xb466dbaa = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11921xb466dbaa(e9Var4.t3().r0());
        c11921xb466dbaa.f160065m = d7Var.f162280i;
        c11921xb466dbaa.f160066n = str4;
        c11921xb466dbaa.f160067o = d7Var.f162281j;
        c11921xb466dbaa.f160068p = bundle;
        c11921xb466dbaa.f160064i = l14Var.f460605f;
        c11921xb466dbaa.f160070r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b7(this, c11921xb466dbaa);
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11885x29239176.f159896h).add(c11921xb466dbaa);
        c11921xb466dbaa.a();
    }
}
