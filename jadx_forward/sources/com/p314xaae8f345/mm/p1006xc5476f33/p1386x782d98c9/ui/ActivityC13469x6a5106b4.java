package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI */
/* loaded from: classes12.dex */
public class ActivityC13469x6a5106b4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f180816d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180817e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180818f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f180819g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f3 f180820h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a9w;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f180817e = getIntent().getStringExtra("app_username");
        java.lang.String stringExtra = getIntent().getStringExtra("key_rank_info");
        getIntent().getStringExtra("key_rank_semi");
        this.f180818f = getIntent().getBooleanExtra("key_is_like_read_only", false);
        java.util.ArrayList arrayList = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("rank_id");
            iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2));
            s32.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.bj();
            bj6.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
            } else {
                java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? order by %s desc", "HardDeviceLikeUser", "rankID", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6);
                java.lang.String[] strArr = new java.lang.String[1];
                strArr[0] = stringExtra2 != null ? stringExtra2 : "";
                android.database.Cursor f17 = bj6.f484000d.f(format, strArr, 2);
                if (f17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
                } else {
                    if (f17.moveToFirst()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        do {
                            r32.e eVar = new r32.e();
                            eVar.mo9015xbf5d97fd(f17);
                            arrayList2.add(eVar);
                        } while (f17.moveToNext());
                        arrayList = arrayList2;
                    }
                    f17.close();
                }
            }
            this.f180816d = arrayList;
        } else {
            java.lang.String str = this.f180817e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdeviceMsgXmlParser", "like info is null or nil");
            } else {
                ot0.q v17 = ot0.q.v(stringExtra);
                if (v17 != null) {
                    java.util.Map map = v17.f430175c;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (map != null && !map.isEmpty()) {
                        int i17 = 0;
                        while (true) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                            sb6.append(".username");
                            java.lang.String str2 = (java.lang.String) map.get(sb6.toString());
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                break;
                            }
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                            sb7.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                            sb7.append(".rankid");
                            java.lang.String str3 = (java.lang.String) map.get(sb7.toString());
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                            sb8.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                            sb8.append(".liketip");
                            java.lang.String str4 = (java.lang.String) map.get(sb8.toString());
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                            sb9.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                            sb9.append(".timestamp");
                            java.lang.String str5 = (java.lang.String) map.get(sb9.toString());
                            r32.e eVar2 = new r32.e();
                            eVar2.f66780x84a2aa32 = str;
                            eVar2.f66782xde6292c = str3;
                            eVar2.f66784xdec927b = str2;
                            eVar2.f66783x9de75411 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str5, 0);
                            eVar2.f66781x5f8c68f4 = str4;
                            arrayList3.add(eVar2);
                            i17++;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", java.lang.Integer.valueOf(i17));
                        arrayList = arrayList3;
                    }
                }
            }
            this.f180816d = arrayList;
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565780dj5);
        this.f180819g = listView;
        listView.setEmptyView(findViewById(com.p314xaae8f345.mm.R.id.dez));
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f3 f3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.f3(this);
        this.f180820h = f3Var;
        this.f180819g.setAdapter((android.widget.ListAdapter) f3Var);
        if (!this.f180818f) {
            this.f180819g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c3(this));
        }
        this.f180819g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.d3(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c3q);
        if (!this.f180818f) {
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c3o), new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a3(this));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b3(this));
    }
}
