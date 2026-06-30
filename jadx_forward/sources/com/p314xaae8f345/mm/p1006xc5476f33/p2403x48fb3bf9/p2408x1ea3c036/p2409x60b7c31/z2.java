package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class z2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public sd.b f264062a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f264063b;

    public z2(sd.b bVar, java.lang.String str) {
        this.f264062a = bVar;
        this.f264063b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.j14 j14Var;
        sd.b bVar = this.f264062a;
        if (bVar == null) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreVerify", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            b(str);
            return;
        }
        r45.y14 y14Var = (r45.y14) oVar.f152244b.f152233a;
        if (y14Var == null || (j14Var = y14Var.f472243d) == null || j14Var.f459024d != 0) {
            b(str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c4 c4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).K;
        java.lang.String str2 = this.f264063b;
        c4Var.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = c4Var.f263694d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.u())) {
                c4Var.f263691a.put(c4Var.a(e0Var.u()), str2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c4 c4Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).K;
        java.lang.String str3 = this.f264063b;
        java.lang.String str4 = y14Var.f472246g;
        c4Var2.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            c4Var2.f263693c.put(str3, str4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q(this.f264063b, y14Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.c4 c4Var3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).K;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var2 = c4Var3.f263694d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var2.u())) {
            c4Var3.f263692b.put(c4Var3.a(e0Var2.u()), qVar);
        }
        java.util.LinkedList linkedList = y14Var.f472244e;
        sd.d dVar = this.f264062a.f488129a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 h17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).f263711J.h(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).u());
        if (h17 == null) {
            b("");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.lx6 lx6Var = (r45.lx6) it.next();
                o45.m b17 = o45.vf.b(lx6Var.f461490d);
                if (b17 != null) {
                    int i19 = b17.f424511c;
                    int d17 = h17.d(i19);
                    int i27 = lx6Var.f461491e;
                    if (d17 != i27) {
                        h17.h(i19, (byte) i27);
                    }
                }
            }
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).D != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", y14Var.f472246g);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).D.X(y14Var.f472246g);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).E != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", y14Var.f472246g);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).E;
            java.lang.String icon = y14Var.f472246g;
            x3Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
            if (x3Var.f264221z == null) {
                x3Var.K(icon);
            }
        }
        sd.d dVar2 = this.f264062a.f488129a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar2).F != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar2).F;
            java.lang.String str5 = y14Var.f472246g;
            if (str5 == null) {
                str5 = "";
            }
            c16092xbbe22aef.m65137x764b6bfb(str5);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).F);
        }
        b("");
    }

    public final void b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f264062a.a();
        } else {
            this.f264062a.c(str, null);
        }
        sx4.d0.l(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) this.f264062a.f488129a).s(), java.lang.System.currentTimeMillis());
        this.f264062a = null;
        this.f264063b = null;
    }
}
