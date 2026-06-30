package xp1;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f537406a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f537407b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(android.content.Context context, android.content.Intent intent, java.lang.String str, java.lang.String str2, boolean z17) {
        b(context, intent, str, str2, z17, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c2, code lost:
    
        if (r3.getId().equals(r15) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
    
        r15 = true;
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.IntentSender, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r26, android.content.Intent r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.Class r31) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xp1.c.b(android.content.Context, android.content.Intent, java.lang.String, java.lang.String, boolean, java.lang.Class):void");
    }

    public static boolean c(android.content.Context context, java.lang.String str, boolean z17) {
        android.content.Intent f17 = f(context, str, true, c01.z1.r());
        android.content.Intent intent = (android.content.Intent) f17.getParcelableExtra("android.intent.extra.shortcut.INTENT");
        if (intent == null) {
            return false;
        }
        a(context, f17, intent.getStringExtra("app_shortcut_custom_id"), null, z17);
        return true;
    }

    public static android.content.pm.ShortcutInfo d(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.Intent intent2, boolean z17, android.graphics.Bitmap bitmap) {
        android.content.pm.ShortcutInfo.Builder intent3 = new android.content.pm.ShortcutInfo.Builder(context, str).setShortLabel(intent.getStringExtra("android.intent.extra.shortcut.NAME")).setLongLabel(intent.getStringExtra("android.intent.extra.shortcut.NAME")).setIntent(intent2);
        if (z17) {
            intent3.setIcon(android.graphics.drawable.Icon.createWithBitmap(bitmap));
        } else {
            intent3.setIcon(android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap));
        }
        return intent3.build();
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String h17;
        if (str != null && str.length() > 0) {
            java.lang.String W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid());
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            if (str2.equals(W) && !gm0.j1.b().m()) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutManager", "process name: %s", W);
            try {
                if (str2.equals(W)) {
                    h17 = h(str, "" + gm0.j1.b().h());
                } else {
                    h17 = h(str, "" + com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                    return null;
                }
                return "shortcut_" + o(h17.getBytes());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutManager", null, "exception: %s", e17.getMessage());
            }
        }
        return null;
    }

    public static android.content.Intent f(android.content.Context context, java.lang.String str, boolean z17, java.lang.String str2) {
        android.graphics.Bitmap createScaledBitmap;
        if (str == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "getIntent, wrong parameters");
            return null;
        }
        int i17 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "getScaledBitmap fail, bmp is null");
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        }
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "use default avatar, bmp is null");
            createScaledBitmap = null;
        } else {
            createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(a17, i17, i17, false);
        }
        if (createScaledBitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "no bmp");
            return null;
        }
        int i18 = 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "no such user");
            return null;
        }
        java.lang.String e17 = e(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutManager", "encryptShortcutUser: %s", e17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.action.BIZSHORTCUT");
        intent.putExtra("LauncherUI.Shortcut.Username", e17);
        intent.putExtra("LauncherUI.From.Biz.Shortcut", true);
        intent.putExtra("app_shortcut_custom_id", e17);
        intent.setPackage(context.getPackageName());
        intent.addFlags(67108864);
        android.content.Intent intent2 = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent2.putExtra("android.intent.extra.shortcut.NAME", c01.a2.c(n17, str));
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.ICON", createScaledBitmap);
        intent2.putExtra("shortcut_is_adaptive_icon", true);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_SOURCE_KEY", f537406a);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_OWNER_ID", e(str2));
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_UNIQUE_ID", e17);
        if (n17.k2()) {
            i18 = 2;
        } else if (c01.e2.U(n17.d1())) {
            i18 = 0;
        }
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_TYPE", i18);
        intent2.putExtra("com.tencent.qlauncher.extra.EXTRA_PUSH_ITEM_CONTAINER", 0);
        return intent2;
    }

    public static java.lang.String g(java.lang.String str) {
        int i17;
        if (str != null && str.length() > 0) {
            java.lang.String W = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid());
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutManager", "process name: %s", W);
            try {
                if (!str2.equals(W)) {
                    i17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
                } else {
                    if (!gm0.j1.b().m()) {
                        return null;
                    }
                    i17 = gm0.j1.b().h();
                }
                if (!str.startsWith("shortcut_")) {
                    return str;
                }
                return h(new java.lang.String(n(str.substring(9))), "" + i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutManager", null, "exception: %s", e17.getMessage());
            }
        }
        return null;
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2) {
        try {
            int[] iArr = new int[256];
            byte[] bArr = new byte[256];
            for (int i17 = 0; i17 < 256; i17++) {
                iArr[i17] = i17;
            }
            for (short s17 = 0; s17 < 256; s17 = (short) (s17 + 1)) {
                bArr[s17] = (byte) str2.charAt(s17 % str2.length());
            }
            int i18 = 0;
            for (int i19 = 0; i19 < 255; i19++) {
                int i27 = iArr[i19];
                i18 = ((i18 + i27) + bArr[i19]) % 256;
                iArr[i19] = iArr[i18];
                iArr[i18] = i27;
            }
            char[] charArray = str.toCharArray();
            char[] cArr = new char[charArray.length];
            int i28 = 0;
            int i29 = 0;
            for (short s18 = 0; s18 < charArray.length; s18 = (short) (s18 + 1)) {
                i28 = (i28 + 1) % 256;
                int i37 = iArr[i28];
                i29 = (i29 + i37) % 256;
                iArr[i28] = iArr[i29];
                iArr[i29] = i37;
                cArr[s18] = (char) (((char) iArr[(iArr[i28] + (i37 % 256)) % 256]) ^ charArray[s18]);
            }
            return new java.lang.String(cArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "Exception in rc4, %s", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutManager", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static boolean i(android.content.Context context, android.content.Intent intent) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "context is null");
            return false;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutManager", "intent is null");
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
        }
        return true;
    }

    public static boolean j(android.content.Context context, java.lang.String str) {
        i(context, f(context, str, false, c01.z1.r()));
        return true;
    }

    public static void k(android.content.pm.ShortcutInfo shortcutInfo, android.content.pm.ShortcutManager shortcutManager, android.content.Context context, java.lang.Class cls) {
        android.content.Intent createShortcutResultIntent = shortcutManager.createShortcutResultIntent(shortcutInfo);
        if (cls != null) {
            createShortcutResultIntent.setClass(context, cls);
        } else {
            createShortcutResultIntent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1278x633fb29.C12932xcc1f522a.class);
        }
        shortcutManager.requestPinShortcut(shortcutInfo, android.app.PendingIntent.getBroadcast(context, 0, createShortcutResultIntent, fp.g0.a(134217728)).getIntentSender());
    }

    public static void l(android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("no_more_show_add_short_cut_dialog", false)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
        u1Var.f293529a.f293354b.f293248e = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4n);
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4p);
        java.lang.String string2 = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j4m);
        u1Var.u(string);
        u1Var.g(string2);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj);
        u1Var.v(new xp1.b(u1Var, activity));
        u1Var.q(false);
    }

    public static void m(android.content.Context context, boolean z17, boolean z18) {
        if (z18) {
            db5.e1.T(context, context.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571539i8 : com.p314xaae8f345.mm.R.C30867xcad56011.f571538i7));
        }
    }

    public static final byte[] n(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) java.lang.Integer.parseInt(str.substring(i18, i18 + 2), 16);
        }
        return bArr;
    }

    public static java.lang.String o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = f537407b;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }
}
