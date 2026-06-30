package yx;

/* loaded from: classes5.dex */
public final class d implements com.p314xaae8f345.mm.p2470x93e71c27.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed f548542a;

    public d(com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed) {
        this.f548542a = activityC10499xbd0fa9ed;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void a() {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548542a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "onEndRecord");
        ay.l lVar = activityC10499xbd0fa9ed.f146813f;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
            throw null;
        }
        lVar.P6(false);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.j();
        }
        a31.m mVar2 = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar2 != null) {
            mVar2.f82506g = 4;
        }
        if (activityC10499xbd0fa9ed.f146817m != 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC10499xbd0fa9ed.f146814g;
            int abs = java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(c22621x7603e017 != null ? c22621x7603e017.getText() : null)).toString().length() - activityC10499xbd0fa9ed.f146818n);
            xx.y yVar = activityC10499xbd0fa9ed.f146816i;
            yVar.g(abs);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC10499xbd0fa9ed.f146814g;
            yVar.h(java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(c22621x7603e0172 != null ? c22621x7603e0172.getText() : null)).toString().length() - activityC10499xbd0fa9ed.f146818n), xx.d.f539314f);
        }
        activityC10499xbd0fa9ed.f146817m = 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548542a.f146811d, "autoSend");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void c(int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548542a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "setStopType: " + i17);
        ay.l lVar = activityC10499xbd0fa9ed.f146813f;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
            throw null;
        }
        lVar.P6(true);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548542a.f146811d, "hideGuide");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void e(int i17) {
        z21.w wVar;
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548542a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "setStopType: " + i17);
        activityC10499xbd0fa9ed.f146817m = i17;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null && (wVar = mVar.f82518s) != null) {
            wVar.e(i17);
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC10499xbd0fa9ed.f146814g;
            int abs = java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(c22621x7603e017 != null ? c22621x7603e017.getText() : null)).toString().length() - activityC10499xbd0fa9ed.f146818n);
            xx.y yVar = activityC10499xbd0fa9ed.f146816i;
            yVar.g(abs);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC10499xbd0fa9ed.f146814g;
            yVar.h(java.lang.Math.abs(r26.n0.u0(java.lang.String.valueOf(c22621x7603e0172 != null ? c22621x7603e0172.getText() : null)).toString().length() - activityC10499xbd0fa9ed.f146818n), xx.d.f539313e);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f548542a.f146811d, "clearHint");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void g(int i17) {
        com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui.ActivityC10499xbd0fa9ed activityC10499xbd0fa9ed = this.f548542a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC10499xbd0fa9ed.f146811d, "onStartRecord");
        ay.l lVar = activityC10499xbd0fa9ed.f146813f;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewModel");
            throw null;
        }
        lVar.P6(true);
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.i(i17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC10499xbd0fa9ed.f146814g;
        activityC10499xbd0fa9ed.f146818n = r26.n0.u0(java.lang.String.valueOf(c22621x7603e017 != null ? c22621x7603e017.getText() : null)).toString().length();
        xx.y yVar = activityC10499xbd0fa9ed.f146816i;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotBrandDataReporter", "reportGreenMicStart");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(yVar.f539368h);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        yVar.f539374n = sb6.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_green_mic_start", yVar.a(yVar.f539370j, new xx.s(yVar)), 36708);
    }
}
