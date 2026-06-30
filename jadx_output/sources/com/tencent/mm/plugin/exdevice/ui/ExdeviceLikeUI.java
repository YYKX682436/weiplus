package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class ExdeviceLikeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f99283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f99284e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99285f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f99286g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.f3 f99287h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9w;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f99284e = getIntent().getStringExtra("app_username");
        java.lang.String stringExtra = getIntent().getStringExtra("key_rank_info");
        getIntent().getStringExtra("key_rank_semi");
        this.f99285f = getIntent().getBooleanExtra("key_is_like_read_only", false);
        java.util.ArrayList arrayList = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("rank_id");
            iz5.a.g(null, !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2));
            s32.e bj6 = com.tencent.mm.plugin.exdevice.model.l3.bj();
            bj6.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
            } else {
                java.lang.String format = java.lang.String.format("select *, rowid from %s where %s = ? order by %s desc", "HardDeviceLikeUser", "rankID", com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP);
                java.lang.String[] strArr = new java.lang.String[1];
                strArr[0] = stringExtra2 != null ? stringExtra2 : "";
                android.database.Cursor f17 = bj6.f402467d.f(format, strArr, 2);
                if (f17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
                } else {
                    if (f17.moveToFirst()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        do {
                            r32.e eVar = new r32.e();
                            eVar.convertFrom(f17);
                            arrayList2.add(eVar);
                        } while (f17.moveToNext());
                        arrayList = arrayList2;
                    }
                    f17.close();
                }
            }
            this.f99283d = arrayList;
        } else {
            java.lang.String str = this.f99284e;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceMsgXmlParser", "like info is null or nil");
            } else {
                ot0.q v17 = ot0.q.v(stringExtra);
                if (v17 != null) {
                    java.util.Map map = v17.f348642c;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (map != null && !map.isEmpty()) {
                        int i17 = 0;
                        while (true) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.likeuserlist.userinfo");
                            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                            sb6.append(".username");
                            java.lang.String str2 = (java.lang.String) map.get(sb6.toString());
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
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
                            eVar2.field_appusername = str;
                            eVar2.field_rankID = str3;
                            eVar2.field_username = str2;
                            eVar2.field_timestamp = com.tencent.mm.sdk.platformtools.t8.P(str5, 0);
                            eVar2.field_liketips = str4;
                            arrayList3.add(eVar2);
                            i17++;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceMsgXmlParser", "should break now : %d", java.lang.Integer.valueOf(i17));
                        arrayList = arrayList3;
                    }
                }
            }
            this.f99283d = arrayList;
        }
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f484247dj5);
        this.f99286g = listView;
        listView.setEmptyView(findViewById(com.tencent.mm.R.id.dez));
        com.tencent.mm.plugin.exdevice.ui.f3 f3Var = new com.tencent.mm.plugin.exdevice.ui.f3(this);
        this.f99287h = f3Var;
        this.f99286g.setAdapter((android.widget.ListAdapter) f3Var);
        if (!this.f99285f) {
            this.f99286g.setOnItemClickListener(new com.tencent.mm.plugin.exdevice.ui.c3(this));
        }
        this.f99286g.setOnItemClickListener(new com.tencent.mm.plugin.exdevice.ui.d3(this));
        setMMTitle(com.tencent.mm.R.string.c3q);
        if (!this.f99285f) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.c3o), new com.tencent.mm.plugin.exdevice.ui.a3(this));
        }
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.b3(this));
    }
}
