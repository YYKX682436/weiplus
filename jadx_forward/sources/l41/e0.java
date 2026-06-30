package l41;

/* loaded from: classes10.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, ab0.v {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397333d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397334e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397335f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cx5 f397336g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f397337h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ex5 f397338i;

    public e0(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dx5();
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397334e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", this.f397335f);
        r45.dx5 dx5Var = (r45.dx5) a17.f152243a.f152217a;
        dx5Var.f454364d = "";
        dx5Var.f454365e = str;
        dx5Var.f454366f = i17;
    }

    public final void H(r45.dx5 dx5Var, r45.bx5 bx5Var) {
        r45.nu3 nu3Var;
        r45.u2 u2Var;
        r45.vm4 vm4Var;
        java.lang.String str;
        dx5Var.f454372o = new r45.fw5();
        if (bx5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact subScene: %s", java.lang.Integer.valueOf(bx5Var.f452666e));
            dx5Var.f454372o.f456187e = bx5Var.f452666e;
        }
        if (bx5Var != null && (str = bx5Var.f452667f) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact search_context: %s", str);
            dx5Var.f454372o.f456188f = bx5Var.f452667f;
        }
        if (bx5Var != null && (vm4Var = bx5Var.f452668g) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact miniprogramContext: %s, %s", vm4Var.f469893d, java.lang.Integer.valueOf(vm4Var.f469894e));
            dx5Var.f454372o.f456189g = bx5Var.f452668g;
        }
        if (bx5Var != null && (u2Var = bx5Var.f452669h) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact adContext: %s, %s", java.lang.Integer.valueOf(u2Var.f468485d), java.lang.Long.valueOf(bx5Var.f452669h.f468486e));
            dx5Var.f454372o.f456190h = bx5Var.f452669h;
        }
        if (bx5Var == null || (nu3Var = bx5Var.f452670i) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "searchOpenIMContact h5Context: %s", nu3Var.f463218d);
        dx5Var.f454372o.f456191i = bx5Var.f452670i;
    }

    public r45.cx5 I() {
        return this.f397336g;
    }

    public java.lang.String J() {
        return this.f397337h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397333d = u0Var;
        return mo9409x10f9447a(sVar, this.f397334e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getReqResp */
    public com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558() {
        return this.f397334e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return vb1.e.f77260x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f397334e.f152244b.f152233a;
        if (fVar instanceof r45.ex5) {
            this.f397338i = (r45.ex5) fVar;
        }
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4 && i19 == -2034) {
                this.f397337h = ((r45.ex5) fVar).f455321e;
            }
            this.f397333d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.cx5 cx5Var = ((r45.ex5) fVar).f455320d;
        this.f397336g = cx5Var;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
        r0Var.f152062a = cx5Var.f453433d;
        r0Var.f152066e = cx5Var.f453438i;
        r0Var.f152065d = cx5Var.f453439m;
        r0Var.f152070i = -1;
        r0Var.f152063b = 3;
        r0Var.f152067f = 1;
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var);
        this.f397333d.mo815x76e0bfae(i18, i19, str, this);
    }

    public e0(java.lang.String str, boolean z17, int i17, int i18, r45.bx5 bx5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dx5();
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397334e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s], scene: %d, getA8KeyScene: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        r45.dx5 dx5Var = (r45.dx5) a17.f152243a.f152217a;
        if (z17) {
            dx5Var.f454367g = str;
            dx5Var.f454370m = i17;
        } else {
            this.f397335f = str;
            dx5Var.f454364d = str;
            dx5Var.f454370m = i17;
        }
        H(dx5Var, bx5Var);
        dx5Var.f454372o.f456186d = i18;
    }

    public e0(java.lang.String str, boolean z17, r45.g05 g05Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dx5();
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397334e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s] finderUserName=%s ,scene=%s", str, g05Var.f456318e, java.lang.Integer.valueOf(g05Var.f456317d));
        r45.dx5 dx5Var = (r45.dx5) a17.f152243a.f152217a;
        dx5Var.f454368h = g05Var;
        if (z17) {
            dx5Var.f454367g = str;
        } else {
            this.f397335f = str;
            dx5Var.f454364d = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", "[openWeComCgi] finderContext: %s", g05Var.f456320g);
    }

    public e0(java.lang.String str, int i17, byte[] bArr, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dx5();
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397334e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "new with: url = [" + str + "], scene = [" + i17 + "], spamContext = [" + bArr + "], bizInfo = [" + str2 + "]");
        r45.dx5 dx5Var = (r45.dx5) a17.f152243a.f152217a;
        dx5Var.f454369i = str;
        dx5Var.f454370m = i17;
        r45.fw5 fw5Var = new r45.fw5();
        dx5Var.f454372o = fw5Var;
        fw5Var.f456188f = str2 == null ? "" : str2;
        if (bArr != null) {
            dx5Var.f454371n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
    }

    public e0(java.lang.String str, int i17, r45.bx5 bx5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.dx5();
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397334e = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchOpenIMContact", "search url [%s], scene: %d", this.f397335f, java.lang.Integer.valueOf(i17));
        r45.dx5 dx5Var = (r45.dx5) a17.f152243a.f152217a;
        dx5Var.f454369i = str;
        dx5Var.f454370m = i17;
        H(dx5Var, bx5Var);
    }

    public e0(r45.dx5 dx5Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = dx5Var;
        lVar.f152198b = new r45.ex5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/searchopenimcontact";
        lVar.f152200d = vb1.e.f77260x366c91de;
        this.f397334e = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kenneth_PromoteReport", "[openWeComCgi] finderContext: %s", dx5Var.f454368h.f456320g);
    }
}
