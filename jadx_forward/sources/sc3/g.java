package sc3;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487979d;

    public g(sc3.k1 k1Var) {
        this.f487979d = k1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            sc3.k1 r0 = r11.f487979d
            r0.getClass()
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams r1 = new com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJniParams
            r1.<init>()
            java.lang.Class<ft.b4> r2 = ft.b4.class
            i95.m r2 = i95.n0.c(r2)
            ft.b4 r2 = (ft.b4) r2
            et.o r2 = (et.o) r2
            r2.getClass()
            java.lang.String r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a()
            r1.f21470x5aa3c83 = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L2c
            java.lang.String r2 = r1.f21470x5aa3c83
            java.lang.String r2 = com.p314xaae8f345.mm.vfs.w6.i(r2, r3)
            r1.f21470x5aa3c83 = r2
        L2c:
            bf3.g0 r2 = bf3.g0.f101160a
            r2.getClass()
            android.content.SharedPreferences r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i()
            java.lang.String r4 = "enable"
            java.lang.String r5 = "disable"
            r6 = 0
            java.lang.String r7 = "MBServerUtil"
            r8 = -2
            if (r2 == 0) goto L59
            android.content.SharedPreferences r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.i()
            java.lang.String r9 = "appbrand_wasm_opt"
            int r2 = r2.getInt(r9, r8)
            if (r2 == r8) goto L59
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r2 == 0) goto L50
            goto L51
        L50:
            r4 = r5
        L51:
            r3[r6] = r4
            java.lang.String r4 = "[mb] wasm opt force %s by cmd"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r4, r3)
            goto L78
        L59:
            java.lang.Class<e42.e0> r2 = e42.e0.class
            i95.m r2 = i95.n0.c(r2)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r9 = e42.d0.clicfg_magic_emoji_wasm_opt_state
            h62.d r2 = (h62.d) r2
            int r2 = r2.Ni(r9, r8)
            if (r2 == r8) goto L79
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r2 == 0) goto L70
            goto L71
        L70:
            r4 = r5
        L71:
            r3[r6] = r4
            java.lang.String r4 = "[mb] wasm opt force %s by abtest"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r4, r3)
        L78:
            r8 = r2
        L79:
            r1.f21471xda4d7062 = r8
            boolean r2 = r0.K0()
            r1.f21467x7687b8b4 = r2
            com.tencent.mm.plugin.magicbrush.MBBuildConfig r2 = r0.f488015n
            if (r2 == 0) goto Lde
            boolean r2 = r2.f229356m
            r1.f21466xe42b02d5 = r2
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni r2 = r0.f488024w
            r2.m43150x3c2bc9a5(r1)
            jz5.g r1 = r0.f488025x
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager r2 = (com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5136x9c8c9fbe) r2
            vc3.a r3 = r0.M0()
            long r3 = r3.L()
            vc3.a r5 = r0.M0()
            long r5 = r5.G()
            r2.a(r3, r5)
            vc3.a r2 = r0.M0()
            bf3.b r3 = new bf3.b
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            com.tencent.mm.appbrand.commonjni.buffer.BufferURLManager r1 = (com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5136x9c8c9fbe) r1
            r3.<init>(r1)
            r2.B(r3)
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni r4 = r0.f488024w
            vc3.a r1 = r0.M0()
            long r5 = r1.L()
            vc3.a r1 = r0.M0()
            long r7 = r1.G()
            vc3.a r0 = r0.M0()
            long r9 = r0.z()
            r4.m43148x39fc3c41(r5, r7, r9)
            return
        Lde:
            java.lang.String r0 = "config"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sc3.g.run():void");
    }
}
