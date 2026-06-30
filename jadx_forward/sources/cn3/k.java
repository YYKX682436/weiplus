package cn3;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5674x5f4457f4 c5674x5f4457f4 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5674x5f4457f4) abstractC20979x809547d1;
        int i17 = c5674x5f4457f4.f135999g.f89154a;
        am.qi qiVar = c5674x5f4457f4.f136000h;
        switch (i17) {
            case 1:
                an3.e.d(null, 0);
                return false;
            case 2:
                an3.e.a(0);
                return false;
            case 3:
                qiVar.f89246a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(143875, 0)) == 1;
                return false;
            case 4:
                gm0.j1.u().c().w(143875, 1);
                return false;
            case 5:
                gm0.j1.u().c().w(143875, 0);
                return false;
            case 6:
                an3.e.b(null);
                return false;
            case 7:
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().l(8210, null);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (l17 != null && currentTimeMillis <= l17.longValue()) {
                    r4 = false;
                }
                qiVar.f89246a = r4;
                return false;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OnLbsroomLogicListener", "LbsroomLogicEvent unkown opcode!");
                return false;
        }
    }
}
