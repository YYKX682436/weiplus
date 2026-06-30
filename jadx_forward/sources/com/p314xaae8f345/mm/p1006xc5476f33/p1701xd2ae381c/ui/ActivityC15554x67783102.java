package com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity */
/* loaded from: classes8.dex */
public class ActivityC15554x67783102 extends com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 {
    public static android.graphics.Bitmap B;
    public boolean A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f218855x;

    /* renamed from: z, reason: collision with root package name */
    public z41.c f218857z;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f218852u = jz5.h.b(new w03.x(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f218853v = jz5.h.b(new w03.z(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f218854w = jz5.h.b(new w03.y(this));

    /* renamed from: y, reason: collision with root package name */
    public z41.a f218856y = z41.a.NONE;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950
    public boolean V6() {
        boolean h17 = ep1.m.h(((w03.u) pf5.z.f435481a.a(this).a(w03.u.class)).m158354x19263085().getIntent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "interceptEnterActivityStyle needEnterFloatBallAnimation " + h17);
        if (h17) {
            overridePendingTransition(-1, com.p314xaae8f345.mm.ui.uc.f292612b);
            return true;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f218854w).mo141623x754a37bb()).booleanValue()) {
            return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390;
        }
        overridePendingTransition(-1, -1);
        return true;
    }

    public final void a7(boolean z17) {
        super.finish();
        if (z17) {
            overridePendingTransition(-1, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(w03.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        w03.u uVar = (w03.u) a17;
        if (!uVar.f523446q && uVar.f523440h && uVar.f523441i && !kd2.p1.N.a().u()) {
            boolean z17 = this.f218855x;
            w03.u.S6(uVar, z17, z17, false, null, 12, null);
        } else {
            super.finish();
            if (((java.lang.Boolean) ((jz5.n) this.f218853v).mo141623x754a37bb()).booleanValue()) {
                overridePendingTransition(-1, -1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return getRequestedOrientation();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{w03.u.class, w03.n.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sb0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onCreate");
        pf5.z zVar = pf5.z.f435481a;
        ((w03.n) zVar.a(this).a(w03.n.class)).P6("PlayerDetailF", hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.l7(nyVar, 162, 6, null, 4, null);
        }
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f218852u).mo141623x754a37bb()).booleanValue();
        z41.a aVar = z41.a.LANDSCAPE;
        if (booleanValue) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(getIntent().getIntExtra("from_page_orientation", 1));
            if (getRequestedOrientation() != 0) {
                aVar = z41.a.PORTRAIT;
            }
        }
        this.f218856y = aVar;
        if (this.f218857z == null) {
            this.f218857z = new z41.c(this, new w03.w(this));
        }
        z41.c cVar = this.f218857z;
        if (cVar != null) {
            cVar.enable();
        }
        try {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (!(mo55332x76847179 instanceof android.app.Activity)) {
                mo55332x76847179 = null;
            }
            if (mo55332x76847179 != null && (window = mo55332x76847179.getWindow()) != null) {
                window.addFlags(128);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MegaVideoFlutterActivity", e17, "keepScreenOn", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = B;
        jz5.g gVar = this.f218853v;
        if (bitmap != null) {
            if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() && !bitmap.isRecycled()) {
                U6().setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
            }
            B = null;
        }
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            overridePendingTransition(-1, -1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        fc2.d a76 = nyVar2 != null ? nyVar2.a7(-1) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1 c1Var = a76 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c1) a76 : null;
        if (c1Var == null) {
            return;
        }
        c1Var.f206509z = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.view.Window window;
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onDestroy");
        try {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (!(mo55332x76847179 instanceof android.app.Activity)) {
                mo55332x76847179 = null;
            }
            if (mo55332x76847179 != null && (window = mo55332x76847179.getWindow()) != null) {
                window.clearFlags(128);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MegaVideoFlutterActivity", e17, "releaseScreenOn", new java.lang.Object[0]);
        }
        ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f81960o = null;
        z41.c cVar = this.f218857z;
        if (cVar != null) {
            cVar.disable();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onPause");
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onRestoreInstanceState");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onResume");
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoFlutterActivity", "onSaveInstanceState");
        this.A = true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).zj(this);
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).yj(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        this.f218855x = true;
        return super.mo48654xe4dc1f55();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950, pi0.w0
    public void u3(pi0.w0 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        super.u3(host);
        if (this.A) {
            return;
        }
        finish();
    }
}
