package gd1;

/* loaded from: classes7.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69791x366c91de = 789;

    /* renamed from: NAME */
    public static final java.lang.String f69792x24728b = "startNFCDiscovery";

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f352016g = jz5.h.b(gd1.a0.f352014d);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            return;
        }
        if (!fd1.d.c()) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13001, "fail:system NFC switch not opened", kz5.c1.i(new jz5.l("errCode", 13001))));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1.class);
        if (t1Var != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k5) t1Var).a()) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f361968c.a(lVar);
        if (jSONObject != null) {
            try {
                jSONObject.getBoolean("requireForegroundDispatch");
                a17.f361972b.getClass();
            } catch (java.lang.Exception unused) {
            }
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("filters");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
                c75.c.d(jSONArray, new gd1.x(arrayList));
                if (arrayList.size() > 0) {
                    a17.c(arrayList);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        gd1.z zVar = new gd1.z(lVar, i17, this, a17);
        ((ku5.t0) ku5.t0.f394148d).B(new hd1.s(a17, zVar));
    }
}
