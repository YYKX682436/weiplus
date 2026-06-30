package o25;

/* loaded from: classes4.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f424072a = jz5.h.b(o25.h2.f424065d);

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r5.i()).D(r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:3:0x0007, B:5:0x001b, B:10:0x0027, B:16:0x0034, B:18:0x0080, B:20:0x008f, B:25:0x0099, B:27:0x00a3, B:29:0x00ad), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.OpenSDKLaunchWXMiniProgramHelper"
            java.lang.String r2 = "cacheWXMiniProgramJumpResult key:"
            r3 = 0
            jz5.g r4 = o25.i2.f424072a     // Catch: java.lang.Exception -> L21
            jz5.n r4 = (jz5.n) r4     // Catch: java.lang.Exception -> L21
            java.lang.Object r4 = r4.mo141623x754a37bb()     // Catch: java.lang.Exception -> L21
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Exception -> L21
            long r4 = r4.longValue()     // Catch: java.lang.Exception -> L21
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L24
            java.lang.String r11 = "cacheWXMiniProgramJumpResult cacheTime <= 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11)     // Catch: java.lang.Exception -> L21
            return
        L21:
            r11 = move-exception
            goto Lb7
        L24:
            r4 = 1
            if (r11 == 0) goto L30
            boolean r5 = r26.n0.N(r11)     // Catch: java.lang.Exception -> L21
            if (r5 == 0) goto L2e
            goto L30
        L2e:
            r5 = r3
            goto L31
        L30:
            r5 = r4
        L31:
            if (r5 == 0) goto L34
            return
        L34:
            com.tencent.mm.sdk.platformtools.v3 r5 = new com.tencent.mm.sdk.platformtools.v3     // Catch: java.lang.Exception -> L21
            java.lang.String r8 = "opensdk_launch_miniprogram_cache"
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r8)     // Catch: java.lang.Exception -> L21
            java.lang.String r9 = "getMMKV(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)     // Catch: java.lang.Exception -> L21
            r9 = 604800(0x93a80, double:2.98811E-318)
            r5.<init>(r8, r9)     // Catch: java.lang.Exception -> L21
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            java.lang.String r9 = "link"
            r8.<init>(r9)     // Catch: java.lang.Exception -> L21
            r8.append(r11)     // Catch: java.lang.Exception -> L21
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L21
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21
            r9.<init>(r2)     // Catch: java.lang.Exception -> L21
            r9.append(r11)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = ", jumpSuccess:"
            r9.append(r2)     // Catch: java.lang.Exception -> L21
            r9.append(r12)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = ", deepLink:"
            r9.append(r2)     // Catch: java.lang.Exception -> L21
            r9.append(r13)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = ", deepLinkKey:"
            r9.append(r2)     // Catch: java.lang.Exception -> L21
            r9.append(r8)     // Catch: java.lang.Exception -> L21
            java.lang.String r2 = r9.toString()     // Catch: java.lang.Exception -> L21
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Exception -> L21
            if (r12 == 0) goto Lad
            java.lang.Object r12 = r5.i()     // Catch: java.lang.Exception -> L21
            com.tencent.mm.sdk.platformtools.o4 r12 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r12     // Catch: java.lang.Exception -> L21
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L21
            r12.B(r11, r6)     // Catch: java.lang.Exception -> L21
            if (r13 == 0) goto L97
            boolean r11 = r26.n0.N(r13)     // Catch: java.lang.Exception -> L21
            if (r11 == 0) goto L96
            goto L97
        L96:
            r4 = r3
        L97:
            if (r4 != 0) goto La3
            java.lang.Object r11 = r5.i()     // Catch: java.lang.Exception -> L21
            com.tencent.mm.sdk.platformtools.o4 r11 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r11     // Catch: java.lang.Exception -> L21
            r11.D(r8, r13)     // Catch: java.lang.Exception -> L21
            goto Lbc
        La3:
            java.lang.Object r11 = r5.i()     // Catch: java.lang.Exception -> L21
            com.tencent.mm.sdk.platformtools.o4 r11 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r11     // Catch: java.lang.Exception -> L21
            r11.D(r8, r0)     // Catch: java.lang.Exception -> L21
            goto Lbc
        Lad:
            java.lang.Object r12 = r5.i()     // Catch: java.lang.Exception -> L21
            com.tencent.mm.sdk.platformtools.o4 r12 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r12     // Catch: java.lang.Exception -> L21
            r12.B(r11, r6)     // Catch: java.lang.Exception -> L21
            goto Lbc
        Lb7:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r11, r0, r12)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.i2.a(java.lang.String, boolean, java.lang.String):void");
    }
}
