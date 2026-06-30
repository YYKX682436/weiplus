package com.p314xaae8f345.mm.p965xc41bc71e.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/msgsubscription/ui/SubscribeMsgRequestProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* renamed from: com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI */
/* loaded from: classes9.dex */
public final class ActivityC11168xbe8821ca extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f153407u = 0;

    /* renamed from: d, reason: collision with root package name */
    public fl1.c0 f153408d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f153409e;

    /* renamed from: f, reason: collision with root package name */
    public h31.r f153410f;

    /* renamed from: g, reason: collision with root package name */
    public int f153411g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f153412h = jz5.h.b(new m31.x1(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f153413i = jz5.h.b(new m31.s1(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f153414m = jz5.h.b(new m31.r1(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f153415n = jz5.h.b(new m31.q1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f153416o = jz5.h.b(new m31.a2(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f153417p = jz5.h.b(new m31.z1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f153418q = jz5.h.b(new m31.t1(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f153419r = jz5.h.b(new m31.w1(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f153420s = jz5.h.b(new m31.u1(this));

    /* renamed from: t, reason: collision with root package name */
    public final m31.y1 f153421t = new m31.y1(this);

    public static void T6(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11168xbe8821ca activityC11168xbe8821ca, int i17, java.lang.String str, boolean z17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            bundle = null;
        }
        ((java.lang.Boolean) ((jz5.n) activityC11168xbe8821ca.f153419r).mo141623x754a37bb()).booleanValue();
        if (!((java.lang.Boolean) ((jz5.n) activityC11168xbe8821ca.f153419r).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC11168xbe8821ca.f153409e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (z17) {
                activityC11168xbe8821ca.m78513xc2a54588().postDelayed(new m31.v1(activityC11168xbe8821ca), 300L);
                return;
            } else {
                activityC11168xbe8821ca.finish();
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", i17);
        intent.putExtra("key_result_err_msg", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activityC11168xbe8821ca.setResult(-1, intent);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = activityC11168xbe8821ca.f153409e;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        if (z17) {
            activityC11168xbe8821ca.m78513xc2a54588().postDelayed(new m31.v1(activityC11168xbe8821ca), 300L);
        } else {
            activityC11168xbe8821ca.finish();
        }
    }

    public final int U6() {
        return ((java.lang.Number) ((jz5.n) this.f153415n).mo141623x754a37bb()).intValue();
    }

    public final java.lang.String V6() {
        return (java.lang.String) ((jz5.n) this.f153413i).mo141623x754a37bb();
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f153412h).mo141623x754a37bb()).intValue();
    }

    public final void X6(boolean z17) {
        T6(this, 10005, "user cancel", z17, null, 8, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        int i17 = this.f153411g;
        h31.s sVar = h31.s.f359979a;
        if (i17 == 3 || i17 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f153409e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            h31.s.f359979a.a(this.f153410f);
            X6(false);
            return;
        }
        if (!(i17 == 2)) {
            h31.s.f359979a.a(this.f153410f);
            X6(false);
            return;
        }
        fl1.c0 c0Var = this.f153408d;
        if (c0Var != null && c0Var.e()) {
            return;
        }
        h31.s.f359979a.a(this.f153410f);
        X6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        h31.r rVar;
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f153409e = db5.e1.Q(this, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), false, false, null);
        int W6 = W6();
        jz5.g gVar = this.f153420s;
        jz5.g gVar2 = this.f153414m;
        if (W6 == 1) {
            rVar = new h31.r(new java.lang.ref.WeakReference(mo55332x76847179()), U6(), V6(), (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb(), (java.lang.String) ((jz5.n) this.f153417p).mo141623x754a37bb(), (java.lang.String) ((jz5.n) this.f153418q).mo141623x754a37bb(), (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb(), this.f153421t);
        } else if (W6() == 2) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(mo55332x76847179());
            int U6 = U6();
            java.lang.String bizAppId = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f153416o).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            java.lang.String extInfo = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
            m31.y1 y1Var = this.f153421t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizAppId, "bizAppId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
            rVar = new h31.r(weakReference, U6, "", bizAppId, "", "", extInfo, y1Var);
            java.util.ArrayList arrayList = rVar.f359969j;
            arrayList.clear();
            arrayList.addAll((java.util.ArrayList) mo141623x754a37bb);
            arrayList.size();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgRequestProxyUI", "requestSubscribeMessage scene invalid: " + W6());
            rVar = null;
        }
        this.f153410f = rVar;
        if (rVar != null) {
            rVar.f359977r = W6();
            int U62 = U6();
            h31.s sVar = h31.s.f359979a;
            if (U62 == 3 || U62 == 1) {
                rVar.c();
            } else {
                if (U6() == 2) {
                    rVar.c();
                }
            }
        }
        this.f153411g = U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f153409e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h31.r rVar = this.f153410f;
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "release");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = rVar.f359970k;
            if (j0Var != null) {
                j0Var.dismiss();
            }
            m31.p1 p1Var = rVar.f359971l;
            if (p1Var != null) {
                p1Var.dismiss();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
    }
}
