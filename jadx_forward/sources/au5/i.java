package au5;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {
    public i(au5.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            bu5.c cVar = au5.j.f95687l;
            if (cVar == null) {
                zt5.h.b("Soter.SoterCoreTreble", "soter: updateExtraParam fail, mSoterService is null", new java.lang.Object[0]);
                return;
            }
            com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25622x1e242462 d17 = ((bu5.a) cVar).d("fingerprint_type");
            if (d17 != null) {
                java.lang.Object obj = d17.f296861d;
                if (obj instanceof java.lang.Integer) {
                    zt5.h.c("Soter.SoterCoreTreble", "soter: updateExtraParam finger type:%s", (java.lang.Integer) obj);
                    zt5.q.a("fingerprint_type", obj);
                }
            }
            com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25622x1e242462 d18 = ((bu5.a) au5.j.f95687l).d("fingerprint_hardware_position");
            if (d18 != null) {
                java.lang.Object obj2 = d18.f296861d;
                if (obj2 instanceof java.lang.Integer[]) {
                    zt5.h.c("Soter.SoterCoreTreble", "soter: updateExtraParam finger pos:%s", java.util.Arrays.toString((java.lang.Integer[]) obj2));
                    zt5.q.a("fingerprint_hardware_position", obj2);
                }
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.SoterCoreTreble", e17, "soter: getExtraParam fail1");
            zt5.i.b(101, "SoterService aidl: getExtraParam.", e17);
        }
    }
}
