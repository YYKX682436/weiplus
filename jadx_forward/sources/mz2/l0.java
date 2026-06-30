package mz2;

/* loaded from: classes9.dex */
public class l0 extends mz2.a {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f414683e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414684f;

    @Override // pz2.a
    public java.util.Map C() {
        return null;
    }

    @Override // mz2.a, pz2.a
    public java.util.Map F8() {
        return null;
    }

    @Override // pz2.a
    public boolean Ge(boolean z17, boolean z18, android.os.Bundle bundle) {
        return false;
    }

    @Override // pz2.a
    public boolean Ic() {
        return this.f414618d.Lf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // pz2.a
    public boolean L2() {
        return true;
    }

    @Override // pz2.a
    public boolean Nh() {
        return true;
    }

    @Override // pz2.a
    public void O(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8, int i17) {
        if (android.text.TextUtils.isEmpty(this.f414683e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_info!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_info!");
        }
        if (android.text.TextUtils.isEmpty(this.f414684f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "fail gen encrypted_pay_sign!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "success gen encrypted_pay_sign!");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "callback FingerPrintAuthEvent onSuccess()");
        if (c5820xc13f26f8 != null) {
            am.on onVar = c5820xc13f26f8.f136128g;
            if (onVar.f89098c != null) {
                am.pn pnVar = new am.pn();
                pnVar.f89173f = mo148658x368f3a();
                pnVar.f89168a = 0;
                pnVar.f89169b = this.f414683e;
                pnVar.f89170c = this.f414684f;
                pnVar.f89171d = i17;
                c5820xc13f26f8.f136129h = pnVar;
                onVar.f89098c.run();
            }
        }
        this.f414683e = "";
        this.f414684f = "";
    }

    @Override // pz2.a
    public int Q7(pz2.c cVar, int i17, int i18) {
        return 0;
    }

    @Override // pz2.a
    public boolean Rb() {
        return false;
    }

    @Override // pz2.a
    public boolean a1() {
        return false;
    }

    @Override // pz2.a
    public void af() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "initFP");
        this.f414618d.mo150321xed060d07();
    }

    @Override // pz2.a
    public void dc(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.android.settings.fingerprint.FingerprintSettings");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/huawei/securitymgr/HwFingerprintAuth", "startRigesterFinger", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // pz2.a
    public int dg(pz2.c cVar, int i17, boolean z17) {
        this.f414618d.g9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new nz2.f(mz2.d2.IML.f414645e), new mz2.k0(this, cVar));
        return 0;
    }

    @Override // pz2.a
    /* renamed from: isRoot */
    public boolean mo148657xb9a85d2c() {
        return false;
    }

    @Override // pz2.a
    /* renamed from: type */
    public int mo148658x368f3a() {
        return this.f414618d.of();
    }

    @Override // pz2.a
    /* renamed from: userCancel */
    public void mo148659x428ac225() {
        this.f414618d.mo150320xae7a2e7a();
    }

    @Override // pz2.a
    public boolean wc() {
        return mz2.n0.c();
    }

    @Override // pz2.a
    public boolean yh() {
        boolean ja6 = this.f414618d.ja();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintMgrImpl", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(ja6));
        return ja6;
    }
}
