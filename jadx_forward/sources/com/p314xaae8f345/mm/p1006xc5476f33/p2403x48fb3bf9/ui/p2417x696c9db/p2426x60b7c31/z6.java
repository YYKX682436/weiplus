package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes12.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 f267122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a7 f267123e;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a7 a7Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5) {
        this.f267123e = a7Var;
        this.f267122d = c5402xfd96e0b5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5402xfd96e0b5 c5402xfd96e0b5 = this.f267122d;
        if (c5402xfd96e0b5.f135747h.f89802b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a7 a7Var = this.f267123e;
            android.app.ProgressDialog progressDialog = a7Var.f266458h.f266512h;
            if (progressDialog != null) {
                progressDialog.dismiss();
                a7Var.f266458h.f266512h = null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5402xfd96e0b5.f135747h.f89801a)) {
                a7Var.f266458h.i5(a7Var.f266455e, "translateVoice:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("translateResult", c5402xfd96e0b5.f135747h.f89801a);
            a7Var.f266458h.i5(a7Var.f266455e, "translateVoice:ok", hashMap);
        }
    }
}
