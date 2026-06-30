package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC13588x8fdaaf43 extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f182134h;

    /* renamed from: g, reason: collision with root package name */
    public final o72.u2 f182133g = new o72.u2();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f182135i = null;

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 V6() {
        return null;
    }

    public void W6(dm.n3 n3Var, java.lang.Runnable runnable, int i17) {
        o72.t2 t2Var = new o72.t2(n3Var);
        t2Var.f425002g = getIntent().getIntExtra("key_detail_fav_is_search", 0);
        t2Var.f425003h = getIntent().getIntExtra("key_detail_fav_search_index", -1);
        t2Var.f425004i = getIntent().getIntExtra("key_detail_fav_ori_index", -1);
        t2Var.f425000e = getIntent().getIntExtra("key_detail_fav_general_msg_type", -1);
        o72.x1.l(n3Var, true, runnable, i17, t2Var);
    }

    public void X6(long j17, int i17, int i18) {
        int intExtra = getIntent().getIntExtra("key_detail_fav_index", 0);
        this.f182133g.f425010b = intExtra;
        o72.v2.e(j17, i17, i18, intExtra, getIntent().getIntExtra("key_detail_fav_is_search", 0), getIntent().getIntExtra("key_detail_fav_search_index", -1), getIntent().getIntExtra("key_detail_fav_ori_index", -1), getIntent().getIntExtra("key_detail_fav_general_msg_type", -1));
    }

    public void Y6(o72.r2 r2Var) {
        if (r2Var != null) {
            o72.u2 u2Var = this.f182133g;
            if (u2Var.f425009a > 0) {
                u2Var.f425011c = r2Var.f67643xc8a07680;
                u2Var.f425012d = r2Var.f67657x2262335f;
                u2Var.f425014f = r2Var.f67651x76e81a5a;
                long j17 = r2Var.f67649xde813d09 / 1000;
                u2Var.f425015g = j17;
                if (j17 == 0) {
                    u2Var.f425015g = r2Var.f67659xa783a79b / 1000;
                }
                if (u2Var.f425015g == 0) {
                    u2Var.f425015g = r2Var.f67638x7d4eb57c;
                }
                u2Var.f425013e = o72.x1.M(r2Var);
                this.f182134h = true;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && intent != null) {
            this.f182133g.f425017i += intent.getLongExtra("key_activity_browse_time", 0L);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_detail_fav_scene", 0);
        o72.u2 u2Var = this.f182133g;
        u2Var.f425009a = intExtra;
        u2Var.f425026r = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        u2Var.f425010b = getIntent().getIntExtra("key_detail_fav_index", 0);
        u2Var.f425029u = getIntent().getStringExtra("key_detail_fav_query");
        u2Var.f425027s = getIntent().getStringExtra("key_detail_fav_sessionid");
        u2Var.f425030v = getIntent().getStringExtra("key_detail_fav_tags");
        u2Var.f425031w = getIntent().getIntExtra("key_detail_fav_is_search", 0);
        u2Var.f425032x = getIntent().getIntExtra("key_detail_fav_search_index", -1);
        u2Var.f425033y = getIntent().getIntExtra("key_detail_fav_ori_index", -1);
        u2Var.f425034z = getIntent().getIntExtra("key_detail_fav_general_msg_type", -1);
        java.lang.String str = u2Var.f425029u;
        if (str == null) {
            str = "";
        }
        u2Var.f425029u = str;
        java.lang.String str2 = u2Var.f425027s;
        if (str2 == null) {
            str2 = "";
        }
        u2Var.f425027s = str2;
        java.lang.String str3 = u2Var.f425030v;
        u2Var.f425030v = str3 != null ? str3 : "";
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 V6 = V6();
        if (V6 != null) {
            V6.m81365x49cdb44e(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a(this));
            if (V6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13617x6fbceb5e) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13617x6fbceb5e) V6).m55386x945a8432(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b(this));
            }
        }
        if (u2Var.f425009a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.BaseFavDetailReportUI", "report object scene is 0");
        }
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f182134h) {
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.c(this), "BaseFavReport");
        }
        setResult(-1, getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2()));
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a = new jt0.i(20, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.class);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        long mo78509x4b0ac5a2 = mo78509x4b0ac5a2();
        o72.u2 u2Var = this.f182133g;
        u2Var.f425016h = mo78509x4b0ac5a2;
        java.lang.String str = com.p314xaae8f345.mm.p959x883644fd.n.a().f153068b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(getClass().getName(), str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, this.f182135i)) {
            long j17 = u2Var.f425017i;
            com.p314xaae8f345.mm.p959x883644fd.n a17 = com.p314xaae8f345.mm.p959x883644fd.n.a();
            java.lang.String str2 = com.p314xaae8f345.mm.p959x883644fd.n.a().f153068b;
            kk.j jVar = a17.f153067a;
            u2Var.f425017i = j17 + (jVar != null ? ((java.lang.Long) ((lt0.f) jVar).get(str2)).longValue() : 0L);
        }
        long j18 = u2Var.f425016h;
        long j19 = u2Var.f425017i;
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182135i)) {
            this.f182135i = com.p314xaae8f345.mm.p959x883644fd.n.a().f153068b;
        }
    }
}
