package yc1;

/* loaded from: classes15.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 {

    /* renamed from: CTRL_INDEX */
    private static final int f77513x366c91de = 530;

    /* renamed from: NAME */
    private static final java.lang.String f77514x24728b = "onLocalServiceEvent";

    public static synchronized void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, uh1.n1 n1Var, java.lang.String str, int i17) {
        synchronized (yc1.a.class) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("event", str);
            if (android.text.TextUtils.equals(str, "found") || android.text.TextUtils.equals(str, "lost") || android.text.TextUtils.equals(str, "resolveFail")) {
                hashMap.put("serviceType", n1Var.f509377c);
                hashMap.put("serviceName", n1Var.f509376b);
                if (android.text.TextUtils.equals(str, "resolveFail")) {
                    hashMap.put("errno", 606101);
                    hashMap.put("errnMsg", java.lang.String.format("fail:mdns resolve system error:%d", java.lang.Integer.valueOf(i17)));
                } else {
                    hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54552x8c62eff0, n1Var.f509378d);
                    hashMap.put("port", java.lang.Integer.valueOf(n1Var.f509379e));
                    hashMap.put("attributes", n1Var.f509375a);
                }
            }
            yc1.a aVar = new yc1.a();
            aVar.t(hashMap);
            aVar.p(lVar);
            aVar.m();
        }
    }
}
