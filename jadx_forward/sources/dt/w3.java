package dt;

/* loaded from: classes12.dex */
public class w3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.rf rfVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015 c5598x407a5015 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5598x407a5015) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        if (c5598x407a5015 == null || (rfVar = c5598x407a5015.f135923g) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent event null ret false");
            return false;
        }
        int i17 = rfVar.f89341a;
        boolean z17 = rfVar.f89342b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "summerdiz GetDisasterInfoEvent callback event noticeid[%d], manualauthSucc[%b]", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        gm0.j1.e().j(new com.p314xaae8f345.mm.app.q7(i17, z17));
        return false;
    }
}
