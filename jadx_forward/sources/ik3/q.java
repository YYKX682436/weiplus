package ik3;

/* loaded from: classes8.dex */
public final class q extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f373442f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f373443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f373442f = jz5.h.b(ik3.m.f373437d);
        this.f373443g = jz5.h.b(ik3.l.f373436d);
    }

    @Override // jm0.g
    public void N6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "registerAffSyncCppToNativeManager");
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.j.f299047a = ik3.h.f373429a;
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "onAccountInit");
        O6(new ik3.p(this));
    }

    @Override // jm0.g
    public void R6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "onAccountInitBefore");
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("multitask"), false);
        if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            com.p314xaae8f345.mm.vfs.w6.u(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "db init result: " + com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.d.f299039b.e(i17));
    }

    public final int T6(int i17) {
        if (i17 == 1) {
            return 5;
        }
        if (i17 == 2) {
            return 9;
        }
        if (i17 == 3) {
            return 7;
        }
        if (i17 == 4) {
            return 8;
        }
        switch (i17) {
            case 22:
                return 10;
            case 23:
                return 11;
            case 24:
                return 4;
            case 25:
                return 3;
            case 26:
                return 1;
            case 27:
                return 2;
            default:
                return 0;
        }
    }

    public final lk3.b U6() {
        return (lk3.b) ((jz5.n) this.f373442f).mo141623x754a37bb();
    }

    public final int V6(bw5.a40 a40Var) {
        if (a40Var == null) {
            return -1;
        }
        int i17 = a40Var.b().f107263d;
        int i18 = 2;
        if (i17 != 9) {
            if (i17 == 1) {
                return 26;
            }
            if (i17 == 2) {
                return 27;
            }
            i18 = 3;
            if (i17 == 3) {
                return 25;
            }
            if (i17 == 4) {
                return 24;
            }
            if (i17 == 11) {
                return 23;
            }
            if (i17 == 5) {
                return 1;
            }
            if (i17 != 7) {
                if (i17 == 8) {
                    return 4;
                }
                return i17 == 10 ? 22 : -1;
            }
        }
        return i18;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c W6(int i17, bw5.a40 a40Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66793x2262335f = V6(a40Var);
        c16601x7ed0e40c.f66791xc8a07680 = a40Var.b().c();
        c16601x7ed0e40c.f66789xac3be4e = a40Var.b().f107269m * 1000;
        c16601x7ed0e40c.f66794xa783a79b = a40Var.f106542e * 1000;
        bw5.bl0 b17 = a40Var.b();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = b17.f107274r[11] ? b17.f107273q : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        if (gVar != null) {
            c16601x7ed0e40c.f66790x225a93cf = gVar.g();
        }
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(ga0.e.class)).all()).iterator();
        while (it.hasNext()) {
            fs.q qVar = (fs.q) it.next();
            if (qVar.mo210xb7045565(java.lang.Integer.valueOf(V6(a40Var)))) {
                ga0.e eVar = (ga0.e) qVar.get();
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c B9 = eVar != null ? eVar.B9(a40Var) : null;
                c16601x7ed0e40c.f66792x98981ec = B9 != null ? B9.f66792x98981ec : null;
                c16601x7ed0e40c.v0().set(1, a40Var.b().m11606x7531c8a2());
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a40Var.b().c(), "getBid(...)");
                c16601x7ed0e40c.v0().set(7, java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.vfs.w6.j(u0Var.b(r2))));
            }
        }
        return c16601x7ed0e40c;
    }
}
