package fs1;

/* loaded from: classes7.dex */
public final class g implements jh0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mu4.h0 f347816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f347817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347818c;

    public g(mu4.h0 h0Var, yz5.p pVar, java.lang.String str) {
        this.f347816a = h0Var;
        this.f347817b = pVar;
        this.f347818c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (z65.c.a() != false) goto L12;
     */
    @Override // jh0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f347818c
            yz5.p r1 = r10.f347817b
            java.lang.Class<jh0.t> r2 = jh0.t.class
            i95.m r2 = i95.n0.c(r2)
            jh0.t r2 = (jh0.t) r2
            jh0.q r2 = (jh0.q) r2
            r2.getClass()
            vz4.x r2 = vz4.h.f523268b
            r3 = 0
            r2.g(r3)
            r2 = 1
            if (r11 == 0) goto L23
            int r4 = r11.length()
            if (r4 != 0) goto L21
            goto L23
        L21:
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            if (r4 != 0) goto L2e
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r4 = z65.c.a()
            if (r4 == 0) goto L53
        L2e:
            java.lang.String r11 = "brandService"
            com.tencent.mm.sdk.platformtools.o4 r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(r11)
            java.lang.String r4 = "GameCenterJsPath"
            java.lang.String r11 = r11.t(r4)
            if (r11 != 0) goto L3e
            java.lang.String r11 = ""
        L3e:
            int r4 = r11.length()
            if (r4 <= 0) goto L45
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 == 0) goto L4d
            java.lang.String r11 = com.p314xaae8f345.mm.vfs.w6.M(r11)
            goto L53
        L4d:
            java.lang.String r11 = "gamecenter_jscore.js"
            java.lang.String r11 = ik1.f.e(r11)
        L53:
            fs1.f r2 = new fs1.f     // Catch: java.lang.Exception -> L62
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L62
            com.tencent.mm.plugin.appbrand.jsruntime.r r4 = fs1.j.f347825e     // Catch: java.lang.Exception -> L62
            if (r4 == 0) goto L9d
            com.tencent.mm.plugin.appbrand.jsruntime.n r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r4     // Catch: java.lang.Exception -> L62
            r4.mo14660x738236e6(r11, r2)     // Catch: java.lang.Exception -> L62
            goto L9d
        L62:
            r11 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "MicroMsg.GamePrefetchJsCoreAdapter"
            java.lang.String r4 = "[game-web-prefetch] inject gamecenter_jscore.js excpetion"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r11, r4, r2)
            mu4.c0 r2 = new mu4.c0
            r2.<init>()
            mu4.h0 r3 = r10.f347816a
            r3.a(r2)
            java.lang.String r2 = fs1.j.f347827g
            java.lang.String r3 = fs1.j.f347828h
            java.lang.String r4 = r11.getMessage()
            if (r4 == 0) goto L8c
            r5 = 44
            r6 = 46
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r11 = r26.i0.u(r4, r5, r6, r7, r8, r9)
            goto L8d
        L8c:
            r11 = 0
        L8d:
            jx3.f r4 = jx3.f.INSTANCE
            r5 = 20821(0x5155, float:2.9176E-41)
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r11}
            r4.d(r5, r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.mo149xb9724478(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fs1.g.a(java.lang.String):void");
    }
}
