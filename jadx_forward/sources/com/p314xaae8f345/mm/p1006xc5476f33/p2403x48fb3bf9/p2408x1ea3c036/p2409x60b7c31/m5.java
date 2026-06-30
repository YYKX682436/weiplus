package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class m5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return hc1.i.f69827x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowSmileyPanel", "invokeInOwn");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a;
        int i17 = 0;
        if (e0Var.f263721v != null) {
            long id6 = java.lang.Thread.currentThread().getId();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = e0Var.M;
            if (id6 == n3Var.mo50280x23b2dd47().getThread().getId()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19493xb618544c c19493xb618544c = e0Var.f263721v;
                c19493xb618544c.setVisibility(0);
                android.widget.LinearLayout linearLayout = c19493xb618544c.f268820q;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                c19493xb618544c.f268822s = true;
                c19493xb618544c.f268813g = 1;
                i17 = c19493xb618544c.c();
            } else {
                i17 = ((java.lang.Integer) new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q0(e0Var, 1000L, 0).a(n3Var)).intValue();
            }
        }
        if (i17 <= 0) {
            bVar.c("fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("height", java.lang.Integer.valueOf(i65.a.c(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f488143d, i17)));
        bVar.d(hashMap);
    }
}
