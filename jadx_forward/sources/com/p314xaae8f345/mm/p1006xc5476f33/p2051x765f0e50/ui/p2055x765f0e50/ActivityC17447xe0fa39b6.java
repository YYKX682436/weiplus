package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsMusicUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI */
/* loaded from: classes8.dex */
public final class ActivityC17447xe0fa39b6 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f242110o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242111d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242112e;

    /* renamed from: f, reason: collision with root package name */
    public long f242113f;

    /* renamed from: g, reason: collision with root package name */
    public long f242114g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f242115h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f242116i;

    /* renamed from: m, reason: collision with root package name */
    public int f242117m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lc0 f242118n;

    public final void V6(java.lang.String str, boolean z17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.k(new jz5.l("view_id", str), new jz5.l("set_opt", java.lang.Integer.valueOf(z17 ? 1 : 0))), 29375);
    }

    public final void W6(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f242111d;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m(str, !z17);
        }
    }

    public final void X6(boolean z17, long j17, int i17) {
        this.f242114g = z17 ? this.f242114g & (~j17) : this.f242114g | j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMusicUI", "switchStateChange open: " + z17 + ", value: " + j17 + ", functionId: " + i17 + ", extStatus2: " + this.f242114g);
        this.f242115h.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void Y6() {
        java.util.LinkedList linkedList;
        bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
        boolean z17 = false;
        this.f242116i = Ui != null ? Ui.f111276m : 0;
        bw5.lc0 lc0Var = this.f242118n;
        W6("settings_music_ai_cover_model", lc0Var != null ? lc0Var.f111278o : false);
        bw5.lc0 lc0Var2 = this.f242118n;
        if (lc0Var2 != null && lc0Var2.f111278o) {
            z17 = true;
        }
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_create_page_switch_model", "view_exp", kz5.q0.f395534d, 5, false);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f242111d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_music_ai_cover_model") : null;
        bw5.lc0 lc0Var3 = this.f242118n;
        if (lc0Var3 != null && (linkedList = lc0Var3.f111277n) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bw5.jc0 jc0Var = (bw5.jc0) it.next();
                if (jc0Var.f110457d == this.f242116i && h17 != null) {
                    h17.H(jc0Var.b());
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f242111d;
        if (rVar2 != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576476cb;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17447xe0fa39b6.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            Y6();
        }
        if (i17 == 1002) {
            bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
            this.f242117m = Ui != null ? Ui.f111279p : 0;
            bw5.lc0 lc0Var = this.f242118n;
            W6("settings_music_ai_create_model", lc0Var != null ? lc0Var.f111281r : false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f242111d;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_music_ai_create_model") : null;
            bw5.lc0 lc0Var2 = this.f242118n;
            if (lc0Var2 != null && (linkedList = lc0Var2.f111280q) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    bw5.kc0 kc0Var = (bw5.kc0) it.next();
                    if (kc0Var.f110878d == this.f242117m && h17 != null) {
                        h17.H(kc0Var.b());
                    }
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f242111d;
            if (rVar2 != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).notifyDataSetChanged();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long i17 = c01.z1.i();
        this.f242114g = i17;
        this.f242113f = i17;
        mo43517x10010bd5();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SettingsMusicUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29375);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f242113f == this.f242114g) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsMusicUI", "doUpdateOplog extStatus2: " + this.f242114g + ", origin: " + this.f242113f);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f242114g));
        java.util.HashMap hashMap = this.f242115h;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = ((java.lang.Number) entry.getKey()).intValue();
            p53Var.f464295e = ((java.lang.Number) entry.getValue()).intValue();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        if (c21560x1fce98fb != null && (str = c21560x1fce98fb.f279313q) != null) {
            switch (str.hashCode()) {
                case -1415971929:
                    if (str.equals("settings_music_ai_create_model")) {
                        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797.class), 1002);
                        break;
                    }
                    break;
                case -1176736000:
                    if (str.equals("settings_music_ai_cover_model")) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("tyt_create_page_switch_model", "view_clk", kz5.q0.f395534d, 5, false);
                        startActivityForResult(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450.class), 1001);
                        break;
                    }
                    break;
                case -854607098:
                    if (str.equals("settings_music_recommend")) {
                        boolean N = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                        ef0.y2 y2Var = (ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class));
                        y2Var.getClass();
                        java.lang.Boolean aj6 = y2Var.aj();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setMusicRecommendState state: " + N + ", old: " + aj6);
                        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ni();
                        cl4.k.f124485a = true;
                        ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).f430601f = 0L;
                        bw5.lc0 Ui = y2Var.Ui();
                        if (Ui != null) {
                            Ui.f111270d = N;
                            Ui.f111282s[1] = true;
                        }
                        y2Var.wi();
                        pq5.g l17 = new vk4.f(y2Var.Ui()).l();
                        l17.f(this);
                        l17.q(new ef0.v2(y2Var, N, aj6));
                        V6("wx_tyt_personlize_switch", N);
                        break;
                    }
                    break;
                case -150702647:
                    if (str.equals("settings_music_quality")) {
                        boolean N2 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                        ef0.y2 y2Var2 = (ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class));
                        y2Var2.getClass();
                        bw5.lc0 Ui2 = y2Var2.Ui();
                        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f111273g) : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan state: " + N2 + ", old: " + valueOf);
                        bw5.lc0 Ui3 = y2Var2.Ui();
                        if (Ui3 != null) {
                            Ui3.f111273g = N2;
                            Ui3.f111282s[4] = true;
                        }
                        y2Var2.wi();
                        pq5.g l18 = new vk4.f(y2Var2.Ui()).l();
                        l18.f(this);
                        l18.q(new ef0.u2(y2Var2, N2, valueOf));
                        break;
                    }
                    break;
                case 225665241:
                    if (str.equals("settings_music_audio_push")) {
                        boolean N3 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                        X6(N3, 2147483648L, 94);
                        V6("wx_tyt_audio_push", N3);
                        break;
                    }
                    break;
                case 1955811640:
                    if (str.equals("settings_music_taskbar")) {
                        boolean N4 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N();
                        X6(N4, 268435456L, 92);
                        V6("wx_tyt_recent_entrance", N4);
                        break;
                    }
                    break;
            }
        }
        return false;
    }
}
