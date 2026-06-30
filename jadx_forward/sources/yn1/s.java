package yn1;

@j95.b
/* loaded from: classes11.dex */
public final class s extends i95.w implements mv.v {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.C12838x99b6cce6 f545349d;

    /* renamed from: e, reason: collision with root package name */
    public yn1.c0 f545350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f545351f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f545352g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f545353h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.backup.migration.MigrationAccountService$exptListener$1] */
    public s() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f545349d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.backup.migration.MigrationAccountService$exptListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Zi();
                yn1.s sVar = yn1.s.this;
                if (sVar.f545351f) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "Change isPomEnable from " + sVar.f545351f + " to true");
                sVar.f545351f = true;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accountInfoUpdater");
                throw null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(yn1.s r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn1.s.wi(yn1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public r45.ol4 Ai(java.lang.String usernameHash) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameHash, "usernameHash");
        byte[] j17 = Bi().j(Ni(usernameHash));
        if (j17 == null) {
            return null;
        }
        r45.ol4 ol4Var = new r45.ol4();
        ol4Var.mo11468x92b714fd(j17);
        return ol4Var;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("migration_account", 1, null);
    }

    public void Di() {
        java.lang.String k17 = gm0.j1.b().k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[hideBannerForever] shouldShowBanner=" + this.f545352g + ", hasBannerShown=" + this.f545353h + ", username=" + k17);
        if (this.f545352g) {
            this.f545352g = false;
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5707xef9cc162().b(android.os.Looper.getMainLooper());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        java.lang.String K1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K1(k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K1, "sha256(...)");
        r45.ol4 Ai = Ai(K1);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationAccountService", "Fail to get accountInfo by username=".concat(k17));
            return;
        }
        if (Ai.f463879f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "Change remainBannerCount from " + Ai.f463879f + " to 0");
            Ai.f463879f = 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
            java.lang.String username = Ai.f463877d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            java.lang.String K12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K1(username);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K12, "sha256(...)");
            Bi.H(Ni(K12), Ai.mo14344x5f01b1f6());
        }
    }

    public final java.lang.String Ni(java.lang.String str) {
        return "hashUsernamePrefix#" + str;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        yn1.z0 z0Var = yn1.z0.f545466a;
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        if (z0Var.o(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[MigrationService.onAccountInitialized] Nothing to do.");
            return;
        }
        this.f545353h = false;
        this.f545352g = false;
        yn1.h4 h4Var = (yn1.h4) ((mv.w) i95.n0.c(mv.w.class));
        h4Var.Zi();
        this.f545351f = true;
        h4Var.Ni();
        h4Var.Vi();
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Ri();
        ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).aj();
        mo48813x58998cd();
        yn1.c0 c0Var = new yn1.c0(new p3325xe03a0797.p3326xc267989b.g2(((ku5.t0) ku5.t0.f394148d).p("MigrationAccountService")), null, "MM.Mig.MigrationAccountService", 2, null);
        this.f545350e = c0Var;
        c0Var.a(new yn1.r(this, null));
        boolean z17 = j62.e.g().i("clicfg_migration_enable_cdn_android", 0, true, true) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "saveCdnMigrateExpt, enable = " + z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().G("clicfg_migration_enable_cdn_android_mmkv", z17);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        yn1.z0 z0Var = yn1.z0.f545466a;
        java.lang.String k17 = gm0.j1.b().k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getUserName(...)");
        boolean o17 = z0Var.o(k17);
        boolean z17 = this.f545350e != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[onAccountReleased] isVirtualLogin=" + o17 + ", isInitialized=" + z17);
        if (z17) {
            yn1.c0 c0Var = this.f545350e;
            if (c0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accountScope");
                throw null;
            }
            p3325xe03a0797.p3326xc267989b.z0.c(c0Var, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = c0Var.f545153d;
            if (p0Var instanceof p3325xe03a0797.p3326xc267989b.f2) {
                ((p3325xe03a0797.p3326xc267989b.f2) p0Var).close();
            }
            mo48814x2efc64();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] Account has ready, skip init");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Bi = Bi();
            if (Bi.i("isInitialized", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] Current device has already initialized");
            } else {
                c01.uc ucVar = c01.uc.f119047c;
                java.util.HashSet hashSet = (java.util.HashSet) ucVar.d();
                java.util.ArrayList arrayList = new java.util.ArrayList(hashSet.size());
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.String string = ucVar.f119050b.getString(str, "");
                    if (string != null && !string.isEmpty()) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0)));
                            java.lang.String optString = jSONObject.optString("last_login_uin", "0");
                            java.lang.String optString2 = jSONObject.optString("last_avatar_path", "");
                            int F1 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F1(optString, 0L);
                            if (F1 != 0) {
                                arrayList.add(new c01.tc(str, F1, optString2));
                            }
                        } catch (org.json.JSONException unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwitchAccountInfo", "Fail to parse jsonObject from str=%s", string);
                        }
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    c01.tc tcVar = (c01.tc) it6.next();
                    r45.ol4 ol4Var = new r45.ol4();
                    ol4Var.f463877d = tcVar.f119028a;
                    int i17 = tcVar.f119029b;
                    ol4Var.f463878e = i17;
                    ol4Var.f463879f = 0;
                    ol4Var.f463880g = true;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initIfNecessary] Save account(");
                    java.lang.String username = tcVar.f119028a;
                    sb6.append(username);
                    sb6.append(", ");
                    sb6.append(i17);
                    sb6.append(')');
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", sb6.toString());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                    java.lang.String K1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K1(username);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K1, "sha256(...)");
                    Bi.H(Ni(K1), ol4Var.mo14344x5f01b1f6());
                }
                Bi.G("isInitialized", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationAccountService", "[initIfNecessary] init done");
            }
        }
        zn1.i0 i0Var = zn1.i0.f555980a;
        if (!((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).Di()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UsbDeviceManager", "[registerUsbChecker] Aoa is not enable, skip registering usb checker");
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b c4683x847dbe1b = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495;
        zn1.h0 h0Var = zn1.i0.f555984e;
        c4683x847dbe1b.mo40976xa01141ab(h0Var);
        c4683x847dbe1b.mo40973x40b15f2e(h0Var);
        if (c4683x847dbe1b.mo40975xf7b3660d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbDeviceManager", "[registerUsbChecker] Start connecting device");
            h0Var.mo8896x832bee5c();
        }
    }
}
