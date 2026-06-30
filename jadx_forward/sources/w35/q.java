package w35;

/* loaded from: classes8.dex */
public final class q extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524293e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f524294f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f524295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, w35.a aVar) {
        super(params, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f524293e = "MicroMsg.OpenWayControllerLocalApp";
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("share_file_temp");
        this.f524295g = "";
        h07.l();
        h07.J();
        if (kz5.c0.i(3, 1, 2, 4).contains(java.lang.Integer.valueOf(params.f270848h))) {
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(this.f524259d);
            if (n17 == null || n17.length() == 0) {
                java.lang.String str = params.f270844d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    int i17 = params.f270848h;
                    if (i17 == 1) {
                        str = "jpg";
                    } else if (i17 == 2) {
                        str = "mp4";
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = this.f524259d;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2 != null ? str2 : "");
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.lang.String str4 = a17.f294812f;
                int lastIndexOf = str4.lastIndexOf("/");
                sb6.append(lastIndexOf >= 0 ? str4.substring(lastIndexOf + 1) : str4);
                sb6.append('.');
                sb6.append(str);
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(h07, sb6.toString()).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                this.f524295g = o17;
                return;
            }
        }
        this.f524294f = true;
    }

    @Override // w35.b
    public void a() {
        java.lang.Iterable<java.lang.String> appList;
        android.graphics.drawable.Drawable drawable;
        java.lang.Object m143895xf1229813;
        java.lang.CharSequence loadLabel;
        w35.a aVar = this.f524257b;
        if (aVar != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0 h0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = this.f524256a.f270843c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str2 = this.f524258c;
            if (!(str2 == null || str2.length() == 0)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 N = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("recent_use_app_mmkv", 2, null);
                if (N == null) {
                    appList = kz5.p0.f395529d;
                } else {
                    r45.j56 j56Var = new r45.j56();
                    byte[] j17 = N.j("shortcut:" + str2);
                    if (j17 != null) {
                        j56Var.mo11468x92b714fd(j17);
                    }
                    appList = j56Var.f459129d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appList, "appList");
                }
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                java.lang.String str3 = this.f524259d;
                android.content.Intent e17 = h0Var.e(context, str2, str3, str);
                android.content.Intent c17 = h0Var.c(context, str2, str3, str);
                for (java.lang.String str4 : appList) {
                    if (r26.n0.D(str4, ".", false, 2, null)) {
                        try {
                            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str4, 0);
                            if (packageInfo != null) {
                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x();
                                android.content.pm.ResolveInfo resolveInfo = new android.content.pm.ResolveInfo();
                                android.content.pm.ActivityInfo activityInfo = new android.content.pm.ActivityInfo();
                                activityInfo.packageName = str4;
                                resolveInfo.activityInfo = activityInfo;
                                xVar.f272561d = resolveInfo;
                                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                xVar.f272562e = (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null) ? null : loadLabel.toString();
                                if (packageInfo.applicationInfo != null) {
                                    try {
                                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                        android.graphics.drawable.Drawable applicationLogo = packageManager.getApplicationLogo(str4);
                                        if (applicationLogo == null) {
                                            android.content.pm.ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                                            applicationLogo = applicationInfo2 != null ? applicationInfo2.loadIcon(packageManager) : null;
                                        }
                                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(applicationLogo);
                                    } catch (java.lang.Throwable th6) {
                                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                                    }
                                    if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
                                        android.content.pm.ApplicationInfo applicationInfo3 = packageInfo.applicationInfo;
                                        m143895xf1229813 = applicationInfo3 != null ? applicationInfo3.loadIcon(packageManager) : null;
                                    }
                                    drawable = (android.graphics.drawable.Drawable) m143895xf1229813;
                                } else {
                                    drawable = null;
                                }
                                xVar.f272563f = drawable;
                                xVar.f272569o = e17;
                                xVar.f272570p = c17;
                                wVar.f272547d = xVar;
                                arrayList.add(wVar);
                            }
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenByOtherAppHelper", "getShortCutAppList: " + e18);
                        }
                    }
                }
            }
            aVar.a(arrayList);
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = info.f272547d;
        java.lang.String str = (xVar == null || (resolveInfo = xVar.f272561d) == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.packageName;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar2 = info.f272547d;
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_7, xVar2 != null ? xVar2.f272562e : null));
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4);
        u1Var.l(new w35.m(this, context, info, str));
        u1Var.i(new w35.n(this, info));
        u1Var.q(false);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = this.f524256a.f270852l;
        if (p3Var == null || (k0Var = p3Var.f270939c) == null) {
            return;
        }
        ((kb0.f) k0Var).b(info);
    }

    public final boolean c(android.content.Context context, android.content.Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Ni(context, intent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f524293e, "no resolveActivity, action: " + intent.getAction() + ", package: " + intent.getPackage() + " filePath: " + this.f524259d);
        return false;
    }
}
