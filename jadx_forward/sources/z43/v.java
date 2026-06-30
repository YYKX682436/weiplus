package z43;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f551666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z43.w f551667g;

    public v(z43.w wVar, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f551667g = wVar;
        this.f551664d = i17;
        this.f551665e = i18;
        this.f551666f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.content.pm.Signature[] a17;
        android.content.pm.Signature signature;
        java.lang.String str2;
        int i17;
        int i18 = this.f551664d;
        z43.w wVar = this.f551667g;
        if (i18 != 0 || this.f551665e != 0) {
            wVar.f551677p.f224976f.a("check fail");
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f551666f.f152244b.f152233a;
        if (wVar.f551668d.booleanValue() && (i17 = l14Var.f460604e) != 0) {
            if (i17 != 2) {
                wVar.f551677p.f224976f.a("check fail");
                return;
            } else {
                wVar.f551677p.f224976f.a("check fail forbidden scene");
                return;
            }
        }
        lt.q0 q0Var = (lt.q0) i95.n0.c(lt.q0.class);
        z43.t tVar = new z43.t(this);
        ((kt.q0) q0Var).getClass();
        z43.u uVar = new z43.u(this, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d5(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e));
        android.content.Context c17 = wVar.f551677p.c();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f551669e)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(wVar.f551669e));
            intent.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(c17, intent);
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
                    uVar.b(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(c17, intent, null, l14Var.f460605f, uVar, wVar.f551670f));
                    return;
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f551671g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f551672h) && (a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(c17, wVar.f551671g, false)) != null && (signature = a17[0]) != null) {
            java.lang.String g17 = kk.k.g(signature.toByteArray());
            if (g17 == null || !g17.equalsIgnoreCase(wVar.f551672h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "launchApplication signature not match");
            } else {
                try {
                    android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(wVar.f551671g);
                    if (launchIntentForPackage != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle, wVar.f551673i);
                        launchIntentForPackage.putExtras(bundle);
                        launchIntentForPackage.addFlags(268435456);
                        lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle2 = wVar.f551670f;
                        ((kt.c) i0Var2).getClass();
                        uVar.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(c17, launchIntentForPackage, null, uVar, bundle2));
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiLaunchApplication", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                }
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = wVar.f551674m;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = wVar.f551674m;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        kiVar.f88682a = c11286x34a5504;
        kiVar.f88683b = wVar.f551675n;
        kiVar.f88684c = l14Var.f460605f;
        kiVar.f88685d = c17;
        kiVar.f88687f = wVar.f551670f;
        kiVar.f88688g = wVar.f551671g;
        kiVar.f88689h = wVar.f551676o.booleanValue();
        kiVar.f88686e = uVar;
        c5670x1f7ac2b.e();
        boolean z17 = c5670x1f7ac2b.f135995h.f88781a;
        if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f551675n) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.f551673i)) {
            java.lang.String str4 = wVar.f551675n + "://" + wVar.f551673i;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(c17, intent2);
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
                    uVar.mo75138x6761d4f();
                    lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.os.Bundle bundle3 = wVar.f551670f;
                    ((kt.c) i0Var4).getClass();
                    z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(c17, intent2, null, uVar, bundle3);
                }
            }
        }
        uVar.b(z17);
    }
}
