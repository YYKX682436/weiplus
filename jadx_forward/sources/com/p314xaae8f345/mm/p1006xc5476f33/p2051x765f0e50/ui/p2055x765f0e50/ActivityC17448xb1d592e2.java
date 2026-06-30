package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI */
/* loaded from: classes12.dex */
public class ActivityC17448xb1d592e2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f242119f = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242120d;

    /* renamed from: e, reason: collision with root package name */
    public long f242121e;

    public final void V6() {
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.a0 Ai = com.p314xaae8f345.mm.p959x883644fd.t0.Ai();
        int i17 = (int) (this.f242121e / 86400000);
        Ai.f153024f.a(true);
        com.p314xaae8f345.mm.p959x883644fd.s sVar = null;
        android.database.Cursor f17 = Ai.f153022d.f("SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + i17 + "", null, 2);
        if (f17.moveToFirst()) {
            sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
            sVar.a(f17);
        }
        f17.close();
        if (sVar == null) {
            sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
        }
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        this.f242121e = com.p314xaae8f345.mm.p959x883644fd.t0.Ai().s0();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_info").L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.izy, android.text.format.DateFormat.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl, ""), this.f242121e).toString()));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_mobile");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", java.lang.Long.valueOf(sVar.f153109x), java.lang.Long.valueOf(sVar.f153097l));
        h17.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.izx, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(sVar.f153109x + sVar.f153097l)));
        h17.E(8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_wifi");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", java.lang.Long.valueOf(sVar.f153110y), java.lang.Long.valueOf(sVar.f153098m));
        h18.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.izx, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(sVar.f153110y + sVar.f153098m)));
        h18.E(8);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17374x19c0e52c) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_mobile_detail")).L = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17374x19c0e52c) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_wifi_detail")).L = true;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: autoRefresh */
    public boolean mo48678xedc85a2c() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576477cc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574627j00);
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        com.p314xaae8f345.mm.p959x883644fd.a0 Ai = com.p314xaae8f345.mm.p959x883644fd.t0.Ai();
        Ai.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int currentTimeMillis = (int) (((java.lang.System.currentTimeMillis() / 86400000) * 86400000) / 86400000);
        if (Ai.n0(currentTimeMillis) == null) {
            com.p314xaae8f345.mm.p959x883644fd.s sVar = new com.p314xaae8f345.mm.p959x883644fd.s();
            sVar.f153088c = currentTimeMillis;
            sVar.f153087b = -1;
            Ai.u0(sVar);
        }
        this.f242120d = m79336x8b97809d();
        ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
        this.f242121e = com.p314xaae8f345.mm.p959x883644fd.t0.Ai().s0();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242120d).h("settings_netstat_info");
        java.lang.String format = new java.text.SimpleDateFormat(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), java.util.Locale.US).format(new java.util.Date(this.f242121e));
        h17.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.izy, format));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNetStatUI", "title datatime = " + format);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dj(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574628j01), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ej(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
    }
}
