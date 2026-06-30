package bh0;

/* loaded from: classes4.dex */
public class w1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930 c6274x15294930 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930) abstractC20979x809547d1;
        if (!(c6274x15294930 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6274x15294930)) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c6274x15294930.f136523g.f89298a);
        am.r20 r20Var = c6274x15294930.f136523g;
        arrayList.add(r20Var.f89299b);
        arrayList.add(r20Var.f89300c);
        arrayList.add(r20Var.f89301d);
        arrayList.add(r20Var.f89302e);
        arrayList.add("" + r20Var.f89303f);
        arrayList.add(r20Var.f89304g);
        arrayList.add(r20Var.f89305h);
        arrayList.add("" + r20Var.f89306i);
        arrayList.add("" + r20Var.f89307j);
        arrayList.add(r17);
        arrayList.add("" + r20Var.f89308k);
        arrayList.add(r20Var.f89309l);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
        arrayList.add(((n34.p4) ((p94.o0) i95.n0.c(p94.o0.class))).Ai(r20Var.f89310m, c19772x1c2cd081));
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");
        int a17 = c01.h2.a(r20Var.f89300c, r20Var.f89301d);
        int a18 = c01.h2.a(r17, r20Var.f89304g);
        arrayList.add("" + a17);
        arrayList.add("" + a18);
        java.lang.String str = r20Var.f89311n;
        java.lang.String str2 = r20Var.f89312o;
        try {
            str = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "" : java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WvReportPublisherIdListener", e17, "", new java.lang.Object[0]);
        }
        arrayList.add(str);
        arrayList.add(c19772x1c2cd081.f38869x6ac9171);
        arrayList.add(str2);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String str3 = r20Var.f89304g;
        ((py.a) iVar).getClass();
        arrayList.add(c01.v1.y(str3) ? "1" : "0");
        java.lang.String str4 = r20Var.f89302e;
        if (str4 != null) {
            str4.replace(",", "!");
        }
        java.lang.String str5 = r20Var.f89309l;
        if (str5 != null) {
            str5.replace(",", "!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.l(11954, arrayList);
        return true;
    }
}
