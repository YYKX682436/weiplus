package ss3;

/* loaded from: classes8.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51 c5872xad626b51 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5872xad626b51) abstractC20979x809547d1;
        am.np npVar = c5872xad626b51.f136179g;
        int i17 = npVar.f88974a;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = npVar.f88975b;
            int i18 = npVar.f88976c;
            java.lang.String str = npVar.f88977d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav info, newsSvrid is %d, tweetId is %s", java.lang.Integer.valueOf(i18), str);
            java.util.ArrayList arrayList = (java.util.ArrayList) ss3.d0.Di().D0(i18, 20);
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav news msgs");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (str.equals(((c01.ta) arrayList.get(i19)).g())) {
                        z17 = ss3.q.a(c5303xc75d2f73, (c01.ta) arrayList.get(i19), i19);
                        break;
                    }
                }
            }
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            z17 = false;
            c5872xad626b51.f136180h.f89104a = z17;
        } else if (i17 == 4) {
            ss3.d0.Di().m0(c5872xad626b51.f136179g.f88978e);
        }
        return false;
    }
}
