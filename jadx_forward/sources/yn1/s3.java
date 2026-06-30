package yn1;

/* loaded from: classes11.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545363d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f545364e;

    /* renamed from: f, reason: collision with root package name */
    public int f545365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545366g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545367h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f545368i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.lang.String str, yn1.a4 a4Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545366g = str;
        this.f545367h = a4Var;
        this.f545368i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.s3(this.f545366g, this.f545367h, this.f545368i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.s3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ol4 accountInfo;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545365f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String K1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K1(yn1.z0.f545466a.j());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K1);
            if ((K1.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(K1, this.f545366g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f545367h.f545139a, "[RSEWUA] currentHash=" + K1 + ", hashUsername=" + this.f545366g);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = this.f545367h.f545142d;
                if (aVar2 != null) {
                    aVar2.M1(this.f545368i, bw5.h0.MATCH_FAIL);
                }
                return jz5.f0.f384359a;
            }
            accountInfo = ((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).Ai(this.f545366g);
            if (accountInfo == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f545367h.f545139a, "[RSEWUA] Target account(sha256=" + this.f545366g + ") doesn't have chat history on the current device.");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = this.f545367h.f545142d;
                if (aVar3 != null) {
                    aVar3.M1(this.f545368i, bw5.h0.NO_CHAT_LOG);
                }
                return jz5.f0.f384359a;
            }
            java.lang.String str2 = yn1.z0.f545477l;
            yn1.a4 a4Var = this.f545367h;
            long j17 = this.f545368i;
            if (str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(a4Var.f545139a, "[RSEWUA] qrcode is empty");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar4 = a4Var.f545142d;
                if (aVar4 != null) {
                    aVar4.M1(j17, bw5.h0.OTHER_ERROR);
                }
                return jz5.f0.f384359a;
            }
            sn1.z zVar = sn1.z.f491649a;
            bw5.xd0 xd0Var = new bw5.xd0();
            xd0Var.f116603d = str2;
            xd0Var.f116604e[2] = true;
            bw5.yd0 yd0Var = new bw5.yd0();
            yn1.r3 r3Var = yn1.r3.f545348d;
            this.f545363d = accountInfo;
            this.f545364e = str2;
            this.f545365f = 1;
            java.lang.Object a17 = zVar.a(17573, "/cgi-bin/micromsg-bin/migratemsggetbindinfo", xd0Var, yd0Var, r3Var, this);
            if (a17 == aVar) {
                return aVar;
            }
            str = str2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f545364e;
            accountInfo = (r45.ol4) this.f545363d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        sn1.j jVar = (sn1.j) obj;
        bw5.yd0 yd0Var2 = (bw5.yd0) jVar.f491564a;
        if (jVar.f491565b != 0 || jVar.f491566c != 0 || yd0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f545367h.f545139a, "[RSEWUA] errType=" + jVar.f491565b + ", errCode=" + jVar.f491566c + ", errMsg=" + jVar.f491567d);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar5 = this.f545367h.f545142d;
            if (aVar5 != null) {
                aVar5.M1(this.f545368i, bw5.h0.OTHER_ERROR);
            }
            return jz5.f0.f384359a;
        }
        long j18 = yd0Var2.f116982e;
        if (j18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f545367h.f545139a, "[RSEWUA] qrcode=" + str + " is expired");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar6 = this.f545367h.f545142d;
            if (aVar6 != null) {
                aVar6.M1(this.f545368i, bw5.h0.QRCODE_EXPIRED);
            }
            return jz5.f0.f384359a;
        }
        if (j18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f545367h.f545139a, "[RSEWUA] flag=" + yd0Var2.f116982e);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar7 = this.f545367h.f545142d;
            if (aVar7 != null) {
                aVar7.M1(this.f545368i, bw5.h0.OTHER_ERROR);
            }
            return jz5.f0.f384359a;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yd0Var2.f116986i[2] ? yd0Var2.f116981d : "", this.f545366g)) {
            java.lang.String str3 = this.f545367h.f545139a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[RSEWUA] Account mismatch. resp.sha256Username=");
            sb6.append(yd0Var2.f116986i[2] ? yd0Var2.f116981d : "");
            sb6.append(", hashUsername=");
            sb6.append(this.f545366g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, sb6.toString());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar8 = this.f545367h.f545142d;
            if (aVar8 != null) {
                aVar8.M1(this.f545368i, bw5.h0.MATCH_FAIL);
            }
            return jz5.f0.f384359a;
        }
        yn1.z0 z0Var = yn1.z0.f545466a;
        synchronized (z0Var) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountInfo, "accountInfo");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "[reInitWithAccountInfo] Ready to reinit with account=" + accountInfo.f463877d);
            iz5.a.g("Migration must be initialized before", z0Var.n());
            iz5.a.b("Status must be equal.", java.lang.Boolean.valueOf(z0Var.j().length() > 0), java.lang.Boolean.valueOf(gm0.j1.a()));
            if (z0Var.j().length() > 0) {
                java.lang.String str4 = accountInfo.f463877d;
                java.lang.String j19 = z0Var.j();
                if (str4 == null || !str4.equals(j19)) {
                    throw new iz5.d("Account must be equal.", str4, j19);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "Account=" + z0Var.j() + " has already logged in.");
            } else {
                java.lang.String username = accountInfo.f463877d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                yn1.z0.f545480o = username;
                yn1.z0.f545482q = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreAccount", "[!] markVirtualLogin");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("system_config_prefs").G("virtual_login_mark", true);
                gm0.j1.b().f354774d = accountInfo.f463877d;
                gm0.j1.i().k(accountInfo.f463878e);
                java.lang.String g17 = z0Var.g();
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("roam_backup"), "migration").o(), "cache").o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[getCachePath] migrationCache=".concat(o17));
                if (!com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                    com.p314xaae8f345.mm.vfs.w6.u(o17);
                }
                yn1.z0.f545479n = o17;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.i(accountInfo.f463878e, accountInfo.f463877d, z0Var.g());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "Reinit backup storage model with ".concat(z0Var.j()));
                tn1.f.f().b();
                tn1.f.f().c();
                ((ku5.t0) ku5.t0.f394148d).q(new yn1.s0(g17));
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar9 = this.f545367h.f545142d;
        if (aVar9 != null) {
            aVar9.M1(this.f545368i, bw5.h0.SUCCESS);
        }
        return jz5.f0.f384359a;
    }
}
