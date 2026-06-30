package sy;

@j95.b
/* loaded from: classes5.dex */
public class b0 extends i95.w implements vg3.g4, com.p314xaae8f345.mm.app.t2, xg3.h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f495314f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f495315d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f495316e = true;

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.lang.String str;
        if (this.f495315d) {
            if (l0Var == null || (str = l0Var.f535943a) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "[onNotifyChange] notifyInfo is null or notifyInfo.talker is null");
                return;
            }
            sy.c0 c0Var = (sy.c0) f495314f.get(str);
            if (c0Var != null && "insert".equals(l0Var.f535944b)) {
                long j17 = c0Var.f495321c;
                int i17 = l0Var.f535946d;
                c0Var.f495321c = j17 + i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "[onNotifyChange] plugin %s receive msg %d, count:%d", c0Var.f495319a, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c0Var.f495321c));
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        try {
            super.mo204xfac946a6(context);
            if (this.f495315d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "PluginMsgReporter onAccountInitialized");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f495314f;
                concurrentHashMap.forEach(new sy.C30203x57b5d16());
                if (this.f495316e) {
                    this.f495316e = false;
                    concurrentHashMap.forEach(new sy.C30200x57b5d13());
                }
                com.p314xaae8f345.mm.app.w.INSTANCE.a(this);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "[onAccountInitialized] exception: " + e17);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        try {
            super.mo836xb8969aab(context);
            if (this.f495315d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "PluginMsgReporter onAccountReleased");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f495314f;
                concurrentHashMap.forEach(new sy.C30201x57b5d14(currentTimeMillis));
                concurrentHashMap.forEach(new sy.C30203x57b5d16());
                com.p314xaae8f345.mm.app.w.INSTANCE.p(this);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "[onAccountReleased] exception: " + e17);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        if (this.f495315d) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "onAppBackground begin to report");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f495314f;
                concurrentHashMap.forEach(new sy.C30201x57b5d14(currentTimeMillis));
                concurrentHashMap.forEach(new sy.C30203x57b5d16());
                concurrentHashMap.forEach(new sy.C30202x57b5d15());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "[onAppBackground] exception: " + e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        try {
            super.mo8845x3e5a77bb(context);
            this.f495315d = j62.e.g().l("clicfg_main_plugin_report_enable", false, true, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "enableExitReport = " + this.f495315d);
            wi();
        } catch (java.lang.Exception e17) {
            this.f495315d = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "get config failed:" + e17);
        }
    }

    public void wi() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginMsgReporter", "recordConversationInit");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f495314f;
            if (concurrentHashMap.isEmpty()) {
                concurrentHashMap.put("gh_25d9ac85a4bc", new sy.c0("gh_25d9ac85a4bc"));
                concurrentHashMap.put("newsapp", new sy.c0("newsapp"));
                concurrentHashMap.put("gh_3dfda90e39d6", new sy.c0("gh_3dfda90e39d6"));
                concurrentHashMap.put("gh_b4af18eac3d5", new sy.c0("gh_b4af18eac3d5"));
                concurrentHashMap.put("gh_f0a92aa7146c", new sy.c0("gh_f0a92aa7146c"));
                concurrentHashMap.put("gh_e087bb5b95e6", new sy.c0("gh_e087bb5b95e6"));
                concurrentHashMap.put("qqmail", new sy.c0("qqmail"));
                concurrentHashMap.put("gh_579db1f2cf89", new sy.c0("gh_579db1f2cf89"));
                concurrentHashMap.put("gh_43f2581f6fd6", new sy.c0("gh_43f2581f6fd6"));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PluginMsgReporter", "[recordConversationInit] exception: " + e17.toString());
        }
    }
}
