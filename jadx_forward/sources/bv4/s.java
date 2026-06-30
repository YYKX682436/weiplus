package bv4;

/* loaded from: classes.dex */
public class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1 w1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class);
            if (w1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PreloadWebSearchDataLsn", "PreGetWebSearchDataTask: PluginWebSearch service is null, skip preGetData");
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) w1Var.Zi()).e(bundle.getString("reqId"), bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984), bundle.getString("subSessionId"), bundle.getString("query"), bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), bundle.getString("parentSearchID"), bundle.getString("sugId"), bundle.getInt("sceneActionType"), bundle.getInt("businessType"), bundle.getInt("chatSearch"), bundle.getString("reqKey"), (java.util.Map) bundle.getSerializable("extParams"));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PreloadWebSearchDataLsn", "PreGetWebSearchDataTask exception: %s", e17.getMessage());
        }
    }
}
