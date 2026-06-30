package rz3;

/* loaded from: classes15.dex */
public class d extends rz3.g implements rz3.e, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f483336g;

    /* renamed from: h, reason: collision with root package name */
    public final int f483337h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f483338i;

    /* renamed from: m, reason: collision with root package name */
    public e04.p f483339m;

    /* renamed from: n, reason: collision with root package name */
    public final rz3.c f483340n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s f483341o;

    public d(java.lang.String str, int i17, int i18, boolean z17, com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2, rz3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar) {
        this.f483337h = 0;
        this.f483336g = str;
        this.f483337h = i18;
        this.f483342d = abstractTextureViewSurfaceTextureListenerC25495xcec752e2;
        this.f483340n = cVar;
        this.f483344f = abstractTextureViewSurfaceTextureListenerC25495xcec752e2.getContext();
        this.f483341o = sVar;
        this.f483338i = z17;
        gm0.j1.d().a(971, this);
    }

    @Override // rz3.e
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeHandler", "notify Event: %d", java.lang.Integer.valueOf(i17));
        rz3.c cVar = this.f483340n;
        switch (i17) {
            case 1:
                this.f483342d.f();
                return;
            case 2:
                this.f483342d.f();
                return;
            case 3:
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) cVar).x();
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                this.f483342d.e();
                return;
            case 6:
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) cVar).t7(1, bundle);
                    return;
                }
                return;
            case 7:
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) cVar).t7(2, bundle);
                    return;
                }
                return;
            case 8:
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) cVar).t7(3, bundle);
                    return;
                }
                return;
            case 9:
                if (cVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) cVar).t7(4, bundle);
                    return;
                }
                return;
        }
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("result_content", "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = bundle.getString("result_code_name", "");
        int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(string2);
        int i17 = bundle.getInt("result_code_version", 0);
        int i18 = bundle.getInt("qbar_string_scan_source", 0);
        boolean z18 = bundle.getBoolean("key_disable_bar_code_jump_scan_goods", false);
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("key_scan_tab_bar_type_list");
        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab = (com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab) bundle.getParcelable("ScanIdentifyReportInfo.DecodeKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 c17258x2152d807 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807) bundle.getParcelable("result_normalize_rect");
        if (c25309x51dbc9ab != null && c17258x2152d807 != null) {
            c25309x51dbc9ab.b(c17258x2152d807, bundle.getInt("result_image_width"), bundle.getInt("result_image_height"));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeHandler", "handleResult content %s, codeType %d, codeName %s, codeVersion %d, disableJumpScanGoods: %s, codeRect: %s", str, java.lang.Integer.valueOf(a17), string2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18), c17258x2152d807);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5857xcc58f6a4 c5857xcc58f6a4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5857xcc58f6a4();
        am.yo yoVar = c5857xcc58f6a4.f136164g;
        yoVar.f90004b = string2;
        yoVar.f90005c = str;
        yoVar.f90003a = 1;
        c5857xcc58f6a4.e();
        c5857xcc58f6a4.f136165h.getClass();
        e04.p pVar = this.f483339m;
        if (pVar != null) {
            pVar.d();
        }
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(a17);
        java.lang.String str2 = this.f483336g;
        if (!b17) {
            new e04.f(str2, c25309x51dbc9ab).b((android.app.Activity) this.f483342d.getContext(), this, this.f483341o, str, i18 == 1, i17, string2, null, this.f483337h, false, -1, this.f483338i, z18, i18 == 1 ? 1 : 0, integerArrayList);
            return;
        }
        e04.p pVar2 = new e04.p(str2);
        this.f483339m = pVar2;
        pVar2.g((android.app.Activity) this.f483342d.getContext(), str, this.f483337h, i18, i18 == 0 ? 4 : 34, string2, a17, i17, this, this.f483341o, null, false, -1, this.f483338i, c25309x51dbc9ab, null);
    }

    @Override // rz3.a
    /* renamed from: destroy */
    public void mo9410x5cd39ffa() {
        gm0.j1.d().q(971, this);
        e04.p pVar = this.f483339m;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QRCodeHandler", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 != 2) {
                z17 = false;
            } else {
                android.content.Context context = this.f483344f;
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
            }
        } else if (gm0.j1.d().m()) {
            gm0.j1.d().l();
        } else if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(this.f483344f)) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l5.a(this.f483344f);
        } else {
            android.content.Context context2 = this.f483344f;
            dp.a.m125854x26a183b(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcf, 1, java.lang.Integer.valueOf(i18)), 1).show();
        }
        if (z17) {
            a(0, null);
            return;
        }
        if (i17 == 4 && i18 == -2004) {
            db5.e1.i(this.f483344f, com.p314xaae8f345.mm.R.C30867xcad56011.hpn, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 971) {
                a(3, null);
            }
        } else {
            java.lang.String G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(G)) {
                G = this.f483344f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.m125854x26a183b(this.f483344f, G, 0).show();
        }
    }
}
