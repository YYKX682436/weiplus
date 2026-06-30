package jb3;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6258x3f496c98 c6258x3f496c98 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6258x3f496c98) abstractC20979x809547d1;
        hb3.o Ni = hb3.o.Ni();
        Ni.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6258x3f496c98.f136508g.f87837a)) {
            am.c20 c20Var = c6258x3f496c98.f136508g;
            ot0.q v17 = ot0.q.v(c20Var.f87837a);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430237r1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "receiver：get new xml from server: %s", v17.f430237r1);
                java.lang.String str = v17.f430237r1;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                try {
                    str2 = android.net.Uri.parse(str).getQueryParameter("sendid");
                } catch (java.lang.Exception unused) {
                }
                ot0.c cVar = (ot0.c) v17.y(ot0.c.class);
                at4.k1 z07 = ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().z0(v17.f430237r1);
                if (z07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreLuckyMoney", "receiver：luckyMoneyItem == null, create Item");
                    z07 = new at4.k1();
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66558xf7c5f050)) {
                    z07.f66558xf7c5f050 = v17.f430237r1;
                    z07.f66562xd3086e30 = 0;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f429954n)) {
                        z07.f66556xfcd83239 = 3;
                        z07.f66554xe4172d8f = cVar.f429954n;
                    }
                    z07.f66557x32fdc97f = v17.M0;
                    z07.f66565xfd3491a = c20Var.f87838b;
                    z07.f66564xfd345a8 = str2;
                    z07.f66560xd09be28e = c20Var.f87839c;
                }
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(z07);
                if (z07.f66556xfcd83239 == 3 && c01.z1.r().equals(z07.f66554xe4172d8f)) {
                    Ni.cj(c20Var.f87838b, true);
                }
                dc3.e eVar = new dc3.e();
                eVar.f68591xea95c2ed = str2;
                if (!Ni.Ri().get(eVar, new java.lang.String[0])) {
                    eVar.f68590xe177af3f = 0;
                    Ni.Ri().mo880xb970c2b9(eVar);
                }
            }
        }
        return false;
    }
}
