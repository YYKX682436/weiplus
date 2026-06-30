package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes8.dex */
public class u extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public u(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ig5();
        lVar.f152198b = new r45.jg5();
        lVar.f152200d = 1916;
        lVar.f152199c = "/cgi-bin/mmpay-bin/qryautoplanorderlist";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.ig5 ig5Var = (r45.ig5) a17.f152243a.f152217a;
        ig5Var.f458570d = i17;
        ig5Var.f458571e = i18;
        ig5Var.f458572f = i19;
        p(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiLqtPlanOrderList", "CgiLqtPlanOrderList Req：plan_id: %s, offset: %s, limit: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public static r45.n85 s(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610 c18995xe3fe0610) {
        if (c18995xe3fe0610 == null) {
            return null;
        }
        r45.n85 n85Var = new r45.n85();
        n85Var.f462705p = c18995xe3fe0610.f259141i;
        n85Var.f462697e = c18995xe3fe0610.f259137e;
        n85Var.f462696d = c18995xe3fe0610.f259136d;
        n85Var.f462708s = c18995xe3fe0610.f259144o;
        n85Var.f462707r = c18995xe3fe0610.f259143n;
        n85Var.f462698f = c18995xe3fe0610.f259138f;
        n85Var.f462699g = c18995xe3fe0610.f259139g;
        n85Var.f462706q = c18995xe3fe0610.f259142m;
        n85Var.f462709t = c18995xe3fe0610.f259145p;
        if (c18995xe3fe0610.f259140h != null) {
            r45.dn4 dn4Var = new r45.dn4();
            n85Var.f462704o = dn4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0 c18994x65c66ca0 = c18995xe3fe0610.f259140h;
            dn4Var.f454128d = c18994x65c66ca0.f259133d;
            dn4Var.f454129e = c18994x65c66ca0.f259134e;
            java.util.Iterator it = c18994x65c66ca0.f259135f.iterator();
            while (it.hasNext()) {
                n85Var.f462704o.f454130f.add((java.lang.Integer) it.next());
            }
        }
        return n85Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610 t(r45.n85 n85Var) {
        if (n85Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610 c18995xe3fe0610 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18995xe3fe0610();
        c18995xe3fe0610.f259141i = n85Var.f462705p;
        c18995xe3fe0610.f259137e = n85Var.f462697e;
        c18995xe3fe0610.f259136d = n85Var.f462696d;
        c18995xe3fe0610.f259144o = n85Var.f462708s;
        c18995xe3fe0610.f259143n = n85Var.f462707r;
        c18995xe3fe0610.f259138f = n85Var.f462698f;
        c18995xe3fe0610.f259139g = n85Var.f462699g;
        c18995xe3fe0610.f259142m = n85Var.f462706q;
        c18995xe3fe0610.f259145p = n85Var.f462709t;
        if (n85Var.f462704o != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0 c18994x65c66ca0 = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.C18994x65c66ca0();
            c18995xe3fe0610.f259140h = c18994x65c66ca0;
            r45.dn4 dn4Var = n85Var.f462704o;
            c18994x65c66ca0.f259133d = dn4Var.f454128d;
            c18994x65c66ca0.f259134e = dn4Var.f454129e;
            java.util.Iterator it = dn4Var.f454130f.iterator();
            while (it.hasNext()) {
                c18995xe3fe0610.f259140h.f259135f.add((java.lang.Integer) it.next());
            }
        }
        return c18995xe3fe0610;
    }
}
