package qe;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f443449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f443450e;

    public a1(qe.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f443450e = d1Var;
        this.f443449d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        qe.d1 d1Var = this.f443450e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "initConfigWcWss initConfig mContextId:%s", d1Var.f443461a);
        if (d1Var.f443468h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss mWcwssNative is null");
            return;
        }
        uh1.a aVar = (uh1.a) this.f443449d.b(uh1.a.class);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss networkConfig is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WcWssNativeInstallHelper", "wcwss mbzType:%s,,websocketTimeoutMS:%d,userAgentString :%s,referer:%s,mode:%d", d1Var.f443467g, java.lang.Integer.valueOf(aVar.f509275f), aVar.B, aVar.D, java.lang.Integer.valueOf(aVar.E));
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("referer", aVar.D);
        hashMap.put("User-Agent", aVar.B);
        hashMap.put("bzType", d1Var.f443467g);
        hashMap.put("mode", java.lang.String.valueOf(aVar.E));
        hashMap.put("timeout", java.lang.String.valueOf(aVar.f509275f));
        d1Var.f443468h.m83412xf3d9c872(hashMap);
        int i17 = aVar.E;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i17 == 1) {
            java.util.ArrayList arrayList3 = aVar.f509288v;
            if (arrayList3 == null || arrayList3.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss blacklistHeaders is null");
                arrayList2 = null;
            } else {
                arrayList2 = aVar.f509288v;
            }
            d1Var.f443468h.m83413x36b64368(null, arrayList2);
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss invalid mode:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        java.util.ArrayList arrayList4 = aVar.f509289w;
        if (arrayList4 == null || arrayList4.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WcWssNativeInstallHelper", "initConfigWcWss whitelistHeaders is null");
            arrayList = null;
        } else {
            arrayList = aVar.f509289w;
        }
        d1Var.f443468h.m83413x36b64368(arrayList, null);
    }
}
