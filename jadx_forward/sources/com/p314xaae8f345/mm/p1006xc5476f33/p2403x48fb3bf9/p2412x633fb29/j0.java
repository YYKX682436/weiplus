package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f264482a = new java.util.LinkedList();

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 h0Var) {
        if (context == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "context or username is null");
            if (h0Var != null) {
                h0Var.a(str, false);
                return;
            }
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "acc not ready");
            if (h0Var != null) {
                h0Var.a(str, false);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String f27 = n17 != null ? n17.f2() : "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f27)) {
            b(context, str, str2, f27, h0Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "displayname is nil, should pull from service");
            ((c01.k7) c01.n8.a()).b(str, 17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e0(h0Var, str, context, str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h0 r16) {
        /*
            r6 = r13
            r7 = r16
            r8 = 1
            r9 = 0
            android.content.ContentResolver r0 = r12.getContentResolver()     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = "content:///favorites?notify=true"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L36
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "title"
            r2[r9] = r3     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "iconResource"
            r2[r8] = r3     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = "title=?"
            java.lang.String[] r4 = new java.lang.String[]{r15}     // Catch: java.lang.Exception -> L36
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L36
            int r1 = r0.getCount()     // Catch: java.lang.Exception -> L36
            if (r1 <= 0) goto L31
            r1 = r8
            goto L32
        L31:
            r1 = r9
        L32:
            r0.close()     // Catch: java.lang.Exception -> L36
            goto L37
        L36:
            r1 = r9
        L37:
            java.lang.String r10 = "MicroMsg.WebviewShrotcutManager"
            if (r1 == 0) goto L47
            java.lang.String r0 = "shortcut has exist"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            if (r7 == 0) goto L46
            r7.a(r13, r8)
        L46:
            return
        L47:
            com.tencent.mm.plugin.webview.model.f0 r11 = new com.tencent.mm.plugin.webview.model.f0
            r0 = r11
            r1 = r13
            r2 = r12
            r3 = r16
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.f264482a
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r11)
            java.lang.Class<kv.a0> r1 = kv.a0.class
            i95.m r2 = i95.n0.c(r1)
            kv.a0 r2 = (kv.a0) r2
            com.tencent.mm.feature.avatar.w r2 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r2
            r2.getClass()
            com.tencent.mm.modelavatar.z r2 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai()
            r2.d(r11)
            android.graphics.Bitmap r4 = f(r12, r13)
            if (r4 == 0) goto Lbe
            boolean r2 = r4.isRecycled()
            if (r2 == 0) goto L7b
            goto Lbe
        L7b:
            r0.remove(r11)
            i95.m r0 = i95.n0.c(r1)
            kv.a0 r0 = (kv.a0) r0
            com.tencent.mm.feature.avatar.w r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r0
            r0.getClass()
            com.tencent.mm.modelavatar.z r0 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai()
            r0.q(r11)
            r5 = 1
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            android.content.Intent r0 = c(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto La6
            java.lang.String r0 = "intent is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r0)
            if (r7 == 0) goto La5
            r7.a(r13, r9)
        La5:
            return
        La6:
            java.lang.Class<ae0.h> r1 = ae0.h.class
            i95.m r1 = i95.n0.c(r1)
            ae0.h r1 = (ae0.h) r1
            zd0.e r1 = (zd0.e) r1
            r1.getClass()
            r1 = 0
            r2 = r12
            xp1.c.a(r12, r0, r1, r1, r9)
            if (r7 == 0) goto Lbd
            r7.a(r13, r8)
        Lbd:
            return
        Lbe:
            java.lang.String r0 = "getAvatarBitmap fail, bmp is null, start timer."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r0)
            com.tencent.mm.sdk.platformtools.b4 r0 = new com.tencent.mm.sdk.platformtools.b4
            com.tencent.mm.plugin.webview.model.i0 r1 = new com.tencent.mm.plugin.webview.model.i0
            com.tencent.mm.plugin.webview.model.g0 r2 = new com.tencent.mm.plugin.webview.model.g0
            r2.<init>(r11, r7, r13)
            r1.<init>(r2)
            r0.<init>(r1, r9)
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.c(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.webview.model.h0):void");
    }

    public static android.content.Intent c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewShrotcutManager", "buildIntent, install = %b", java.lang.Boolean.valueOf(z17));
        if (bitmap == null && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewShrotcutManager", "no bmp");
            return null;
        }
        java.lang.String e17 = e(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", str3);
        intent.putExtra("duplicate", false);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        if (n07 != null) {
            str4 = kk.k.g((str3 + n07.d()).getBytes());
        } else {
            str4 = "";
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.WX_SHORTCUT");
        intent2.putExtra("type", 2);
        intent2.putExtra(dm.i4.f66865x76d1ec5a, e17);
        intent2.putExtra("ext_info", e(str2));
        intent2.putExtra("ext_info_1", e(str3));
        intent2.putExtra("token", d(str2, "" + gm0.j1.b().h()));
        intent2.putExtra("digest", str4);
        intent2.setPackage(context.getPackageName());
        intent2.addFlags(67108864);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        return intent;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(kk.k.g(str.getBytes()));
        ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
        sb6.append(xp1.c.h(str2, str));
        return kk.k.g(sb6.toString().getBytes());
    }

    public static java.lang.String e(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        java.lang.String str2 = "" + gm0.j1.b().h() + "_" + java.lang.System.currentTimeMillis();
        ((zd0.e) hVar).getClass();
        java.lang.String h17 = xp1.c.h(str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shortcut_");
        ae0.h hVar2 = (ae0.h) i95.n0.c(ae0.h.class);
        byte[] bytes = h17.getBytes();
        ((zd0.e) hVar2).getClass();
        sb6.append(xp1.c.o(bytes));
        return sb6.toString();
    }

    public static android.graphics.Bitmap f(android.content.Context context, java.lang.String str) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 == null || a17.isRecycled()) {
            return a17;
        }
        int i17 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        return android.graphics.Bitmap.createScaledBitmap(a17, i17, i17, false);
    }
}
