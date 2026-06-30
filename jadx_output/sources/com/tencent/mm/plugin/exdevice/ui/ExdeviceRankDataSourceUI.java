package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public class ExdeviceRankDataSourceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f99329f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f99330d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.q5 f99331e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a_a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f99330d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.a_c, null);
        android.view.View inflate2 = android.view.View.inflate(this, com.tencent.mm.R.layout.a_b, null);
        this.f99330d.addHeaderView(inflate, null, false);
        this.f99330d.addFooterView(inflate2, null, false);
        com.tencent.mm.plugin.exdevice.ui.q5 q5Var = new com.tencent.mm.plugin.exdevice.ui.q5();
        this.f99331e = q5Var;
        this.f99330d.setAdapter((android.widget.ListAdapter) q5Var);
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcq)).scrollTo(0, 0);
        inflate2.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.m5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.exdevice.ui.o5 o5Var;
        if (i17 == 1 && i18 == -1 && intent != null) {
            long longExtra = intent.getLongExtra("device_mac", 0L);
            intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, 0);
            if (longExtra == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, mac is nil.");
                return;
            }
            java.lang.String f17 = a42.i.f(longExtra);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "invalid mac(%s).", f17);
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.q5 q5Var = this.f99331e;
            synchronized (q5Var) {
                o5Var = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                    for (com.tencent.mm.plugin.exdevice.ui.o5 o5Var2 : q5Var.f99631d) {
                        o5Var2.getClass();
                        if (f17.equals(null)) {
                            break;
                        }
                    }
                }
                o5Var2 = null;
            }
            if (o5Var2 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
                return;
            }
            v32.b W0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().W0(longExtra);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExdeviceRankDataSourceUI", "hard device info is null.(mac : %s)", java.lang.Long.valueOf(longExtra));
                return;
            }
            com.tencent.mm.plugin.exdevice.ui.q5 q5Var2 = this.f99331e;
            java.lang.String str = W0.field_deviceID;
            java.lang.String str2 = W0.field_deviceType;
            synchronized (q5Var2) {
                java.util.Iterator it = q5Var2.f99631d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.exdevice.ui.o5 o5Var3 = (com.tencent.mm.plugin.exdevice.ui.o5) it.next();
                    if (o5Var3 != null) {
                        r45.rw6 rw6Var = o5Var3.f99607a;
                        if ((rw6Var == null || str == null || str2 == null || !str.equals(rw6Var.f385247d) || !str2.equals(rw6Var.f385248e)) ? false : true) {
                            o5Var = o5Var3;
                            break;
                        }
                    }
                }
            }
            if (o5Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
            } else {
                gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.m1.CTRL_INDEX, this);
                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.i2());
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.l5(this));
        setMMTitle(com.tencent.mm.R.string.bgi);
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.pay.m1.CTRL_INDEX, this);
        initView();
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.i2());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.m1.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, scene is null.");
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.i2) {
            gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.pay.m1.CTRL_INDEX, this);
            if (i17 == 0 && i18 == 0) {
                r45.ko3 ko3Var = (r45.ko3) ((com.tencent.mm.plugin.exdevice.model.i2) m1Var).f98921e.f70711b.f70700a;
                java.util.LinkedList linkedList = ko3Var.f378876d;
                if (linkedList != null) {
                    linkedList.size();
                }
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.n5(this, ko3Var.f378876d));
            }
        }
    }
}
