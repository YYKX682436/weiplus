package wk;

/* loaded from: classes12.dex */
public class t extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5404xb552832d c5404xb552832d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5404xb552832d) abstractC20979x809547d1;
        if (w21.p0.Di() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SubCoreVoice.getVoiceStg()");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtVoiceMsgIdToFileName", sb6.toString());
            c5404xb552832d.f135751h.f87666a = "";
        }
        w21.w0 J0 = w21.p0.Di().J0(c5404xb552832d.f135750g.f90060b, (int) r2.f90059a);
        am.a9 a9Var = c5404xb552832d.f135751h;
        if (J0 == null) {
            a9Var.f87666a = "";
            return true;
        }
        a9Var.f87666a = J0.f524018b;
        return true;
    }
}
