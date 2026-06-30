package od1;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f73040x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f73041x24728b = "getGamePerformance";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17;
        yg.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(e9Var.mo48798x74292566(), true)) == null) {
            return;
        }
        int i18 = yd.c0.INST.h().f542451a;
        int i19 = i18 - b17.f169685x;
        yg.h hVar = ((ae.a) ((ae.q) b17.f169677p.C0().z1(ae.q.class))).w().f130118i;
        synchronized (hVar.f543597a) {
            aVar = hVar.f543599c;
        }
        float f17 = aVar.f543551a;
        yg.f a17 = hVar.a();
        int i27 = a17.f543583c;
        int i28 = a17.f543584d;
        float f18 = a17.f543585e * 10000;
        int round = (int) java.lang.Math.round(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.z.INST.f169924d.b());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cpu", java.lang.String.valueOf(round));
        hashMap.put("memory", java.lang.String.valueOf(i18));
        hashMap.put("memoryDiff", java.lang.String.valueOf(i19));
        hashMap.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, java.lang.String.valueOf(f17));
        hashMap.put("jank", java.lang.String.valueOf(i27));
        hashMap.put("bigJank", java.lang.String.valueOf(i28));
        hashMap.put("stutter", java.lang.String.valueOf(f18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetGamePerformance", "jMap:" + hashMap);
        e9Var.a(i17, p("ok", hashMap));
    }
}
