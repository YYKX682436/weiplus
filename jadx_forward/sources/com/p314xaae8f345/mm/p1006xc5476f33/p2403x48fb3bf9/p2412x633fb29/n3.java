package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes15.dex */
public class n3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options f264576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 f264577f;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 j3Var, java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options) {
        this.f264577f = j3Var;
        this.f264575d = str;
        this.f264576e = options;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 j3Var = this.f264577f;
        if (j3Var.f264498g) {
            return;
        }
        java.lang.String k17 = j3Var.k(j3Var.f264493b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "dealWithError pkg nil");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithError:");
        java.lang.String str = this.f264575d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", sb6.toString());
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
        resp.f32870x7fa0d2de = j3Var.f264495d;
        resp.f32867xa7c470f2 = -1;
        resp.f32868xb2d5068c = str;
        resp.f33041x68ac491 = j3Var.f264496e;
        resp.f33040x3291ee = "zh_CN";
        resp.f33039x39175796 = "";
        j3Var.h(k17, resp, this.f264576e);
    }
}
