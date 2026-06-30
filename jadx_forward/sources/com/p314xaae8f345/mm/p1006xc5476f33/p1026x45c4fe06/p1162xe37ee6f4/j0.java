package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j0 f167625a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j0();

    public final boolean a() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_open_cronet_ws, 0) == 1) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsSwitcherLogic", "expt enable. use cronet ws", null);
            sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            return true;
        }
        if (b()) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsSwitcherLogic", "tryLoadWcWssOnce success, use wc wss", null);
            return false;
        }
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsSwitcherLogic", "tryLoadWcWssOnce failed, use cronet ws", null);
        sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r15 = this;
            java.lang.Class<com.tencent.mm.udr.e0> r0 = com.p314xaae8f345.mm.udr.e0.class
            i95.m r1 = i95.n0.c(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            com.tencent.mm.udr.e0 r1 = (com.p314xaae8f345.mm.udr.e0) r1
            com.tencent.mm.udr.a1 r1 = (com.p314xaae8f345.mm.udr.a1) r1
            java.lang.String r2 = "ilinkres_55e88e46"
            java.lang.String r3 = "libwcwss"
            com.tencent.wechat.aff.udr.x r4 = r1.Ui(r2, r3)
            java.lang.String r5 = "libmmwcwss"
            com.tencent.wechat.aff.udr.x r1 = r1.Ui(r2, r5)
            r6 = 0
            if (r4 == 0) goto L23
            java.lang.String r7 = r4.m117639xfb83cc9b()
            goto L24
        L23:
            r7 = r6
        L24:
            java.lang.String r8 = ""
            if (r7 != 0) goto L29
            r7 = r8
        L29:
            if (r1 == 0) goto L30
            java.lang.String r9 = r1.m117639xfb83cc9b()
            goto L31
        L30:
            r9 = r6
        L31:
            if (r9 != 0) goto L34
            goto L35
        L34:
            r8 = r9
        L35:
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L63
            if (r1 == 0) goto L63
            long r11 = r4.f299123e
            r13 = 1
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 < 0) goto L63
            long r11 = r1.f299123e
            r13 = 2
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 < 0) goto L63
            int r1 = r7.length()
            if (r1 <= 0) goto L53
            r1 = r9
            goto L54
        L53:
            r1 = r10
        L54:
            if (r1 == 0) goto L63
            int r1 = r8.length()
            if (r1 <= 0) goto L5e
            r1 = r9
            goto L5f
        L5e:
            r1 = r10
        L5f:
            if (r1 == 0) goto L63
            r1 = r9
            goto L64
        L63:
            r1 = r10
        L64:
            if (r1 != 0) goto L90
            i95.m r0 = i95.n0.c(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            com.tencent.mm.udr.e0 r0 = (com.p314xaae8f345.mm.udr.e0) r0
            com.tencent.wechat.aff.udr.q r1 = new com.tencent.wechat.aff.udr.q
            r1.<init>()
            r1.c(r2)
            java.util.LinkedList r2 = r1.f299081e
            if (r2 == 0) goto L7e
            r2.add(r5)
        L7e:
            java.util.LinkedList r2 = r1.f299081e
            if (r2 == 0) goto L85
            r2.add(r3)
        L85:
            com.tencent.mm.plugin.appbrand.networking.i0 r2 = new com.tencent.mm.plugin.appbrand.networking.i0
            r2.<init>()
            com.tencent.mm.udr.a1 r0 = (com.p314xaae8f345.mm.udr.a1) r0
            r0.Di(r1, r2)
            return r10
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "tryLoadWcWssOnce wsPath: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ", mmWsPath: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            int r1 = rl.b.f478676a
            java.lang.String r1 = "WsSwitcherLogic"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r6)
            java.lang.String r0 = "owl"
            fp.d0.n(r0)     // Catch: java.lang.UnsatisfiedLinkError -> Lc4
            fp.d0.s(r7)     // Catch: java.lang.UnsatisfiedLinkError -> Lc4
            java.lang.String r0 = "ssl"
            fp.d0.n(r0)     // Catch: java.lang.UnsatisfiedLinkError -> Lc4
            java.lang.String r0 = "crypto"
            fp.d0.n(r0)     // Catch: java.lang.UnsatisfiedLinkError -> Lc4
            fp.d0.s(r8)     // Catch: java.lang.UnsatisfiedLinkError -> Lc4
            return r9
        Lc4:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to load WSS libraries: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.j0.b():boolean");
    }
}
