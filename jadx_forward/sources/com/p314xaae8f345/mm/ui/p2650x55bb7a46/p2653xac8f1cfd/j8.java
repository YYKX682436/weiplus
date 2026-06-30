package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class j8 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f280791a;

    public j8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        this.f280791a = y8Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f280791a;
        a31.m mVar = y8Var.f281825m;
        if (mVar != null) {
            mVar.j();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = y8Var.v0();
        if (v07 != null && (c8Var = v07.D2) != null) {
            c8Var.m();
        }
        fl5.i C0 = y8Var.C0();
        if (C0 != null) {
            C0.mo81584x764b0e09("");
        }
        a31.m mVar2 = y8Var.f281825m;
        if (mVar2 == null) {
            return;
        }
        mVar2.f82506g = 1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void b() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 v07 = this.f280791a.v0();
        if (v07 != null) {
            android.widget.Button button = v07.f271560n;
            if (button != null) {
                button.performClick();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = v07.D2;
            if (c8Var == null || !c8Var.n()) {
                return;
            }
            v07.D2.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void c(int i17) {
        a31.m mVar = this.f280791a.f281825m;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void d() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f280791a;
        y8Var.A0().G("show_guide", true);
        fl5.i C0 = y8Var.C0();
        if (C0 == null) {
            return;
        }
        C0.mo81584x764b0e09("");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void e(int i17) {
        z21.w wVar;
        a31.m mVar = this.f280791a.f281825m;
        if (mVar == null || (wVar = mVar.f82518s) == null) {
            return;
        }
        wVar.e(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void f() {
        fl5.i C0 = this.f280791a.C0();
        if (C0 == null) {
            return;
        }
        C0.mo81584x764b0e09("");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void g(int i17) {
        android.content.Context w07;
        int i18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 B0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f280791a;
        a31.m mVar = y8Var.f281825m;
        if ((mVar != null && mVar.f82506g == 1) && (B0 = y8Var.B0()) != null) {
            u35.b.f505964c = java.lang.System.currentTimeMillis();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_session_id", u35.b.f505962a);
            hashMap.put("last_emoji_clk_ts", java.lang.Long.valueOf(u35.b.f505965d));
            hashMap.put("last_clk_btn_name", java.lang.Integer.valueOf(u35.b.f505963b));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(B0, "speech_to_text_button");
            aVar.gk(B0, hashMap);
            aVar.ik(B0, 8, 35963);
            u35.b.f505963b = 1;
        }
        a31.m mVar2 = y8Var.f281825m;
        if (mVar2 != null) {
            mVar2.i(i17);
        }
        y8Var.A0().putBoolean("hide_btn_bubble_guide", true);
        if (!y8Var.A0().i("show_guide", false) && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20059x5917b388()) == 1) {
            fl5.i C0 = y8Var.C0();
            if (C0 != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                    w07 = y8Var.w0();
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.ona;
                } else {
                    w07 = y8Var.w0();
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.onb;
                }
                C0.mo81584x764b0e09(w07.getString(i18));
            }
            y8Var.f281829q = y8Var.A0().o("show_count", 0);
            y8Var.f281829q++;
            y8Var.A0().A("show_count", y8Var.f281829q);
            if (y8Var.f281829q >= 3) {
                y8Var.A0().G("show_guide", true);
            }
        }
    }
}
