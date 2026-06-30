package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class vb {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.StringBuffer f292681d;

    /* renamed from: e, reason: collision with root package name */
    public static long f292682e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f292683a;

    /* renamed from: b, reason: collision with root package name */
    public long f292684b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21396xc5757e1c f292685c;

    public static void a(com.p314xaae8f345.mm.ui.vb vbVar, android.content.Intent intent, boolean z17) {
        vbVar.getClass();
        java.lang.String stringExtra = intent.getStringExtra("classname");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "dealWithClickStream className is null, broadcast should set this intent flag");
            return;
        }
        java.lang.String substring = stringExtra.substring(stringExtra.lastIndexOf(".") + 1);
        z65.c.f551989b = substring;
        if (f292681d == null) {
            f292681d = new java.lang.StringBuffer(800);
            f292682e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            f292681d.append("start:");
            f292681d.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
            f292681d.append("|");
        }
        if (z17) {
            if ("desktop".equals(vbVar.f292683a)) {
                f292681d.append("desktop:");
                f292681d.append((android.os.SystemClock.elapsedRealtime() - vbVar.f292684b) + 800);
                f292681d.append("|");
            }
            vbVar.f292684b = android.os.SystemClock.elapsedRealtime();
            vbVar.f292683a = substring;
        } else {
            f292681d.append(vbVar.f292683a + ":");
            f292681d.append(android.os.SystemClock.elapsedRealtime() - vbVar.f292684b);
            f292681d.append("|");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "dkact classname %s, isAcitvity %b", substring, java.lang.Boolean.valueOf(z17));
    }

    public static void b(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        if (sharedPreferences.getBoolean("Main_ShortCut", false)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573922gb3));
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.MAIN");
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setComponent(new android.content.ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f78060x313c79));
        intent.putExtra("shortcut_icon_resource_id", com.p314xaae8f345.mm.R.C30861xcebc809e.f78060x313c79);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("is_main_shortcut", true);
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        xp1.c.a(context, intent, null, null, false);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("Main_ShortCut", true);
        edit.commit();
    }

    public static void c(android.content.Context context) {
        d(context, true, 2);
    }

    public static void d(android.content.Context context, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAppMgr", "on kill proc: exitApplication, pid=" + android.os.Process.myPid());
        mm.g0.f410016a.d(kz5.b0.c(java.lang.Integer.valueOf(android.os.Process.myPid())));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMAppMgr", "exitApplication", new java.lang.Object[0]);
        gm0.j1.i().f354741a.f354835g.e(z17);
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77703xc00c37da();
        com.p314xaae8f345.mm.p642xad8b531f.q2.c();
        if (c01.d9.e() != null && c01.d9.e().f152297d != null) {
            c01.d9.e().f152297d.r1(z17);
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b != null) {
                m78443x9cf0d20b.finish();
            }
            f(z17);
            return;
        }
        if (i17 == 2) {
            android.content.Intent intent = new android.content.Intent().setClass(context, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
            intent.addFlags(67108864);
            intent.putExtra("absolutely_exit_pid", android.os.Process.myPid());
            intent.putExtra("kill_service", z17);
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAppMgr", th6, "[-] Fail to start launcherUI in suicide.", new java.lang.Object[0]);
                return;
            }
        }
        if (i17 != 3) {
            throw new java.lang.IllegalArgumentException("Unknown exit by type " + i17);
        }
        android.content.Intent intent2 = new android.content.Intent().setClass(context, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent2.addFlags(32768);
        intent2.putExtra("absolutely_exit_pid", android.os.Process.myPid());
        intent2.putExtra("kill_service", z17);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        } else {
            intent2.addFlags(268435456);
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/MMAppMgr", "exitApplication", "(Landroid/content/Context;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMAppMgr", th7, "[-] Fail to start launcherUI in suicide.", new java.lang.Object[0]);
        }
    }

    public static void e() {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).e();
    }

    public static void f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(8);
        h(z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "killApplication", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "killApplication", "(Z)V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    public static void g() {
        h(true);
    }

    public static void h(boolean z17) {
        java.lang.String name = java.lang.Thread.currentThread().getName();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.os.Process.myPid());
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAppMgr", "killProcess thread:%s proc:%d stack:%s, killService:%b", name, valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            i();
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5177x8d056a0c().e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar = c5691xc916fb10.f136017g;
        hjVar.getClass();
        hjVar.f88369a = 2;
        c5691xc916fb10.e();
        k();
        if (z17) {
            gm0.m.f354767w = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            gm0.j1.i().r();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
        com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
        if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
        }
        m45.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":recovery", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":support", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":tools", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand0", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand1", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand2", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand3", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand4");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "clearAllWebViewCache");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "clear cookie failed : %s", e17);
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/ui/MMAppMgr", "killProcess", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    public static void i() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context != null) {
            if (com.p314xaae8f345.mm.p642xad8b531f.o.d()) {
                com.p314xaae8f345.mm.app.d0.e();
            } else {
                try {
                    context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.ServiceC10285xbf7f55f6.class));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAppMgr", "killService() Exception:%s", e17.getMessage());
                }
            }
            j45.l.D(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService.class));
            l85.h1.f(new android.content.Intent().setClassName(context, "com.tencent.mm.plugin.exdevice.service.ExDeviceService"), "exdevice", true, j45.l.e("exdevice"));
        }
    }

    public static boolean j(android.app.Activity activity, android.content.DialogInterface.OnClickListener onClickListener) {
        android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        boolean z17 = sharedPreferences.getBoolean("gprs_alert", true);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273979i &= z17;
        if (z17) {
            android.content.Context baseContext = activity.getBaseContext();
            if (!com.p314xaae8f345.mm.app.m7.f135056a) {
                synchronized (com.p314xaae8f345.mm.app.m7.class) {
                    if (!com.p314xaae8f345.mm.app.m7.f135056a) {
                        c01.je.h();
                        of5.b.f426643a = new com.p314xaae8f345.mm.app.e7();
                        com.p314xaae8f345.mm.app.m7.a(baseContext);
                        c01.je.f118804a.add(new com.p314xaae8f345.mm.app.f7(baseContext));
                        com.p314xaae8f345.mm.app.m7.f135056a = true;
                    }
                }
            }
            android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.bih, null);
            java.lang.String e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hln));
            java.lang.String e18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqu));
            java.lang.String e19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqt, e17, e18));
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(e19);
            newSpannable.setSpan(new com.p314xaae8f345.mm.ui.rb(activity), e19.indexOf(e17), e19.indexOf(e17) + e17.length(), 33);
            newSpannable.setSpan(new android.text.style.StyleSpan(1), e19.indexOf(e18), e19.indexOf(e18) + e18.length(), 33);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j8q);
            textView.setText(newSpannable);
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 I = db5.e1.I(activity, false, null, inflate, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqq), new com.p314xaae8f345.mm.ui.sb(sharedPreferences, activity, onClickListener), new com.p314xaae8f345.mm.ui.gb(activity));
            if (I == null) {
                return false;
            }
            I.setOnCancelListener(new com.p314xaae8f345.mm.ui.hb(activity));
        }
        return z17;
    }

    public static void k() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(800);
        java.lang.StringBuffer stringBuffer2 = f292681d;
        if (stringBuffer2 == null) {
            f292681d = stringBuffer;
            f292682e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            return;
        }
        java.lang.String stringBuffer3 = stringBuffer2.toString();
        int length = stringBuffer3.length() - 1;
        int i17 = 0;
        while (length >= 0) {
            if (stringBuffer3.charAt(length) == '|') {
                i17++;
            }
            if (i17 == 3) {
                break;
            } else {
                length--;
            }
        }
        stringBuffer.append(stringBuffer3.substring(length + 1));
        f292681d = stringBuffer;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMAppMgr", "oreh report clickstream %s", stringBuffer3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10508, "1," + f292682e + "," + stringBuffer3);
        f292682e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
    }
}
