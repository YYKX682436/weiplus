package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes15.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f267047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f267049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 f267050g;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f267050g = y1Var;
        this.f267047d = i17;
        this.f267048e = i18;
        this.f267049f = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f267047d != 0 || this.f267048e != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var = this.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = y1Var.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var, y1Var.f267080d, c1Var.f266517o, 3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var2 = this.f267050g;
            y1Var2.f267090q.i5(y1Var2.f267081e, "launchApplication:fail_check fail", null);
            return;
        }
        r45.l14 l14Var = (r45.l14) this.f267049f.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication check result(showType : %d, errCode : %d)", java.lang.Integer.valueOf(l14Var.f460605f), java.lang.Integer.valueOf(l14Var.f460604e));
        if (l14Var.f460604e != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var3 = this.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var2 = y1Var3.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var2, y1Var3.f267080d, c1Var2.f266517o, 3);
        }
        int i17 = l14Var.f460604e;
        if (i17 != 0) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var4 = this.f267050g;
                y1Var4.f267090q.i5(y1Var4.f267081e, "launchApplication:fail_check fail forbidden scene", null);
                return;
            } else if (i17 != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var5 = this.f267050g;
                y1Var5.f267090q.i5(y1Var5.f267081e, "launchApplication:fail_check fail", null);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var6 = this.f267050g;
                y1Var6.f267090q.i5(y1Var6.f267081e, "launchApplication:fail", null);
                return;
            }
        }
        android.content.Context context = this.f267050g.f267090q.f266508d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var7 = this.f267050g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var3 = y1Var7.f267090q;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.J3(c1Var3, y1Var7.f267080d, c1Var3.f266517o, 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var8 = this.f267050g;
            y1Var8.f267090q.i5(y1Var8.f267081e, "launchApplication:fail_cancel", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication activity finished");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.i8 i8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.i8(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w1(this));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f267050g.f267084h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.f267050g.f267084h));
            intent.addFlags(268435456);
            java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(this.f267050g.f267090q.f266508d, intent);
            if ((w17 == null || w17.isEmpty()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                android.os.Bundle bundle = this.f267050g.f267085i;
                ((kt.c) i0Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.z(bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: list is avaliable");
                if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var2).getClass();
                    str2 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo);
                } else {
                    str2 = intent.getPackage();
                }
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (str3 == null) {
                    str3 = "";
                }
                if (!str3.equals(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle schemeUrl: launchAppByWeChat, pkg is %s", str2);
                    lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var9 = this.f267050g;
                    i8Var.b(((kt.c) i0Var3).cj(y1Var9.f267090q.f266508d, intent, null, l14Var.f460605f, i8Var, y1Var9.f267085i));
                    return;
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f267050g.f267086m) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f267050g.f267087n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var10 = this.f267050g;
            android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(y1Var10.f267090q.f266508d, y1Var10.f267086m, false);
            if (a17 != null && a17[0] != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg: pkgSigns is avaliable");
                java.lang.String g17 = kk.k.g(a17[0].toByteArray());
                if (g17 == null || !g17.equalsIgnoreCase(this.f267050g.f267087n)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication signature not match");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(this.f267050g.f267086m);
                        if (launchIntentForPackage != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle pkg: launchAppByWeChat");
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.i(bundle2, this.f267050g.f267088o);
                            launchIntentForPackage.putExtras(bundle2);
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var11 = this.f267050g;
                            android.content.Context context2 = y1Var11.f267090q.f266508d;
                            android.os.Bundle bundle3 = y1Var11.f267085i;
                            ((kt.c) i0Var4).getClass();
                            i8Var.b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context2, launchIntentForPackage, null, i8Var, bundle3));
                            return;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "launchApplication getLaunchIntentForPackage, %s", e17.getMessage());
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699 c11272xd6622699 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11272xd6622699();
        c11272xd6622699.f33061xb2206a6f = this.f267050g.f267089p;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11272xd6622699);
        c11286x34a5504.f33127xc9f07109 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a;
        c11286x34a5504.f33125x9b39409a = this.f267050g.f267089p;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b();
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        kiVar.f88682a = c11286x34a5504;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var12 = this.f267050g;
        kiVar.f88683b = y1Var12.f267082f;
        kiVar.f88684c = l14Var.f460605f;
        kiVar.f88685d = y1Var12.f267090q.f266508d;
        kiVar.f88687f = y1Var12.f267085i;
        kiVar.f88686e = i8Var;
        c5670x1f7ac2b.e();
        boolean z17 = c5670x1f7ac2b.f135995h.f88781a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "1" : "0";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter, r = %s", objArr);
        if (!z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f267050g.f267082f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f267050g.f267088o)) {
            java.lang.String str4 = this.f267050g.f267082f + "://" + this.f267050g.f267088o;
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
            intent2.addFlags(268435456);
            java.util.List w18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(this.f267050g.f267090q.f266508d, intent2);
            if ((w18 != null && !w18.isEmpty()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: list is avaliable");
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w18 != null && w18.size() == 1) {
                    lt.i0 i0Var5 = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo2 = (android.content.pm.ResolveInfo) w18.get(0);
                    ((kt.c) i0Var5).getClass();
                    str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.o(resolveInfo2);
                } else {
                    str = intent2.getPackage();
                }
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                if (!(str5 != null ? str5 : "").equals(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "launchApplication: handle in EventCenter: launchAppByWeChat, pkg is %s", str);
                    i8Var.f266732d = false;
                    i8Var.f266730b = false;
                    i8Var.f266733e = false;
                    i8Var.f266729a = false;
                    lt.i0 i0Var6 = (lt.i0) i95.n0.c(lt.i0.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y1 y1Var13 = this.f267050g;
                    android.content.Context context3 = y1Var13.f267090q.f266508d;
                    android.os.Bundle bundle4 = y1Var13.f267085i;
                    ((kt.c) i0Var6).getClass();
                    z17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(context3, intent2, null, i8Var, bundle4);
                }
            }
        }
        i8Var.b(z17);
    }
}
