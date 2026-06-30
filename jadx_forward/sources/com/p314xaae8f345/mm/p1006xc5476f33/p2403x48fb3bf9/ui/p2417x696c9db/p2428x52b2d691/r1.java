package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class r1 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268008e;

    public r1(nw4.k kVar, nw4.y2 y2Var) {
        this.f268007d = kVar;
        this.f268008e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s1.f268042e == i17) {
            nw4.k kVar = this.f268007d;
            nw4.y2 y2Var = this.f268008e;
            if (i18 == -1) {
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "get hk encrypt passwd succ", new java.lang.Object[0]);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String stringExtra = intent.getStringExtra("encryptPasswd");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("encryptPasswd", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("signature");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("signature", stringExtra2);
                }
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", linkedHashMap);
                return;
            }
            int intExtra = intent != null ? intent.getIntExtra("retcode", 0) : 0;
            rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "get hk encrypt passwd fail, retcode is " + intExtra, new java.lang.Object[0]);
            if (intExtra == 3) {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail_user cancel", null);
                return;
            }
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
    }
}
