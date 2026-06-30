package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/webwx/ui/LoginDeviceListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lc01/y8;", "Lcom/tencent/mm/plugin/webwx/ui/r;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI */
/* loaded from: classes11.dex */
public class ActivityC19504xce272b91 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, c01.y8, com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.r {

    /* renamed from: d, reason: collision with root package name */
    public boolean f269515d;

    /* renamed from: e, reason: collision with root package name */
    public int f269516e;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f269518g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.C19505xe7fe3479 f269520i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f269521m;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f269517f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.n(this));

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f269519h = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$iUpdateExtDeviceListener$1] */
    public ActivityC19504xce272b91() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f269520i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6191x1700be4c>(a0Var) { // from class: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$iUpdateExtDeviceListener$1
            {
                this.f39173x3fe91575 = 190808156;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6191x1700be4c c6191x1700be4c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6191x1700be4c event = c6191x1700be4c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginDeviceListUI", "UpdateExtDeviceEvent");
                com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91 activityC19504xce272b91 = com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91.this;
                activityC19504xce272b91.f269519h.clear();
                activityC19504xce272b91.f269519h.addAll(ug3.i.K());
                activityC19504xce272b91.m74950xced61ae5();
                return false;
            }
        };
        this.f269521m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67>(a0Var) { // from class: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$statusNotifyFunctionListener$1
            {
                this.f39173x3fe91575 = 1510396759;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 c6130x1c2ecb67) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6130x1c2ecb67 event = c6130x1c2ecb67;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f136402g.f90145a != 8) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91.this.finish();
                return false;
            }
        };
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 T6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f269517f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    @Override // c01.y8
    public void a0() {
        if (!c01.d9.b().F()) {
            finish();
        } else if (ug3.i.L()) {
            m74950xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bsy;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef == null) {
            return null;
        }
        java.util.Set W0 = kz5.n0.W0(mo43419xa59964ef);
        W0.add(my4.g.class);
        return W0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ghx);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.o(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        mo78530x8b45058f();
        java.util.ArrayList arrayList = this.f269519h;
        arrayList.addAll(ug3.i.K());
        T6().mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.m(arrayList, arrayList.size() == 1 ? 0 : -1, this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo55332x76847179());
        c22847x422a813d.Q(1);
        T6().mo7967x900dcbe1(c22847x422a813d);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MULTI_DEVICE_NEW_EDUCATION_SHOWN_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            return;
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mz9)).setVisibility(0);
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
    }

    /* renamed from: notifyDataSetChanged */
    public void m74950xced61ae5() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = T6().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f269516e = getIntent().getIntExtra("intent.key.online_version", 0);
        }
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        c01.d9.e().a(281, this);
        c01.d9.e().a(gd1.w.f69815x366c91de, this);
        c01.d9.e().a(uc1.x1.f76938x366c91de, this);
        mo48813x58998cd();
        c01.d9.b().a(this);
        this.f269521m.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        c01.d9.e().q(281, this);
        c01.d9.e().q(gd1.w.f69815x366c91de, this);
        c01.d9.e().q(uc1.x1.f76938x366c91de, this);
        c01.d9.b().G(this);
        mo48814x2efc64();
        this.f269521m.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f269515d && gm0.j1.a()) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 27;
            p53Var.f464295e = c01.z1.K() ? 1 : 2;
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(23, p53Var));
            this.f269515d = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        android.app.ProgressDialog progressDialog = this.f269518g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f269518g = null;
        if (scene.mo808xfb85f7b0() == 281) {
            if (i17 != 0 || i18 != 0) {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.l7y, 1).show();
            }
            finish();
            return;
        }
        if (scene.mo808xfb85f7b0() == 526) {
            java.util.ArrayList arrayList = this.f269519h;
            arrayList.clear();
            arrayList.addAll(ug3.i.K());
            m74950xced61ae5();
        }
    }
}
