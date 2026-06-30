package fu4;

/* loaded from: classes9.dex */
public class f implements fu4.h, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public fu4.g f348422d = null;

    /* renamed from: e, reason: collision with root package name */
    public fu4.g f348423e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348424f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348425g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348426h = false;

    public void a(android.content.Context context, fu4.g gVar, android.os.Bundle bundle) {
        if (bundle != null) {
            this.f348424f = bundle.getString("key_pay_passwd");
            boolean z17 = bundle.getBoolean("key_fp_lock_offline_mode");
            this.f348425g = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepare pwd: %s, isOfflineMode: %b", this.f348424f, java.lang.Boolean.valueOf(z17));
        }
        this.f348422d = gVar;
        this.f348426h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance;
        lVar.f262903d = null;
        lVar.f262904e = null;
        gm0.j1.d().a(1967, this);
        gm0.j1.d().a(1548, this);
        if (this.f348425g) {
            lVar.f262903d = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            b(false);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d() == null) {
            fu4.g gVar2 = this.f348422d;
            if (gVar2 != null) {
                gVar2.h(2, "system error");
                return;
            }
            return;
        }
        re4.v a17 = re4.u.a();
        java.lang.String str = a17.f476086a;
        java.lang.String str2 = a17.f476087b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "cpuId: %s, uid: %s", str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            gm0.j1.d().g(new fu4.i(str, str2));
        } else {
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            fu4.e eVar = new fu4.e(this);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, eVar);
        }
    }

    public final void b(boolean z17) {
        fu4.k kVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepareAuthKey isNeedChangeAuthKey: %b", java.lang.Boolean.valueOf(z17));
        fu4.d dVar = new fu4.d(this);
        if (this.f348425g) {
            kVar = null;
        } else {
            je0.j jVar = (je0.j) i95.n0.c(je0.j.class);
            java.lang.String str = this.f348424f;
            ((ie0.o) jVar).getClass();
            kVar = new fu4.k(str);
        }
        ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
        cu5.b.e(dVar, z17, true, 3, kVar, new oe4.i());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (this.f348426h) {
            return;
        }
        if (m1Var instanceof fu4.i) {
            if (i17 == 0 && i18 == 0) {
                fu4.i iVar = (fu4.i) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.f262903d = iVar.f348429f;
                b(iVar.f348430g);
                return;
            } else {
                fu4.g gVar = this.f348422d;
                if (gVar != null) {
                    gVar.h(7, "get challenge failed");
                    return;
                }
                return;
            }
        }
        if (m1Var instanceof fu4.j) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.a(true);
                fu4.g gVar2 = this.f348423e;
                if (gVar2 != null) {
                    gVar2.h(0, "open touch lock ok");
                    return;
                }
                return;
            }
            cu5.b.f(3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.a(false);
            fu4.g gVar3 = this.f348423e;
            if (gVar3 != null) {
                gVar3.h(6, "open touch lock failed");
            }
        }
    }
}
