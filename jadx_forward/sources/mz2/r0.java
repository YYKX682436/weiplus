package mz2;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7 f414705d;

    /* renamed from: e, reason: collision with root package name */
    public int f414706e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414707f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f414708g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f414709h;

    public r0() {
        super(0);
        this.f414706e = 0;
        this.f414707f = "";
        this.f414708g = false;
        this.f414709h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7) r7
            boolean r0 = gm0.j1.a()
            r1 = 0
            java.lang.String r2 = "MicroMsg.GenFingerPrintRsaKeyEventListener"
            if (r0 != 0) goto L12
            java.lang.String r7 = "GenFingerPrintRsaKeyEventListener account is not ready"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
            goto Lc8
        L12:
            java.lang.String r0 = "GenFingerPrintRsaKeyEventListener callback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r6.f414708g = r1
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7
            if (r0 == 0) goto Lc8
            boolean r0 = mz2.n0.c()
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L4d
            java.lang.String r7 = "device is not support FingerPrintAuth"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
            am.cf r7 = new am.cf
            r7.<init>()
            r7.f87882a = r1
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r0 = r6.f414705d
            r0.f135908h = r7
            r6.f414708g = r4
            java.lang.String r7 = "doCallback()"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f414705d
            java.lang.Runnable r7 = r7.f273897d
            if (r7 == 0) goto L45
            r7.run()
        L45:
            boolean r7 = r6.f414708g
            if (r7 == 0) goto Lc7
            r6.f414705d = r3
            goto Lc7
        L4d:
            r6.f414705d = r7
            gm0.j1.i()
            gm0.y r7 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r7 = r7.f354821b
            r0 = 385(0x181, float:5.4E-43)
            r7.a(r0, r6)
            com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent r7 = r6.f414705d
            am.bf r7 = r7.f135907g
            boolean r0 = r7.f87781a
            int r5 = r7.f87782b
            r6.f414706e = r5
            java.lang.String r7 = r7.f87783c
            r6.f414707f = r7
            if (r0 != 0) goto La2
            java.lang.String r7 = mz2.n0.b()
            java.lang.String r0 = wo.w0.k()
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r5 = mz2.n0.a(r5)
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63459x2e2166f5(r5, r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "FingerPrintAuth.getRsaKey() success!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            oz2.e r0 = new oz2.e
            r0.<init>(r7)
            gm0.j1.i()
            gm0.y r7 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r7 = r7.f354821b
            r7.g(r0)
            goto La8
        L9c:
            java.lang.String r7 = "FingerPrintAuth.getRsaKey() return null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
            goto La7
        La2:
            java.lang.String r7 = "FingerPrintAuth should gen rsa key!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r7)
        La7:
            r1 = r4
        La8:
            if (r1 == 0) goto Lc7
            java.lang.String r7 = "FingerPrintAuth begin asyc gen rsa key!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            mz2.c2 r7 = new mz2.c2
            mz2.q0 r0 = new mz2.q0
            r0.<init>(r6, r3)
            r7.<init>(r0)
            mz2.a2 r0 = new mz2.a2
            r0.<init>(r7)
            java.lang.Class<mz2.c2> r7 = mz2.c2.class
            java.lang.String r7 = r7.getName()
            s75.d.b(r0, r7)
        Lc7:
            r1 = r4
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mz2.r0.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof oz2.e) {
            am.cf cfVar = new am.cf();
            cfVar.f87882a = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is success");
                oz2.e eVar = (oz2.e) m1Var;
                java.lang.String str2 = eVar.f431783d;
                java.lang.String str3 = eVar.f431784e;
                java.lang.String b17 = mz2.n0.b();
                java.lang.String k17 = wo.w0.k();
                java.lang.String a17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.a();
                if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63453xf4fe79c1(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), b17, k17, java.lang.String.valueOf(this.f414706e), a17, "", str2, str3, wo.w0.m()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt failed!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt success!");
                    cfVar.f87882a = true;
                }
                java.lang.String m63455xd772203 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63455xd772203(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), b17, k17, java.lang.String.valueOf(this.f414706e), a17, this.f414707f, wo.w0.m());
                java.lang.String m63454x6d7333e1 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.C15518x5dfa006c.m63454x6d7333e1(mz2.n0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), mz2.n0.b(), wo.w0.k(), m63455xd772203);
                cfVar.f87883b = m63455xd772203;
                cfVar.f87884c = m63454x6d7333e1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is fail");
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.q(385, this);
            this.f414705d.f135908h = cfVar;
            this.f414708g = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "doCallback()");
            java.lang.Runnable runnable = this.f414705d.f273897d;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f414708g) {
                this.f414705d = null;
            }
        }
    }
}
