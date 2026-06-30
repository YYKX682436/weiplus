package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes15.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f263796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f263798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c2 f263799g;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c2 c2Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f263799g = c2Var;
        this.f263796d = i17;
        this.f263797e = i18;
        this.f263798f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str2;
        int i17 = this.f263796d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.c2 c2Var = this.f263799g;
        if (i17 != 0 || this.f263797e != 0) {
            c2Var.f263812d.a("check fail", null);
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f263798f.f152244b.f152233a;
        int i18 = l14Var.f460604e;
        if (i18 != 0) {
            if (i18 != 2) {
                c2Var.f263812d.a("check fail", null);
                return;
            } else {
                c2Var.f263812d.a("check fail forbidden scene", null);
                return;
            }
        }
        lt.q0 q0Var = (lt.q0) i95.n0.c(lt.q0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.a2(this);
        ((kt.q0) q0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d5 d5Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d5(a2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f263813e)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(c2Var.f263813e));
            intent.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(c2Var.f263814f, intent);
            if ((w17 != null && !w17.isEmpty()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                } else {
                    str2 = intent.getPackage();
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(str2)) {
                    d5Var.b(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(c2Var.f263814f, intent, null, l14Var.f460605f, d5Var, c2Var.f263815g));
                    return;
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f263816h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f263817i) && (a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(c2Var.f263814f, c2Var.f263816h, false)) != null && (signature = a17[0]) != null) {
            java.lang.String g17 = kk.k.g(signature.toByteArray());
            if (g17 == null || !g17.equalsIgnoreCase(c2Var.f263817i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication signature not match");
            } else {
                try {
                    android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(c2Var.f263816h);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle, c2Var.f263818m);
                        launchIntentForPackage.putExtras(bundle);
                        launchIntentForPackage.addFlags(268435456);
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.Context context = c2Var.f263814f;
                        android.os.Bundle bundle2 = c2Var.f263815g;
                        ((kt.c) i0Var2).getClass();
                        d5Var.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context, launchIntentForPackage, null, d5Var, bundle2));
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                }
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = c2Var.f263819n;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = c2Var.f263819n;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        kiVar.f88682a = c11286x34a5504;
        kiVar.f88683b = c2Var.f263820o;
        kiVar.f88684c = l14Var.f460605f;
        kiVar.f88685d = c2Var.f263814f;
        kiVar.f88687f = c2Var.f263815g;
        kiVar.f88686e = d5Var;
        c5670x1f7ac2b.e();
        boolean z17 = c5670x1f7ac2b.f135995h.f88781a;
        if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f263820o) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c2Var.f263818m)) {
            java.lang.String str4 = c2Var.f263820o + "://" + c2Var.f263818m;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(c2Var.f263814f, intent2);
            if ((w18 != null && !w18.isEmpty()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w18 != null && w18.size() == 1) {
                    lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) w18.get(0);
                    ((kt.c) i0Var3).getClass();
                    str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo2);
                } else {
                    str = intent2.getPackage();
                }
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (!(str5 != null ? str5 : "").equals(str)) {
                    d5Var.mo75138x6761d4f();
                    lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.Context context2 = c2Var.f263814f;
                    android.os.Bundle bundle3 = c2Var.f263815g;
                    ((kt.c) i0Var4).getClass();
                    z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context2, intent2, null, d5Var, bundle3);
                }
            }
        }
        d5Var.b(z17);
    }
}
