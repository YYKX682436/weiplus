package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class b7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 f191231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 activityC13983x9b040529) {
        super(1);
        this.f191231d = activityC13983x9b040529;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13983x9b040529 activityC13983x9b040529 = this.f191231d;
        java.util.Iterator it = activityC13983x9b040529.f190858x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.l82) obj2).m75945x2fec8307(0), str)) {
                break;
            }
        }
        r45.l82 l82Var = (r45.l82) obj2;
        r45.xn1 xn1Var = l82Var != null ? (r45.xn1) l82Var.m75936x14adae67(2) : null;
        if (xn1Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            if (c19782x23db1cfa != null) {
                c19782x23db1cfa.m76240x66bc2758(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = activityC13983x9b040529.E;
            if (hpVar != null) {
                java.lang.String u17 = pm0.v.u(activityC13983x9b040529.F);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13983x9b040529.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                hpVar.x0(xn1Var, (r16 & 2) != 0 ? "" : u17, 4, (r16 & 8) != 0 ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(mo55332x76847179).c(zy2.ra.class))).V6(), false, (r16 & 32) != 0 ? "" : null);
            }
        }
        return jz5.f0.f384359a;
    }
}
