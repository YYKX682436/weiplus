package z11;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final w11.d2 f550797d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550798e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 f550799f;

    /* renamed from: g, reason: collision with root package name */
    public int f550800g;

    /* renamed from: h, reason: collision with root package name */
    public int f550801h;

    /* renamed from: i, reason: collision with root package name */
    public final int f550802i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f550803m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.cx4 f550804n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f550805o = false;

    public b(w11.d2 d2Var, int i17, int i18, int i19, r45.cx4 cx4Var) {
        this.f550797d = d2Var;
        this.f550800g = i17;
        this.f550801h = i18;
        this.f550802i = i19;
        this.f550803m = i19 > 0;
        this.f550804n = cx4Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s doScene", this);
        this.f550798e = u0Var;
        int i17 = this.f550800g;
        int i18 = this.f550801h;
        boolean z17 = mm.w.f410075a;
        mm.w.d("MicroMsg.NotifyPowerInspector", "netSyncMin: scene=" + i17 + ", selector=0x" + java.lang.Integer.toBinaryString(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            java.lang.String str = i17 + "-" + java.lang.Integer.toBinaryString(i18);
            mm.y yVar = mm.w.f410082h;
            if (yVar.b() || !mm.w.f410076b) {
                yVar.c(str);
            }
        }
        w11.z.f523712a = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncRunning true");
        return mo9409x10f9447a(sVar, this.f550799f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 138;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: needCheckCallback */
    public boolean mo48009xb05ac77() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "onGYNetEnd %s %s %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this);
        boolean z17 = true;
        if (v0Var == null || v0Var.mo13822xfb85f7b0() != 138) {
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 44L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this;
            objArr[1] = java.lang.Integer.valueOf(v0Var == null ? -2 : v0Var.mo13822xfb85f7b0());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s onGYNetEnd error type:%d", objArr);
            return;
        }
        if (this.f550805o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s onGYNetEnd has been callback  , give up  ", this);
            return;
        }
        this.f550805o = true;
        w11.d2.b("Check rr failed.", v0Var == this.f550799f);
        boolean z18 = (i18 == 0 && i19 == 0) ? false : true;
        w11.z.f523712a = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncRunning false");
        boolean z19 = z18 ^ true;
        w11.z.f523713b = z19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MinSyncStatusHolder", "setMinSyncResult " + z19);
        w11.d2 d2Var = this.f550797d;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s onGYNetEnd scene error Callback [%s,%s,%s ] rr:%s", this, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, v0Var);
            if (i18 != 4 || i19 != -2006) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(11098, 3501, "" + this.f550800g + ";" + i18 + ";" + i19 + ";" + z65.c.f551988a + ";" + a21.a.a());
                fVar.mo68477x336bdfd8(99L, 43L, 1L, false);
                this.f550798e.mo815x76e0bfae(i18, i19, str, this);
                d2Var.d(this);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "%s onGYNetEnd MM_ERR_KEYBUF_INVALID , not merge key buf", this);
            jx3.f.INSTANCE.mo68477x336bdfd8(99L, 42L, 1L, false);
            z17 = false;
        }
        r45.ew4 ew4Var = ((o45.yh) v0Var.mo13821x7f35c2d1()).f424572a;
        r45.jj6 jj6Var = new r45.jj6();
        jj6Var.f459423n = 0;
        jj6Var.f459418f = this.f550800g;
        jj6Var.f459417e = z17;
        jj6Var.f459416d = ew4Var;
        jj6Var.f459420h = this.f550803m;
        jj6Var.f459419g = this.f550801h;
        r45.cx4 cx4Var = this.f550804n;
        jj6Var.f459425p = cx4Var.f453432e;
        jj6Var.f459426q = cx4Var;
        jj6Var.f459428s = this.f550802i;
        d2Var.f523539h.b(jj6Var, this);
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        int i17;
        int i18;
        java.lang.String str;
        boolean m40092xb9aa8b5f;
        boolean z17;
        boolean z18;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = this;
        boolean z19 = true;
        objArr[1] = java.lang.Integer.valueOf(this.f550800g);
        objArr[2] = java.lang.Integer.valueOf(this.f550801h);
        objArr[3] = java.lang.Integer.valueOf(this.f550802i);
        objArr[4] = queue == null ? "null" : java.lang.Integer.valueOf(queue.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s begin run scene:%s selector:%s contSyncCnt:%s List:%s", objArr);
        java.lang.String str2 = ";";
        int i19 = 7;
        int i27 = 6;
        if (queue != null) {
            if (!queue.isEmpty()) {
                if (queue.size() >= 5) {
                    jx3.f.INSTANCE.d(11098, 3590, "" + queue.size() + ";" + z65.c.f551988a + ";" + a21.a.a());
                }
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.A(queue.size(), new int[]{1, 2, 3, 4, 5, 10}, new java.lang.Integer[]{60, 61, 62, 63, 64, 65, 66})), 1L, false);
            }
            boolean z27 = false;
            boolean z28 = false;
            while (!queue.isEmpty()) {
                z11.b bVar = (z11.b) queue.poll();
                if (bVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "NetSceneMinSync list poll value is null list.size:%d", java.lang.Integer.valueOf(queue.size()));
                } else {
                    this.f550801h |= bVar.f550801h;
                    if (bVar.f550800g == 3) {
                        z18 = z28;
                        z17 = z19;
                    } else {
                        z17 = z27;
                        z18 = bVar.f550803m ? z19 : z28;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s pop:%s[%s] scene:%s selector:%s isContinue:%s contSyncCnt:%s hashcont:%s hasBgfg:%s", this, java.lang.Integer.valueOf(queue.size()), bVar, java.lang.Integer.valueOf(bVar.f550800g), java.lang.Integer.valueOf(bVar.f550801h), java.lang.Boolean.valueOf(bVar.f550803m), java.lang.Integer.valueOf(bVar.f550802i), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
                    i27 = i27;
                    i19 = i19;
                    z27 = z17;
                    z28 = z18;
                    str2 = str2;
                    z19 = true;
                }
            }
            i17 = i27;
            i18 = i19;
            str = str2;
            if (z27) {
                this.f550800g = 3;
            } else if (z28) {
                this.f550800g = i17;
            }
        } else {
            i17 = 6;
            i18 = 7;
            str = ";";
        }
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s accready:%s hold:%s accstg:%s ", this, java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), gm0.j1.u());
            return false;
        }
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) gm0.j1.u().c().l(8196, null), 0L);
        if (k17 != 0) {
            gm0.j1.u().c().w(8196, 0L);
            this.f550801h = ((int) (this.f550801h | k17)) & 95;
        }
        int i28 = this.f550800g;
        int i29 = i28 == 3 ? 1 : 0;
        if (i28 == 1010) {
            this.f550801h |= 16;
            this.f550800g = i18;
        } else if (i28 == 1011) {
            this.f550801h |= 64;
            this.f550800g = i18;
        } else if (i28 == 3) {
            this.f550801h |= 262144;
            this.f550800g = 3;
        }
        if (this.f550803m) {
            this.f550800g = i17;
        }
        w11.y0 y0Var = new w11.y0(false);
        this.f550799f = y0Var;
        r45.dw4 dw4Var = ((o45.xh) y0Var.mo47979x2d63726f()).f424569a;
        dw4Var.f454315i = i29;
        dw4Var.f454311e = this.f550801h;
        dw4Var.f454313g = this.f550800g;
        byte[] a17 = w11.c2.f523524a.a();
        dw4Var.f454312f = x51.j1.a(a17);
        dw4Var.f454310d = new r45.c50();
        int i37 = o45.wf.f424556a;
        dw4Var.f454314h = wo.q.f529313a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f454317n = wi6;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        if (m40092xb9aa8b5f) {
            dw4Var.f454316m = 1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s continueFlag:%s SyncMsgDigest:%s Selector:%d Scene:%d device:%s SyncFlag:%d", this, java.lang.Long.valueOf(k17), java.lang.Integer.valueOf(dw4Var.f454315i), java.lang.Integer.valueOf(dw4Var.f454311e), java.lang.Integer.valueOf(this.f550800g), dw4Var.f454314h, java.lang.Integer.valueOf(wi6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "%s Req synckey %s", this, o45.qi.d(a17));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(99L, this.f550800g, 1L, false);
        fVar.mo68477x336bdfd8(99L, 0L, 1L, false);
        fVar.mo68477x336bdfd8(99L, z65.c.f551988a ? 241L : 242L, 1L, false);
        if (gm0.j1.n().f354821b.h(this, 0)) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(this.f550800g);
        java.lang.String str3 = str;
        sb6.append(str3);
        sb6.append(z65.c.f551988a);
        sb6.append(str3);
        sb6.append(a21.a.a());
        fVar.d(11098, 3500, sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "%s NetSceneQueue doScene failed. ", this);
        fVar.mo68477x336bdfd8(99L, 41L, 1L, false);
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m178304x9616526c() {
        return "NetSync[" + hashCode() + "]";
    }
}
