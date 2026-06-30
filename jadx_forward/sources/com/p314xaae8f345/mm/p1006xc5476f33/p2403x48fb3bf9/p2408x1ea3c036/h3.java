package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class h3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 f263752e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var, java.lang.String str) {
        this.f263752e = w3Var;
        this.f263751d = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("result");
        int i17 = bundle.getInt("code_type");
        int i18 = bundle.getInt("code_version");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w3 w3Var = this.f263752e;
        w3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "onGetQRCodeResult");
        if (w3Var.f264202j == null) {
            return;
        }
        w3Var.f264193a = string;
        w3Var.f264195c = i17;
        w3Var.f264196d = i18;
        w3Var.f264194b = com.p314xaae8f345.mm.vfs.w6.N(this.f263751d, 0, -1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.l3(w3Var));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w3Var.f264193a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName mResultOfImageUrl nil");
            return;
        }
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i19 = w3Var.f264195c;
        java.lang.String str = w3Var.f264193a;
        ((jd0.z1) l2Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i19, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewLongClickHelper", "processGetWXACodeNickName");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("wxa_result", w3Var.f264193a);
            bundle2.putInt("wxa_code_type", w3Var.f264195c);
            bundle2.putInt("wxa_code_version", w3Var.f264196d);
            bundle2.putInt("type", 4);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.k3(w3Var));
        }
    }
}
