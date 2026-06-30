package sd1;

/* loaded from: classes7.dex */
public abstract class d {
    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, sd1.b referrerPolicyContainer, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referrerPolicyContainer, "referrerPolicyContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Referrers", "updateReferrers, component is null");
            return null;
        }
        sd1.a aVar = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerHelper is null");
            return null;
        }
        if (referrerPolicyContainer.mo51883x546d0727() == null) {
            referrerPolicyContainer.mo51890x1c636f33(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5.f172063e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5 p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p5) aVar;
        sd1.c c17 = p5Var.c(data, lVar);
        if (c17 != null) {
            referrerPolicyContainer.mo51890x1c636f33(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Referrers", "updateReferrers, referrerPolicy: " + referrerPolicyContainer.mo51883x546d0727());
        if (sd1.c.f488210e == referrerPolicyContainer.mo51883x546d0727()) {
            return null;
        }
        java.lang.String e17 = p5Var.e(lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Referrers", "updateReferrers, mReferrer: " + e17);
        return e17;
    }
}
