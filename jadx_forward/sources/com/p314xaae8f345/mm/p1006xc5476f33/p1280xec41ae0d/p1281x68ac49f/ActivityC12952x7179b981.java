package com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f;

/* renamed from: com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity */
/* loaded from: classes12.dex */
public class ActivityC12952x7179b981 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f175360m = 0;

    /* renamed from: d, reason: collision with root package name */
    public zp1.e f175361d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.p1282x5a3d7de.C12953xede67e98 f175362e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f175363f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.CheckBox f175364g;

    /* renamed from: h, reason: collision with root package name */
    public vh.f f175365h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175366i;

    public final void T6() {
        if (this.f175363f.isChecked()) {
            this.f175361d.f518363f = new zp1.C30848x2ca3e3();
        } else if (this.f175364g.isChecked()) {
            this.f175361d.f518363f = new zp1.C30849x2ca3e4();
        } else {
            this.f175361d.f518363f = null;
        }
        zp1.e eVar = this.f175361d;
        eVar.f518361d = 0;
        eVar.f518360c.post(new vh.w(eVar));
        this.f175361d.b();
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
            zp1.e r0 = r13.f175361d
            vh.f r14 = r0.a(r14)
            if (r14 == 0) goto Lf8
            vh.f r0 = r13.f175365h
            if (r0 == 0) goto Le
            if (r0 == r14) goto Lf8
        Le:
            r13.f175365h = r14
            r0 = 2131309972(0x7f093594, float:1.8238243E38)
            android.view.View r0 = r13.findViewById(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f554818a
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
            java.lang.String r14 = r14.f518319d
            r0.setText(r14)
            zp1.e r14 = r13.f175361d
            android.content.Context r0 = r13.getApplicationContext()
            r14.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.Class<com.tencent.matrix.batterycanary.stats.k> r1 = com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class
            rh.e3 r1 = ph.a.a(r1)
            com.tencent.matrix.batterycanary.stats.k r1 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) r1
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto Ldd
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r1.next()
            com.tencent.matrix.batterycanary.stats.BatteryRecord r5 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e) r5
            boolean r6 = r5 instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord
            if (r6 == 0) goto L90
            r6 = r5
            com.tencent.matrix.batterycanary.stats.BatteryRecord$EventStatRecord r6 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord) r6
            java.lang.String r7 = r6.f134137g
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
            long r11 = r5.f134133e
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
            com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart r0 = r13.f175362e
            r0.m54223x76491f2c(r14)
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.U6(int):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569459br;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = (java.lang.String) uh.c.f509201a.b();
        mo54450xbf7c1df6("电量统计报告");
        m78548x39037dd1();
        m78494xd9193382(1, ":" + str, new zp1.MenuItemOnMenuItemClickListenerC30845x2ca3e0(this), null, com.p314xaae8f345.mm.ui.fb.NORMAL);
        this.f175362e = (com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.p1282x5a3d7de.C12953xede67e98) findViewById(com.p314xaae8f345.mm.R.id.bfl);
        this.f175363f = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.bdk);
        this.f175364g = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.bdl);
        this.f175363f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: zp1.a$$b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.this;
                if (!z17) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
                } else if (activityC12952x7179b981.f175364g.isChecked()) {
                    activityC12952x7179b981.f175364g.setChecked(false);
                }
                activityC12952x7179b981.T6();
            }
        });
        this.f175364g.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: zp1.a$$c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981 activityC12952x7179b981 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.this;
                if (!z17) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
                } else if (activityC12952x7179b981.f175363f.isChecked()) {
                    activityC12952x7179b981.f175363f.setChecked(false);
                }
                activityC12952x7179b981.T6();
            }
        });
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.m8r);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        zp1.d dVar = new zp1.d();
        c1163xf1deaba4.mo7960x6cab2c8d(dVar);
        dVar.mo8163xed962dec(new zp1.b(this, c1162x665295de));
        this.f175361d = new zp1.e(dVar);
        c1163xf1deaba4.i(new zp1.c(this, c1162x665295de));
        zp1.e eVar = this.f175361d;
        eVar.f518362e = str;
        eVar.f518361d = 0;
        eVar.f518360c.post(new vh.w(eVar));
        this.f175361d.b();
    }
}
