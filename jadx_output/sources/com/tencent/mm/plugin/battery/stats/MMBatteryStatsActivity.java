package com.tencent.mm.plugin.battery.stats;

/* loaded from: classes12.dex */
public class MMBatteryStatsActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f93827m = 0;

    /* renamed from: d, reason: collision with root package name */
    public zp1.e f93828d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart f93829e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f93830f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckBox f93831g;

    /* renamed from: h, reason: collision with root package name */
    public vh.f f93832h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93833i;

    public final void T6() {
        if (this.f93830f.isChecked()) {
            this.f93828d.f436830f = new zp1.a$$d();
        } else if (this.f93831g.isChecked()) {
            this.f93828d.f436830f = new zp1.a$$e();
        } else {
            this.f93828d.f436830f = null;
        }
        zp1.e eVar = this.f93828d;
        eVar.f436828d = 0;
        eVar.f436827c.post(new vh.w(eVar));
        this.f93828d.b();
        U6(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r14.isEmpty() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(int r14) {
        /*
            r13 = this;
            zp1.e r0 = r13.f93828d
            vh.f r14 = r0.a(r14)
            if (r14 == 0) goto Lf8
            vh.f r0 = r13.f93832h
            if (r0 == 0) goto Le
            if (r0 == r14) goto Lf8
        Le:
            r13.f93832h = r14
            r0 = 2131309972(0x7f093594, float:1.8238243E38)
            android.view.View r0 = r13.findViewById(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            r10 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r9.add(r1)
            java.util.Collections.reverse(r9)
            java.lang.Object[] r2 = r9.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity"
            java.lang.String r4 = "updateHeader"
            java.lang.String r5 = "(I)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.get(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity"
            java.lang.String r3 = "updateHeader"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2131323769(0x7f096b79, float:1.8266227E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r14 = r14.f436786d
            r0.setText(r14)
            zp1.e r14 = r13.f93828d
            android.content.Context r0 = r13.getApplicationContext()
            r14.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Class<com.tencent.matrix.batterycanary.stats.k> r1 = com.tencent.matrix.batterycanary.stats.k.class
            rh.e3 r1 = ph.a.a(r1)
            com.tencent.matrix.batterycanary.stats.k r1 = (com.tencent.matrix.batterycanary.stats.k) r1
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto Ldd
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r1.next()
            com.tencent.matrix.batterycanary.stats.BatteryRecord r5 = (com.tencent.matrix.batterycanary.stats.BatteryRecord) r5
            boolean r6 = r5 instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord
            if (r6 == 0) goto L90
            r6 = r5
            com.tencent.matrix.batterycanary.stats.BatteryRecord$EventStatRecord r6 = (com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) r6
            java.lang.String r7 = r6.f52604g
            java.lang.String r8 = "BATTERY_STAT"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L90
            java.lang.String r7 = "battery-change"
            boolean r7 = r6.b(r7, r10)
            if (r7 == 0) goto L90
            java.lang.String r7 = "battery-pct"
            r8 = -1
            long r6 = r6.c(r7, r8)
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L90
            m3.d r8 = new m3.d
            float r6 = (float) r6
            float r6 = r6 * r4
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            long r11 = r5.f52600e
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r8.<init>(r6, r5)
            r14.add(r8)
            goto L90
        Ld6:
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Ldd
            goto Lf3
        Ldd:
            m3.d r1 = new m3.d
            int r0 = wh.m.i(r0)
            float r0 = (float) r0
            float r0 = r0 * r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.<init>(r0, r2)
            r14.add(r1)
        Lf3:
            com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart r0 = r13.f93829e
            r0.setData(r14)
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.U6(int):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487926br;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) uh.c.f427668a.b();
        setMMTitle("电量统计报告");
        removeAllOptionMenu();
        addTextOptionMenu(1, ":" + str, new zp1.a$$a(this), null, com.tencent.mm.ui.fb.NORMAL);
        this.f93829e = (com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart) findViewById(com.tencent.mm.R.id.bfl);
        this.f93830f = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.bdk);
        this.f93831g = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.bdl);
        this.f93830f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: zp1.a$$b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.this;
                if (!z17) {
                    int i17 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
                } else if (mMBatteryStatsActivity.f93831g.isChecked()) {
                    mMBatteryStatsActivity.f93831g.setChecked(false);
                }
                mMBatteryStatsActivity.T6();
            }
        });
        this.f93831g.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: zp1.a$$c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity mMBatteryStatsActivity = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.this;
                if (!z17) {
                    int i17 = com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity.f93827m;
                } else if (mMBatteryStatsActivity.f93830f.isChecked()) {
                    mMBatteryStatsActivity.f93830f.setChecked(false);
                }
                mMBatteryStatsActivity.T6();
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.m8r);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        zp1.d dVar = new zp1.d();
        recyclerView.setAdapter(dVar);
        dVar.registerAdapterDataObserver(new zp1.b(this, linearLayoutManager));
        this.f93828d = new zp1.e(dVar);
        recyclerView.i(new zp1.c(this, linearLayoutManager));
        zp1.e eVar = this.f93828d;
        eVar.f436829e = str;
        eVar.f436828d = 0;
        eVar.f436827c.post(new vh.w(eVar));
        this.f93828d.b();
    }
}
