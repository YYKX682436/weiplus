package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class c0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f266504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266505e;

    public c0(nw4.k kVar, nw4.y2 y2Var) {
        this.f266504d = kVar;
        this.f266505e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0.f266574e == i17) {
            nw4.y2 y2Var = this.f266505e;
            nw4.k kVar = this.f266504d;
            if (i18 == 0) {
                nw4.g gVar = kVar.f422396d;
                java.lang.String str = y2Var.f422546c;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0.f266573d;
                gVar.e(str, "createAvatar:cancel", null);
                return;
            }
            if (intent == null) {
                nw4.g gVar2 = kVar.f422396d;
                java.lang.String str2 = y2Var.f422546c;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 d0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0.f266573d;
                gVar2.e(str2, "createAvatar:fail", null);
                return;
            }
            int intExtra = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
            java.lang.String stringExtra = intent.getStringExtra("desc");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("nickname");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            java.lang.String stringExtra3 = intent.getStringExtra("avatarurl");
            java.lang.String str3 = stringExtra3 != null ? stringExtra3 : "";
            if (stringExtra2.length() > 0) {
                if (str3.length() > 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(dm.i4.f66865x76d1ec5a, intExtra);
                    jSONObject.put("nickname", stringExtra2);
                    jSONObject.put("url", str3);
                    jSONObject.put("desc", stringExtra);
                    java.util.Map e17 = kz5.b1.e(new jz5.l("avatarInfo", jSONObject));
                    nw4.g gVar3 = kVar.f422396d;
                    java.lang.String str4 = y2Var.f422546c;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 d0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0.f266573d;
                    gVar3.e(str4, "createAvatar:ok", e17);
                    return;
                }
            }
            nw4.g gVar4 = kVar.f422396d;
            java.lang.String str5 = y2Var.f422546c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0 d0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d0.f266573d;
            gVar4.e(str5, "createAvatar:fail", null);
        }
    }
}
