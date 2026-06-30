package qs;

/* loaded from: classes8.dex */
public class v extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public v() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5632xc2bedd22 c5632xc2bedd22 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5632xc2bedd22) abstractC20979x809547d1;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (c5632xc2bedd22 != null) {
            try {
                am.ch chVar = c5632xc2bedd22.f135960g;
                if (chVar != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3 c6295xdee69c3 = wi6.f552068f;
                    c6295xdee69c3.f136560d = chVar.f87886a;
                    c6295xdee69c3.f136561e = chVar.f87887b;
                    c6295xdee69c3.f136562f = chVar.f87888c;
                    c6295xdee69c3.f136564h = c6295xdee69c3.b("latitude", chVar.f87890e + "", true);
                    c6295xdee69c3.f136563g = c6295xdee69c3.b("longitude", chVar.f87889d + "", true);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3 c6295xdee69c32 = wi6.f552068f;
                    c81.b wi7 = c81.b.wi();
                    wi7.m134976x2690a4ac();
                    c81.a aVar = wi7.f121189d;
                    java.lang.String m17 = c6295xdee69c32.m();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = aVar.a();
                    if (a17 != null) {
                        a17.putString("last_gps_info", m17);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiWeixinData", "note gps info cost [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return false;
    }
}
