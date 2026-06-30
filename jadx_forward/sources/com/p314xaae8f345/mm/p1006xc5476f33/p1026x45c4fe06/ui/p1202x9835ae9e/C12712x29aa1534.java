package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionFolderActivityContext;", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/FolderActivityContextWithLifecycle;", "Ll75/q0;", "Lcom/tencent/mm/ui/MMActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Lcom/tencent/mm/ui/MMActivity;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.CollectionFolderActivityContext */
/* loaded from: classes7.dex */
public final class C12712x29aa1534 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12712x29aa1534(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f171185d = "CollectionFolderActivityContext";
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        java.lang.String str;
        android.content.Intent intent;
        android.content.Intent intent2;
        if (a().isFinishing()) {
            return;
        }
        if ((z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732.class : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd.class).isInstance(a().mo7595x9cdc264().m7664x6f4c869b(android.R.id.content))) {
            return;
        }
        a().m78548x39037dd1();
        if (z17) {
            a().m78599xdf056fb4();
        } else {
            a().mo78530x8b45058f();
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = a().mo7595x9cdc264().m7630xb2c12e75();
        if (z17) {
            componentCallbacksC1101xa17d4670 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732();
        } else {
            java.lang.String string = a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571796q0);
            java.lang.String string2 = a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571616kf);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd c12643xc46c9cdd = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12643xc46c9cdd();
            android.os.Bundle bundle = new android.os.Bundle(2);
            bundle.putString("extra_title", string);
            bundle.putString("extra_tip", string2);
            c12643xc46c9cdd.mo7562xe26dab14(bundle);
            componentCallbacksC1101xa17d4670 = c12643xc46c9cdd;
        }
        m7630xb2c12e75.k(android.R.id.content, componentCallbacksC1101xa17d4670, null);
        m7630xb2c12e75.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = a();
        if (a17 == null || (intent2 = a17.getIntent()) == null || (str = intent2.getStringExtra("extra_enter_scene_note")) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a18 = a();
        java.lang.String str2 = this.f171185d;
        if (a18 != null && (intent = a18.getIntent()) != null) {
            int intExtra = intent.getIntExtra("extra_enter_scene", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "EnterScene = " + intExtra);
            if (intExtra == 1 || intExtra == 3 || intExtra == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.h(intExtra, str);
            }
        }
        if (z17) {
            z5Var.mo49775xc84af884(this);
        } else {
            z5Var.add(str2 + ".WORKER", this);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 a19 = h0Var.a();
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 enumC3941xa739ed99 = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170358p;
            a19.P(enumC3941xa739ed99, x6Var);
            h0Var.a().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f, x6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932
    public void b(android.content.Intent intent) {
        android.view.View findViewById = a().findViewById(android.R.id.content);
        if (findViewById != null) {
            findViewById.setBackgroundColor(-855310);
        }
        H3(true);
        if (intent != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t5.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v5.f158133a, intent.getIntExtra("extra_get_usage_reason", 7), intent.getIntExtra("extra_get_usage_prescene", 0), null, 4, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932
    /* renamed from: onActivityDidResume */
    public void mo52972xf541971e() {
        a().mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571796q0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1203xac1f0fa0.AbstractC12715x4f1a932
    /* renamed from: onActivityWillDestroy */
    public void mo52973xfd8954da() {
        super.mo52973xfd8954da();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).mo49775xc84af884(this);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).mo49831x7444f759() > 0) {
            a().runOnUiThread(new xj1.y(this));
        }
    }
}
